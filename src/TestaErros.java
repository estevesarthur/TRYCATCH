public class TestaErros {
	
	public static void main (String[] args) {
		
		/*try {
		int n1, n2, resultado;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero"));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero"));
		resultado = n1/n2;
		JOptionPane.showInputDialog(null, "Resultado: " + resultado);
		}catch(NumberFormatException e) {
			System.out.println("Por favor, digite um n�mero.");
			
		}catch(ArithmeticException e1) {
			System.out.println("N�o h� resultado quando o 2� n�mero inserido for 0");
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
			System.out.print("N�o h� divis�o por ZERO");*/
		}
	}
