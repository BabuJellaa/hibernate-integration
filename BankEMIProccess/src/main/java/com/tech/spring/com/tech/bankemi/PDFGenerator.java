package com.tech.spring.com.tech.bankemi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {
	public void exportToPDF(List<LoanEMIDetails> emiDetails, String filePath) throws IOException, DocumentException {
		Document document = new Document();
		FileOutputStream outputStream = new FileOutputStream(filePath);
		
		PdfWriter.getInstance(document, outputStream);
		document.open();
		
		PdfPTable table = new PdfPTable(5);
        table.setWidths(new float[] { 10, 10, 15, 15, 15 }); 


        table.addCell(createCell("Month", Element.ALIGN_CENTER));
        table.addCell(createCell("EMI", Element.ALIGN_CENTER));
        table.addCell(createCell("Principal", Element.ALIGN_CENTER));
        table.addCell(createCell("Interest", Element.ALIGN_CENTER));
        table.addCell(createCell("Remaining Principal", Element.ALIGN_CENTER));

      
        for (LoanEMIDetails details : emiDetails) {
            table.addCell(createCell(String.valueOf(details.getMonth()), Element.ALIGN_CENTER));
            table.addCell(createCell(String.format("%.2f", details.getEmiAmount()), Element.ALIGN_CENTER));
            table.addCell(createCell(String.format("%.2f", details.getPrincipleAmount()), Element.ALIGN_CENTER));
            table.addCell(createCell(String.format("%.2f", details.getPrincipleIntrest()), Element.ALIGN_CENTER));
            table.addCell(createCell(String.format("%.2f", details.getDueAmount()), Element.ALIGN_CENTER));
        }
        document.add(table);
		document.close();
		
		System.out.println("PDF report generated successfully!");
	}
	
	private PdfPCell createCell(String text, int alignment) {
        PdfPCell cell = new PdfPCell(new Phrase(text));
        cell.setHorizontalAlignment(alignment);
        cell.setPadding(5);
        return cell;
    }
}
