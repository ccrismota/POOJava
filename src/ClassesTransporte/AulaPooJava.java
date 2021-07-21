package ClassesTransporte;

public class AulaPooJava {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("HB20S");
        carro.setCor("Preto");
        carro.setAno(2022);
        carro.setLotacaoMax(5);
        carro.entrarNoCarro(3);
        carro.sairDoCarro(2);
        carro.entrarNoCarro(4);
        carro.entrarNoCarro(1);
        carro.sairDoCarro(3);

        Carro carro1 = new Carro();
        carro1.setModelo("Van");
        carro1.setMarca("Mercedes");
        carro1.setCor("Amarelo");
        carro1.setAno(2010);
        carro1.setPortas(6);
        carro1.setLotacaoMax(12);
        carro1.entrarNoCarro(7);
        carro1.entrarNoCarro(5);
        carro1.entrarNoCarro(2);
        carro1.sairDoCarro(1);


        carro.Status();
        carro1.Status();


    }
}
