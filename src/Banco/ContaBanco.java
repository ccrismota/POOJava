package Banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    public ContaBanco() {
        this.saldo = 0.0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("\nConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus() + "\n");
        System.out.println("=================================");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")) {
            this.setSaldo(50.0);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150.0);
        }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A Conta de " + this.getDono()+ " não pode ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em Débito, não pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("A conta de " + this.getDono() + " foi fechada com Sucesso!!");
        }
    }

    public void depositar(Double valor) {
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Valor depositado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(Double valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque Realizado com Sucesso");
            } else {
                System.out.println("Saldo Insuficiente para Saldo");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarmensal() {
        Double valor = 0.0;
        if (this.getTipo().equals("CC")) {
            valor = 12.0;
        } else if (this.getTipo().equals("CP")) {
            valor = 20.0;
        }
        if (this.getStatus()) {
            this.setSaldo(getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta Fechada");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
