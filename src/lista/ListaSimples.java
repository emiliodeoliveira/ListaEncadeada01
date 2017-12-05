package lista;

public class ListaSimples {
	
	private No primeiro;
	private No ultimo;
	private int quantNo;
	
	public ListaSimples(){
		this.primeiro = null;
		this.ultimo = null;
		this.quantNo = 0;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantNo() {
		return quantNo;
	}

	public void setQuantNo(int quantNo) {
		this.quantNo = quantNo;
	}
	
	// recebe o valor de pessoa e insere no nó
	public void inserirPrimeiro(Pessoa p){
		No novoNo = new No(p);
		if (this.verificaVazia()){
			this.ultimo = novoNo;
		}
		novoNo.setProx(this.primeiro);
		this.primeiro = novoNo;
		this.quantNo++;
	}
	
	public boolean verificaVazia(){
		return (this.primeiro == null);
	}
}
