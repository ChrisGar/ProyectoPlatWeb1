package negocio;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

import modelo.Libro;

@Local
public interface GestionLibrosLocal {
	
	public void guardarLibro(String codigo, String titulo, String autor, String categoria, String editorial);
	public List<Libro> getLibros();
	public List<Libro> getLibrosNombre(String filtro);
	public void eliminaLibrosNombre(String filtro);

}
