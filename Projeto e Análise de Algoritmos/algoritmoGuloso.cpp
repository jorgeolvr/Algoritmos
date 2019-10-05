/**
 * Algoritmo Guloso para o problema do menor caminho
 * @author Guilherme Reis Barbosa de Oliveira
 * @author Ian Rodrigues dos Reis Paixao
 * @author Jorge Allan de Castro Oliveira
 * @version 2 05/2019
 */

#include <limits.h>
#include <stdio.h>

// Numero de vertices no grafo
#define V 4

// Funcao para encontrar o vertice com valor minimo de distancia a partir do
//conjunto de vertices ainda nao incluidos na arvore de caminho mais curto
int distanciaMinima(int distancia[], bool arvCaminho[])
{
    // Inicializa o valor da variavel min
    int min = INT_MAX, min_ind;

    for (int v = 0; v < V; v++)
    {
        if (arvCaminho[v] == false && distancia[v] <= min)
        {
            min = distancia[v], min_ind = v;
        }
    }
    return min_ind;
}

// Funcao para imprimir a matriz de distancia que foi construida
int imprimirMatriz(int distancia[], int n)
{
    printf("Vertice  || Dist. origem\n");
    for (int i = 0; i < V; i++)
    {
        printf("%d || %d\n", i, distancia[i]);
    }
}

// Funcao que implementa o Dijkstra para solucao do menor caminho para um grafo
// que utiliza matriz de adjacencia
void dijkstra(int grafo[V][V], int orig)
{
    // O array de saida. O distancia[i] vai manter a menor distancia
    //de orig ate i
    int distancia[V];
    // arvCaminho[i] sera verdadeiro se o vertice i for incluido na arvore de
    //caminho mais curto ou a distancia mais curta de orig ate i for finalizada
    bool arvCaminho[V];
    // Inicializa todas as distancias como INFINITO e arvCaminho[] como falso
    for (int i = 0; i < V; i++)
    {
        distancia[i] = INT_MAX, arvCaminho[i] = false;
    }

    // Distancia do vertice de origem de si mesmo eh sempre igual a zero
    distancia[orig] = 0;

    // Encontra o caminho mais curto para todos os vertices
    for (int i = 0; i < V - 1; i++)
    {
        // Escolhe o vertice de distancia minima do conjunto de vertices ainda
        //nao processados. u eh sempre igual a orig na primeira iteracao
        int u = distanciaMinima(distancia, arvCaminho);

        // Marca o vertice escolhido como processado
        arvCaminho[u] = true;

        // Atualiza o valor de distancia dos vertices adjacentes do
        //vertice escolhido.
        for (int v = 0; v < V; v++)
        {
            // Atualiza distancia[v] somente se nao estiver em arvCaminho,
            //existe uma aresta de u para v, e o peso total do caminho de orig
            //para v ate u eh menor que o valor atual de distancia[v]
            if (!arvCaminho[v] && grafo[u][v] && distancia[u] != INT_MAX && distancia[u] + grafo[u][v] < distancia[v])
                distancia[v] = distancia[u] + grafo[u][v];
        }
    }

    // Imprime a matriz de distancia
    imprimirMatriz(distancia, V);
}

int main()
{
    //Valores de entrada do grafo
    int grafo[V][V] = {{0, 1, 100, 1000},
                       {1, 0, 6, 5},
                       {100, 6, 0, 10},
                       {1000, 5, 10, 0}};

    //Chamada da funcao que calcula menor caminho
    dijkstra(grafo, 0);

    return 0;
}