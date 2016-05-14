/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author feisal
 */
public class Tools extends Inventori{
	private String nama;
	private boolean statusPakai;
	
	public Tools(String s){
		super(s);
		statusPakai = false;
	}

	public void setNama(String s){
		nama = s;
	}
	
	public String getNama(){
		return nama;
	}
		
	public boolean getStatusPakai(){
		return statusPakai;
	}
		
	public void setStatusPakai(){
		if(!statusPakai){
			statusPakai = true;
		}else{
			statusPakai = false;
		}
	}
}

