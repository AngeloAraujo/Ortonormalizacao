
public class Regras {
	
	/*Nessa parte calculamos o produto escalar, pegamos dois vetores e calculamos entre eles.*/

	public double Produtoescalar (double[] vetor1, double[] vetor2) {
		double prod =0;
		
		prod= ((vetor1[0])*(vetor2[0]))+((vetor1[1])*(vetor2[1]))+((vetor1[2])*(vetor2[2]));
			
		return prod;
	}
	
	/*Esse booleano verifica se � ortogonal ou n�o caso seja, ele aparece true sen�o false. 
	 * se for ortogonal o resultado do produto escalar tem que dar zero. */
	public boolean ortogonal (double[] vetor1, double[] vetor2) {
		if (Produtoescalar(vetor1, vetor2) ==0) {
			return true;
		}
		return false;
	}
	
	/*Essa string ir� dizer se � ortogonal ou n�o, pegando os valores de orotgonal e trar� como resultado se � orotogonal
	 * ou n�o.  */
	public String ortogonaliza��o (boolean ortogonal) {
		String a = null;
		if (ortogonal ==true) {
			a = "� ortogonal"; 
		}else if (ortogonal == false){
			a ="N�o � ortogonal"; 
		}
		return a;
	}
	/* Essa fun��o c�lcula a norma de cada vetor, multiplicando o vetor por ele mesmo e depois 
	 * realiza a raiz quadrada*/
	public double normax (double vetor1[]) {
		double norma =0;
		norma = (Math.sqrt((vetor1[0]*vetor1[0])+(vetor1[1]*vetor1[1])+(vetor1[2]*vetor1[2])));
		return norma;
	}
	
	/*Esse vetor faz um booleano que verifica se a norma � igual a 1 para ser unit�rio, caso for
	 * ele retorna true sen�o false*/
	public boolean valorunitario (double vetor1[]) {
		if (normax (vetor1)==1) {
			return true;
		}
		return false;
		
	}
	
	/* Aqui ele transforma oleano em um valor String*/
	
	public String unitario (boolean valorunitario) {
		String valor = null;
		if (valorunitario == true) {
			valor= "� unit�rio";
		}else if  (valorunitario == false) {
			valor = "N�o � unit�rio";
		}
		return valor;
		
	}
	
	/*Aqui faz uma proje��o de dois vetor, utilizando as fun��es produto escalar, a norma e a divis�o da proje��o pela norma.*/
	public double[] projecaosimples (double vetor1[], double vetor2[]) {
		double [] projecao = new double [3];
		
		double proda= Produtoescalar(vetor1, vetor2);
		double norma= Math.pow(normax(vetor2), 2);
		double proj= (proda/norma);
		
			
		for (int i =0; i< projecao.length;i++) {
			projecao[i] = (vetor2[i]*proj);
		}
		return projecao;
	}
	
	public boolean base (double vetor1 [], double vetor2 [], double vetor3 []) {
		if(ortogonal(vetor1, vetor2)&& ortogonal(vetor1, vetor3)&& ortogonal(vetor2, vetor3)) {
			if (valorunitario(vetor1)&& valorunitario(vetor2)&& valorunitario(vetor3)) {
				return true;
			}
		}
		return false;
	}
	
	public String baseortonormal (boolean base) {
		String baseorto=null;
		if (base== true) {
			baseorto= "� uma base ortonormal";
		}else if (base== false) {
			baseorto = "N�o � uma base ortonormal";
		}
		return baseorto;
	}
	public void ortonormalizacao (double[] vetor1, double[] vetor2,double[] vetor3) {
		double [] vetorx1= new double [3];
		double [] vetorx2= new double [3];
		double [] vetorx3= new double [3];
		
		for (int i=0; i<vetorx1.length; i++) {
			vetorx1[i]= vetor1 [i];  
		}		
		double projecao []= projecaosimples(vetor2, vetorx1);
		
		for (int i=0; i<vetorx2.length;i++) {
			 vetorx2 [i]= vetor2 [i]-projecao[i]; 
			}
		
		double projecaov3emx1 []= new double [3];
		double projecaov3emx2 []= new double [3];
		
		projecaov3emx1 =projecaosimples(vetor3, vetorx1);
		projecaov3emx2 = projecaosimples(vetor3, vetorx2);
		
		for (int i=0; i<vetorx3.length;i++) {
			 vetorx3 [i]= vetor3 [i]-projecaov3emx1[i]-projecaov3emx2[i]; 
			}
		
		double v1[] = new double[3];
		double v2[] = new double[3];
		double v3[] = new double[3];
		
		double normavetorx1 = normax(vetorx1);
		double normavetorx2 =  normax(vetorx2);;
		double normavetorx3 =  normax(vetorx3);;
		
		for (int i = 0; i < v1.length; i++) {
			v1[i] = vetorx1[i] / normavetorx1;
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] = vetorx2[i] / normavetorx2;
		}
		for (int i = 0; i < v3.length; i++) {
			v3[i] = vetorx3[i] / normavetorx3;
		}
				
		for (int i = 0; i < v1.length; i++) {
			System.out.print("v1 = " + Math.round((v1[i])*100.0)/100.0 + "  ");
		}	
		System.out.println();
		for (int i = 0; i < v2.length; i++) {
			System.out.print("v2 = " + Math.round((v2[i])*100.0)/100.0 + "  ");
		}	
		System.out.println();
		for (int i = 0; i < v3.length; i++) {
			System.out.print("v3 = " + Math.round((v3[i])*100.0)/100.0 + "  ");
		}	
}
}
	
	
	
	

