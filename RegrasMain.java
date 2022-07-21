import java.util.Scanner;

public class RegrasMain {

	public static void main(String[] args) {

	Scanner entrada= new Scanner (System.in);
	
	Regras vet = new Regras ();
	double[]x = new double [3];
	double []y = new double [3];
	double []z = new double [3];
	
	// Aqui ele repassa os vetores para um único vetor.
	for(int i =0; i < x.length;i++) {
		System.out.println("Insira os valores do 1º vetor!");
		int valorx = entrada.nextInt();
		x [i]= valorx;
		}
	System.out.println("Valores do vetor x:");
	for (int i=0; i<x.length;i++) {
		System.out.print(x [i]+" , ");
	}System.out.println();

	
	
	for(int i =0; i < y.length;i++) {
		System.out.println("Insira os valores do 2º vetor!");
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
	
	//Aqui chama a função que calcula o produto escalar.
	System.out.println("---------------------------------");
	System.out.println("Produto escalar de x e y:");
	System.out.println(vet.Produtoescalar(x, y));
	System.out.println("Produto escalar de x e z:");
	System.out.println(vet.Produtoescalar(x, z));	
	System.out.println("Produto escalar de y e z:");
	System.out.println(vet.Produtoescalar(y, z));
	
	//Aqui verifica se os vetores são ortogonais com a função vet.ortogonal, nesse caso se for ele retorna
	//true, senão false, ai chamamos a função vet.ortogonalização que diz se é ou não com uma string.
	System.out.println("---------------------------------");
	System.out.println("Os vetor x e y são ortogonais?");
	System.out.println(vet.ortogonalização(vet.ortogonal(x, y)));
	System.out.println("Os vetor x e y são ortogonais?");
	System.out.println(vet.ortogonalização(vet.ortogonal(x, z)));
	System.out.println("Os vetor x e y são ortogonais?");
	System.out.println(vet.ortogonalização(vet.ortogonal(y, z)));
	
	//Aqui chamamos a função norma que calcula a norma de cada vetor.
	System.out.println("---------------------------------");
	System.out.println("A norma de v1 é: "+ vet.normax(x));
	System.out.println("A norma de v2 é: "+ vet.normax(y));
	System.out.println("A norma de v3 é: "+ vet.normax(z));
	
	//aqui mostra se os vetores são unitários, ai chamamos  a função vet.valorunitário que é um booleano e vai dizer
	//se é true ou false.
	System.out.println("---------------------------------");
	System.out.println("Caso todos os vetores sejam unitários os valores aparecem abaixo:");
	System.out.println(vet.unitario(vet.valorunitario(x)));
	System.out.println(vet.unitario(vet.valorunitario(y)));
	System.out.println(vet.unitario(vet.valorunitario(z)));

	//Caso apareça unitário ele percorre o vetor e mostra os valores do vetor unitário.
	if (vet.valorunitario(x)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unitários de x são:");
		for (int i=0;i < x.length;i++) {
			System.out.println(x[i]+ "|");
		}
	}
	if (vet.valorunitario(y)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unitários de y são:");
		for (int i=0;i < y.length;i++) {
			System.out.println(y[i]+ "|");
		}
	}
	if (vet.valorunitario(z)) {
		System.out.println("---------------------------------");
		System.out.println("Os vetores unitários de z são:");
		for (int i=0;i < z.length;i++) {
			System.out.println(z[i]+ "|");
		}
	}
	
	//Aqui criamos um vetor para receber os valores da projeção entre dois vetores
	//e depois com um for imprimimos os valores dessa projeção
	System.out.println("---------------------------------");
	System.out.println("Projeção de x em y: ");
	double projecaoxy []=vet.projecaosimples(x, y);
	for(int i=0; i<projecaoxy.length;i++) {
		System.out.println(Math.round((projecaoxy[i])*100.0)/100.0);
		
	}
	System.out.println("---------------------------------");
	System.out.println("Projeção de x em z: ");
	double projecaoxz []=vet.projecaosimples(x, z);
	for(int i=0; i<projecaoxz.length;i++) {
		System.out.println(Math.round((projecaoxz[i])*100.0)/100.0);
	}
	System.out.println("---------------------------------");
	System.out.println("Projeção de y em z: ");
	double projecaoyz []=vet.projecaosimples(y, z);
	for(int i=0; i<projecaoyz.length;i++) {
		System.out.println(Math.round((projecaoyz[i])*100.0)/100.0);
		
		
	}
	//Aqui verifica se a base é ortonormal pois chamamos a função vet.baseortonormal que dentro dela tem a função vet.base 
	//que é um booleano e verifica se todos os vetores são ortogonais. 
	System.out.println("---------------------------------");
	System.out.println(vet.baseortonormal(vet.base(x, y, z)));
	
	// E aqui chamamos a função vet.ortonormalização que faz a ortonormalização de Gran-Schimidt
	System.out.println("---------------------------------");
	System.out.println("Valores da ortonormalização de Gran Schimidt:");
	vet.ortonormalizacao(x, y, z);
	}
}
