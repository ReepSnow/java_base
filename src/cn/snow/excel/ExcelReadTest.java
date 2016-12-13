package cn.snow.excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadTest {

    public static void readExcel() {
        try {
            //打开文件
            Workbook book = Workbook.getWorkbook(new File("D:\\testfile\\test.xls")) ;
            //取得第一个sheet
            Sheet sheet = book.getSheet(0);
            //取得行数
            int rows = sheet.getRows();
            for(int i = 0; i < rows; i++) {
                Cell [] cell = sheet.getRow(i);
                for(int j=0; j<cell.length; j++) {
                    //getCell(列，行)
                    System.out.println(sheet.getCell(j, i).getContents());
                }
            }
            //关闭文件
            book.close();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void main(String[] args) {
    	readExcel();
	}
}