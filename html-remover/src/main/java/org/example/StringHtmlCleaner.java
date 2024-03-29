import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class StringHtmlCleaner {
    public static String main(String htmlString) {
        String textToClean = htmlString;
        Document document = Jsoup.parse(textToClean);
        String textWithoutHtml = document.text();
        return textWithoutHtml;
    }
}
