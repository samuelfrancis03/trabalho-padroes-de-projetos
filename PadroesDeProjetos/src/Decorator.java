public class Decorator {
    public static void main(String[] args) {

        TimeFutebol time = new TimeFutebol("Cruzeiro", "Azul e Branco", "02/01/1921");

        MostraTime mostrar = new MostraTime();
        MostraTimeCaixaAlta mostraTimeCaixaAlta = new MostraTimeCaixaAlta(mostrar);
        String mostraTime = mostraTimeCaixaAlta.prepTime(time);
        System.out.println(mostraTime);
    }

}

class TimeFutebol{
    public String nome;
    public String cores;
    public String dataFundacao;

    public TimeFutebol(String nome, String cor, String dataFundacao) {
        this.nome = nome;
        this.cores = cor;
        this.dataFundacao = dataFundacao;
    }
}

class MostraTime{
    public String mostraTime(TimeFutebol time){
        StringBuilder sb = new StringBuilder();
        sb.append(time.nome);
        sb.append("\n");
        sb.append(time.cores);
        sb.append("\n");
        sb.append(time.dataFundacao);
        return sb.toString();
    }


}

class MostraTimeCaixaAlta{
    MostraTime mostraTime;

    public MostraTimeCaixaAlta(MostraTime mostraTime){
        super();
        this.mostraTime = mostraTime;
    }

    public String prepTime(TimeFutebol time){
        return mostraTime.mostraTime(time).toUpperCase();
    }

}