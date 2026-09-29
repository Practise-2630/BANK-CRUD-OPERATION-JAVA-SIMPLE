package com.bt.Accountdao;
import com.bt.config.*;
import com.bt.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bt.BankMain.*;

public class AccountDao {
	
public 	String AccountCreate(Account acc)
{ 
	try {
	Config c=new Config();
	Connection con = c.getConnection();
	String Insertsql="Insert into  acccount values (?,?,?,?)";
	 PreparedStatement ps=con.prepareStatement(Insertsql);
	 ps.setInt(1, acc.getBank_no());
	 ps.setString(2, acc.getAccount_Holder_name());
	 ps.setString(3, acc.getMobile_Number());
	 ps.setString(4, acc.getAccount_type());
	 
	 int rows=ps.executeUpdate();
	 
	 if(rows>=1)
	 {
		 return "Account Created Sucessfully";
	 }
	 else
	 {
		 return "Account Does Not Created Please Try Again ";
	 }
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
	
}
public void DisplayAccount(Account acc) {

    try {
        Config c = new Config();
        Connection con = c.getConnection();

        String displaySql = "SELECT * FROM acccount WHERE Bank_no=?";

        PreparedStatement ps = con.prepareStatement(displaySql);

        ps.setInt(1, acc.getBank_no());

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            int id = rs.getInt("Bank_no");
            String name = rs.getString("Account_Holder_name");
            String mobile = rs.getString("Mobile_Number");
            String Acctype = rs.getString("Account_type");

            System.out.println("Bank Account Number : " + id +" "+"");
            System.out.println("Account Holder Name : " + name);
            System.out.println("Mobile Number        : " + mobile);
            System.out.println("Account Type         : " + Acctype);

        } else {
            System.out.println("Account Not Found");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
