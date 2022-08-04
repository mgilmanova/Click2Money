import java.io.*;
import java.util.*;

public class FB {

    public static void main(String args[]) {
        int length = 0;
        long prev1 = 1;
        long prev2 = 1;
        long current = 0;
        byte bKbd[] = new byte[256];
        String szStr = "";
        StringTokenizer st;

        System.out.print("Enter the length of the Fibonacci sequence: ");

        try {
            int iCnt = System.in.read(bKbd);
            szStr = new String(bKbd, 0, iCnt);

            st = new StringTokenizer(szStr, "\r\n");
            szStr = new String((String) st.nextElement());

            Integer intVal = new Integer(szStr);
            length = intVal.intValue();
        }

        catch (Exception ex) {
            System.out.println("Error!!!");
        }

        for (int i = 0; i < length; i++) {
            if (i < 2) {
                System.out.println(1);
            } else {
                current = prev1 + prev2;
                prev2=prev1;
                prev1=current;
                
                System.out.println(current);
            }
        }
    }
}