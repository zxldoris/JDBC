package com.hxlxz.zxl.model;

public class ModelMapping {

	private Integer num;
	private String name;
	private String MAC;

	public int getNum() {
		return num;
	}

	public void setNum(Integer string) {
		this.num = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	@Override
	public String toString() {
		return "ModelMapping [num=" + num + ", name=" + name + ", MAC=" + MAC + "]";
	}
	
}
