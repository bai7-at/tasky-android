package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class l08 {
    public static long a(int i, int i2) {
        return b(i * i2);
    }

    private static long b(long j) {
        return j;
    }

    public static /* synthetic */ long c(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = o08.a.a();
        }
        return a(i, i2);
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }
}
