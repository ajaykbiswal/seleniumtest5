package utility;

import org.testng.Assert;


import org.testng.annotations.Test;

import lib.pdfverify;

public class pdftext {
   
	@Test
	public void pdf() {
		pdfverify.deletedownloadfile();
		String data=pdfverify.pdfverifys();
		System.out.println(data);
		Assert.assertTrue(data.contains("2017-19"),"Text not found in the PDF file");

	}

}
