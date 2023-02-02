package org.tempur.client;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import org.tempuri.Calculator;
import org.tempuri.CalculatorLocator;
import org.tempuri.CalculatorSoap;
import org.tempuri.CalculatorSoapStub;

public class SoapCalculator {
	public static void main(String[] args) throws RemoteException {
	
		CalculatorLocator locator = new CalculatorLocator();
		
		try {
			CalculatorSoap calculatorSoap = locator.getCalculatorSoap();
			int soapAdd = calculatorSoap.add(10, 9);
			JOptionPane.showMessageDialog(null,soapAdd);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unable to reach service: " + e.getMessage()); 
		}
		
		try {
			CalculatorSoap calculatorSoap = locator.getCalculatorSoap();
			int soapSubstract = calculatorSoap.subtract(8, 6);
			JOptionPane.showMessageDialog(null,soapSubstract);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unable to reach service: " + e.getMessage()); 
		}
		
		try {
			CalculatorSoap calculatorSoap = locator.getCalculatorSoap();
			int soapDivide = calculatorSoap.divide(78, 6);
			JOptionPane.showMessageDialog(null,soapDivide);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unable to reach service: " + e.getMessage()); 
		}
		
		try {
			CalculatorSoap calculatorSoap = locator.getCalculatorSoap();
			int soapMultiply = calculatorSoap.multiply(6, 7);
			JOptionPane.showMessageDialog(null,soapMultiply);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unable to reach service: " + e.getMessage()); 
		}
	}
}
