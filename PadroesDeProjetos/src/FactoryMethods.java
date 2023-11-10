public class FactoryMethods {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        Comercio comercio = categoria.novoComercio(1);

        Categoria categoria1 = new Categoria();
        Comercio comercio1 = categoria1.novoComercio(2);

        Categoria categoria2 = new Categoria();
        Comercio comercio2 = categoria2.novoComercio(3);

    }
}

interface Comercio{

}

class ComercioPadrao implements Comercio{

}

class ComercioDigital extends ComercioPadrao{

}

class ComercioFisico extends ComercioPadrao{

}



class Categoria{


    public Comercio novoComercio(int tipoComercio) {
        if (tipoComercio == 1) {
            System.out.println("Comercio Padrao criado");
            return new ComercioPadrao();

        } else if (tipoComercio == 2) {
            System.out.println("Comercio Digital criado");
            return new ComercioDigital();

        } else if (tipoComercio == 3) {
            System.out.println("Comercio Fisico criado");
            return new ComercioFisico();
        } else {
            System.out.println("Numero digitado Invalido");
        }
        return null;
    }
}

