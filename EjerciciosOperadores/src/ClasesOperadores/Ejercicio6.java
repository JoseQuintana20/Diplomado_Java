package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int ladoCuadrado = 8;
		System.out.println("El Área es "+(ladoCuadrado*ladoCuadrado)+" y el Perimero es "+(ladoCuadrado*4));
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo, ladoDosTriangulo = 8;
		System.out.println("El Área es "+((baseTriangulo*alturaTriangulo)/2)+" y el Perimero es "+(baseTriangulo+ladoDosTriangulo+ladoDosTriangulo));
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		System.out.println("El Área es "+(baseRectangulo*alturaRectangulo)+" y el Perimero es "+(baseRectangulo*2+alturaRectangulo*2));
		

	}

}
