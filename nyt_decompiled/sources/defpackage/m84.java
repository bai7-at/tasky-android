package defpackage;

import org.threeten.bp.Clock;

/* loaded from: classes4.dex */
public final class m84 {
    private final int a;
    private final int b;
    private final int c;
    private final Clock d;

    public m84(int i, int i2, int i3, Clock clock) {
        zq3.h(clock, "clock");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = clock;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Clock c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m84)) {
            return false;
        }
        m84 m84Var = (m84) obj;
        return this.a == m84Var.a && this.b == m84Var.b && this.c == m84Var.c && zq3.c(this.d, m84Var.d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LogManagerParams(bufferSize=" + this.a + ", bufferWaitMinutes=" + this.b + ", maxSizeMB=" + this.c + ", clock=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ m84(int r1, int r2, int r3, org.threeten.bp.Clock r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L6
            r1 = 20
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            r2 = 5
        Lb:
            r6 = r5 & 4
            if (r6 == 0) goto L10
            r3 = 2
        L10:
            r5 = r5 & 8
            if (r5 == 0) goto L1d
            org.threeten.bp.Clock r4 = org.threeten.bp.Clock.systemDefaultZone()
            java.lang.String r5 = "systemDefaultZone(...)"
            defpackage.zq3.g(r4, r5)
        L1d:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m84.<init>(int, int, int, org.threeten.bp.Clock, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
