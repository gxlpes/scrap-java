package scrap;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://pra.ufpr.br/ru/ru-centro-politecnico/").get();
        Elements elements = doc.getElementsByTag("tr");
        for (Element x : elements) {
            System.out.println(x.text());
        }
    }
}