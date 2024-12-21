package com.googlemap;

import java.awt.Desktop;
import java.net.URI;

public class Open_Link {
	

	public  static void main(String[] args) {
		
		try {
			Desktop.getDesktop().browse(new URI("https://www.google.com/maps/"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
}}
//"https://www.javatpoint.com/"