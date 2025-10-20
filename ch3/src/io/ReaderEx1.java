package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream(new File(""));
            Reader in = new FileReader("c:\\temp\\file1.txt");
            Writer out = new FileWriter("c:\\temp\\output2.txt");

            int input = 0;
            char[] cbuf = new char[1024];

            while ((input = in.read(cbuf)) != -1) {
                // cbuf => String
                out.write(new String(cbuf));
            }

            in.close();
            out.close();

        } catch (IOException e) { // IOException이 FileNotFoundException의 부모여서 둘다 처리가능
            e.printStackTrace();
        }
    }
}
