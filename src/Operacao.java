
public class Operacao {
	//Atributos
	private int n1;
	private int n2;
	//métodos getters e setters
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) throws Exception{
		if(n2==0) {
			throw new IllegalArgumentException("N2 não pode ser zero");
		}else {
			
		}
		this.n2 = n2;
	}
	
	public double divisao() {
		return this.n1/this.n2;
	}
	
}
