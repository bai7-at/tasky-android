package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mt5 {
    private final long a;
    private final long b;

    public mt5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final mt5 a() {
        return new mt5(this.b, 0L, 2, null);
    }

    public final mt5 b() {
        return new mt5(this.a, 0L, 2, null);
    }

    public final long c() {
        return this.b;
    }

    public final mt5 d() {
        return new mt5(this.b, this.a);
    }

    public final long e() {
        return this.a;
    }

    public /* synthetic */ mt5(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? j : j2);
    }
}
