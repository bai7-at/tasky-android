package defpackage;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gxb implements via, u7c, tof, t7c {
    private final ywb a;
    private final zwb b;
    private final v2b d;
    private final Executor e;
    private final Clock f;
    private final Set c = new HashSet();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final fxb h = new fxb();
    private boolean i = false;
    private WeakReference j = new WeakReference(this);

    public gxb(s2b s2bVar, zwb zwbVar, Executor executor, ywb ywbVar, Clock clock) {
        this.a = ywbVar;
        y1b y1bVar = b2b.b;
        this.d = s2bVar.a("google.afma.activeView.handleUpdate", y1bVar, y1bVar);
        this.b = zwbVar;
        this.e = executor;
        this.f = clock;
    }

    private final void s() {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            this.a.f((wlb) it2.next());
        }
        this.a.e();
    }

    @Override // defpackage.u7c
    public final synchronized void E(Context context) {
        this.h.b = false;
        a();
    }

    @Override // defpackage.tof
    public final void O() {
    }

    @Override // defpackage.tof
    public final void Q1(int i) {
    }

    @Override // defpackage.via
    public final synchronized void R(uia uiaVar) {
        fxb fxbVar = this.h;
        fxbVar.a = uiaVar.j;
        fxbVar.f = uiaVar;
        a();
    }

    @Override // defpackage.tof
    public final synchronized void Y4() {
        this.h.b = false;
        a();
    }

    public final synchronized void a() {
        try {
            if (this.j.get() == null) {
                n();
                return;
            }
            if (this.i || !this.g.get()) {
                return;
            }
            try {
                this.h.d = this.f.elapsedRealtime();
                final JSONObject zzb = this.b.zzb(this.h);
                for (final wlb wlbVar : this.c) {
                    this.e.execute(new Runnable() { // from class: bxb
                        @Override // java.lang.Runnable
                        public final void run() {
                            wlb.this.M0("AFMA_updateActiveView", zzb);
                        }
                    });
                }
                sgb.b(this.d.zzb(zzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                pzc.l("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(wlb wlbVar) {
        this.c.add(wlbVar);
        this.a.d(wlbVar);
    }

    @Override // defpackage.tof
    public final void h6() {
    }

    public final void k(Object obj) {
        this.j = new WeakReference(obj);
    }

    @Override // defpackage.u7c
    public final synchronized void l(Context context) {
        this.h.e = QueryKeys.USER_ID;
        a();
        s();
        this.i = true;
    }

    public final synchronized void n() {
        s();
        this.i = true;
    }

    @Override // defpackage.tof
    public final void n4() {
    }

    @Override // defpackage.tof
    public final synchronized void s4() {
        this.h.b = true;
        a();
    }

    @Override // defpackage.u7c
    public final synchronized void t(Context context) {
        this.h.b = true;
        a();
    }

    @Override // defpackage.t7c
    public final synchronized void zzq() {
        if (this.g.compareAndSet(false, true)) {
            this.a.c(this);
            a();
        }
    }
}
