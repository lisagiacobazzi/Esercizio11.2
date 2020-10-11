public class Automobile extends Veicolo{
	private String targa;
	private Boolean avviata;
	
	public Automobile(String targa) {
		super();
		this.targa = targa;
		avviata = false;
	}
	
	public void avvia() {
		avviata = true;
	}
	public void spegni() {
		avviata = false;
	}
	public void accellera(double accellerazione, int secondi) {
		if (avviata == true) {
			double vel = getVelocita()+(accellerazione* secondi);
			setVelocita(vel);
			setAccellerazione(accellerazione);
		}
		else System.out.println("Errore: macchina spenta.");
	}
}
