package ar.edu.unahur.obj2.w2j.planes;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
public class Usuario {
    private List<Contenido> contenidoVisto;
    private PlanesDeSucripcion plan;
    
    public Usuario(List<Contenido> contenidoVisto, PlanesDeSucripcion plan) {
        this.contenidoVisto = contenidoVisto;
        this.plan = plan;
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }
    public Double costoDelPlan(){
        return plan.costo(this);
    }
    public void vaciarContenido(){
        contenidoVisto.clear();
    }
    public void addContenidoVisto(Contenido unContenido) {
        contenidoVisto.add(unContenido);
    }

    public PlanesDeSucripcion getPlan() {
        return plan;
    }

    public void setPlan(PlanesDeSucripcion plan) {
        this.plan = plan;
    }
    public Integer canVistas(){
        return contenidoVisto.size();
    }
    public List<Contenido> excedentesDelPlan(Integer limite){
        return contenidoVisto.stream().skip(limite).toList();
                //contenidos.subList(limite,contenidoVisto.size())
    }
    
    
}
