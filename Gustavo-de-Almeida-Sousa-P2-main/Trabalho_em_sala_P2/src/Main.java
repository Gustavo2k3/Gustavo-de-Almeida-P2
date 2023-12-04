// Definição da interface Residencia
interface Residencia {
    void alugar();
    void comprar();
}

// Classe base Residencia com propriedades comuns
class ResidenciaBase {
    int quartos;
    int banheiros;

    public ResidenciaBase(int quartos, int banheiros) {
        this.quartos = quartos;
        this.banheiros = banheiros;
    }
}

// Classe Apto que implementa a interface Residencia e herda de ResidenciaBase
class Apto extends ResidenciaBase implements Residencia {
    int garagem;

    public Apto(int quartos, int banheiros, int garagem) {
        super(quartos, banheiros);
        this.garagem = garagem;
    }

    @Override
    public void alugar() {
        System.out.println("Apartamento alugado.");
    }

    @Override
    public void comprar() {
        System.out.println("Apartamento comprado.");
    }
}

// Classe Casa que implementa a interface Residencia e herda de ResidenciaBase
class Casa extends ResidenciaBase implements Residencia {
    boolean quintal;

    public Casa(int quartos, int banheiros, boolean quintal) {
        super(quartos, banheiros);
        this.quintal = quintal;
    }

    @Override
    public void alugar() {
        System.out.println("Casa alugada.");
    }

    @Override
    public void comprar() {
        System.out.println("Casa comprada.");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Apto apartamento = new Apto(2, 1, 1);
        Casa casa = new Casa(3, 2, true);

        apartamento.alugar();
        apartamento.comprar();

        casa.alugar();
        casa.comprar();
    }
}
