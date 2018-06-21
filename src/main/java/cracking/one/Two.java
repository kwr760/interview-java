package cracking.one;

public class Two {
    String reverse(String str)
    {
        char[] strArray = str.toCharArray();
        int len = strArray.length;
        for (int i = 0; i < len/2; i++) {
            int end = len - i - 1;
            char temp = strArray[i];
            strArray[i] = strArray[end];
            strArray[end] = temp;
        }

        return new String(strArray);
    }
}
