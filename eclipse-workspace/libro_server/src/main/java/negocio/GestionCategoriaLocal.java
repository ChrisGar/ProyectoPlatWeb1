package negocio;

import java.util.List;



import javax.ejb.Local;
import modelo.Categoria;
import modelo.Libro;
@Local
public interface GestionCategoriaLocal {
	
	public void guardarCategoria(String codigo, String nombre);
	public List<Categoria> getCategorias();
	public List<Categoria> getCategoriasNombre();
}
