package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class nm3 extends o26 {
    private int[] a;
    private int b;

    public nm3(int[] iArr) {
        zq3.h(iArr, "bufferWithData");
        this.a = iArr;
        this.b = iArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, uo6.d(i, iArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
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
        iArr[d] = i;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
