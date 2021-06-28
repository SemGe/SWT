package Honorar;

import java.util.Arrays;
import java.util.Collections;

public class TextHonorar
{
    String text = "";

    public TextHonorar(String text)
    {
        this.text = text;
    }

    public int calcHonorar()
    {
        int honorar = 0;
        honorar += text.length();
        honorar += text.chars().reduce(0, (subtotal, c) -> subtotal += c == '\n' ? 1 : 0);
        honorar += text.chars().reduce(0, (subtotal, c) -> subtotal += c == '.' ? 2 : 0);
        honorar += text.chars().reduce(0, (subtotal, c) -> subtotal += c == '!' ? 3 : 0);

        return honorar;
    }
}
