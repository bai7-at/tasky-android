package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.a;
import defpackage.an3;
import defpackage.jy4;
import defpackage.q04;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yb5;
import defpackage.zb5;

/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements q04 {
    private final yb5 b;
    private final Object[] c;
    private final int d;

    public NearestRangeKeyIndexMap(an3 an3Var, LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        a h = lazyLayoutIntervalContent.h();
        final int g = an3Var.g();
        if (g < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        final int min = Math.min(an3Var.j(), h.a() - 1);
        if (min < g) {
            this.b = zb5.a();
            this.c = new Object[0];
            this.d = 0;
        } else {
            int i = (min - g) + 1;
            this.c = new Object[i];
            this.d = g;
            final jy4 jy4Var = new jy4(i);
            h.b(g, min, new ss2() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
                
                    if (r3 == null) goto L7;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void b(androidx.compose.foundation.lazy.layout.a.C0029a r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = r7.c()
                        androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
                        ss2 r0 = r0.getKey()
                        int r1 = r1
                        int r2 = r7.b()
                        int r1 = java.lang.Math.max(r1, r2)
                        int r2 = r2
                        int r3 = r7.b()
                        int r4 = r7.a()
                        int r3 = r3 + r4
                        int r3 = r3 + (-1)
                        int r2 = java.lang.Math.min(r2, r3)
                        if (r1 > r2) goto L57
                    L27:
                        if (r0 == 0) goto L39
                        int r3 = r7.b()
                        int r3 = r1 - r3
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        java.lang.Object r3 = r0.invoke(r3)
                        if (r3 != 0) goto L3d
                    L39:
                        java.lang.Object r3 = androidx.compose.foundation.lazy.layout.g.a(r1)
                    L3d:
                        jy4 r4 = r3
                        r4.q(r3, r1)
                        androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r4
                        java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.a(r4)
                        androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r4
                        int r5 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.d(r5)
                        int r5 = r1 - r5
                        r4[r5] = r3
                        if (r1 == r2) goto L57
                        int r1 = r1 + 1
                        goto L27
                    L57:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.b(androidx.compose.foundation.lazy.layout.a$a):void");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((a.C0029a) obj);
                    return ww8.a;
                }
            });
            this.b = jy4Var;
        }
    }

    @Override // defpackage.q04
    public int b(Object obj) {
        yb5 yb5Var = this.b;
        int a = yb5Var.a(obj);
        if (a >= 0) {
            return yb5Var.c[a];
        }
        return -1;
    }

    @Override // defpackage.q04
    public Object c(int i) {
        Object[] objArr = this.c;
        int i2 = i - this.d;
        if (i2 < 0 || i2 > kotlin.collections.d.e0(objArr)) {
            return null;
        }
        return objArr[i2];
    }
}
