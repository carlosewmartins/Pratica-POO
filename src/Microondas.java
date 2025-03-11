public class Microondas {
    public String marca;
    public String tipo;
    public int potencia;
    public boolean ligado;

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

