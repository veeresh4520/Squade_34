public class Issue53_ElectionCandidateSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {7, 9, 6, 134};
        int target = 134;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
