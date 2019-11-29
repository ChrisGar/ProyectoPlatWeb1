package vista;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionCategoriaLocal;
import negocio.GestionLibrosLocal;
import modelo.Categoria;
import modelo.Libro;
@ManagedBean
public class GestionCategoriaBean {
	
	@Inject //se trae instancias del servidor
	private GestionCategoriaLocal gl;
	
	/*Bean Properties*/
	private String codigo;
	private String nombre;
	private List<Categoria> categoria;
	
	
	public String guardarCategoria() {
		
		System.out.println(codigo + "  " + nombre) ;
		gl.guardarCategoria(codigo, nombre);; 
		
		categoria= gl.getCategorias();
		
		return "listar_categorias";
	}


	public GestionCategoriaLocal getGl() {
		return gl;
	}


	public void setGl(GestionCategoriaLocal gl) {
		this.gl = gl;
	}



	public List<Categoria> getCategoria() {
		return categoria;
	}


	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

}
