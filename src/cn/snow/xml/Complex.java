package cn.snow.xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Complex {

	@Test
	public void read() throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =builder.parse("xml/book.xml");
		
		NodeList list = document.getElementsByTagName("书名");
		Node node = list.item(1);
		String content = node.getTextContent();
		System.out.println(content);
	}
	
	@Test
	public void read2() throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =builder.parse("xml/book.xml");
		//得到节点
		Node root = document.getElementsByTagName("书架").item(0);
		list(root);
	}

	private void list(Node node) {
		if(node instanceof Element)
			System.out.println(node.getNodeName());
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node child = list.item(i);
			list(child);
		}
	}
	
	//得到xml文档中标签属性的值
	@Test
	public void read3() throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =builder.parse("xml/book.xml");
		
		Element bookname = (Element) document.getElementsByTagName("书名").item(0);
		String value = bookname.getAttribute("name");
		System.out.println(value);
	}
	
	//向xml里面添加节点：
	@Test
	public void add() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =builder.parse("xml/book.xml");
		
		//创建节点
		Element price =  document.createElement("售价");
		price.setTextContent("59.0元");
		//把创建的节点挂到第一本书上
		Element book = (Element) document.getElementsByTagName("书").item(0);
		book.appendChild(price);
		
		//把更新后的内存写会到xml文档
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
	
	//往指定的位置处，添加节点
	@Test
	public void add2() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =builder.parse("xml/book.xml");
		
		//创建节点
		Element price =  document.createElement("售价");
		price.setTextContent("59.0元");
		
		//得到参考节点
		Element refNode = (Element) document.getElementsByTagName("售价").item(0);
		
		//得到要挂载节点的节点
		Element book = (Element) document.getElementsByTagName("书").item(0);
		
		//往book节点的指定位置插入节点
		book.insertBefore(price, refNode);
		//把更新后的内存写会到xml文档
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
	
	//向xml文档上面添加属性：
	@Test
	public void addAttr() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("xml/book.xml");
		
		Element bookname = (Element) document.getElementsByTagName("书名").item(0);
		bookname.setAttribute("name", "xxxx");
		
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
	
	@Test
	public void delete() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("xml/book.xml");
		
		//得到要删除的节点
		Element e = (Element) document.getElementsByTagName("售价").item(0);
		
		//得到要删除的节点的爸爸
		Element book = (Element) document.getElementsByTagName("书").item(0);
		
		//父亲节点删除子节点
		book.removeChild(e);
		
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
	
	@Test
	public void delete2() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("xml/book.xml");
		
		//得到要删除的节点
		Element e = (Element) document.getElementsByTagName("售价").item(0);
		e.getParentNode().removeChild(e);
		
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
	
	//更新节点
	@Test
	public void update() throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("xml/book.xml");
		
		Element e = (Element) document.getElementsByTagName("售价").item(0);
		e.setTextContent("109");
		
		TransformerFactory tffactory = TransformerFactory.newInstance();
		Transformer tf = tffactory.newTransformer();
		tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("xml/book.xml")));
	}
}
