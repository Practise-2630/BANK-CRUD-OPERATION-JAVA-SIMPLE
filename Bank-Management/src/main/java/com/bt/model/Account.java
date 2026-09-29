package com.bt.model;

public class Account {
	
	private  int Bank_no;
	private String Account_Holder_name;
	private String Mobile_Number;
	private String Account_type;
	public Account() {
		super();
	}
	public Account(int bank_no, String account_Holder_name, String mobile_Number, String account_type) {
		super();
		Bank_no = bank_no;
		Account_Holder_name = account_Holder_name;
		Mobile_Number = mobile_Number;
		Account_type = account_type;
	}
	public int getBank_no() {
		return Bank_no;
	}
	public void setBank_no(int bank_no) {
		Bank_no = bank_no;
	}
	public String getAccount_Holder_name() {
		return Account_Holder_name;
	}
	public void setAccount_Holder_name(String account_Holder_name) {
		Account_Holder_name = account_Holder_name;
	}
	public String getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getAccount_type() {
		return Account_type;
	}
	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}
	@Override
	public String toString() {
		return "Account [Bank_no=" + Bank_no + ", Account_Holder_name=" + Account_Holder_name + ", Mobile_Number="
				+ Mobile_Number + ", Account_type=" + Account_type + "]";
	}
	
	
	
	
	

}
