 import java.util.Scanner;

public class Meteoritos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x, y; //(coordenadas meterorito)
		int x1, y1, x2, y2 ; //coordenadas da fazenda
		int n;
		int contador;
		int teste = 0;
		
		do {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			
			if (x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0){
				teste++;
				n = scan.nextInt();
				contador = 0;
				for (int i=0 ; i < n ; i++) {
					x = scan.nextInt();
					y = scan.nextInt();

					if ((x >= x1 && x <= x2) && (y >= y2 && y <= y1 )) {
						contador++;
					} 
				}
				
				System.out.println("Teste "+teste);
				System.out.println(contador);
				System.out.println("");
			}
			
		} while (x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0);
	}

}
