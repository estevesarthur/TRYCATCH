
public class TestaErro {

		public static void main(String[] args) {
			try{
				int valor = 200;
				valor = valor/4;
				System.out.println("Resultado: " + valor);
				
			}catch(ArithmeticException e) {
				System.out.println("N�o h� divis�o por ZERO.");
				//System.out.println(e.getMessage()); vendo a mensagem do erro que foi pego
			}finally {
				System.out.println("Fim...");
			}
		}
}
