package JavaUTILITY;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData( int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("V:\\Zerodha\\src\\test\\resources\\Book2.xlsx");
		String user = WorkbookFactory.create(file).getSheet("credential").getRow(row).getCell(cell).getStringCellValue();
		return user;	
		
		}
}
