public class ExemploColecoesHeterogeneas{
	public static void imprimeOpcoesDeParcelamento
				(Produto produto, Parceladora[] parceladoras){
		for(Parceladora parceladora: parceladoras){
		    System.out.
			println("============================================");
		    PlanoDePagamento plano = parceladora.parcela(produto); 
		    plano.imprime();
		}
		System.out.println("============================================");
		
	}
	public static void main(String[] args){	

		Produto tv = new Produto("Tv", 3500.0);
		tv.imprime();
		//crie uma parceladora de cada tipo 
		Parceladora parcCheque = new ParceladoraCheque();
		Parceladora parcCartao = new ParceladoraCartao();
		/*
                 * colecao heterogenea, com objetos que implementam uma interface comum 
                 * também eh possivel utilizar colecoes heterogeneas com objetos 
                 * que compartilham uma superclase comum
                 */
 		Parceladora[] parcs = {parcCheque, parcCartao};
		imprimeOpcoesDeParcelamento(tv, parcs);
	}

}



