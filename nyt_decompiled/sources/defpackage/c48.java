package defpackage;

/* loaded from: classes.dex */
public abstract class c48 {
    public static final int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i) {
        return pj8.b(b(charSequence, i), a(charSequence, i));
    }
}
