package com.gui;

import javax.swing.JOptionPane;

public aspect LoginAspect {
	
	boolean retBool;
	
	pointcut callValidateUSer() : call(boolean Frame.validateUser());
	
	before() : callValidateUSer(){
		
	}
	
	
    after() returning (Object retObj): callValidateUSer(){
		
		retBool = (boolean) retObj;
		if(retBool) {
			JOptionPane.showMessageDialog(null, "Login successful", "Information", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}


}
