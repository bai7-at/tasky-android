package defpackage;

import androidx.compose.ui.text.i;

/* loaded from: classes.dex */
public abstract class my1 {
    public static final long a(long j, long j2) {
        int j3;
        int l = i.l(j);
        int k = i.k(j);
        if (i.p(j2, j)) {
            if (i.d(j2, j)) {
                l = i.l(j2);
                k = l;
            } else {
                if (i.d(j, j2)) {
                    j3 = i.j(j2);
                } else if (i.e(j2, l)) {
                    l = i.l(j2);
                    j3 = i.j(j2);
                } else {
                    k = i.l(j2);
                }
                k -= j3;
            }
        } else if (k > i.l(j2)) {
            l -= i.j(j2);
            j3 = i.j(j2);
            k -= j3;
        }
        return pj8.b(l, k);
    }
}
