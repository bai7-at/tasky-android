package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class wq7 extends o26 {
    private short[] a;
    private int b;

    public wq7(short[] sArr) {
        zq3.h(sArr, "bufferWithData");
        this.a = sArr;
        this.b = sArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            short[] copyOf = Arrays.copyOf(sArr, uo6.d(i, sArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
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
        sArr[d] = s;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
