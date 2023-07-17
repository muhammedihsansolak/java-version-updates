package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {

        var address = "Harbiye Mah. Veznedar Sok.\n" +
                "No 20 Daire 11 Çankaya & Ankara";

        //Text Block --> use three """

        var address2 = """
                Harbiye Mahallesi Venzedar Sokak
                No20 Daire 11
                Çankaya - Ankara
                """;

        System.out.println(address2);

    }
}
