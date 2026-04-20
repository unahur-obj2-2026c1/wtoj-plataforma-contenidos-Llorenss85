package ar.edu.unahur.obj2.w2j.planes;

public abstract class PlanesDeSucripcion {
    public PlanesDeSucripcion() {;
    }

    public Double costo(Usuario usuario){
        return this.costoFijo() + this.getCostoMensal(usuario);
    }
    public abstract Double costoFijo(); //dato fijo 
    public abstract Double getCostoMensal(Usuario unUusario); //variable<- depende del usuario 

}

