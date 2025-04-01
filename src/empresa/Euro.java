package empresa;

//Lucas Nogueira Delegredo RU: 5071970

public class Euro extends Moeda{
	
	
	public Euro(double valor) {
		super(valor);
	}

	//informações da moeda
	@Override
	   public void info() {
	   System.out.println("Euro: " + valor);
	}
		
	//conversão da moeda
	@Override
	    public double converter() {
	    return valor * 6; // Já está em reais
	}

}
