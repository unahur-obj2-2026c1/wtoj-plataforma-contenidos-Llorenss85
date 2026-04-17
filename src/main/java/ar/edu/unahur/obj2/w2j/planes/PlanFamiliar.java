package ar.edu.unahur.obj2.w2j.planes;
public class PlanFamiliar extends PlanBasico {
    public PlanFamiliar( Usuario unUsuario, Integer unLimite) {
        super( unUsuario, unLimite);
        
    }
    
    @Override
    public Double getCostoMensal(Usuario unUusario) {
        return   super.getCostoMensal(unUusario)  * 0.85 ; 
    }//super.getCostoMensal(e)  
}
