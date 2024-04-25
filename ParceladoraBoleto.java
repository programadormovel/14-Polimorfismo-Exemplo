/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class ParceladoraBoleto implements Parceladora{
    
     private double juros = 0.05;
        private int qtdeParcelas = 10;
        
        public PlanoDePagamento parcela(Produto produto){
            double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
            PlanoDePagamento plano = new PlanoDePagamento("Boleto", qtdeParcelas, valorParcela);
                    return plano;
        }
        
    }