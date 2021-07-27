public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> HeyJude = new LinkedList<>();

        HeyJude.addAtIndex("Heeeey Juuuuudddeeee",0);
        HeyJude.addAtIndex("Dont Make it Baad",1);
        HeyJude.addAtIndex("Remember, the love is all in your hearrrrt",2);


        //System.out.println(HeyJude.getHead().getData());
        System.out.println(HeyJude.getAtIndex(0));
        System.out.println(HeyJude.getAtIndex(1));
        System.out.println(HeyJude.getAtIndex(2));







    }
}
