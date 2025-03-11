public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.nome = "Tekaxis";
        jogador1.classe = "Mago";
        jogador1.genero = "Masculino";
        jogador1.raca = "Elfo";
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


        Microondas microondas1 = new Microondas();
        microondas1.marca = "Eletrolux";
        microondas1.tipo = "Embutir";
        microondas1.potencia = 100;

        microondas1.definirTempo(10);
        microondas1.cancelar();
        microondas1.cancelar();
        System.out.println("\n");


        Conta conta1 = new Conta();
        conta1.nome = "Carlos Eduardo Wille Martins";
        conta1.numeroDeTelefone = "41995738010";

        conta1.consultarSaldo();
        conta1.depositar(100);
        conta1.sacar(100);
        conta1.abrirPoupanca();
        conta1.abrirPoupanca();
        System.out.println("\n");


        Computador computador1 = new Computador();
        computador1.modeloProcessador = "Intel Core i7 14700K";
        computador1.modeloPlacaMae = "Z790";
        computador1.nucleosProcessador = 8;
        computador1.qntDisco = 1000;
        computador1.qntRAM = 32;

        Computador computador2 = new Computador();
        computador2.modeloProcessador = "Intel Core i3 520";
        computador2.modeloPlacaMae = "HM55";
        computador2.nucleosProcessador = 2;
        computador2.qntDisco = 10;
        computador2.qntRAM = 2;

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


        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Branco";
        carro1.qtdPortas = 4;
        carro1.ano = 2002;

        carro1.ligar();
        carro1.acelerar(100);
        carro1.frear(50);
        carro1.desligar();
    }
}