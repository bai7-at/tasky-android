package defpackage;

import com.google.android.gms.internal.ads.zzby;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class pw9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final ow9 k;
    private final zzby l;

    private pw9(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ow9 ow9Var, zzby zzbyVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i(i5);
        this.g = i6;
        this.h = i7;
        this.i = h(i7);
        this.j = j;
        this.k = ow9Var;
        this.l = zzbyVar;
    }

    private static int h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return Math.max(0L, Math.min((j * this.e) / 1000000, this.j - 1));
    }

    public final l6a c(byte[] bArr, zzby zzbyVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzby d = d(zzbyVar);
        x3a x3aVar = new x3a();
        x3aVar.w("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        x3aVar.o(i);
        x3aVar.k0(this.g);
        x3aVar.x(this.e);
        x3aVar.q(khe.z(this.h));
        x3aVar.l(Collections.singletonList(bArr));
        x3aVar.p(d);
        return x3aVar.D();
    }

    public final zzby d(zzby zzbyVar) {
        zzby zzbyVar2 = this.l;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.d(zzbyVar);
    }

    public final pw9 e(List list) {
        return new pw9(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(new zzby(list)));
    }

    public final pw9 f(ow9 ow9Var) {
        return new pw9(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, ow9Var, this.l);
    }

    public final pw9 g(List list) {
        return new pw9(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(cy9.b(list)));
    }

    public pw9(byte[] bArr, int i) {
        g8e g8eVar = new g8e(bArr, bArr.length);
        g8eVar.k(i * 8);
        this.a = g8eVar.d(16);
        this.b = g8eVar.d(16);
        this.c = g8eVar.d(24);
        this.d = g8eVar.d(24);
        int d = g8eVar.d(20);
        this.e = d;
        this.f = i(d);
        this.g = g8eVar.d(3) + 1;
        int d2 = g8eVar.d(5) + 1;
        this.h = d2;
        this.i = h(d2);
        int d3 = g8eVar.d(4);
        int d4 = g8eVar.d(32);
        int i2 = khe.a;
        this.j = ((d3 & 4294967295L) << 32) | (d4 & 4294967295L);
        this.k = null;
        this.l = null;
    }
}
