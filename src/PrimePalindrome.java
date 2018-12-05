public class PrimePalindrome {
    public static void main(String[]args){

    }

    public static int primePalindrome(int N){
        //check for even length palindromes
        //check for odd length palindromes
        return 0;
    }

    public boolean isPrime(int N) {
        if (N < 2)
            return false;
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d){
            if (N % d == 0)
                return false;
        }

        return true;
    }
}
