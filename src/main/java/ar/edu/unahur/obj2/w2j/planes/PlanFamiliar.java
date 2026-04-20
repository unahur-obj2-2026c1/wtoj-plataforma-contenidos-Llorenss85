package ar.edu.unahur.obj2.w2j.planes;
public class PlanFamiliar extends PlanBasico {
    public PlanFamiliar(  Integer unLimite) {
        super(unLimite);
        
    }
    
    @Override
    public Double getCostoMensal(Usuario unUusario) {
        return   super.getCostoMensal(unUusario)  * 0.85 ; 
    }//super.getCostoMensal(e)  
}
