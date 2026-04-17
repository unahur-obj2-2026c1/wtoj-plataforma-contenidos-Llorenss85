package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }
    
    @Override
    public Double doCosto(){
        return  IDRA.getInstance().canon(); // el costobase ya se calcula con el metodo costo, por eso se deberia sacar esto. 
    }
}
