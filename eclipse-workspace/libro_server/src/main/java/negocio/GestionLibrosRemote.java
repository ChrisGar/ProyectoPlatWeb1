package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(String codigo, String titulo, String categoria, String editorial);
	public List<Libro> getLibros();
	public void eliminaLibrosNombre(String filtro);
}
