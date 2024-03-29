public class Application {
    public static void main(String[] args) {
        System.out.println(StringHtmlCleaner.main(PageDownloadingUtility.download(args[0])));
    }
}