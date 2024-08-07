package exceptions.thows;

public class ExemploThrow {

    public static void saque(double valor) throws LimiteSaqueExceptions{
        if(valor > 400){
            LimiteSaqueExceptions erro = new LimiteSaqueExceptions("Valor solicitado é maior que seu limite diario");
            throw erro;
        }else{
            System.out.println("Valor retirado da conta: R$ " + valor );
        }
    }

    public static void saqueRuntimeExeptions(double valor){
        if(valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException("Valor solicitado maior que seu limite diario");
            throw erro;
        }else {
            System.out.println("Valor retirado da conta: R$ " + valor );
        }
    }
}
