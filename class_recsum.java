public class Main {
    public static void main(String[] args) {
        int ans=sum(6);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int temp=sum(n-1);
        return temp+n;
    }
}
