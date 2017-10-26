/**
 * 
 */
package com.alldo.customerJsf.datamanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.alldo.customerJsf.dto.ImageComparison;

/**
 * @author CHECHO
 *
 */
@SessionScoped
@ManagedBean(name="ourWorksDatamanager")
public class OurWorksDatamanager implements Serializable{

	private static final long serialVersionUID = -1934346881075133749L;
	
	//private List<ImageComparison> comparacionList = new ArrayList<ImageComparison>();
	private List<ImageComparison> comparacionList;// = new ArrayList<ImageComparison>();
	private ImageComparison comparacionSeleccionada;

	public ImageComparison getComparacionSeleccionada() {
		return comparacionSeleccionada;
	}
	public void setComparacionSeleccionada(ImageComparison comparacionSeleccionada) {
		this.comparacionSeleccionada = comparacionSeleccionada;
	}

	@PostConstruct
    public void init() {
		comparacionList = new ArrayList<ImageComparison>();
         
		comparacionList.add(new ImageComparison("/images/dynamic/?file=antes.jpg", "/images/dynamic/?file=despues.jpg", "Titulo 1"));
		comparacionList.add(new ImageComparison("/images/dynamic/?file=antes2.jpg", "/images/dynamic/?file=despues2.jpg", "Titulo 2"));
		comparacionList.add(new ImageComparison("/images/dynamic/?file=antes2.jpg", "/images/dynamic/?file=despues2.jpg", "Titulo 3"));
        /*cars.add(new Car("4", "BMW", 2012, "Red"));
        cars.add(new Car("5", "Fiat", 2001, "Yellow"));
        cars.add(new Car("6", "Mercedes", 2014, "Blue"));*/
    }
	
	public List<ImageComparison> getComparacionList() {
		return comparacionList;
	}
	public void setComparacionList(List<ImageComparison> comparacionList) {
		this.comparacionList = comparacionList;
	}
	
	
}
