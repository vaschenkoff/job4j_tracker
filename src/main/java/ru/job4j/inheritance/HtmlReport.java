package ru.job4j.inheritance;

import org.w3c.dom.Text;

public class HtmlReport extends TextReport {
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
