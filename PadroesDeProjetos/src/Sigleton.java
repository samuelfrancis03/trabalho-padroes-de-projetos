public class Sigleton {

    public static void main(String[] args) {
        LojaFactory.INSTANCE.novaLoja(1);
        LojaFactory.INSTANCE.novaLoja(2);
        LojaFactory.INSTANCE.novaLoja(3);

    }
}

interface Loja {

}

class LojaPadrao implements Loja {

}

class LojaDigital extends LojaPadrao {

}

class LojaFisica extends LojaPadrao {

}



class LojaFactory {
    public static final LojaFactory INSTANCE = new LojaFactory();

    private LojaFactory(){

    }

    public Loja novaLoja(int tipoLoja){
        switch (tipoLoja){
            case 1:
                System.out.println("Loja Padrao criada");
                return new LojaPadrao();
            case 2:
                System.out.println("Loja Digital criada");
                return new LojaDigital();
            case 3:
                System.out.println("Loja Fisica criada");
                return new LojaFisica();
            default:
                System.out.println("Numero digitado Invalido");
        }
        return  null;
    }



}


