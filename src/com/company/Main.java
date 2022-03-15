package com.company;
//import java.util.Document;
//import javax.swing.text.Document;
import java.util.Date;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;

public class Main {

    //Tyler thinks this will not work, we will prove him wrong-ish
    public static String FindHTMLTitle(String lsTargetSource) throws IOException {
        Document doc = Jsoup.connect("https://mingle-portal.inforcloudsuite.com/"+ lsTargetSource).get(); //set target download // https://mingle-portal.inforcloudsuite.com/ANDERSENCORP_DEV
        String title = doc.title();
        return title;
    }
    public static String FindHTMLContent(String lsTargetSource) throws IOException {
        Document doc = Jsoup.connect("https://mingle-portal.inforcloudsuite.com/"+ lsTargetSource).get(); //set target download // https://mingle-portal.inforcloudsuite.com/ANDERSENCORP_TST
        String content = doc.wholeText();
        return content;
    }
    public static String sourceSite() throws IOException {
        String lsSource = "ANDERSENCORP_DEV"; //this will be an input later
        return lsSource;
    }
    public static String targetSite() throws IOException {
        String lsTarget = "ANDERSENCORP_TST"; //this will be an input later
        return lsTarget;
    }
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        String lsTarget = targetSite();
        String lshtmlTarget = FindHTMLTitle(lsTarget);
        String lshtmlTargetCont = FindHTMLTitle(lsTarget);
        String lsSource = sourceSite();
        String lshtmlSource = FindHTMLTitle(lsSource);
        String lshtmlSourceCont = FindHTMLTitle(lsTarget);
        System.out.println("The current date/time is: " + date);
        System.out.println("Source: " + lsSource);
        System.out.println("Source Data: " + lshtmlSource+ " | "+ lshtmlSourceCont);
        System.out.println("Target: " + lsTarget);
        System.out.println("Target Data: " + lshtmlTarget+ " | "+ lshtmlTargetCont);
    }
}
