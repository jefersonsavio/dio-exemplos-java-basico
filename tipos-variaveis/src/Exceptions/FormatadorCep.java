package Exceptions;

public class FormatadorCep {

    public static void main(String[] args) {
        String cep = "1234567";

        try {
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Favor validar o parametro de cep informado");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}