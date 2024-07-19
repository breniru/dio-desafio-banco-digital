
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setEndereço("Rua Barro Branco");
		venilton.setRg("68.396.5673-4");
		venilton.setCpf("564.863.837-63");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
