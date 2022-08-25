package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Car {
		private int sl;
		private String owner;
		private String  car;
		@Id
		@Column 
		public int getSl() {
			return sl;
		}
		public void setSl(int sl) {
			this.sl = sl;
		}
	
		@Column
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		@Column
		public String getCar() {
			return car;
		}
		public void setCar(String car) {
			this.car = car;
		}
		@Override
		public String toString() {
			return "Car [sl=" + sl + ", owner=" + owner + ", car=" + car + "]";
		}
		
		
}
