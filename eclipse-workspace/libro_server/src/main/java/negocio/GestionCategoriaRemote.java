package negocio;

import java.util.List;
import javax.ejb.Remote;
import modelo.Categoria;
@Remote
public interface GestionCategoriaRemote {
	
	public void guardarAutor(String codigo, String nombre);
	public List<Categoria> getCategorias();
}
