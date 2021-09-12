package digital.innovation.one.teste;

public class Main {
    public static void main(String[] args) {
        System.out.println("Essa classe não tem acesso a Calculadora, para liberar o acesso a mesma," +
                " deverá ser alterado o module-info do pacote digital.innovation.one.utils");
    }
}
