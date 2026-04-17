package ar.edu.unahur.obj2.w2j.contenidos;
import java.util.List;
public class Temporada {
    private final Number numero;
    private List<Episodio> episodios ;
    
    public Temporada(Number numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
        
    }

    public Number getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
    
    public Double costo(){
        return episodios.stream().mapToDouble(e-> e.getCosto()).average().orElse(0.0)  ;
    }
}
