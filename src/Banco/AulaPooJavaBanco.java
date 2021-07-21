package Banco;

public class AulaPooJavaBanco {
    public static void  main(String[] args){
        ContaBanco pessoa = new ContaBanco();
        pessoa.setNumConta(15111);
        pessoa.setDono("José Jorge Júnior");
        pessoa.abrirConta("CC");

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(11222);
        pessoa2.setDono("Larissa Lara");
        pessoa2.abrirConta("CP");

        //Deposito
        pessoa.depositar(500.01);
        pessoa2.depositar(750.01);
        pessoa.depositar(12.0);
        //sacar
        pessoa.sacar(250.0);
        pessoa2.sacar(550.0);
        pessoa.sacar(300.01);
        //Pagamento
        pessoa.pagarmensal();
        pessoa2.pagarmensal();
        //fechar
        pessoa.fecharConta();
        pessoa2.fecharConta();
        pessoa.estadoAtual();
        pessoa2.estadoAtual();

    }
}
