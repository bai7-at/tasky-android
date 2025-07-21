package defpackage;

/* loaded from: classes3.dex */
public abstract class l7f {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == "00000000-0000-0000-0000-000000000000") {
            return true;
        }
        if (length != 36) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = "00000000-0000-0000-0000-000000000000".charAt(i);
            if (charAt != charAt2 && ((b = b(charAt)) >= 26 || b != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c) {
        return (char) ((c | ' ') - 97);
    }
}
