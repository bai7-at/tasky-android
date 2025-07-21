package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class yb1 {
    private Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int c = wv3.c(keyEvent);
        if ((Integer.MIN_VALUE & c) != 0) {
            this.a = Integer.valueOf(c & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.a;
        if (num == null) {
            return Integer.valueOf(c);
        }
        this.a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), c));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        return num2 == null ? Integer.valueOf(c) : num2;
    }
}
