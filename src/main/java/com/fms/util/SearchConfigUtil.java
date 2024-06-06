package com.fms.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 搜索配置文件工具类
 * 根据传入的参数获取对应的类并实例化
 */
public class SearchConfigUtil {
    public static Object getBean(String searchType) {
        try {
            // 创建DOM对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
            Document document = dBuilder.parse(new File("src//main//resources//config//searchConfig.xml"));

            // 获取节点
            String searchName = "Film" + searchType + "Search";
            NodeList nl = document.getElementsByTagName(searchName);
            Node node = nl.item(0).getFirstChild();
            String className = node.getNodeValue();

            // 实例化对象
            Class c = Class.forName(className);
            Object o = c.newInstance();

            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
