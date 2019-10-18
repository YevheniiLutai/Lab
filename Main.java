package lab1;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            QuadraticEquation example = new QuadraticEquation();
            Pair pair = example.searchRoots(-3.0, 0.0, 315.0);
            System.out.println(pair.x1);
            System.out.println(pair.x2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
