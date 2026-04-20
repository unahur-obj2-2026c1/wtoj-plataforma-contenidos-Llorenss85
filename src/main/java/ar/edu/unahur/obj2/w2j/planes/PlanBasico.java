package ar.edu.unahur.obj2.w2j.planes;

public class PlanBasico extends PlanesDeSucripcion {
    private  Integer limite; 
    public PlanBasico( Integer unLimite) {
        limite =unLimite;
    }

     @Override
    public Double getCostoMensal(Usuario unUusario) {
        return costoaAdicionalAlContenido(unUusario) ;
    }  
    
    @Override
    public Double costoFijo() {
        return 5.0;
    }

    public Double costoaAdicionalAlContenido( Usuario unUusario ) {
        if( unUusario.canVistas() > limite ){
            return unUusario.excedentesDelPlan(limite).stream().mapToDouble( e -> e.costo()).sum();
        }
        else{
            return 0.0;
        }
    }

    

}

