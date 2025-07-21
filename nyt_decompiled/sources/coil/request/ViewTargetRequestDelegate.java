package coil.request;

import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.util.Lifecycles;
import defpackage.c44;
import defpackage.d44;
import defpackage.lb9;
import defpackage.s;
import defpackage.vg3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate extends RequestDelegate {
    private final ImageLoader a;
    private final vg3 b;
    private final lb9 c;
    private final Lifecycle d;
    private final Job e;

    public ViewTargetRequestDelegate(ImageLoader imageLoader, vg3 vg3Var, lb9 lb9Var, Lifecycle lifecycle, Job job) {
        super(null);
        this.a = imageLoader;
        this.b = vg3Var;
        this.c = lb9Var;
        this.d = lifecycle;
        this.e = job;
    }

    @Override // coil.request.RequestDelegate
    public void a() {
        if (this.c.getView().isAttachedToWindow()) {
            return;
        }
        s.l(this.c.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public void c() {
        this.d.a(this);
        lb9 lb9Var = this.c;
        if (lb9Var instanceof c44) {
            Lifecycles.b(this.d, (c44) lb9Var);
        }
        s.l(this.c.getView()).c(this);
    }

    public void d() {
        Job.DefaultImpls.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
        lb9 lb9Var = this.c;
        if (lb9Var instanceof c44) {
            this.d.d((c44) lb9Var);
        }
        this.d.d(this);
    }

    public final void e() {
        this.a.b(this.b);
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        s.l(this.c.getView()).a();
    }
}
