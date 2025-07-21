package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class cw8 extends o26 {
    private short[] a;
    private int b;

    public /* synthetic */ cw8(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // defpackage.o26
    public /* bridge */ /* synthetic */ Object a() {
        return bw8.a(f());
    }

    @Override // defpackage.o26
    public void b(int i) {
        if (bw8.t(this.a) < i) {
            short[] sArr = this.a;
            short[] copyOf = Arrays.copyOf(sArr, uo6.d(i, bw8.t(sArr) * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = bw8.f(copyOf);
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(short s) {
        o26.c(this, 0, 1, null);
        short[] sArr = this.a;
        int d = d();
        this.b = d + 1;
        bw8.x(sArr, d, s);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return bw8.f(copyOf);
    }

    private cw8(short[] sArr) {
        zq3.h(sArr, "bufferWithData");
        this.a = sArr;
        this.b = bw8.t(sArr);
        b(10);
    }
}
