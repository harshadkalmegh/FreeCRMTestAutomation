package org.ORHRM.UtilityMethods;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileHandling {
	
	public String FileName;
	
	public ExcelFileHandling(String FileName)
	{
		this.FileName=FileName;
	}
	public String GetParameter(String ParameterName)
	{
		File inputWorkbook = new File(this.FileName);
	    Workbook w;
	    try {
	      w = Workbook.getWorkbook(inputWorkbook);
	      // Get the first sheet
	      Sheet sheet = w.getSheet(0);
	      
	      // code to search for a specific value
	      Cell cell1= sheet.findCell(ParameterName);
	      System.out.println(cell1.getRow());
	      System.out.println(cell1.getColumn());
	      Cell cell_Val=sheet.getCell(cell1.getColumn()+1,cell1.getRow());
	      return cell_Val.getContents();
	    }
	    catch (Exception e)
	    {
	    	System.out.println(e.getMessage());
	    	return null;
	    }
	}
	public boolean UpdateResult(String TestCaseID,String TestStatus) throws BiffException, IOException, RowsExceededException, WriteException
	{
		try
		{
			  File f1=new File(this.FileName);                                               //the excel sheet which contains data  
		         WorkbookSettings ws=new WorkbookSettings();  
		         
		         Workbook wo=Workbook.getWorkbook(f1,ws);   
		           
		         Sheet readsheet=wo.getSheet(0);  
		         System.out.println(readsheet.getName());  
		         
		         WritableWorkbook Wb1= Workbook.createWorkbook(f1,wo);
		         WritableSheet sh1=Wb1.getSheet(0);
		         
		        	  Cell cell_TCID=readsheet.findCell(TestCaseID);
		        	  Label Result=new Label(cell_TCID.getColumn()+3, cell_TCID.getRow(), TestStatus);
		        	  sh1.addCell(Result);
		        	  Wb1.write();  
		        	  Wb1.close();
		        	  wo.close();
		        	  return true;
		         }
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					return false;
				}
	}
		
		
	}

