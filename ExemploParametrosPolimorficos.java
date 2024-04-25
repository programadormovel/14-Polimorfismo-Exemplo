public class ExemploParametrosPolimorficos{

	/* 
         * observe que ao escolher a superclasse comum ImpressoraProduto, 
         * podemos eliminar os dois metodos abaixo
         */
	public static void imprime(Produto produto, ImpressoraProduto impressora){
		impressora.setProduto(produto);
		impressora.imprimeProduto();
	}

        /* dois metodos nao necessarios ao escolher a superclasse comum ImpressoraProduto
	 * public static void imprime(Produto produto, ImpressoraProdutoPipe impressora){
	 * 	impressora.setProduto(produto);
	 * 	impressora.imprimeProduto();
	 * }

	 * public static void imprime(Produto produto, ImpressoraProdutoXml impressora){
	 * 	impressora.setProduto(produto);
	 * 	impressora.imprimeProduto();
	 * }
	 */




	public static void main(String[] args){	
		Produto produto = new Produto("Tv", 2500.0);
		// criar um impressora de cada tipo
		ImpressoraProduto impPipe = new ImpressoraProdutoPipe();
		ImpressoraProduto impXml = new ImpressoraProdutoXml();

		imprime(produto, impPipe);
		imprime(produto, impXml);
	}
}



