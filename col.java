import java.util.LinkedList;

public class col {
    public static void main(String args[]){
    LinkedList<String> colors=new LinkedList<>();
    colors.add("green");
    colors.add("yellow");
    colors.add("red");
    colors.add("blue");
    System.out.println(colors);
    colors.remove(1);
    System.out.println(colors);
    colors.add("orange");
    colors.add("grey");
    colors.add("purple");
    System.out.println(colors.size());


    
    }
}
