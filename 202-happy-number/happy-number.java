class Solution {
       public static boolean isHappy(int n){
        //test
        int slow = n;
        int fast = sumofsqr(n);

        while(slow != fast && fast != 1){
            slow = sumofsqr(slow);
            fast = sumofsqr(sumofsqr(fast));
        }

        return fast == 1;
       }

       public static int sumofsqr(int n){

        int sum = 0;
        while(n != 0){
            int dig = n % 10;
            sum += dig * dig ;
            n /= 10;
        }
        return sum;
       }
}