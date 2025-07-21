package defpackage;

import com.google.android.gms.internal.ads.ea;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class g3g extends t3g {
    private final q7g f;
    private final zzgaa g;
    private final acd h;

    protected g3g(v3c v3cVar, int[] iArr, int i, q7g q7gVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, acd acdVar) {
        super(v3cVar, iArr, 0);
        this.f = q7gVar;
        this.g = zzgaa.p(list);
        this.h = acdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ zzgaa a(m6g[] m6gVarArr) {
        long j;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            m6g m6gVar = m6gVarArr[i2];
            if (m6gVar == null || m6gVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                h9 h9Var = new h9();
                h9Var.g(new e3g(0L, 0L));
                arrayList.add(h9Var);
            }
        }
        long[][] jArr = new long[2][];
        int i3 = 0;
        while (true) {
            j = -1;
            if (i3 >= 2) {
                break;
            }
            m6g m6gVar2 = m6gVarArr[i3];
            if (m6gVar2 == null) {
                jArr[i3] = new long[0];
            } else {
                jArr[i3] = new long[m6gVar2.b.length];
                int i4 = 0;
                while (true) {
                    int[] iArr = m6gVar2.b;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    long j2 = m6gVar2.a.b(iArr[i4]).h;
                    long[] jArr2 = jArr[i3];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i4] = j2;
                    i4++;
                }
                Arrays.sort(jArr[i3]);
            }
            i3++;
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            long[] jArr4 = jArr[i5];
            jArr3[i5] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        b(arrayList, jArr3);
        pie c = ea.b(ga.c()).b(2).c();
        int i6 = 0;
        while (i6 < 2) {
            int length = jArr[i6].length;
            if (length > 1) {
                double[] dArr = new double[length];
                int i7 = i;
                while (true) {
                    long[] jArr5 = jArr[i6];
                    double d = 0.0d;
                    if (i7 >= jArr5.length) {
                        break;
                    }
                    long j3 = jArr5[i7];
                    if (j3 != j) {
                        d = Math.log(j3);
                    }
                    dArr[i7] = d;
                    i7++;
                }
                int i8 = length - 1;
                double d2 = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d3 = dArr[i9];
                    i9++;
                    c.a(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                    i = 0;
                }
            }
            i6++;
            i = 0;
            j = -1;
        }
        zzgaa p = zzgaa.p(c.zzr());
        for (int i10 = 0; i10 < p.size(); i10++) {
            int intValue = ((Integer) p.get(i10)).intValue();
            int i11 = iArr2[intValue] + 1;
            iArr2[intValue] = i11;
            jArr3[intValue] = jArr[intValue][i11];
            b(arrayList, jArr3);
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (arrayList.get(i12) != null) {
                long j4 = jArr3[i12];
                jArr3[i12] = j4 + j4;
            }
        }
        b(arrayList, jArr3);
        h9 h9Var2 = new h9();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            h9 h9Var3 = (h9) arrayList.get(i13);
            h9Var2.g(h9Var3 == null ? zzgaa.t() : h9Var3.j());
        }
        return h9Var2.j();
    }

    private static void b(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            h9 h9Var = (h9) list.get(i2);
            if (h9Var != null) {
                h9Var.g(new e3g(j, jArr[i2]));
            }
        }
    }
}
