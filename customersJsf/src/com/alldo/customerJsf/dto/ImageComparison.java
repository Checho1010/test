/**
 * 
 */
package com.alldo.customerJsf.dto;

/**
 * @author CHECHO
 *
 */
public class ImageComparison {

	private String left;
	private String right;
	private String titulo;
	
	public ImageComparison(String left, String right, String titulo) {
		super();
		this.left = left;
		this.right = right;
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	
	
}
