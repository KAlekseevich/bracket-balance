package ru.spbstu.telematics.java;
import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();
        char symbol = ' ';

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            //если встречается открывающая скобка, кладем ее в стек
            if (symbol == '(' || symbol == '{' || symbol == '[' || symbol == '<') {
                stack.push(symbol);
            }
            //если встречаем закрывающую скобку, выполняем проверку:
            else if (symbol == ')' || symbol == '}' || symbol == ']' || symbol == '>') {
                if (stack.isEmpty())
                    return false; //для данной закрывающей скобки нет никакой открывающей -> строка несбалансирована
                if (!checkPair(stack.peek(), symbol)) return false; //скобки не сошлись -> строка несбалансирована
                stack.pop(); //скобки сошлись, удалили открывающую из стека
            }
        }

        //если дошли до конца строки:
        return stack.isEmpty(); // стек пуст (для всех скобок нашли пары) -> строка сбалансирована, либо обратное
    }

    public static boolean checkPair(char bracket1, char bracket2){
        //проверка соответствия открывающих и закрывающих скобок
        return (bracket1 == '(' && bracket2 == ')' ||
                bracket1 == '{' && bracket2 == '}' ||
                bracket1 == '[' && bracket2 == ']' ||
                bracket1 == '<' && bracket2 == '>');
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String inputString = scanner.nextLine();

        if (isCorrect(inputString)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }

        scanner.close();
    }

}
