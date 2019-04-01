package org.framework.beans;

import java.util.ArrayList;
import java.util.List;

public abstract class ResponseBean<T> {

	private List<T> list = new ArrayList<T>();

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
