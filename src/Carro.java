public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int qtdPortas;
    public int ano;
    public int velocidadeAtual;

    public Carro(String marca, String modelo, String cor, int qtdPortas, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
        this.ano = ano;
    }

    public Carro(){
        this("","","",0,0);
        this.velocidadeAtual = 0;
    }

    public void ligar(){
        System.out.println("Ligando o carro");
    }

    public void desligar(){
        System.out.println("Desligando o carro");
    }

    public int acelerar(int pisarNoAcelerador){
        velocidadeAtual += pisarNoAcelerador;
        System.out.println("Acelerando o carro para " + velocidadeAtual + " km/h");
        return velocidadeAtual;
    }

    public void frear(int pisarNoFreio){
        if (velocidadeAtual > 0){
            velocidadeAtual -= pisarNoFreio;
            System.out.println("Freando o carro para " + velocidadeAtual + " km/h");
        }
    }
}
