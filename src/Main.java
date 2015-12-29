public class Main {
    private static final String space = "!";
    private static final String flg = "*";
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String in = "zhangsuixinaa";
        int print =10;
        new Main().print(print);
    }

    private String convertS(String a){
        char[] temp = a.toCharArray();
        StringBuilder out = new StringBuilder();
        for (int i=temp.length-1;i>=0;i--) {
            out.append(temp[i]);
        }
        return out.toString();
    }

    private void print(int num){
        int size = num * 2 -1;
        for (int i = 1;i <= num;i++){
            StringBuffer sb = new StringBuffer("");
            printPre(sb,num - i);
            printMid(sb,i);
            printPre(sb,num - i);
            System.out.println(sb.toString());
        }

    }

    private StringBuffer printPre(StringBuffer sb,int i){
        for (int j = 0;j<i;j++){
            sb.append(space);
        }
        return sb;
    }

    private StringBuffer printMid(StringBuffer sb,int i){
        for (int j = 1;j<=2*i-1;j++){
            if (j%2==1){
                sb.append(flg);
            } else {
                sb.append(space);
            }
        }
        return sb;
    }


}
