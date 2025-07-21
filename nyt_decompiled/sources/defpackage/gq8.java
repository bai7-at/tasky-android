package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.ImmutableList;
import defpackage.ye4;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class gq8 {
    public static h2 a(ye4.a aVar, aq8[] aq8VarArr) {
        List[] listArr = new List[aq8VarArr.length];
        for (int i = 0; i < aq8VarArr.length; i++) {
            aq8 aq8Var = aq8VarArr[i];
            listArr[i] = aq8Var != null ? ImmutableList.y(aq8Var) : ImmutableList.x();
        }
        return b(aVar, listArr);
    }

    public static h2 b(ye4.a aVar, List[] listArr) {
        boolean z;
        ImmutableList.a aVar2 = new ImmutableList.a();
        for (int i = 0; i < aVar.d(); i++) {
            wp8 f = aVar.f(i);
            List list = listArr[i];
            for (int i2 = 0; i2 < f.a; i2++) {
                up8 c = f.c(i2);
                boolean z2 = aVar.a(i, i2, false) != 0;
                int i3 = c.a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < c.a; i4++) {
                    iArr[i4] = aVar.g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        aq8 aq8Var = (aq8) list.get(i5);
                        if (aq8Var.n().equals(c) && aq8Var.l(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                aVar2.a(new h2.a(c, z2, iArr, zArr));
            }
        }
        wp8 h = aVar.h();
        for (int i6 = 0; i6 < h.a; i6++) {
            up8 c2 = h.c(i6);
            int[] iArr2 = new int[c2.a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new h2.a(c2, false, iArr2, new boolean[c2.a]));
        }
        return new h2(aVar2.k());
    }

    public static h.a c(q72 q72Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = q72Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (q72Var.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new h.a(1, 0, length, i);
    }
}
