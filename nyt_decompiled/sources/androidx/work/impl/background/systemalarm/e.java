package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import defpackage.ej9;
import defpackage.ek7;
import defpackage.h94;
import defpackage.jj9;
import defpackage.lj9;
import defpackage.mk9;
import defpackage.n62;
import defpackage.pj9;
import defpackage.r08;
import defpackage.rc9;
import defpackage.rg8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class e implements n62 {
    static final String l = h94.i("SystemAlarmDispatcher");
    final Context a;
    final rg8 b;
    private final mk9 c;
    private final androidx.work.impl.a d;
    private final pj9 e;
    final androidx.work.impl.background.systemalarm.b f;
    final List g;
    Intent h;
    private c i;
    private r08 j;
    private final jj9 k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor a;
            d dVar;
            synchronized (e.this.g) {
                e eVar = e.this;
                eVar.h = (Intent) eVar.g.get(0);
            }
            Intent intent = e.this.h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.h.getIntExtra("KEY_START_ID", 0);
                h94 e = h94.e();
                String str = e.l;
                e.a(str, "Processing command " + e.this.h + ", " + intExtra);
                PowerManager.WakeLock b = rc9.b(e.this.a, action + " (" + intExtra + ")");
                try {
                    h94.e().a(str, "Acquiring operation wake lock (" + action + ") " + b);
                    b.acquire();
                    e eVar2 = e.this;
                    eVar2.f.o(eVar2.h, intExtra, eVar2);
                    h94.e().a(str, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    a = e.this.b.a();
                    dVar = new d(e.this);
                } catch (Throwable th) {
                    try {
                        h94 e2 = h94.e();
                        String str2 = e.l;
                        e2.d(str2, "Unexpected error in onHandleIntent", th);
                        h94.e().a(str2, "Releasing operation wake lock (" + action + ") " + b);
                        b.release();
                        a = e.this.b.a();
                        dVar = new d(e.this);
                    } catch (Throwable th2) {
                        h94.e().a(e.l, "Releasing operation wake lock (" + action + ") " + b);
                        b.release();
                        e.this.b.a().execute(new d(e.this));
                        throw th2;
                    }
                }
                a.execute(dVar);
            }
        }
    }

    static class b implements Runnable {
        private final e a;
        private final Intent b;
        private final int c;

        b(e eVar, Intent intent, int i) {
            this.a = eVar;
            this.b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b, this.c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {
        private final e a;

        d(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d();
        }
    }

    e(Context context) {
        this(context, null, null, null);
    }

    private void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        c();
        synchronized (this.g) {
            try {
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    if (str.equals(((Intent) it2.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b2 = rc9.b(this.a, "ProcessCommand");
        try {
            b2.acquire();
            this.e.v().d(new a());
        } finally {
            b2.release();
        }
    }

    @Override // defpackage.n62
    public void a(ej9 ej9Var, boolean z) {
        this.b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.d(this.a, ej9Var, z), 0));
    }

    public boolean b(Intent intent, int i) {
        h94 e = h94.e();
        String str = l;
        e.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h94.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean isEmpty = this.g.isEmpty();
                this.g.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void d() {
        h94 e = h94.e();
        String str = l;
        e.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.g) {
            try {
                if (this.h != null) {
                    h94.e().a(str, "Removing command " + this.h);
                    if (!((Intent) this.g.remove(0)).equals(this.h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.h = null;
                }
                ek7 c2 = this.b.c();
                if (!this.f.n() && this.g.isEmpty() && !c2.s()) {
                    h94.e().a(str, "No more commands & intents.");
                    c cVar = this.i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.g.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    androidx.work.impl.a e() {
        return this.d;
    }

    rg8 f() {
        return this.b;
    }

    pj9 g() {
        return this.e;
    }

    mk9 h() {
        return this.c;
    }

    jj9 i() {
        return this.k;
    }

    void k() {
        h94.e().a(l, "Destroying SystemAlarmDispatcher");
        this.d.p(this);
        this.i = null;
    }

    void m(c cVar) {
        if (this.i != null) {
            h94.e().c(l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.i = cVar;
        }
    }

    e(Context context, androidx.work.impl.a aVar, pj9 pj9Var, jj9 jj9Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = r08.a();
        pj9Var = pj9Var == null ? pj9.p(context) : pj9Var;
        this.e = pj9Var;
        this.f = new androidx.work.impl.background.systemalarm.b(applicationContext, pj9Var.n().a(), this.j);
        this.c = new mk9(pj9Var.n().k());
        aVar = aVar == null ? pj9Var.r() : aVar;
        this.d = aVar;
        rg8 v = pj9Var.v();
        this.b = v;
        this.k = jj9Var == null ? new lj9(aVar, v) : jj9Var;
        aVar.e(this);
        this.g = new ArrayList();
        this.h = null;
    }
}
