package defpackage;

import com.google.android.gms.internal.ads.zzcc;
import java.math.RoundingMode;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes3.dex */
final class r9a implements s9a {
    private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final sv9 a;
    private final tx9 b;
    private final v9a c;
    private final int d;
    private final byte[] e;
    private final b9e f;
    private final int g;
    private final l6a h;
    private int i;
    private long j;
    private int k;
    private long l;

    public r9a(sv9 sv9Var, tx9 tx9Var, v9a v9aVar) {
        this.a = sv9Var;
        this.b = tx9Var;
        this.c = v9aVar;
        int max = Math.max(1, v9aVar.c / 10);
        this.g = max;
        b9e b9eVar = new b9e(v9aVar.f);
        b9eVar.z();
        int z = b9eVar.z();
        this.d = z;
        int i = v9aVar.b;
        int i2 = v9aVar.d;
        int i3 = (((i2 - (i * 4)) * 8) / (v9aVar.e * i)) + 1;
        if (z != i3) {
            throw zzcc.a("Expected frames per block: " + i3 + "; got: " + z, null);
        }
        int i4 = khe.a;
        int i5 = ((max + z) - 1) / z;
        this.e = new byte[i2 * i5];
        this.f = new b9e(i5 * (z + z) * i);
        int i6 = ((v9aVar.c * v9aVar.d) * 8) / z;
        x3a x3aVar = new x3a();
        x3aVar.w("audio/raw");
        x3aVar.j0(i6);
        x3aVar.r(i6);
        x3aVar.o((max + max) * i);
        x3aVar.k0(v9aVar.b);
        x3aVar.x(v9aVar.c);
        x3aVar.q(2);
        this.h = x3aVar.D();
    }

    private final int a(int i) {
        int i2 = this.c.b;
        return i / (i2 + i2);
    }

    private final int d(int i) {
        return (i + i) * this.c.b;
    }

    private final void e(int i) {
        long H = this.j + khe.H(this.l, 1000000L, this.c.c, RoundingMode.FLOOR);
        int d = d(i);
        this.b.c(H, 1, d, this.k - d, null);
        this.l += i;
        this.k -= d;
    }

    @Override // defpackage.s9a
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.s9a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.ov9 r21, long r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9a.c(ov9, long):boolean");
    }

    @Override // defpackage.s9a
    public final void zza(int i, long j) {
        this.a.m(new y9a(this.c, this.d, i, j));
        this.b.f(this.h);
    }
}
