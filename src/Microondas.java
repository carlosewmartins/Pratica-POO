public class Microondas {
    public String marca;
    public String tipo;
    public int potencia;
    public boolean ligado;

    public Microondas(String marca, String tipo, int potencia){
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public Microondas(){
        this("","",0);
    }
    public void cancelar(){
        if (ligado == true){
            System.out.println("Desligando microondas - Timer zerado!");
            ligado = false;
        }
        else{
            System.out.println("Microondas ja está desligado");
        }
    }

    public void definirTempo(int segundos){
        System.out.println("Tempo definido para " + segundos + " segundos");
        ligado = true;
    }



}

