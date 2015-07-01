/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penny ;

public class Saltos extends Sapatos{
    
    private Double tamanho;

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
     public String resumosaltos ()
    {
        
        return  this.getModelo() + ":" + this.getCor() + " ," + this.getNumeracao() + "salto: " + this.tamanho;
        
        
    }
    
}
