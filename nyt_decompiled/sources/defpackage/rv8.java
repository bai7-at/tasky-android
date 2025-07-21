package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class rv8 extends o26 {
    private long[] a;
    private int b;

    public /* synthetic */ rv8(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // defpackage.o26
    public /* bridge */ /* synthetic */ Object a() {
        return qv8.a(f());
    }

    @Override // defpackage.o26
    public void b(int i) {
        if (qv8.t(this.a) < i) {
            long[] jArr = this.a;
            long[] copyOf = Arrays.copyOf(jArr, uo6.d(i, qv8.t(jArr) * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = qv8.f(copyOf);
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(long j) {
        o26.c(this, 0, 1, null);
        long[] jArr = this.a;
        int d = d();
        this.b = d + 1;
        qv8.x(jArr, d, j);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return qv8.f(copyOf);
    }

    private rv8(long[] jArr) {
        zq3.h(jArr, "bufferWithData");
        this.a = jArr;
        this.b = qv8.t(jArr);
        b(10);
    }
}
