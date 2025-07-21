package defpackage;

/* loaded from: classes3.dex */
public abstract class tr {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = b(charAt)) >= 26 || b != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static boolean c(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (d(c)) {
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

    public static String f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c(c)) {
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
