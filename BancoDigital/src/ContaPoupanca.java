
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente, cliente, cliente, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
