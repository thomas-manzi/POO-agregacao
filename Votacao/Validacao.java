package Votacao;

public class Validacao {
 private String hash;
 private boolean ativo;
 protected Votaca votaca;
 protected Usuario usuario;
public String getHash() {
	return hash;
}
public void setHash(String hash) {
	this.hash = hash;
}
public boolean isAtivo() {
	return ativo;
}
public void setAtivo(boolean ativo) {
	this.ativo = ativo;
}
public Votaca getVotaca() {
	return votaca;
}
public void setVotaca(Votaca votaca) {
	this.votaca = votaca;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

	public Validacao(Votaca votaca, Usuario usuario) {
		this.votaca=votaca;
		this.usuario=usuario;
		
	}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Validacao [hash=");
	builder.append(hash);
	builder.append(", ativo=");
	builder.append(ativo);
	builder.append(", votaca=");
	builder.append(votaca);
	builder.append(", usuario=");
	builder.append(usuario);
	builder.append("]");
	return builder.toString();
}
 

 
}
