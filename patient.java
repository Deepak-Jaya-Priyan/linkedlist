import java.util.*;

class patient {
    public static void main(String args[]){
        LinkedList <String> things=new LinkedList<>();
        things.add("aadhar");
        things.add("pan card");
        things.add("cibil Score");
        if(things.contains("aadhar") && things.contains("pan card") && things.contains("cibil Score")){
           System.out.println("you are eligible");
        }
        else{
        System.out.println("not eligible");
        }
    }
}




    
    

