package defpackage;

/* loaded from: classes3.dex */
final class o40 {
    private final byte[] a;
    private int b = 0;

    o40(int i) {
        this.a = new byte[i];
    }

    private void c(int i, boolean z) {
        this.a[i] = z ? (byte) 1 : (byte) 0;
    }

    void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            c(i3, z);
        }
    }

    byte[] b(int i) {
        int length = this.a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.a[i2 / i];
        }
        return bArr;
    }
}
