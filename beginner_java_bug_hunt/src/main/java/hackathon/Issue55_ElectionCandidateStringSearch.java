public class Issue55_ElectionCandidateStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Candidate ID found");
        else System.out.println("Candidate ID not found");
    }
}