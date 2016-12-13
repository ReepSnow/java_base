package cn.snow.xml;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Easy {

	public static void main(String[] args) throws Exception {
		
		//创建工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//得到dom解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		//得到xml文档，得到代表文档的document
		Document document = (Document) builder.parse("src/xml/book.xml");
	}
}
