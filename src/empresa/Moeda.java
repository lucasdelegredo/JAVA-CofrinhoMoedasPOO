package empresa;

//Lucas Nogueira Delegredo RU: 5071970

abstract public class Moeda {
	
	protected double valor;

	public Moeda(double valor) {
        this.valor = valor;
    }
	
	public abstract void info();
    public abstract double converter();
	
}
