package com.bt.BankMain;

import java.util.*;

import com.bt.Accountdao.AccountDao;
import com.bt.model.Account;

public class BankMain {
	public static void main(String[] args) {
		AccountDao dao=new AccountDao();

		while (true) {
			System.out.println("====================");
			System.out.println("1 :Account Create ");
			System.out.println("2 : Display Account");
			System.out.println("3 :Update Account");
			System.out.println("4 :Delete Account");
			System.out.println("5: Exits");
			System.out.println("======================");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Bank Id");
				int bank_id = sc.nextInt();

				sc.nextLine(); // 

				System.out.println("Enter Account Holder Name");
				String name = sc.nextLine();

				System.out.println("Enter Mobile Number");
				String mobile = sc.next();

				System.out.println("Enter Account Type");
				String AccType = sc.next();

				Account a = new Account(bank_id, name, mobile, AccType);

				String msg = dao.AccountCreate(a);

				System.out.println(msg);
				break;
			case 2:

			    System.out.println("Enter The Bank Account Number");

			    int bnumber = sc.nextInt();

			    Account b = new Account(bnumber,null,null,null);

			    dao.DisplayAccount(b);

			    break;
			
			
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}

		}
	}

}
