import java.util.Scanner;

public class RegrasMain {

	public static void main(String[] args) {

	Scanner entrada= new Scanner (System.in);
	
	Regras vet = new Regras ();
	double[]x = new double [3];
	double []y = new double [3];
	double []z = new double [3];
	
	// Aqui ele repassa os vetores para um �nico vetor.
	for(int i =0; i < x.length;i++) {
		System.out.println("Insira os valores do 1� vetor!");
		int valorx = entrada.nextInt();
		x [i]= valorx;
		}
	System.out.println("Valores do vetor x:");
	for (int i=0; i<x.length;i++) {
		System.out.print(x [i]+" , ");
	}System.out.println();

	
	
	for(int i =0; i < y.length;i++) {
		System.out.println("Insira os valores do 2� vetor!");
		int valorx = entrada.nextInt();
		y [i]= valorx;
		}
	System.out.println("Valores do vetor y:");
	for (int i=0; i<y.length;i++) {
		System.out.print(y[i]+" , ");
	}System.out.println();
	
	
	for(int i =0; i < z.length;i++) {
		System.out.println("Insira os valores do terceiro vetor!");
		int valorx = entrada.nextInt();
		z [i]= valorx;
		}
	System.out.println("Valores do vetor z:");
	for (int i=0; i<z.length;i++) {
		System.out.print(z[i]+" , ");
	}System.out.println();
	
	//Aqui chama a fun��o que calcula o produto escalar.
	System.out.println("---------------------------------");
	System.out.println("Produto escalar de x e y:");
	System.out.println(vet.Produtoescalar(x, y));
	System.out.println("Produto escalar de x e z:");
	System.out.println(vet.Produtoescalar(x, z));	
	System.out.println("Produto escalar de y e z:");
	System.out.println(vet.Produtoescalar(y, z));
	
	//Aqui verifica se os vetores s�o ortogonais com a fun��o vet.ortogonal, nesse caso se for ele retorna
	//true, sen�o false, ai chamamos a fun��o vet.ortogonaliza��o que diz se � ou n�o com uma string.
	System.out.println("---------------------------------");
	System.out.println("Os vetor x e y s�o ortogonais?");
	System.out.println(vet.ortogonaliza��o(vet.ortogonal(x, y)));
	System.out.println("Os vetor x e y s�o ortogonais?");
	System.out.println(vet.ortogonaliza��o(vet.ortogonal(x, z)));
	System.out.println("Os vetor x e y s�o ortogonais?");
	System.out.println(vet.ortogonaliza��o(vet.ortogonal(y, z)));
	
	//Aqui chamamos a fun��o norma que calcula a norma de cada vetor.
	System.out.println("---------------------------------");
	System.out.println("A norma de v1 �: "+ vet.normax(x));
	System.out.println("A norma de v2 �: "+ vet.normax(y));
	System.out.println("A norma de v3 �: "+ vet.normax(z));
	
	//aqui mostra se os vetores s�o unit�rios, ai chamamos  a fun��o vet.valorunit�rio que � um booleano e vai dizer
	//se � true ou false.
	System.out.println("---------------------------------");
	System.out.println("Caso todos os vetores sejam unit�rios os valores aparecem abaixo:");
	System.out.println(vet.unitario(vet.valorunitario(x)));
	System.out.println(vet.unitario(vet.valorunitario(y)));
	System.out.println(vet.unitario(vet.valorunitario(z)));

	//Caso apare�a unit�rio ele percorre o vetor e mostra os valores do vetor unit�rio.
	if (vet.valorunitario(x)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unit�rios de x s�o:");
		for (int i=0;i < x.length;i++) {
			System.out.println(x[i]+ "|");
		}
	}
	if (vet.valorunitario(y)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unit�rios de y s�o:");
		for (int i=0;i < y.length;i++) {
			System.out.println(y[i]+ "|");
		}
	}
	if (vet.valorunitario(z)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unit�rios de z s�o:");
		for (int i=0;i < z.length;i++) {
			System.out.println(z[i]+ "|");
		}
	}
	
	//Aqui criamos um vetor para receber os valores da proje��o entre dois vetores
	//e depois com um for imprimimos os valores dessa proje��o
	System.out.println("---------------------------------");
	System.out.println("Proje��o de x em y: ");
	double projecaoxy []=vet.projecaosimples(x, y);
	for(int i=0; i<projecaoxy.length;i++) {
		System.out.println(Math.round((projecaoxy[i])*100.0)/100.0);
		
	}
	System.out.println("---------------------------------");
	System.out.println("Proje��o de x em z: ");
	double projecaoxz []=vet.projecaosimples(x, z);
	for(int i=0; i<projecaoxz.length;i++) {
		System.out.println(Math.round((projecaoxz[i])*100.0)/100.0);
	}
	System.out.println("---------------------------------");
	System.out.println("Proje��o de y em z: ");
	double projecaoyz []=vet.projecaosimples(y, z);
	for(int i=0; i<projecaoyz.length;i++) {
		System.out.println(Math.round((projecaoyz[i])*100.0)/100.0);
		
		
	}
	//Aqui verifica se a base � ortonormal pois chamamos a fun��o vet.baseortonormal que dentro dela tem a fun��o vet.base 
	//que � um booleano e verifica se todos os vetores s�o ortogonais. 
	System.out.println("---------------------------------");
	System.out.println(vet.baseortonormal(vet.base(x, y, z)));
	
	// E aqui chamamos a fun��o vet.ortonormaliza��o que faz a ortonormaliza��o de Gran-Schimidt
	System.out.println("---------------------------------");
	System.out.println("Valores da ortonormaliza��o de Gran Schimidt:");
	vet.ortonormalizacao(x, y, z);
	}
}
