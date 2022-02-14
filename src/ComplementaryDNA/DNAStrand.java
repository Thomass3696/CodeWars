package ComplementaryDNA;

public class DNAStrand {

    public static String makeComplement(String dna) {

        String myDna = dna.replaceAll("A", "1").replaceAll("T", "2")
                .replaceAll("C", "3").replaceAll("G", "4");

        return myDna.replaceAll("1", "T").replaceAll("2", "A")
                .replaceAll("3", "G").replaceAll("4", "C");

    }

    public static void main(String[] args) {
        System.out.println(makeComplement(""));
    }

}
