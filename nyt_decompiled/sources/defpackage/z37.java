package defpackage;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class z37 {
    private static final byte[] l = new byte[0];
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final byte d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final long h;
    public final int i;
    public final byte[] j;
    public final byte[] k;

    public static final class b {
        private boolean a;
        private boolean b;
        private byte c;
        private int d;
        private long e;
        private int f;
        private byte[] g = z37.l;
        private byte[] h = z37.l;

        public z37 i() {
            return new z37(this);
        }

        public b j(byte[] bArr) {
            ur.e(bArr);
            this.g = bArr;
            return this;
        }

        public b k(boolean z) {
            this.b = z;
            return this;
        }

        public b l(boolean z) {
            this.a = z;
            return this;
        }

        public b m(byte[] bArr) {
            ur.e(bArr);
            this.h = bArr;
            return this;
        }

        public b n(byte b) {
            this.c = b;
            return this;
        }

        public b o(int i) {
            ur.a(i >= 0 && i <= 65535);
            this.d = i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            return this;
        }

        public b p(int i) {
            this.f = i;
            return this;
        }

        public b q(long j) {
            this.e = j;
            return this;
        }
    }

    public static int b(int i) {
        return sm3.b(i + 1, 65536);
    }

    public static int c(int i) {
        return sm3.b(i - 1, 65536);
    }

    public static z37 d(yo5 yo5Var) {
        byte[] bArr;
        if (yo5Var.a() < 12) {
            return null;
        }
        int H = yo5Var.H();
        byte b2 = (byte) (H >> 6);
        boolean z = ((H >> 5) & 1) == 1;
        byte b3 = (byte) (H & 15);
        if (b2 != 2) {
            return null;
        }
        int H2 = yo5Var.H();
        boolean z2 = ((H2 >> 7) & 1) == 1;
        byte b4 = (byte) (H2 & 127);
        int N = yo5Var.N();
        long J = yo5Var.J();
        int q = yo5Var.q();
        if (b3 > 0) {
            bArr = new byte[b3 * 4];
            for (int i = 0; i < b3; i++) {
                yo5Var.l(bArr, i * 4, 4);
            }
        } else {
            bArr = l;
        }
        byte[] bArr2 = new byte[yo5Var.a()];
        yo5Var.l(bArr2, 0, yo5Var.a());
        return new b().l(z).k(z2).n(b4).o(N).q(J).p(q).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z37.class != obj.getClass()) {
            return false;
        }
        z37 z37Var = (z37) obj;
        return this.f == z37Var.f && this.g == z37Var.g && this.e == z37Var.e && this.h == z37Var.h && this.i == z37Var.i;
    }

    public int hashCode() {
        int i = (((((527 + this.f) * 31) + this.g) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.h;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.i;
    }

    public String toString() {
        return z19.D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f), Integer.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.e));
    }

    private z37(b bVar) {
        this.a = (byte) 2;
        this.b = bVar.a;
        this.c = false;
        this.e = bVar.b;
        this.f = bVar.c;
        this.g = bVar.d;
        this.h = bVar.e;
        this.i = bVar.f;
        byte[] bArr = bVar.g;
        this.j = bArr;
        this.d = (byte) (bArr.length / 4);
        this.k = bVar.h;
    }
}
