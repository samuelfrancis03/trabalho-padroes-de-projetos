public class TamplateMethod {
    public static void main(String[] args) {
        ProcessadorPagamento pagamento = new ProcessarPagamento();
        pagamento.processarPagamento();

    }
}

abstract class ProcessadorPagamento{
    public void processarPagamento(){
        preparar();
        validar();
        debitar();
        noificar();
        finalizar();

    }

    protected abstract void debitar();

    private void preparar(){
        System.out.println("Resevando produtos");
    }

    public  void validar(){
        System.out.println("Valindando cadastro");
    }

    public  void noificar(){
        System.out.println("Notificando o usuário");
    }

    public  void finalizar(){
        System.out.println("Finalizando compra");
    }


}

class ProcessarPagamento extends  ProcessadorPagamento{

    @Override
    protected void debitar() {
        System.out.println("Debitando");
    }
}