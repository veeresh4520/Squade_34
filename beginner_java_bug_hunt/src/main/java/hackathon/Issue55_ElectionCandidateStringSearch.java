public class Issue55_ElectionCandidateStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A34", "B34", "C34"};
        String target = new String("B34");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
