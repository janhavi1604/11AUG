package com.consumer;


public class CallQualityFeedBack {
	
	
	public CallQualityFeedBack(int customerId, String phoneNo, String feedBackDescription, int rating) {
		super();
		this.customerId = customerId;
		this.phoneNo = phoneNo;
		this.feedBackDescription = feedBackDescription;
		this.rating = rating;
	}
	private int customerId;
	private String phoneNo;
	private String feedBackDescription;
	private int rating;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFeedBackDescription() {
		return feedBackDescription;
	}
	public void setFeedBackDescription(String feedBackDescription) {
		this.feedBackDescription = feedBackDescription;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CallQualityFeedBack [customerId=" + customerId + ", phoneNo=" + phoneNo + ", feedBackDescription="
				+ feedBackDescription + ", rating=" + rating + "]";
	}
	
	
	

}
