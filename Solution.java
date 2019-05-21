import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader==null) return "reader = null";
        char[] buf = new char[100];
        int b, i = 0;
        while ((b = reader.read())>0) {
            buf[i] = (char) (b + key);
         //   System.out.print(buf[i]);
            i++;

        }
        if (i==0) return "none";
        return new String(buf, 0, i);
    }
}
