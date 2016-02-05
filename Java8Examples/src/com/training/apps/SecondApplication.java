package com.training.apps;

import com.training.ifaces.Converter;

public class SecondApplication {

	public static void main(String[] args) {

		Converter c = (usd) -> {System.out.println(usd*67.0);};
		c.usdToInr(4);
	}

}
