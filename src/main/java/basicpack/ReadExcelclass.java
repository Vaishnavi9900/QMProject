package basicpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class ReadExcelclass {
	
	
	public void readexcel() throws IOException {
	
		 try {
	            File src= new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\QMProject\\workbook\\ReadExcel-QM.xlsx");

	            FileInputStream fis=new FileInputStream(src);

	            XSSFWorkbook wb=new XSSFWorkbook(fis);

	            XSSFSheet Sheet1=wb.getSheetAt(0);

	            int rowcount=Sheet1.getLastRowNum();

	            for(int i=0;i<rowcount+1;i++) {

	            String data0=Sheet1.getRow(i).getCell(0).getStringCellValue(); 
	            
	            System.out.println(split(data0,rowcount));

	            wb.close();
	            //close of try catch block    
	            }
	        } catch (IOException e) {
	        }
}

	public String split(String data0, int rowcount) {
		// TODO Auto-generated method stub
		return split(data0, rowcount);
	
}
}
