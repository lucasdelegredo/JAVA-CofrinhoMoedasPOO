package empresa;

//Lucas Nogueira Delegredo RU: 5071970

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}
	
	//informações da moeda
	@Override
		public void info() {
		System.out.println("Dolar: " + valor);
	}
			
	//conversão da moeda
	@Override
		public double converter() {
		return valor * 5; // Já está em reais
	}

	
}
