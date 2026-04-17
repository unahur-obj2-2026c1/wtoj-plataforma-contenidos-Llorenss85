package ar.edu.unahur.obj2.w2j.contenidos;

public class IDRA {
    private static IDRA instance= new IDRA(); //Singleton
    private Double valor = 0.5;  
    private IDRA(){} //Anulas el construcor

    public static IDRA getInstance(){
        return instance;
    }    

    public Double canon(){
        return valor;
    } 
    public  void setValor(Double unValor ){
      valor = unValor;
    } 
}
