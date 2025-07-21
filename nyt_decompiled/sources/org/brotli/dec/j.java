package org.brotli.dec;

import java.io.InputStream;

/* loaded from: classes5.dex */
final class j {
    byte[] A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    byte[] H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P;
    int U;
    int V;
    int W;
    int X;
    int Y;
    byte[] Z;
    int b;
    byte[] d;
    int g;
    boolean h;
    boolean i;
    boolean j;
    int w;
    int x;
    int y;
    byte[] z;
    int a = 0;
    final a c = new a();
    final int[] e = new int[3240];
    final int[] f = new int[3240];
    final g k = new g();
    final g l = new g();
    final g m = new g();
    final int[] n = new int[3];
    final int[] o = new int[3];
    final int[] p = new int[6];
    final int[] q = {16, 15, 11, 4};
    int r = 0;
    int s = 0;
    int t = 0;
    boolean u = false;
    int v = 0;
    int Q = 0;
    long R = 0;
    byte[] S = new byte[0];
    int T = 0;

    j() {
    }

    static void a(j jVar) {
        int i = jVar.a;
        if (i == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i == 11) {
            return;
        }
        jVar.a = 11;
        a.b(jVar.c);
    }

    private static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i = a.i(aVar, 3);
        if (i != 0) {
            return i + 17;
        }
        int i2 = a.i(aVar, 3);
        if (i2 != 0) {
            return i2 + 8;
        }
        return 17;
    }

    static void c(j jVar, InputStream inputStream) {
        if (jVar.a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(jVar.c, inputStream);
        int b = b(jVar.c);
        if (b == 9) {
            throw new BrotliRuntimeException("Invalid 'windowBits' code");
        }
        int i = 1 << b;
        jVar.P = i;
        jVar.O = i - 16;
        jVar.a = 1;
    }
}
