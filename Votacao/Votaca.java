package Votacao;

import java.util.ArrayList;

public class Votaca {
	protected ArrayList<Usuario> usuario;
	protected Usuario admin;
	protected ArrayList<Usuario> podeVotar;
	protected ArrayList<Canditado> canditado;
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
	public Usuario getAdmin() {
		return admin;
	}
	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
	public ArrayList<Usuario> getPodeVotar() {
		return podeVotar;
	}
	public void setPodeVotar(ArrayList<Usuario> podeVotar) {
		this.podeVotar = podeVotar;
	}
	public ArrayList<Canditado> getCanditado() {
		return canditado;
	}
	public void setCanditado(ArrayList<Canditado> canditado) {
		this.canditado = canditado;
	}
	
	public Votaca(ArrayList<Usuario> podeVota, ArrayList<Usuario> usuario, ArrayList<Canditado> canditado, Usuario admin) {
		this.admin=admin;
		this.canditado=canditado;
		this.podeVotar=podeVota;
		this.usuario=usuario;
		// perguntar diferenciar agregacao multipla  da composicao multipla
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Votaca [usuario=");
		builder.append(usuario);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", podeVotar=");
		builder.append(podeVotar);
		builder.append(", canditado=");
		builder.append(canditado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
