package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x83 {
    private final long a;
    private final long b;
    private long c;

    public /* synthetic */ x83(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + ((Object) fd5.v(this.b)) + ')';
    }

    public /* synthetic */ x83(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private x83(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = fd5.b.c();
    }

    private x83(long j, long j2, long j3) {
        this(j, j2, (DefaultConstructorMarker) null);
        this.c = j3;
    }
}
