package penny;
import java.util.ArrayList;
import java.util.List;

public class Armario {
    
    
    private List<Sapatos> sapato;
    private String letra;
    public List<Sapatos> getSapatos() {
        return sapato;
    }

    public void setSapatos(List<Sapatos> sapatos) {
        this.sapato = sapatos;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

   
    public Armario ()
    {
        
        this.sapato = null;
        this.letra = null;
        
    }
    
    public void catalogarSapatos ()
    {
        Sapatos s = new Sapatos ();
        s.setCor("Prata");
        
    }
    
    public String mostrarTudo ()
    {
        String a = "Prateleira " + this.letra + "\n";
        a = a + "Sapatos \n";
        
        for (Sapatos sapatos : sapato) {
            a = a + sapatos.resumo() + "\n";
        }
        return a;
        
    }
    

}
    
    

