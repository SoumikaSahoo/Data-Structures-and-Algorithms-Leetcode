class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       
        if(x%sumOfDigits(x)==0){
            return sumOfDigits(x);
        }
        return -1;

    }
    public int sumOfDigits(int n) {
    int sum = 0;

    while (n > 0) {
        sum = sum + n % 10;
        n = n / 10;
    }

    return sum;
}
}