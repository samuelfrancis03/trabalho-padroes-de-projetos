import java.math.BigDecimal;

public class Adapter {

    public static void main(String[] args) {
        PagamentoCredito credito = new PagamentoCredito();
        credito.debitar(100.0);
        credito.creditar(2500.00);


    }

}


class PagamentoCredito{ //classe com acesso

    SdkPagamentoCredito sdkpgcred = new SdkPagamentoCredito();

    public void debitar(Double valor){
        System.out.println("Valor debitado: R$ " + valor);
        sdkpgcred.autorizar(valor);
        sdkpgcred.capturar(valor);
    }

    public void creditar(Double valor){
        System.out.println("Valor credito: R$ " + valor);
        sdkpgcred.creditar(valor);

    }


}


class SdkPagamentoCredito{ //sdk sem acesso

    public  void autorizar(Double valor){
        //autorizar transação
    }

    public  void capturar(Double valor){
        //capturar transação
    }

    public void creditar(Double valor){
        //creditar transação
    }

}