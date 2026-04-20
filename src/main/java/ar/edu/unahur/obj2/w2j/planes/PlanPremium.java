package ar.edu.unahur.obj2.w2j.planes;

public class PlanPremium extends PlanesDeSucripcion {

    public PlanPremium() {
    }
    
    @Override
    public Double costoFijo() {
        return 12.0;
    }

    @Override
    public Double getCostoMensal(Usuario unUusario) {
        return 0.0;
    }
    
    
}
