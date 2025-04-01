package empresa;

//Lucas Nogueira Delegredo RU: 5071970

public class Real extends Moeda{
	
	//construct
	public Real(double valor) {
		super(valor);
	}
	
	//informações da moeda
	@Override
    public void info() {
        System.out.println("Real: " + valor);
    }
	
	//conversão da moeda
	@Override
    public double converter() {
        return valor; // Já está em reais
    }
}

