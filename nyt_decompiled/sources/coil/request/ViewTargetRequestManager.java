package coil.request;

import android.view.View;
import defpackage.mb9;
import defpackage.s;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    private final View a;
    private mb9 b;
    private Job c;
    private ViewTargetRequestDelegate d;
    private boolean e;

    public ViewTargetRequestManager(View view) {
        this.a = view;
    }

    public final synchronized void a() {
        Job launch$default;
        try {
            Job job = this.c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.c = launch$default;
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized mb9 b(Deferred deferred) {
        mb9 mb9Var = this.b;
        if (mb9Var != null && s.r() && this.e) {
            this.e = false;
            mb9Var.a(deferred);
            return mb9Var;
        }
        Job job = this.c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.c = null;
        mb9 mb9Var2 = new mb9(this.a, deferred);
        this.b = mb9Var2;
        return mb9Var2;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.d();
        }
        this.d = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.e = true;
        viewTargetRequestDelegate.e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.d();
        }
    }
}
