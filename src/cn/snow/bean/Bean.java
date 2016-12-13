package cn.snow.bean;

import java.util.List;

public class Bean<T> {

	private List<T> list;

	/**
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
