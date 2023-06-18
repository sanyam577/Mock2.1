public class Test2 {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        int left = 1;
        int right = x;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid > x / mid) {
                right = mid - 1;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        
        return right;
    }
    
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " is " + result);
    }
}
