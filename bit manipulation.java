//clear bit

public class clearbit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        int ans = (n & (~(bitmask)));

        System.out.println(ans);
    }
}


//set bit


public class setibit {
    public static void main(String args[]){

        int n=5;
        int pos = 1;
        int bitmask = 1<<pos;

        int ans = bitmask | n;

        System.out.println(ans);
    }
}
