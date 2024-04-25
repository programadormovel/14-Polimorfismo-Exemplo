public class ExemploCastUpCastDown{
	public static void main(String[] args){	

	System.out.println("\tCast Up");
	ProdutoDigital produtoDigital = 
		new ProdutoDigital("Ebook Java 8", 100.0);
	// Casting up impl�cito 
	Produto produto = produtoDigital;
	System.out.println("\timprime() sobreescrito em ProdutoDigital");
	produto.imprime();
	// Casting up impl�cito 
	Object object = produtoDigital;
	System.out.println("\ttoString() herdado de ...");
	System.out.println(object.toString());

	String texto = "Uma String qualquer";
	/*
         * descomentando esta linha, object instanceof Produto retorna false, 
	 * pois object apontara para  um objeto do tipo String que n�o eh inst�ncia de Produto
         */
	// object = texto;

	System.out.println(object.toString());

	//verifica se object aponta para um objeto do tipo Produto
	if(object instanceof Produto){
		System.out.println("\tCast Down");
		// Casting down expl�cito 
		produto = (Produto) object;
		produto.imprime();
	}else{
		System.out.println("N�o � poss�vel converter "
				+ object.getClass()+" para Produto");
	}

	}

}



