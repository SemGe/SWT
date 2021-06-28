package Honorar;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextHonorarTest
{

    @Test
    public void calcHonorar()
    {
        String text = "Hallo";
        String text2 = "Hallo!";
        String text3 = "Hallo.!";

        TextHonorar textHonorar = new TextHonorar(text);
        assertEquals(5, textHonorar.calcHonorar());;
        textHonorar.setText(text2);
        assertEquals(9, textHonorar.calcHonorar());;
        textHonorar.setText(text3);
        assertEquals(12, textHonorar.calcHonorar());;
    }

    @Test
    public void calcPicture()
    {
        String text = "Hallo Picture Hallo";
        TextHonorar textHonorar = new TextHonorar(text);
        assertEquals(textHonorar.calcPictures(), 1);
    }
}