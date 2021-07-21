package ClassesTransporte;

public class Carro extends Veiculo {

    String modelo;
    String marca;
    String cor;
    int ano;
    int portas;
    int qtdPessoas;
    int lotacaoMax;

    public void entrarNoCarro(int valor) {
        if (qtdPessoas < lotacaoMax) {
            this.setQtdPessoas(getQtdPessoas() + valor);
            System.out.println(this.getQtdPessoas() + " é a lotação atual, entrou " + valor +" pessoa");
        } else {
            System.out.println("Não Cabe mais ninquém!!");
        }
    }

    public void sairDoCarro(int valor) {
        if (qtdPessoas > 0) {
            this.setQtdPessoas(getQtdPessoas() - valor);
            System.out.println(this.getQtdPessoas() +" é a lotação atual, saiu " + valor + " pessoa");
        } else {
            System.out.println("Não tem ninguem no carro!!");
        }
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if (qtdPessoas <= lotacaoMax) {
            this.qtdPessoas = qtdPessoas;
        } else {
            System.out.println("Numero de pessoas maior que o permitido");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public Carro() {
        this.marca = "Hyundai";
        this.portas = 4;
    }

    public void Status() {
        System.out.println("\nModelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Portas: " + this.getPortas());
        System.out.println("Lotação: " + this.getLotacaoMax());
        System.out.println("Quantidade de pessoas no carro: "+ this.getQtdPessoas());
        System.out.println("==============================\n");


    }
}


