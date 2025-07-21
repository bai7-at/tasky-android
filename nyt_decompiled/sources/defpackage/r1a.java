package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzagv;

/* loaded from: classes3.dex */
final class r1a implements w1a {
    private final long[] a;
    private final long[] b;
    private final long c;

    private r1a(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? khe.F(jArr2[jArr2.length - 1]) : j;
    }

    public static r1a c(long j, zzagv zzagvVar, long j2) {
        int length = zzagvVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzagvVar.zzb + zzagvVar.zzd[i3];
            j3 += zzagvVar.zzc + zzagvVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new r1a(jArr, jArr2, j2);
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        int r = khe.r(jArr, j, true, true);
        long j2 = jArr[r];
        long j3 = jArr2[r];
        int i = r + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        Pair d = d(khe.I(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        hx9 hx9Var = new hx9(khe.F(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new ex9(hx9Var, hx9Var);
    }

    @Override // defpackage.w1a
    public final long b(long j) {
        return khe.F(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.c;
    }

    @Override // defpackage.w1a
    public final long zzc() {
        return -1L;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
