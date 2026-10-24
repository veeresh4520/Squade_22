public class Issue47_CourseRegistrationCount {
    public static void main(String[] args) {
        int[] values = new int[] {5, 0, -9, 6, 6};
        int count = 1;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] >= 0) count += 2;
        }
        System.out.println("Count=" + count);
    }
}
