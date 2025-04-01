package empresa;

import java.util.ArrayList;

// Lucas Nogueira Delegredo RU: 5071970

public class Cofrinho {

	private ArrayList<Moeda> moedas;
	
	public Cofrinho() {
		this.moedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moeda) {
		//vamos adicionar a moeda na lista
		moedas.add(moeda);
		System.out.println("Moeda adicionado ao cofrinho!");
		
	}
	
	public void remover(Moeda moeda) {
		for (Moeda m : moedas) { //para cada uma das moedas na lista
	        if (m.valor == moeda.valor) { //encontrar aquela que possui o mesmo valor
	            moedas.remove(m); //remover essa moeda
	            System.out.println("Moeda removida do cofrinho!");
	            return;
	        }
	    }
	    System.out.println("Moeda não encontrada no cofrinho!"); // caso não tenha essa moeda no cofrinho
	}
	
	public void listagemMoedas() {
		if(moedas.isEmpty()) { //para sabermos se a lista está vazia e podermos tratar essas informações
			System.out.println("Não existem moedas no seu cofrinho!");
		}else {
			for (Moeda moeda: moedas) { //para cada registro de moeda na lista vamos executar o método info()
				moeda.info();
			}
		}
	}
	
	public double totalConvertido() {
        double total = 0; //definir o total como zero para modificarmos o valor
        for (Moeda moeda : moedas) { //para cada moeda existente na lista moedas
            total += moeda.converter(); //agora vamos somar ao total o valor da moeda que passou pelo metodo de conversão
        }
        return total;
    }
	
	
}
