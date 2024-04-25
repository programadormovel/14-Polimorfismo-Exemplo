public class ExemploRetornoPolimorfico{

	private static Parceladora[] parceladoras;

	static{
		Parceladora parcCartao = new ParceladoraCartao();
		Parceladora parcCheque = new ParceladoraCheque();
		parceladoras = new Parceladora[]{parcCartao, parcCheque};
	}

	// observe o retorno polimorfico, usando a inerface comum Parceladora 
	public static Parceladora getParceladora(int posicao){
		if(posicao>=0 && posicao<parceladoras.length){
			return parceladoras[posicao];
		}
		return null;
	}

	public static void main(String[] args){	
		Produto tv = new Produto("Tv", 3500.0);
		tv.imprime();
		for(int i=0;i<2;i++){
			Parceladora parceladora = getParceladora(i);
			PlanoDePagamento plano = parceladora.parcela(tv); 
	    		plano.imprime();
		}
	}

}



