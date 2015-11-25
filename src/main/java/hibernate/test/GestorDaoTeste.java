package hibernate.test;

import br.com.model.GestorCaixa;
import br.com.model.defaultInfo.DefaultManager;

public class GestorDaoTeste {
	public static void main(String[] args) {
		DefaultManager manager = DefaultManager.getInstance();
		GestorCaixa gestor = manager.getGestorCaixa();
		
		if(gestor!=null){
			gestor.receber(10000000.0);
			System.out.println(gestor.getSaldo());
		}else{
			System.out.println("Gestor null");
		}
		
		
	}
}
