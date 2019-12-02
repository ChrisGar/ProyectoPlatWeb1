package vista;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import negocio.GestionLibrosLocal;
import modelo.Autor;
import modelo.Libro;
import modelo.Persona;
import modelo.Telefono;
@ManagedBean

/**
 *  
 *  @RequestScope
 *
 */

public class GestionLibrosBean {
	
	@Inject
	private GestionLibrosLocal gl;
	
	private Libro libro = new Libro();
	/*Beans properties*/
	private String codigo;
	private String titulo;
	private String categoria;
	private String editorial;
	
	private List<Libro> libros;
	
	
	@PostConstruct
	public void init() {
		libro = new Libro();
		libro.addAutor(new Autor());
		libros = gl.getLibros();
	}
	
	
	public String guardarLibro() {
		
		System.out.println(codigo +"  "+ "  " +titulo+ "  " +categoria+ "  " +editorial) ;
		gl.guardarLibro(codigo, titulo,categoria,editorial); 
		init();
		libros = gl.getLibros();
		
		return "listar_libros";
	}


	public GestionLibrosLocal getGl() {
		return gl;
	}


	public void setGl(GestionLibrosLocal gl) {
		this.gl = gl;
	}



	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public List<Libro> getLibros() {
		return libros;
	}


	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public String addAutor() {
		libro.addAutor(new Autor());
		return null;
	}

	

	
}