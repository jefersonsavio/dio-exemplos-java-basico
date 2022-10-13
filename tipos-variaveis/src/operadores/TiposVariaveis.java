package operadores;
public class TiposVariaveis {
   
    public static void main(String[] args) {

        String nome = "jeferson savio";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int idade = 5;

        idade = 10;

        System.out.println("nome: " + nome);
        System.out.println("SAlario: " + salarioMinimo);
        System.out.println("Casting de numero: " + numeroCurto2);
        System.out.println("Idade:" + idade);

    }

}
