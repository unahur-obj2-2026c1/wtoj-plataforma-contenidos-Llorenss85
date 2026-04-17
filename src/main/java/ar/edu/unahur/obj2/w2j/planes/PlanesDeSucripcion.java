package ar.edu.unahur.obj2.w2j.planes;

public abstract class PlanesDeSucripcion {
    private Double costoFijo;
    private Usuario usuario; 
    public PlanesDeSucripcion(Usuario unUsuario) {
        usuario = unUsuario;
    }

    public Double costo(){
        return this.costoFijo() + this.getCostoMensal(usuario);
    }
    public abstract Double costoFijo(); //dato fijo 
    public abstract Double getCostoMensal(Usuario unUusario); //variable<- depende del usuario 

}

