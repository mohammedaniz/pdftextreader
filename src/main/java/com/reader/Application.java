package com.reader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class Application {

public static void main(String[] args) throws InvalidPasswordException, IOException {	
		
		PDFTextStripper tStripper = new PDFTextStripper();
		tStripper.setStartPage(42);
		tStripper.setEndPage(42);
		String content = "";
		PDDocument document = PDDocument.load(new File("Your FIle location here"));
		document.getClass();
		            if (!document.isEncrypted()) {
		            	String pdfFileInText = tStripper.getText(document);
		                String[] lines = pdfFileInText.split("\\r\\n\\r\\n");
		                for (String line : lines) {
		                    System.out.println(line);
		                    content += line;
		                }
		            }
		System.out.println(content.trim());

		
	}
}
