package defpackage;

import java.util.Calendar;

/* loaded from: classes4.dex */
public abstract class us3 {
    public static final long a(int i, int i2, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() - j;
        return timeInMillis > 0 ? timeInMillis : timeInMillis + 86400000;
    }

    public static /* synthetic */ long b(int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = System.currentTimeMillis();
        }
        return a(i, i2, j);
    }
}
