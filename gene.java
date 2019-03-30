public class gene{

    public static void main(String[] args){
        String s = args[0];
        boolean found = false;
        int start = -1;
        for (int i = 0; i < s.length() - 2; i++) {
            String triplet = s.substring(i, i + 3);
            if (triplet.equals("ATG")) {
            start = i + 3;
        } 
        else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)){
            String gene = s.substring(start, i);
            if (gene.length() % 3 == 0)
                {
                found=true;
                System.out.println(gene);
                start = -1;
                }
            }
        }
        if (!found)
        System.out.println("No Gene Found");
}
}