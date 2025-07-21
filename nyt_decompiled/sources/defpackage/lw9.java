package defpackage;

import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class lw9 {
    public static zzby a(ov9 ov9Var, boolean z) {
        zzby a = new uw9().a(ov9Var, z ? null : n0a.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }

    public static ow9 b(b9e b9eVar) {
        b9eVar.l(1);
        int D = b9eVar.D();
        long s = b9eVar.s();
        long j = D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long I = b9eVar.I();
            if (I == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = I;
            jArr2[i2] = b9eVar.I();
            b9eVar.l(2);
            i2++;
        }
        b9eVar.l((int) ((s + j) - b9eVar.s()));
        return new ow9(jArr, jArr2);
    }
}
