package com.jiachengyu.entity;

public class Movie {

	private Integer mid;
	private String mname;
	private String author;
	private double price;
	private String sydatea;
	private int hours;
	private int tid;
	private int years;
	private String addr;
	private int struts;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSydatea() {
		return sydatea;
	}
	public void setSydatea(String sydatea) {
		this.sydatea = sydatea;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getStruts() {
		return struts;
	}
	public void setStruts(int struts) {
		this.struts = struts;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", author=" + author + ", price=" + price + ", sydatea="
				+ sydatea + ", hours=" + hours + ", tid=" + tid + ", years=" + years + ", addr=" + addr + ", struts="
				+ struts + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Integer mid, String mname, String author, double price, String sydatea, int hours, int tid, int years,
			String addr, int struts) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.author = author;
		this.price = price;
		this.sydatea = sydatea;
		this.hours = hours;
		this.tid = tid;
		this.years = years;
		this.addr = addr;
		this.struts = struts;
	}
	public Movie(String mname, String author, double price, String sydatea, int hours, int tid, int years, String addr,
			int struts) {
		super();
		this.mname = mname;
		this.author = author;
		this.price = price;
		this.sydatea = sydatea;
		this.hours = hours;
		this.tid = tid;
		this.years = years;
		this.addr = addr;
		this.struts = struts;
	}
	
}
