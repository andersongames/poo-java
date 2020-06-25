package laboratorio;

public class AloMundoJava2 {
	
	String mensagem;
	
	public AloMundoJava2() {
		this.mensagem = "Alo Mundo!";
	}
	
	public AloMundoJava2 (String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AloMundoJava2 alomundo = new AloMundoJava2();
		
		System.out.println("" + alomundo.getMensagem());
		alomundo.setMensagem("Um novo alo mundo.");
		System.out.println("" + alomundo.getMensagem());

	}

}