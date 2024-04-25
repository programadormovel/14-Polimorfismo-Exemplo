public class ParceladoraCartao implements Parceladora{
	private double juros = 0.03;
	private int qtdeParcelas = 12;
	public PlanoDePagamento parcela(Produto produto){
		double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
		PlanoDePagamento plano = 
			new PlanoDePagamento("Cartao de credito", qtdeParcelas, valorParcela); 
		return plano;
	}
}