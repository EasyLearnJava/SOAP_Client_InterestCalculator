package com.easylearnjava.clientcall;

import com.easylearnjava.webserviceprovider.InterestCalculator;
import com.easylearnjava.webserviceprovider.InterestCalculatorImplService;
import com.easylearnjava.webserviceprovider.InterestException_Exception;
import com.easylearnjava.webserviceprovider.Purchase;


public class Demo {
	
	public static void main(String[] args) {
		
		InterestCalculatorImplService ics = new InterestCalculatorImplService();
		InterestCalculator ic = ics.getInterestCalculatorImplPort();
		
		try{			
			Purchase purchaseObj = new Purchase();
			purchaseObj.setId(123);
			purchaseObj.setPurchaseAmount(100);
			purchaseObj.setInterestPercent(8);
			
			System.out.println("Interest charged : " + ic.calculateInterestFromObject(purchaseObj));
			System.out.println();
			
			System.out.println("Simple interest charged : " + ic.calculateSimpleInterest(200, 8));
			System.out.println();
		}catch(InterestException_Exception ie){
			System.out.println("User data input fault...");
			System.out.println(ie.getMessage());
		}catch(Exception e){
			System.out.println("Server side exception...");
			e.printStackTrace();
		}
		
	}

}
