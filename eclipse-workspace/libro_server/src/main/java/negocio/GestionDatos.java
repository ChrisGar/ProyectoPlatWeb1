package negocio;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import datos.CategoriaDAO;
import datos.EditorialDAO;
import datos.LibroDAO;
import modelo.Autor;
import modelo.Categoria;
import modelo.Editorial;
import modelo.Libro;
import modelo.Persona;
//import java.util.ArrayList;


@Stateless
public class GestionDatos implements GestionLibrosRemote , GestionLibrosLocal, GestionAutorRemote , GestionAutorLocal, GestionCategoriaRemote , GestionCategoriaLocal, GestionEditorialRemote , GestionEditorialLocal{
	
	@Inject
	private LibroDAO daoLib;
	@Inject
	private AutorDAO daoAut;
	@Inject
	private CategoriaDAO daoCat;
	@Inject
	private EditorialDAO daoEdit;
	
	
	public void guardarLibro(String codigo, String titulo ,String autor, String categoria, String editorial){
		Libro L = new Libro();  
		L.setCodigo(codigo);
		L.setTitulo(titulo);
		L.setAutor(autor);
		L.setCategoria(categoria);
		L.setEditorial(editorial);
		System.out.println(L);
		daoLib.insert(L);
		
		
	}
	
	public List<Libro> getLibros(){
		return daoLib.getLibros();
	}
	
	public List<Libro> getLibrosNombre(String filtro)
	{
		return daoLib.getLibrosNombre(filtro);
	}
	
	public void removeLibrosNombre(String filtro)
	{
		daoLib.remove(filtro);
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public void guardarAutor(String codigo, String nombre){
		Autor A = new Autor();  
		A.setCodigo(codigo);
		A.setNombre(nombre);
		System.out.println(A);
		daoAut.insert(A);
		
		
	}
	
	public List<Autor> getAutores(){
		return daoAut.getAutores();
	}
	
	public List<Autor> getAutoresNombre(String filtro)
	{
		return daoAut.getAutoresNombre(filtro);
	}
	
	
	
	///////////////////////////////////////////////////////////////////
	
	public void guardarCategoria(String codigo, String nombre){
		Categoria C = new Categoria();  
		C.setCodigo(codigo);
		C.setNombre(nombre);
		System.out.println(C);
		daoCat.insert(C);
		
		
	}
	
	public List<Categoria> getCategorias(){
		return daoCat.getCategorias();
	}
	
	public List<Categoria> getCategoriasNombre(String filtro)
	{
		return daoCat.getCategoriasNombre(filtro);
	}
	
	////////////////////////////////////////////////////////////////////////
	
	public void guardarEditorial(String codigo, String nombre, String ciudad){
		Editorial E = new Editorial();  
		E.setCodigo(codigo);
		E.setNombre(nombre);
		E.setCiudad(ciudad);
		System.out.println(E);
		daoEdit.insert(E);
		
		
	}
	
	public List<Editorial> getEditoriales(){
		return daoEdit.getEditoriales();
	}
	
	public List<Editorial> getEditorialesNombre(String filtro)
	{
		return daoEdit.getEditorialesNombre(filtro);
	}
	
	//////////////////////////////////////////////////////////////////////////////

	


	@Override
	public List<Editorial> getEditorialesNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> getCategoriasNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autor> getAutoresNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaLibrosNombre(String filtro) {
		// TODO Auto-generated method stub
		
	}




	
}
