/**
 * Created by benaissa on 8/23/17.
 */

public class ClothingItem {
    public String type;

    public static void main(String [] args)
    {
        ClothingItem item=new ClothingItem();
        item.type="hello";
        item.displayItem();
//      A Char array to String
        char chars[]={'B','e','n','a','i','s','s','a'};
        String s1 = new String(chars);

        System.out.println("This is s1: "+s1);
    }

    private void displayItem() {
        System.out.println("This is a: "+this.type);
    }


}
