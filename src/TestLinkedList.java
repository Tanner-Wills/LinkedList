public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> HeyJude = new LinkedList<>();

        HeyJude.addAtIndex("Heeeey Juuuuudddeeee",0);
        HeyJude.addAtIndex("Dont Make it Baad",1);
        HeyJude.addAtIndex("Take a sad sooooong",2);
        HeyJude.addAtIndex("and make it beetteerrrr",3);
        HeyJude.addAtIndex("Remember the love is all in your heart",4);
        //HeyJude.removeAtIndex(1);

        //System.out.println(HeyJude.getHead().getData());
        System.out.println(HeyJude.removeAtIndex(1));
        System.out.println(HeyJude.getAtIndex(0));
        System.out.println(HeyJude.remove("Remember the love is all in your heart"));

        System.out.println(HeyJude.getAtIndex(1));
        System.out.println(HeyJude.getAtIndex(2));
        //System.out.println(HeyJude.getAtIndex(3));
        //System.out.println(HeyJude.getAtIndex(4));
        System.out.println(HeyJude.size());







    }
}
