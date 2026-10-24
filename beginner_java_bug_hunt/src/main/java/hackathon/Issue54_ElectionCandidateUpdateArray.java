public class Issue54_ElectionCandidateUpdateArray {
    public static void main(String[] args) {
        int[] values = new int[] {7, 9, 6, 6};
        int position = 2;
        int replacement = 16 - 7;
        if (position >= 0 && position < values.length) values[position - 1] = replacement;
        if (position == values.length) values[values.length - 1] = replacement;
        System.out.println(java.util.Arrays.toString(values));
    }
}
