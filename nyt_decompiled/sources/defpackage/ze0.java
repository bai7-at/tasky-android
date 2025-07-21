package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ze0 extends o26 {
    private byte[] a;
    private int b;

    public ze0(byte[] bArr) {
        zq3.h(bArr, "bufferWithData");
        this.a = bArr;
        this.b = bArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            byte[] copyOf = Arrays.copyOf(bArr, uo6.d(i, bArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(byte b) {
        o26.c(this, 0, 1, null);
        byte[] bArr = this.a;
        int d = d();
        this.b = d + 1;
        bArr[d] = b;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
