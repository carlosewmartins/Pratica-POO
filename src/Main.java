public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Tekaxis","Mago","Masculino","Elfo");
        Jogador jogador2 = new Jogador();

        jogador1.vida = 100;
        jogador1.nivel = 1;
        jogador1.atributoAtaque = 10;
        jogador1.atributoDefesa = 10;
        jogador1.atributoVelocidade = 10;

        jogador1.atacar();
        System.out.println(jogador1.vida);
        jogador1.defender(20);
        jogador1.ganharVida(5);
        System.out.println(jogador1.vida);
        System.out.println("\n");


        Microondas microondas1 = new Microondas("Eletrolux", "Embutir", 100);
        Microondas microondas2 = new Microondas();

        microondas1.definirTempo(10);
        microondas1.cancelar();
        microondas1.cancelar();
        System.out.println("\n");


        Conta conta1 = new Conta("Carlos", "41995738010", 0, 1000);
        Conta conta2 = new Conta();

        conta1.consultarSaldo();
        conta1.depositar(100);
        conta1.sacar(100);
        conta1.abrirPoupanca();
        conta1.abrirPoupanca();
        System.out.println("\n");


        Computador computador1 = new Computador("Intel Core i7 14700K","Z790",8,32,1000);
        Computador computador2 = new Computador();

        computador1.verificarLolzinho();
        computador1.ligar();
        computador1.verificarLolzinho();
        computador1.verificarComponentes();
        computador1.desligar();
        System.out.println();

        computador2.verificarLolzinho();
        computador2.ligar();
        computador2.verificarLolzinho();
        computador2.verificarComponentes();
        computador2.desligar();
        System.out.println("\n");


        Carro carro1 = new Carro("Fiat", "Uno", "Branco", 4, 2002);
        Carro carro2 = new Carro();

        carro1.ligar();
        carro1.acelerar(100);
        carro1.frear(50);
        carro1.desligar();
    }
}