package cn.snow.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelOutTest 
{
	/**
	 * 数据转成xls文件。并将数据转存到制定的文件内
	 * @param title			标题
	 * @param content		内容
	 * @param outFile		存储到哪个文件中
	 * @throws Exception
	 */
	public static void buildAndWriteXls(String title , List<List<Object>> content , File outFile) throws Exception
	{
		//WritableWorkbook wbook = Workbook.createWorkbook(new FileOutputStream(fileName + ".xls")); // 建立excel文件
		WritableWorkbook wbook = Workbook.createWorkbook(new FileOutputStream(outFile)); // 建立excel文件
		WritableSheet wsheet = wbook.createSheet("导出数据", 0); // sheet名称
		WritableCellFormat cellFormatNumber = new WritableCellFormat();
		cellFormatNumber.setAlignment(Alignment.RIGHT);

		WritableFont wf = new WritableFont(WritableFont.ARIAL, 12,
				WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
				jxl.format.Colour.BLACK); // 定义格式、字体、粗体、斜体、下划线、颜色
		WritableCellFormat wcf = new WritableCellFormat(wf); // title单元格定义
		WritableCellFormat wcfc = new WritableCellFormat(); // 一般单元格定义
		WritableCellFormat wcfe = new WritableCellFormat(); // 一般单元格定义
		wcf.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
		wcfc.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式

		wcf.setBorder(jxl.format.Border.ALL,
				jxl.format.BorderLineStyle.THIN);
		wcfc.setBorder(jxl.format.Border.ALL,
				jxl.format.BorderLineStyle.THIN);
		wcfe.setBorder(jxl.format.Border.ALL,
				jxl.format.BorderLineStyle.THIN);

		wsheet.setColumnView(0, 20);// 设置列宽
		wsheet.setColumnView(1, 10);
		wsheet.setColumnView(2, 20);

		int rowIndex = 0;
		int columnIndex = 0;
		if (null != content) {
			// rowIndex++;
			columnIndex = 0;
			wsheet.setRowView(rowIndex, 500);// 设置标题行高
			wsheet.addCell(new Label(columnIndex++, rowIndex, title, wcf));
			wsheet.mergeCells(0, rowIndex, 3, rowIndex);// 合并标题所占单元格
			rowIndex++;
			columnIndex = 0;
			wsheet.setRowView(rowIndex, 380);// 设置项目名行高
			
			boolean isFirstLine = true;
			for (List<Object> line : content) 
			{
				columnIndex = 0;
				if(isFirstLine == true)
				{
					isFirstLine = false;
				}
				for (int i = 0; i < line.size(); i++) {
					String cell = line.get(i).toString();
					wsheet.addCell(new Label(columnIndex++, rowIndex, cell, wcf));
				}
				rowIndex++;
			}
		}
		wbook.write();
		if (wbook != null) {
			wbook.close();
		}
	}
	
	public static void main(String[] args) 
	{
		List<List<Object>> content = new ArrayList<List<Object>>();
		
		List<Object> head = new ArrayList<Object>();
		head.add("报销人");
		head.add("部门");
		head.add("月份");
		head.add("年份");
		content.add(head);
		
		List<Object> line1 = new ArrayList<Object>();
		
		line1.add("董平");
		line1.add("开发部");
		line1.add(1);
		line1.add(2013);
		content.add(line1);
		
		List<Object> line2 = new ArrayList<Object>();
		line2.add("马克");
		line2.add("开发部");
		line2.add(1);
		line2.add(2013);
		content.add(line2);
		
		
		File file = new File("d:\\2013年8月开发部月度报销统计.xls");
		try {
			buildAndWriteXls("2013年8月开发部月度报销统计", content, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
