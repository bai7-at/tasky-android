package defpackage;

import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class n63 implements xz5 {
    private final HandleReferencePoint a;
    private final jd5 b;
    private long c = fd5.b.c();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            try {
                iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HandleReferencePoint.TopMiddle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HandleReferencePoint.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public n63(HandleReferencePoint handleReferencePoint, jd5 jd5Var) {
        this.a = handleReferencePoint;
        this.b = jd5Var;
    }

    @Override // defpackage.xz5
    public long a(bn3 bn3Var, long j, LayoutDirection layoutDirection, long j2) {
        int i;
        long a2 = this.b.a();
        if (!hd5.c(a2)) {
            a2 = this.c;
        }
        this.c = a2;
        int i2 = a.a[this.a.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = hn3.g(j2) / 2;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = hn3.g(j2);
        }
        long a3 = wm3.a(dg4.d(fd5.o(a2)), dg4.d(fd5.p(a2)));
        return wm3.a((bn3Var.d() + vm3.j(a3)) - i, bn3Var.g() + vm3.k(a3));
    }
}
