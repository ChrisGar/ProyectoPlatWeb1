package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Libro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7040436953499503136L;
	@Id
	private String codigo;
	private String titulo;
	private List<Autor> autores;
	private String categoria;
	private String editorial;
	
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
	
	public List<Autor> getAutor() {
		return autores;
	}
	public void setAutor(List<Autor> autor) {
		this.autores = autor;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addAutor(Autor autor) {
		if(autores==null)
			autores = new ArrayList<Autor>();
		autores.add(autor);
	}
	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", autores=" + autores + ", categoria=" + categoria
				+ ", editorial=" + editorial + "]";
	}
	
	
}
