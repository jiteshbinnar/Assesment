package com.springcore.com.springcore;

public class Laptop {

	
	private int lid;
	private String modelname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lid;
		result = prime * result + ((modelname == null) ? 0 : modelname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (lid != other.lid)
			return false;
		if (modelname == null) {
			if (other.modelname != null)
				return false;
		} else if (!modelname.equals(other.modelname))
			return false;
		return true;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int lid, String modelname) {
		super();
		this.lid = lid;
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", modelname=" + modelname + "]";
	}
	
}
