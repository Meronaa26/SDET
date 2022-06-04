package Practice;

public class Unique {
    public static void main(String[] args) {

        System.out.println("unique(\"aabbcddffghhillm\") = " + unique("aabbcddffghhillm"));
    }

    public static String unique(String str) {
        String[] arr = str.split(""); // first split the array
        String unique = "";

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    num++;
                }
                if (num == 1)
                    unique += arr[i];
            }
            return unique;
        }

}
