import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Danny on 5/10/2017.
 */
public class Psudo {

    private ArrayList<ArrayList<Item>> itemContainer;

    Psudo(String inputFileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(inputFileName));
        this.itemContainer = new ArrayList<ArrayList<Item>>();
        for (int lineIndex = 0; scanner.hasNextLine(); lineIndex++) {
            String line = scanner.nextLine();
            Scanner scanline = new Scanner(line);
            ArrayList<Item> lineArray = new ArrayList<Item>();
            for (int wordIndex = 0; scanline.hasNext(); wordIndex++) {
                lineArray.add( new Item(scanline.next()));
            }
            itemContainer.add(lineArray);
        }
    }

    public void outToFile(String outFileName) throws FileNotFoundException {
        PrintStream out=new PrintStream(new FileOutputStream(new File(outFileName)));
        //for every line
        for (ArrayList<Item> line:
                this.itemContainer){

            for(Item item:
                    line){
                out.print(item.getName());//print item
                out.print(" ");
                //print tab
            }
            out.println();
            //print newline
        }
    }

    /***
     *
     * @return number of lines
     */
    public int numLines(){
        return itemContainer.size();
    }

    public int numItemsinLine(int index){
        return itemContainer.get(index).size();
    }

}
