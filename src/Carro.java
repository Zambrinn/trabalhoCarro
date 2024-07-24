public class Carro {
    //Atributos
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private double velocidade;
    private static double kilometragem;

    //Construtores
    public Carro(String marca, String cor, String modelo, int anoFabricacao){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
        this.kilometragem = 0;
    }

    //Métodos
    public void acelerar(double incremento){
        this.velocidade += incremento;
    }

    public void frear(double decremento){
        this.velocidade -= decremento;
    }

    public static double consumoMedioKilometro(double distancia, double litro) {
        System.out.println("O consumo médio de combustível do carro é: ");
        return (distancia / litro);
    }

    public static double consumoViagem(double distance) {
        double litro = 5.0;
        distance = distance / litro;
        System.out.println("O combustível gasto pela distância andada foi: ");
        return distance;
    }

    public String getDescricao(){
        return "Marca:" + this.marca + "Cor:" + this.cor + "Modelo:" + this.modelo + "Ano de Fabricação:" + this.anoFabricacao + "Velocidade:" +this.velocidade;
    }

    public static String trocaDeOleo(double kilometragemTrocaDeOleo) {
        kilometragemTrocaDeOleo = 7000;
        return kilometragem < kilometragemTrocaDeOleo ? "É necessária uma troca de óleo" : "Não é necessária uma troca de óleo";
    }

    public static String revisaoFreios(double kilometragemRevisaoFreios) {
        kilometragemRevisaoFreios = 10000;
        return kilometragem < kilometragemRevisaoFreios ? "É necessária uma revisão de freios" : "Não é necessária uma revisão nos freios";
    }

}