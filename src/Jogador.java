import org.w3c.dom.ls.LSOutput;

public class Jogador {
    public String nome;
    public String classe;
    public String genero;
    public String raca;
    public int vida;
    public int nivel;
    public int atributoAtaque;
    public int atributoDefesa;
    public int atributoVelocidade;
    public boolean isVivo;

    public void atacar() {
        System.out.println( nome + " realizou um ataque e causou " + atributoAtaque + " de dano");
    }
    public void defender(int ataqueRecebido){

        if (atributoDefesa > ataqueRecebido){
            System.out.println( nome + " defendeu com sucesso!");
        }
        else {
            ataqueRecebido -= atributoDefesa;
            System.out.println( nome + " recebeu " + ataqueRecebido + " de dano!");
            vida -= ataqueRecebido;
        }
    }

    public void ganharVida(int qntRestaurada){
        System.out.println( nome + " restaurou 10 de vida!");
        vida += qntRestaurada;
    }

    public void perderVida(int qntPerdida){
        System.out.println( nome + " perdeu 10 de vida!");
        vida -= qntPerdida;
        if (vida <= 0){
            isVivo = false;
            System.out.println( nome + " morreu!");
        }
    }

}

