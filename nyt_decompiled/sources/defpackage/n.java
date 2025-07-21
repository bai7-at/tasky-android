package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.size.Precision;
import coil.size.ViewSizeResolver;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class n {
    private static final dj1 a = new dj1(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Precision.values().length];
            iArr[Precision.EXACT.ordinal()] = 1;
            iArr[Precision.INEXACT.ordinal()] = 2;
            iArr[Precision.AUTOMATIC.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final boolean a(vg3 vg3Var) {
        int i = a.a[vg3Var.H().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if ((vg3Var.q().m() != null || !(vg3Var.K() instanceof js1)) && (!(vg3Var.M() instanceof lb9) || !(vg3Var.K() instanceof ViewSizeResolver) || !(((lb9) vg3Var.M()).getView() instanceof ImageView) || ((lb9) vg3Var.M()).getView() != ((ViewSizeResolver) vg3Var.K()).getView())) {
                return false;
            }
        }
        return true;
    }

    public static final dj1 b() {
        return a;
    }

    public static final Drawable c(vg3 vg3Var, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return f.a(vg3Var.l(), num.intValue());
    }
}
