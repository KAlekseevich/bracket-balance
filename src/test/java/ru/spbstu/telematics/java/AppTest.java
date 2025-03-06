package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.spbstu.telematics.java.App;

public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testUnbalancedBrackets() {
        //проверяем несбалансированные скобки
        assertFalse(App.isCorrect(")("));      //открывающая и закрывающая скобки перепутаны
        assertFalse(App.isCorrect("{[(()]}")); //круглая скобка не закрыта
        assertFalse(App.isCorrect("[{(})]"));  //открывающая и закрывающая скобки не совпадают
        assertFalse(App.isCorrect("<([)]>"));  //все перепутано
        assertFalse(App.isCorrect("{[}"));     //не хватает закрывающей скобки
    }

    public void testEmptyString() {
        //проверяем строку без скобок -> строка должна быть сбалансирована
        assertTrue(App.isCorrect("Hello, world!"));
    }

    public void testOnlyOpeningBrackets() {
        //проверяем строку лишь с открывающими скобками -> строка должна быть несбалансирована
        assertFalse(App.isCorrect("({[<"));
    }

    public void testOnlyClosingBrackets() {
        //проверяем строку лишь с закрывающими скобками -> строка должна быть несбалансирована
        assertFalse(App.isCorrect(")}]>"));
    }
}
