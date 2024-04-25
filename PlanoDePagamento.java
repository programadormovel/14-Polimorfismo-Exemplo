/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PlanoDePagamento {
   private String formaPagto;
	private int qtdeParcelas;
	private double valorParcelas;

	public PlanoDePagamento(String formaPagto, int qtdeParcelas, double valorParcelas){
		this.formaPagto = formaPagto;
		this.qtdeParcelas = qtdeParcelas;
		this.valorParcelas = valorParcelas;
	}

	public String getFormaPagto(){
		return this.formaPagto;
	}
	public int getQtdeParcelas(){
		return this.qtdeParcelas;
	}
	public double getValorParcelas(){
		return this.valorParcelas;
	}
	public void imprime(){
		System.out.printf("%1$s em %2$d parcelas de %3$,.2f %n",formaPagto,qtdeParcelas,valorParcelas);
	}


} 

