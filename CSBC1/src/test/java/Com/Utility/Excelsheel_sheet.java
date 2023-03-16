package Com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//Excelsheet
public class Excelsheel_sheet {


		public static String getDataProviderExcelsheet(int cell,int row ) throws EncryptedDocumentException, IOException, InvalidFormatException {
			String data ;
			
			FileInputStream excel=new FileInputStream("C:\\Users\\RnD\\eclipse-workspace\\Montcrest\\CSBC1\\Testdata\\Testing Data.xlsx");
			
		Sheet Inputdata=WorkbookFactory.create(excel).getSheet("Sheet1");
		try {
		data=	Inputdata.getRow(row).getCell(cell).getStringCellValue();
		}catch(Exception e) {
			long intdata=(long)Inputdata.getRow(row).getCell(cell).getNumericCellValue();
			data= ""+intdata;
		}
		return data;
		}

	
//Screenshot
public static void getScreenshot(WebDriver driver) throws IOException {
	File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File d=new File("C:/Users/RnD/eclipse-workspace/Montcrest/CSBC1/Screenshot/Error3.png");
	FileUtils.copyFile(s,d);
}
}