class Celula<T>{
    public T obj;
    public Celula prox;

    public Celula(){
        this(null);
    }

    public Celula(T obj){
        this.obj = obj;
        this.prox = null;
    }
}

public class Fila<T extends Entidade>{
    public Celula primeiro;
    public Celula ultimo;

    public Fila(){
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserir(T obj) throws Exception{
        System.out.println(obj);
        ultimo.prox = new Celula(obj);
        ultimo = ultimo.prox;
    }
}
