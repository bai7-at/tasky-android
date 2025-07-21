package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.request.BaseRequestDelegate;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import coil.size.Scale;
import defpackage.oq1;
import kotlin.collections.d;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class sy6 {
    private final ImageLoader a;
    private final de8 b;
    private final y63 c;

    public sy6(ImageLoader imageLoader, de8 de8Var, i94 i94Var) {
        this.a = imageLoader;
        this.b = de8Var;
        this.c = j.a(i94Var);
    }

    private final boolean d(vg3 vg3Var, au7 au7Var) {
        return c(vg3Var, vg3Var.j()) && this.c.a(au7Var);
    }

    private final boolean e(vg3 vg3Var) {
        return vg3Var.O().isEmpty() || d.W(s.o(), vg3Var.j());
    }

    public final boolean a(uk5 uk5Var) {
        return !a.d(uk5Var.f()) || this.c.b();
    }

    public final a32 b(vg3 vg3Var, Throwable th) {
        Drawable t;
        if (th instanceof NullRequestDataException) {
            t = vg3Var.u();
            if (t == null) {
                t = vg3Var.t();
            }
        } else {
            t = vg3Var.t();
        }
        return new a32(t, vg3Var, th);
    }

    public final boolean c(vg3 vg3Var, Bitmap.Config config) {
        if (!a.d(config)) {
            return true;
        }
        if (!vg3Var.h()) {
            return false;
        }
        dg8 M = vg3Var.M();
        if (M instanceof lb9) {
            View view = ((lb9) M).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final uk5 f(vg3 vg3Var, au7 au7Var) {
        Bitmap.Config j = (e(vg3Var) && d(vg3Var, au7Var)) ? vg3Var.j() : Bitmap.Config.ARGB_8888;
        CachePolicy D = this.b.b() ? vg3Var.D() : CachePolicy.DISABLED;
        boolean z = vg3Var.i() && vg3Var.O().isEmpty() && j != Bitmap.Config.ALPHA_8;
        oq1 d = au7Var.d();
        oq1.b bVar = oq1.b.a;
        return new uk5(vg3Var.l(), j, vg3Var.k(), au7Var, (zq3.c(d, bVar) || zq3.c(au7Var.c(), bVar)) ? Scale.FIT : vg3Var.J(), n.a(vg3Var), z, vg3Var.I(), vg3Var.r(), vg3Var.x(), vg3Var.L(), vg3Var.E(), vg3Var.C(), vg3Var.s(), D);
    }

    public final RequestDelegate g(vg3 vg3Var, Job job) {
        Lifecycle z = vg3Var.z();
        dg8 M = vg3Var.M();
        return M instanceof lb9 ? new ViewTargetRequestDelegate(this.a, vg3Var, (lb9) M, z, job) : new BaseRequestDelegate(z, job);
    }
}
