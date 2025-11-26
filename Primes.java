public class Primes {
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        int i = 2;
        while (i <= n) 
        {
            isPrime[i] = true;
            i++;
        }
        int p = 2;
        while (p * p <= n) 
        {
            if (isPrime[p]) 
            {
                int m = p + p; 
                while (m <= n) 
                {
                    isPrime[m] = false;
                    m += p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        int pIndex = 2;
        while (pIndex <= n) 
        {
            if (isPrime[pIndex]) 
            {
                System.out.println(pIndex);
                count++;
            }
            pIndex++;
        }

        int percentage = (int) (100.0 * count / n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
    }
}