package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;;

public class Series extends Contenido{
    private List<Temporada> temporada = new ArrayList<>();
    
    public Series(String titulo, Double costoBase, List<Temporada> temporada) {
        super(titulo, costoBase);
        this.temporada = temporada;
    }
    
    @Override
    public Double doCosto(){ // e. costo 
        return temporada.stream().mapToDouble(e -> e.costo()).average().orElse(0) ;
    }

    public void setTemporada(List<Temporada> temporada) {
        this.temporada = temporada;
    }

    
    

}
