package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.t0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class hk2 {
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
    public final a k;
    private final Metadata l;

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public hk2(byte[] bArr, int i) {
        xo5 xo5Var = new xo5(bArr);
        xo5Var.p(i * 8);
        this.a = xo5Var.h(16);
        this.b = xo5Var.h(16);
        this.c = xo5Var.h(24);
        this.d = xo5Var.h(24);
        int h = xo5Var.h(20);
        this.e = h;
        this.f = j(h);
        this.g = xo5Var.h(3) + 1;
        int h2 = xo5Var.h(5) + 1;
        this.h = h2;
        this.i = e(h2);
        this.j = xo5Var.j(36);
        this.k = null;
        this.l = null;
    }

    private static int e(int i) {
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

    private static int j(int i) {
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

    public hk2 a(List list) {
        return new hk2(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(new Metadata(list)));
    }

    public hk2 b(a aVar) {
        return new hk2(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public hk2 c(List list) {
        return new hk2(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(oc9.c(list)));
    }

    public long d() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.a;
            j = ((((i2 != this.b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public long f() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public t0 g(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new t0.b().g0("audio/flac").Y(i).J(this.g).h0(this.e).V(Collections.singletonList(bArr)).Z(h(metadata)).G();
    }

    public Metadata h(Metadata metadata) {
        Metadata metadata2 = this.l;
        return metadata2 == null ? metadata : metadata2.b(metadata);
    }

    public long i(long j) {
        return z19.r((j * this.e) / 1000000, 0L, this.j - 1);
    }

    private hk2(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, Metadata metadata) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j(i5);
        this.g = i6;
        this.h = i7;
        this.i = e(i7);
        this.j = j;
        this.k = aVar;
        this.l = metadata;
    }
}
