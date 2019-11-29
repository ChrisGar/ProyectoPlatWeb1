package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionCategoriaLocal;
import negocio.GestionLibrosLocal;
import modelo.Categoria;
import modelo.Libro;
@ManagedBean
public class BusquedaCategoriasBean {
	
	@Inject //se trae instancias del servidor
	private GestionCategoriaLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Categoria> categorias;
	
	
	public String BuscarCategoria()
	{
		categorias = gl.getCategoriasNombre();
		return null;
	}


	public GestionCategoriaLocal getGl() {
		return gl;
	}


	public void setGl(GestionCategoriaLocal gl) {
		this.gl = gl;
	}


	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	
	
	
	

}