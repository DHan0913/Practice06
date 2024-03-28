package com.javaex.ex01;

public class Customer extends Person{
	private int cNo; 
	private int point; 
			
	//생성자
	public Customer () {
		
	}
	
	public Customer (String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
		
	}
	
	public int getCNo() {

		return cNo;
	}
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {

		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.println("#이름:" + name + " #핸드폰:" + hp + " #고객번호:" + cNo + " #포인트:" + point); //protected
		
		// 부모의 getter 이용 super.get_
	}
	
}
