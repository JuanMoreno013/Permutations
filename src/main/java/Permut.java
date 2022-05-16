

public class Permut {
    public static void main(String[] args) {

        Permut pm = new Permut();
        char [] a = {'a', 'b', 'c', 'd'};
        int k= 1;

        print(a, k );

    }
    static void print(char[] chars, int k)
    {
        int n = chars.length;
        double tam = Math.pow(n,k);
        String [] vc = new String[(int) tam];
        getStringsRec(vc, chars, "", k);
    }

    static void getStringsRec(String[] list, char[] chars, String prefix, int k) {
        int n = chars.length;

        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }
        else {

            for (int i=0; i<chars.length; i++) {
                prefix+=chars[i];
                k--;
                //recursive call the
                //getStringRec()

                getStringsRec(list,chars, prefix, k);
                k++;
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

    }


}
