package defpackage;

import java.util.GregorianCalendar;

/* loaded from: classes5.dex */
public abstract class cn9 {
    private static final int a = -1;

    public static final long a(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, i2 - 1, i3, i4, i5, i6);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return a;
    }
}
