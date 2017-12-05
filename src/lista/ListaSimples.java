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

	public void inserirUltimo(Pessoa p){
		No novoNo = new No(p);
		if(this.verificaVazia()){
			this.primeiro = novoNo;

		} else{
			this.ultimo.setProx(novoNo);
		}
		this.ultimo = novoNo;
		this.quantNo++;
	}

	public boolean verificaVazia(){
		return (this.primeiro == null);
	}

	public boolean removerNo(String nome){
		No atual =  this.primeiro;
		No anterior = null;
		if(verificaVazia()){
			return false;
		} else {
			while ((atual != null) && (!atual.getP().getNome().equals(nome))){
				anterior = atual;
				atual = atual.getProx();
			}
			if (atual == this.primeiro){
				if(this.primeiro == this.ultimo){
					this.ultimo = null;
				}

				this.primeiro = primeiro.getProx();
			} else {
				if (atual== this.ultimo){
					this.ultimo = anterior;
				}
				anterior.setProx(atual.getProx());
			}
			this.quantNo--;
			return true;		
		}	
	}

	public String pesquisarNo(String nome){
		String msg = "";
		No atual = this.primeiro;
		while ((atual != null) && (atual.getP().getNome().equals(nome))) {
			atual = atual.getProx();
		}
		return msg = "Nome: "+atual.getP().getNome()+"\n"+
				"Sexo: "+atual.getP().getSexo()+"\n"+
				"Idade:"+atual.getP().getIdade();
	}

	public String imprimirLista(){
		String msg = "";
		if (verificaVazia()){
			msg = "A lista está vazia";		
		}else{
			No atual = this.primeiro;
			while(atual != null){
				msg += atual.getP().getNome() + " -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
}