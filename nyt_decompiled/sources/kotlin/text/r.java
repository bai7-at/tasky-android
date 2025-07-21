package kotlin.text;

import defpackage.uo6;
import defpackage.zq3;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class r extends q {
    public static String g1(String str, int i) {
        zq3.h(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(uo6.i(i, str.length()));
            zq3.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static Character h1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character i1(CharSequence charSequence, int i) {
        zq3.h(charSequence, "<this>");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char j1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(h.V(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char k1(CharSequence charSequence) {
        zq3.h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String l1(String str, int i) {
        zq3.h(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, uo6.i(i, str.length()));
            zq3.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
