package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class nv8 extends o26 {
    private int[] a;
    private int b;

    public /* synthetic */ nv8(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // defpackage.o26
    public /* bridge */ /* synthetic */ Object a() {
        return mv8.a(f());
    }

    @Override // defpackage.o26
    public void b(int i) {
        if (mv8.t(this.a) < i) {
            int[] iArr = this.a;
            int[] copyOf = Arrays.copyOf(iArr, uo6.d(i, mv8.t(iArr) * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = mv8.f(copyOf);
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(int i) {
        o26.c(this, 0, 1, null);
        int[] iArr = this.a;
        int d = d();
        this.b = d + 1;
        mv8.x(iArr, d, i);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return mv8.f(copyOf);
    }

    private nv8(int[] iArr) {
        zq3.h(iArr, "bufferWithData");
        this.a = iArr;
        this.b = mv8.t(iArr);
        b(10);
    }
}
