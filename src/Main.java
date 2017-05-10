import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        String inputFileName="testPsudocode.txt";
        String outFileName="out.txt";

        int lengthOfeachLine[]={6,2,4,5,3,5};



        //this loads the psudo object with the psudocode form the file
        Psudo psudo=new Psudo(inputFileName);

        testLineSizes(lengthOfeachLine,psudo);

        psudo.outToFile(outFileName);

        System.out.println("finished out 1");

        //test if right number of lines and items
        Psudo psudo1=new Psudo(outFileName);
        testLineSizes(lengthOfeachLine, psudo1);




    }
    public static void testLineSizes(int[] psudoLinesize, Psudo psudo){

        if(psudoLinesize.length!=psudo.numLines()){
            System.out.print("Failed: different number of lines"+psudoLinesize.length+" "+psudo.numLines());
        }else {

            for (int lineIndex=0;lineIndex<psudo.numLines();lineIndex++) {

                if (psudoLinesize[lineIndex] == psudo.numItemsinLine(lineIndex)) {
                    System.out.println("passed");
                } else {
                    System.out.println("Failed: different number of items line: " + lineIndex);
                }
            }
        }
    }


}