package Votacao;

public class Voto {
	protected Votaca votaca;

	public Votaca getVotaca() {
		return votaca;
	}

	public void setVotaca(Votaca votaca) {
		this.votaca = votaca;
	}

	public Voto(Votaca votaca) {
		this.votaca =votaca;
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voto [votaca=");
		builder.append(votaca);
		builder.append("]");
		return builder.toString();
	}
	

}
