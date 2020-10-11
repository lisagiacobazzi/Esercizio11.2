public class Veicolo{
	private double velocita;					
	private double accellerazione;
	
	public Veicolo() {
		velocita = 0;
		accellerazione = 0;
	}
	public Veicolo(double velocita, double accelerazione) {
		this.velocita = velocita;
		this.accellerazione = accelerazione;
	}
	
	public double getVelocita() {
		return velocita;
	}
	public double getAccellerazione() {
		return accellerazione;
	}
	
	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
	
	public void setAccellerazione(double accellerazione) {
		this.accellerazione = accellerazione;
	}
	
	static public void printVelocita(Veicolo v) {
		System.out.println(v.velocita);
	}
}
