public class TestaErros {
	
	public static void main (String[] args) {
		
		/*try {
		int n1, n2, resultado;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
		resultado = n1/n2;
		JOptionPane.showInputDialog(null, "Resultado: " + resultado);
		}catch(NumberFormatException e) {
			System.out.println("Por favor, digite um número.");
			
		}catch(ArithmeticException e1) {
			System.out.println("Não há resultado quando o 2º número inserido for 0");
		}
		finally {
			System.out.println("Fim! :D");
		}
		*/
		Operacao op = new Operacao();
		op.setN1(200);
		try {
		op.setN2(0);
		}catch (Exception e) {
			System.out.println();
		}
		//try {		
			System.out.println(op.divisao());
		/*}catch(Exception e) {
			System.out.print("Não há divisão por ZERO");*/
		}
	}
