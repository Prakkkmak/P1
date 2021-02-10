package com.company;

import com.company.arith.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlLoader {
    public Expression loadFromXml(String fichier){
        try{
            File f = new File(fichier);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(f);
            doc.getDocumentElement().normalize();
            Element root = doc.getDocumentElement();
            return getExpressionFromElement(root);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void saveToXml(String fichier, Expression e){

    }

    private Expression getExpressionFromElement(Element element){
        String name = element.getNodeName();
        switch (name) {
            case "num":
                return new Nombre(Double.parseDouble(element.getAttribute("val")));
            case "var":
                return new Variable(element.getAttribute("label"));
        }
        List<Element> childElements = getChildrenElement(element);
        if(childElements.size() == 2){
            Element child1 = childElements.get(0);
            Element child2 = childElements.get(1);
            switch (name) {
                case "div":
                    return new Division(getExpressionFromElement(child1), getExpressionFromElement(child2));
                case "add":
                    return new Addition(getExpressionFromElement(child1), getExpressionFromElement(child2));
                case "mul":
                    return new Multiplication(getExpressionFromElement(child1), getExpressionFromElement(child2));
                case "min":
                    return new Soustraction(getExpressionFromElement(child1), getExpressionFromElement(child2));
            }
        }
        return null;
    }

    private List<Element> getChildrenElement(Element element){
        List<Element> elements = new ArrayList<>();
        NodeList nodeList = element.getChildNodes();
        for(int i = 0; i < nodeList.getLength(); i++){
            Node child = nodeList.item(i);
            if(child.getNodeType() == Node.ELEMENT_NODE){
                elements.add((Element)child);
            }
        }
        return elements;
    }
}
