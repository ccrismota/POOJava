public class Pessoa {
    String nome = "João";
    int idade = 45;
    String tipoFisico = "Magro";
    String peso ="77Kg";



    private boolean getNome() {
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoFísico() {
        return tipoFisico;
    }

    public void setTipoFísico(String tipoFísico) {
        this.tipoFisico = tipoFísico;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}

