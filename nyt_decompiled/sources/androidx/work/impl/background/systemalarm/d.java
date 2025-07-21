package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.a;
import com.facebook.AuthenticationTokenClaims;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.h94;
import defpackage.kq8;
import defpackage.mk9;
import defpackage.nl1;
import defpackage.oe5;
import defpackage.ol1;
import defpackage.q08;
import defpackage.rc9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public class d implements oe5, mk9.a {
    private static final String r = h94.i("DelayMetCommandHandler");
    private final Context a;
    private final int b;
    private final ej9 c;
    private final e d;
    private final WorkConstraintsTracker e;
    private final Object f;
    private int g;
    private final Executor h;
    private final Executor i;
    private PowerManager.WakeLock j;
    private boolean k;
    private final q08 l;
    private final CoroutineDispatcher m;
    private volatile Job n;

    d(Context context, int i, e eVar, q08 q08Var) {
        this.a = context;
        this.b = i;
        this.d = eVar;
        this.c = q08Var.a();
        this.l = q08Var;
        kq8 t = eVar.g().t();
        this.h = eVar.f().c();
        this.i = eVar.f().a();
        this.m = eVar.f().b();
        this.e = new WorkConstraintsTracker(t);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    private void d() {
        synchronized (this.f) {
            try {
                if (this.n != null) {
                    this.n.cancel((CancellationException) null);
                }
                this.d.h().b(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    h94.e().a(r, "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.g != 0) {
            h94.e().a(r, "Already started work for " + this.c);
            return;
        }
        this.g = 1;
        h94.e().a(r, "onAllConstraintsMet for " + this.c);
        if (this.d.e().r(this.l)) {
            this.d.h().a(this.c, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String b = this.c.b();
        if (this.g >= 2) {
            h94.e().a(r, "Already stopped work for " + b);
            return;
        }
        this.g = 2;
        h94 e = h94.e();
        String str = r;
        e.a(str, "Stopping work for WorkSpec " + b);
        this.i.execute(new e.b(this.d, b.f(this.a, this.c), this.b));
        if (!this.d.e().k(this.c.b())) {
            h94.e().a(str, "Processor does not have WorkSpec " + b + ". No need to reschedule");
            return;
        }
        h94.e().a(str, "WorkSpec " + b + " needs to be rescheduled");
        this.i.execute(new e.b(this.d, b.e(this.a, this.c), this.b));
    }

    @Override // mk9.a
    public void a(ej9 ej9Var) {
        h94.e().a(r, "Exceeded time limits on execution for " + ej9Var);
        this.h.execute(new nl1(this));
    }

    @Override // defpackage.oe5
    public void e(dk9 dk9Var, androidx.work.impl.constraints.a aVar) {
        if (aVar instanceof a.C0124a) {
            this.h.execute(new ol1(this));
        } else {
            this.h.execute(new nl1(this));
        }
    }

    void f() {
        String b = this.c.b();
        this.j = rc9.b(this.a, b + " (" + this.b + ")");
        h94 e = h94.e();
        String str = r;
        e.a(str, "Acquiring wakelock " + this.j + "for WorkSpec " + b);
        this.j.acquire();
        dk9 h = this.d.g().u().i().h(b);
        if (h == null) {
            this.h.execute(new nl1(this));
            return;
        }
        boolean l = h.l();
        this.k = l;
        if (l) {
            this.n = WorkConstraintsTrackerKt.d(this.e, h, this.m, this);
            return;
        }
        h94.e().a(str, "No constraints for " + b);
        this.h.execute(new ol1(this));
    }

    void g(boolean z) {
        h94.e().a(r, "onExecuted " + this.c + ", " + z);
        d();
        if (z) {
            this.i.execute(new e.b(this.d, b.e(this.a, this.c), this.b));
        }
        if (this.k) {
            this.i.execute(new e.b(this.d, b.b(this.a), this.b));
        }
    }
}
