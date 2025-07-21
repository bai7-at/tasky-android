package org.brotli.dec;

/* loaded from: classes5.dex */
final class h {
    private byte[] a;
    private int[] b;

    h() {
    }

    static void a(h hVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = hVar.b;
            byte[] bArr = hVar.a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    static void b(h hVar, byte[] bArr, int[] iArr) {
        hVar.a = bArr;
        hVar.b = iArr;
    }
}
