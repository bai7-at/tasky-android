package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class jj0 extends o26 {
    private char[] a;
    private int b;

    public jj0(char[] cArr) {
        zq3.h(cArr, "bufferWithData");
        this.a = cArr;
        this.b = cArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            char[] copyOf = Arrays.copyOf(cArr, uo6.d(i, cArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(char c) {
        o26.c(this, 0, 1, null);
        char[] cArr = this.a;
        int d = d();
        this.b = d + 1;
        cArr[d] = c;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
