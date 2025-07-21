package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class rld {
    public final j64 a;
    private final long b;
    private final Clock c;

    public rld(j64 j64Var, long j, Clock clock) {
        this.a = j64Var;
        this.c = clock;
        this.b = clock.elapsedRealtime() + j;
    }

    public final boolean a() {
        return this.b < this.c.elapsedRealtime();
    }
}
