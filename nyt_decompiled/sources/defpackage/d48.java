package defpackage;

import androidx.emoji2.text.e;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public abstract class d48 {
    public static final int a(String str, int i) {
        e c = c();
        Integer num = null;
        if (c != null) {
            Integer valueOf = Integer.valueOf(c.d(str, i));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int b(String str, int i) {
        e c = c();
        Integer num = null;
        if (c != null) {
            Integer valueOf = Integer.valueOf(c.f(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final e c() {
        if (!e.k()) {
            return null;
        }
        e c = e.c();
        if (c.g() == 1) {
            return c;
        }
        return null;
    }
}
