package seng2050.lab2;

public class HtmlGen {

    public static String doctype() {
        return "<!DOCTYPE html>";
    }

    public static String htmlOpen() {
        return "<html lang=\"en\">";
    }

    public static String htmlClose() {
        return "</html>";
    }

    public static String head(String title) {
        return "<head><meta charset=\"UTF-8\"><title>" + title + "</title></head>";
    }

    public static String bodyOpen() {
        return "<body>";
    }

    public static String bodyClose() {
        return "</body>";
    }

    public static String h1(String text) {
        return "<h1>" + text + "</h1>";
    }

    public static String h2(String text) {
        return "<h2>" + text + "</h2>";
    }

    public static String h3(String text) {
        return "<h3>" + text + "</h3>";
    }

    public static String paragraph(String text) {
        return "<p>" + text + "</p>";
    }

    public static String script(String src) {
        return "<script src=\"" + src + "\"></script>";
    }

    public static String css(String href) {
        return "<link rel=\"stylesheet\" href=\"" + href + "\">";
    }
}
