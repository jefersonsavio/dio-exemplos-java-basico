package escopos;

public class Conta {
    //variavel da classe conta
    double saldo = 10.0;
    double valor = 2.0;

    public void sacar(double valor){
        // vara=iavel local de método
        double novoSaldo = saldo - valor;

        //somente o método sacar conhece a variavel novoSaldo
        System.out.println(novoSaldo);
    }
    
    
    
    public void imprimirSaldo(){
        // disponivel em toda a classe
        System.out.println(saldo);

    }

          
    public double calcularDividaExponencial(){
        // variavel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;// começando a variavel

        for(int x=1; x<=5; x++){// x é a variavel de escopo  de fluxo

            //essa variavel sera reiniciada a cada execucao
            double valorCalculado = valorParcela*x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valor calculado nunca estarao disponiveis
        return valorMontante;
    }


}
