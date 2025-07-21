package defpackage;

/* loaded from: classes4.dex */
public abstract class sr {
    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
