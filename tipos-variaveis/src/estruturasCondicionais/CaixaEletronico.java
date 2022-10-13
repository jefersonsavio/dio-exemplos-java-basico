package estruturasCondicionais;

// Exemplo de condicional simples
public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 100.00;
        double saque = 35.50;
        
        if(saque < saldo){

            saldo = saldo - saque;

            System.out.println("voce sacou: " + saque + " saldo atualizado: " + saldo);
        }

    }
    
}
