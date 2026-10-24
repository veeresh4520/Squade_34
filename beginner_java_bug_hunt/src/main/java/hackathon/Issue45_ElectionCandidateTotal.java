public class Issue45_ElectionCandidateTotal {
    public static void main(String[] args) {
        int[] values = new int[] {7, -9, 6, 6};
        int total = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] >= 0) total += values[i];
            else total += values[i];
            if (values[i] == 0) total++;
        }
        System.out.println("Total=" + total);
    }
}
