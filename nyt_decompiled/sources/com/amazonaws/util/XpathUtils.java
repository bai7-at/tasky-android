package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Date;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public class XpathUtils {
    private static Log log = LogFactory.getLog((Class<?>) XpathUtils.class);
    private static DocumentBuilderFactory factory = getDocumentBuilderFactory();

    public static Boolean asBoolean(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Boolean.valueOf(evaluateAsString);
    }

    public static Byte asByte(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Byte.valueOf(evaluateAsString);
    }

    public static ByteBuffer asByteBuffer(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString) || isEmpty(node)) {
            return null;
        }
        return ByteBuffer.wrap(Base64.decode(evaluateAsString));
    }

    public static Date asDate(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return DateUtils.parseISO8601Date(evaluateAsString);
    }

    public static Double asDouble(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Double.valueOf(evaluateAsString);
    }

    public static Float asFloat(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Float.valueOf(evaluateAsString);
    }

    public static Integer asInteger(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Integer.valueOf(evaluateAsString);
    }

    public static Long asLong(String str, Node node) throws XPathExpressionException {
        String evaluateAsString = evaluateAsString(str, node);
        if (isEmptyString(evaluateAsString)) {
            return null;
        }
        return Long.valueOf(evaluateAsString);
    }

    public static Node asNode(String str, Node node) throws XPathExpressionException {
        if (node == null) {
            return null;
        }
        return (Node) xpath().evaluate(str, node, XPathConstants.NODE);
    }

    public static String asString(String str, Node node) throws XPathExpressionException {
        return evaluateAsString(str, node);
    }

    public static Document documentFrom(InputStream inputStream) throws SAXException, IOException, ParserConfigurationException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(inputStream);
        Document parse = factory.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return parse;
    }

    private static String evaluateAsString(String str, Node node) throws XPathExpressionException {
        if (isEmpty(node)) {
            return null;
        }
        if (InstructionFileId.DOT.equals(str) || asNode(str, node) != null) {
            return xpath().evaluate(str, node).trim();
        }
        return null;
    }

    private static DocumentBuilderFactory getDocumentBuilderFactory() {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
            return newInstance;
        } catch (ParserConfigurationException unused) {
            return null;
        }
    }

    public static boolean isEmpty(Node node) {
        return node == null;
    }

    private static boolean isEmptyString(String str) {
        return str == null || "".equals(str.trim());
    }

    public static int nodeLength(NodeList nodeList) {
        if (nodeList == null) {
            return 0;
        }
        return nodeList.getLength();
    }

    public static XPath xpath() {
        return XPathFactory.newInstance().newXPath();
    }

    public static Document documentFrom(String str) throws SAXException, IOException, ParserConfigurationException {
        return documentFrom(new ByteArrayInputStream(str.getBytes(StringUtils.UTF8)));
    }

    public static Document documentFrom(URL url) throws SAXException, IOException, ParserConfigurationException {
        return documentFrom(url.openStream());
    }
}
