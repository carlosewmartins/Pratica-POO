public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int qtdPortas;
    public int ano;
    public int velocidadeAtual;

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
