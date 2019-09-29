public class TesteString {
    public static void main(String[] args) {

        String str1 = "teste";
        String str2 = "Oteste";

        System.out.println("str1: " + str1 + ", str2: " + str2);
        if(str1.equals(str2)) { //perceba a diferença aqui
            System.out.println("str1 igual a str2");
        }
        else {
            System.out.println("str1 diferente de str2");
        }
    }
}