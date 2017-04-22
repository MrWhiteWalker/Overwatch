package com.napstablook.common.mainCategories;

import java.io.*;


/**
 * Created by Ramandeep on 09-04-2017.
 */
public class Test {

    public void write(StringBuffer buffer,String className) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        String FILENAME = className+".java";
        try {

            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            bw.write(buffer.toString());

            System.out.println(FILENAME+" Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public void run() {
        BufferedReader br = null;
        FileReader fr = null;
        String FILENAME = "G:\\Coding\\IntelliJWorkspace\\src\\main\\java\\com\\overwatch\\ApiResponse.txt";
        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            System.out.println("Reading file");
            String sCurrentLine;
            StringBuffer classes = new StringBuffer();
            String className = "";
            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.trim().startsWith("public class")) {
                    write(classes,className);
                    classes = new StringBuffer();
                    classes.append("package com.overwatch;\n");
                    classes.append(sCurrentLine);
                    className = sCurrentLine.trim().split(" ")[2];
                } else {
                    classes.append("\n"+sCurrentLine);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}
