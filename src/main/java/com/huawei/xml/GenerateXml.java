package com.huawei.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

public class GenerateXml {

    public static void main(String[] args) throws DocumentException {
        //创建解析器
        SAXReader reader=new SAXReader();
        //通过解析器的read 方法 将配置文件读取到内存中，生成一个 Document[org.dom4j]对象树
        Document document = reader.read("src/resources/AndroidManifest.xml");

        //获取根节点
        Element rootElement = document.getRootElement();

        //遍历根节点
       for (Iterator<Element>  rootIter=rootElement.elementIterator();rootIter.hasNext();){
            Element manifestEle = rootIter.next();
          //  System.out.println(manifestEle.attribute());
            for (Iterator<Element> applicationEle=manifestEle.elementIterator();applicationEle.hasNext();){
                Element application = applicationEle.next();
                System.out.println(application.attribute("android:allowBackup"));
            }
        }
    }

}
