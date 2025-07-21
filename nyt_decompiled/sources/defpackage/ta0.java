package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ta0 extends o26 {
    private boolean[] a;
    private int b;

    public ta0(boolean[] zArr) {
        zq3.h(zArr, "bufferWithData");
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            boolean[] copyOf = Arrays.copyOf(zArr, uo6.d(i, zArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(boolean z) {
        o26.c(this, 0, 1, null);
        boolean[] zArr = this.a;
        int d = d();
        this.b = d + 1;
        zArr[d] = z;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
