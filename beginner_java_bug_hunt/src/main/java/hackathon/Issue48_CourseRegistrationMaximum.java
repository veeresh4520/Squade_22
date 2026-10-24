public class Issue48_CourseRegistrationMaximum {
    public static void main(String[] args) {
        int[] values = new int[] {-5, -9, -6, -6};
        int largest = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < largest) largest = values[i];
        }
        System.out.println("Largest=" + largest);
    }
}
