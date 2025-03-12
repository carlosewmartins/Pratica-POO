public class Computador {
    public String modeloProcessador;
    public String modeloPlacaMae;
    public int nucleosProcessador;
    public int qntRAM;
    public int qntDisco;
    public boolean isLigado;

    public Computador(String modeloProcessador, String modeloPlacaMae, int nucleosProcessador, int qntRAM, int qntDisco){
        this.modeloProcessador = modeloProcessador;
        this.modeloPlacaMae = modeloPlacaMae;
        this.nucleosProcessador = nucleosProcessador;
        this.qntRAM = qntRAM;
        this.qntDisco = qntDisco;
    }

    public Computador(){
        this("","",0,0,0);
    }

    public void ligar(){
        isLigado = true;
        System.out.println("Computador ligado!");
    }

    public void desligar(){
        isLigado = false;
        System.out.println("Computador desligado!");
    }

    public void verificarComponentes(){
        System.out.println("Modelo do processador: " + modeloProcessador);
        System.out.println("Quantidade de nucleos do processador: " + nucleosProcessador);
        System.out.println("Modelo da placa mae: " + modeloPlacaMae);
        System.out.println("Quantidade de RAM: " + qntRAM + "GB");
        System.out.println("Quantidade de disco: " + qntDisco + "GB");
    }

    public void verificarLolzinho(){
        if (isLigado && qntDisco >= 16 && qntRAM >= 2 && nucleosProcessador >= 2){
            System.out.println("Voce pode instalar o lolzinho");
        }
        else if (isLigado == false) {
            System.out.println("Ligue o computador primeiro!");
        }

        else {
            System.out.println("Seu computador nao roda o lolzinho");
        }
    }
}
