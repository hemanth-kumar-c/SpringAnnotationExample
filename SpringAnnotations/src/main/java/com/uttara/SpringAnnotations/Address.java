package com.uttara.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	private String homeNumber;
	private String street;
	
	@Value("Bengaluru")
	private String city;
	private String pincode;
	private String state;

	@Override
	public String toString() {
		return "Address [homeNumber=" + homeNumber + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((homeNumber == null) ? 0 : homeNumber.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (homeNumber == null) {
			if (other.homeNumber != null)
				return false;
		} else if (!homeNumber.equals(other.homeNumber))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
		System.out.println("in A -> setHomeNumber()");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
		System.out.println("in A -> setStreet()");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("in A -> setCity()");
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;System.out.println("in A -> setPincode()");
	}
	
	
	public String getState() {
		return state;
	}
	@Value("Karnataka")
	public void setState(String state) {
		this.state = state;
		System.out.println("in A -> setState()");
	}

	public Address() {
		System.out.println("in Address no arg const");
		
	}

}
