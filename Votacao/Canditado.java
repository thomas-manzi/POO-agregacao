package Votacao;

public class Canditado {
	protected Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canditado [usuario=");
		builder.append(usuario);
		builder.append("]");
		return builder.toString();
	}
	public Canditado(String email) {
		usuario=new Usuario();
		this.usuario.setEmail(email);
	}

}
