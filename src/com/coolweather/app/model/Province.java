package com.coolweather.app.model;

public class Province {
	
	private int id;
	private String provinceName;
	private String provinceCode;
	
	public int getId(){
		return id;
		
	}
	
	public void setId(int id){
		this.id = id;
		
	}
	
	public String getProviceName(){
		return provinceName;
	}
	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
