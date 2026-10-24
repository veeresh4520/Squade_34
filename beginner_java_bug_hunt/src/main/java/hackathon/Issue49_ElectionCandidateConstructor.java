public class Issue49_ElectionCandidateConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Candidate");
        System.out.println("Candidate ID: " + record.id);
        System.out.println("Candidate name: " + record.name);
    }
}