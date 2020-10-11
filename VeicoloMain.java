public class VeicoloMain{
	public static void main(String[] args) {
		Automobile a;
		Bicicletta b;
		
		a = new Automobile ("BL987CT");
		b = new Bicicletta ();
		
		a.accellera(3.5,4);
		b.pedala(8,3);
		
		System.out.print("La velocità della macchina è: ");
		a.printVelocita(a);
		System.out.print("La velocità della bicicletta è: ");
		b.printVelocita(b);
		}
}

