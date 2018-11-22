package teste3;

public class Descobrir {
	
	private String frasedescobrir;
	private String dicafrase;
	private String fraseresposta;
	

	public Descobrir() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Descobrir(String frasedescobrir, String dicafrase ) {
		super();
		this.frasedescobrir = frasedescobrir;
		this.dicafrase = dicafrase;
		
	}

	public String getFrasedescobrir() {
		return frasedescobrir;
	}

	public void setFrasedescobrir(String frasedescobrir) {
		this.frasedescobrir = frasedescobrir;
	}

	public String getDicafrase() {
		return dicafrase;
	}

	public void setDicafrase(String dicafrase) {
		this.dicafrase = dicafrase;
	}

	public String getFraseresposta() {
		return fraseresposta;
	}

	public void setFraseresposta(String fraseresposta) {
		this.fraseresposta = fraseresposta;
	}
	
}
