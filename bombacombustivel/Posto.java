public class Posto{
	public static void main(String args[]){

		BombaDeCombustivel bomba1, bomba2;

		bomba1 = new BombaDeCombustivel("Gasolina", 3.99f);
		bomba2 = new BombaDeCombustivel("Etanol", 2.39f);

		bomba1.puxarGancho();
		bomba1.abastecerPorLitro(20);
		bomba1.voltarGancho();


		bomba2.puxarGancho();
		bomba2.abastecerPorValor(50);
		bomba2.voltarGancho();


	}
}