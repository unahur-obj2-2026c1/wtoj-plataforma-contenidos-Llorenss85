package ar.edu.unahur.obj2.w2j.plataforma;
import java.util.List;

import ar.edu.unahur.obj2.w2j.planes.Usuario;
public class Plataforma {
    private List<Usuario> usuarios;
    public Double calcularImporte(){
        Double total=usuarios.stream().mapToDouble(e-> e.costoDelPlan()).sum();
        usuarios.forEach(e-> e.vaciarContenido());
        return total;
    }
    public void addUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
}
