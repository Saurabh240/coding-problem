package src.search;

public class SquareRoot {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        long start = 2;
        long end = x / 2;

        while (start <= end) {
            long mid = start + ((end - start) / 2);
            if (mid * mid > x){
                end = (mid - 1);
            }
            else if (mid * mid <= x){
                start = mid + 1;
            }
            else
                return (int)mid;
        }
        return (int)end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
