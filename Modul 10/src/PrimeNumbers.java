public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 1000000;
        int temp = 0;
        boolean[] primes = new boolean[n];
        long timeEnd = 0;
        long timeStart = System.currentTimeMillis();
        for (int i = 2; i < primes.length; i++){
            primes[i] = true;
            if(i == primes.length - 1){
                System.out.println("At the end");
            }
        }
        for (int i = 2; i < primes.length; i++){
            if(primes[i]){
                for (int j = (int)Math.pow(i,2); j < n; j+= i){
                    primes[j] = false;
                }
            }
            if(i == primes.length - 1){
                System.out.println("All primes are now found");
            }
        }
        for (int i = n -1; i > 0; i--){
            if(primes[i]){
                if(i > temp){
                    temp = i;
                }
            }
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("True: " + temp);
        System.out.println("Took: " + (timeEnd-timeStart));
    }
}
