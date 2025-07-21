package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import defpackage.ei7;

/* loaded from: classes2.dex */
final class pu4 implements hi7 {
    private final long[] a;
    private final long[] b;
    private final long c;

    private pu4(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? z19.D0(jArr2[jArr2.length - 1]) : j;
    }

    public static pu4 a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3];
            j3 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new pu4(jArr, jArr2, j2);
    }

    private static Pair c(long j, long[] jArr, long[] jArr2) {
        int i = z19.i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i2] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override // defpackage.hi7
    public long b(long j) {
        return z19.D0(((Long) c(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        Pair c = c(z19.h1(z19.r(j, 0L, this.c)), this.b, this.a);
        return new ei7.a(new gi7(z19.D0(((Long) c.first).longValue()), ((Long) c.second).longValue()));
    }

    @Override // defpackage.hi7
    public long g() {
        return -1L;
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.c;
    }
}
