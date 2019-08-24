package com.jzhang.lab.db.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyData {
	
	@Id
	private int id;
	private String first;
	private String last;
	private String lang;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "MyData [id=" + id + ", first=" + first + ", last=" + last + ", lang=" + lang + "]";
	}

}
