package org.brotli.dec;

/* loaded from: classes5.dex */
abstract class l {
    private static final byte[] a = new byte[1024];
    private static final int[] b = new int[1024];

    static void a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(a, 0, bArr, i + i3, min);
            i3 += min;
        }
    }

    static void b(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(b, 0, iArr, i + i3, min);
            i3 += min;
        }
    }
}
