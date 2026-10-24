public class Issue55_CourseRegistrationStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A22", "B22", "C22"};
        String target = new String("B22");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
