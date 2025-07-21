package org.brotli.dec;

/* loaded from: classes5.dex */
final class g {
    private int a;
    int[] b;
    int[] c;

    g() {
    }

    static void a(g gVar, a aVar) {
        int length = gVar.c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            gVar.c[i2] = i;
            d.n(gVar.a, gVar.b, i, aVar);
            i += 1080;
        }
    }

    static void b(g gVar, int i, int i2) {
        gVar.a = i;
        gVar.b = new int[i2 * 1080];
        gVar.c = new int[i2];
    }
}
