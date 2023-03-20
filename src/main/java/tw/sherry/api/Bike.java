package tw.sherry.api;

import java.io.Serializable;

public class Bike implements Serializable { //物件
//	private double speed; //封裝物件，無法改變//如果我做出腳踏車他就會擁有速度這個屬性+public可以讓別packag
	protected double speed; //繼承的子類別or相同的package可以使用
	
	public Bike () {
		System.out.println("Bike");
	}

	public void upSpeed() {
		speed = speed < 1 ? 1: speed *1.4; //速度<1 ?(三元運算) : 速度*1.4

	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}
	
	public double getSpeed() {
		return speed;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "sa";
		}	
}
