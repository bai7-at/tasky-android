package coil.request;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class BaseRequestDelegate extends RequestDelegate {
    private final Lifecycle a;
    private final Job b;

    public BaseRequestDelegate(Lifecycle lifecycle, Job job) {
        super(null);
        this.a = lifecycle;
        this.b = job;
    }

    @Override // coil.request.RequestDelegate
    public void b() {
        this.a.d(this);
    }

    @Override // coil.request.RequestDelegate
    public void c() {
        this.a.a(this);
    }

    public void d() {
        Job.DefaultImpls.cancel$default(this.b, (CancellationException) null, 1, (Object) null);
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        d();
    }
}
