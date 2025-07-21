package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class txf {
    private static final Map o = new HashMap();
    private final Context a;
    private final n6f b;
    private boolean g;
    private final Intent h;
    private ServiceConnection l;
    private IInterface m;
    private final kzc n;
    private final List d = new ArrayList();
    private final Set e = new HashSet();
    private final Object f = new Object();
    private final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: xcf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            txf.h(txf.this);
        }
    };
    private final AtomicInteger k = new AtomicInteger(0);
    private final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    private final WeakReference i = new WeakReference(null);

    public txf(Context context, n6f n6fVar, String str, Intent intent, kzc kzcVar, blf blfVar, byte[] bArr) {
        this.a = context;
        this.b = n6fVar;
        this.h = intent;
        this.n = kzcVar;
    }

    public static /* synthetic */ void h(txf txfVar) {
        txfVar.b.d("reportBinderDeath", new Object[0]);
        lh4.a(txfVar.i.get());
        txfVar.b.d("%s : Binder has died.", txfVar.c);
        Iterator it2 = txfVar.d.iterator();
        while (it2.hasNext()) {
            ((s8f) it2.next()).c(txfVar.s());
        }
        txfVar.d.clear();
        txfVar.t();
    }

    static /* bridge */ /* synthetic */ void m(txf txfVar, s8f s8fVar) {
        if (txfVar.m != null || txfVar.g) {
            if (!txfVar.g) {
                s8fVar.run();
                return;
            } else {
                txfVar.b.d("Waiting to bind to the service.", new Object[0]);
                txfVar.d.add(s8fVar);
                return;
            }
        }
        txfVar.b.d("Initiate binding to the service.", new Object[0]);
        txfVar.d.add(s8fVar);
        mwf mwfVar = new mwf(txfVar, null);
        txfVar.l = mwfVar;
        txfVar.g = true;
        if (txfVar.a.bindService(txfVar.h, mwfVar, 1)) {
            return;
        }
        txfVar.b.d("Failed to bind to the service.", new Object[0]);
        txfVar.g = false;
        Iterator it2 = txfVar.d.iterator();
        while (it2.hasNext()) {
            ((s8f) it2.next()).c(new zzu());
        }
        txfVar.d.clear();
    }

    static /* bridge */ /* synthetic */ void n(txf txfVar) {
        txfVar.b.d("linkToDeath", new Object[0]);
        try {
            txfVar.m.asBinder().linkToDeath(txfVar.j, 0);
        } catch (RemoteException e) {
            txfVar.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(txf txfVar) {
        txfVar.b.d("unlinkToDeath", new Object[0]);
        txfVar.m.asBinder().unlinkToDeath(txfVar.j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        synchronized (this.f) {
            try {
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    ((qg8) it2.next()).d(s());
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.m;
    }

    public final void p(s8f s8fVar, final qg8 qg8Var) {
        synchronized (this.f) {
            this.e.add(qg8Var);
            qg8Var.a().b(new me5() { // from class: raf
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var) {
                    txf.this.q(qg8Var, og8Var);
                }
            });
        }
        synchronized (this.f) {
            try {
                if (this.k.getAndIncrement() > 0) {
                    this.b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new cff(this, s8fVar.b(), s8fVar));
    }

    final /* synthetic */ void q(qg8 qg8Var, og8 og8Var) {
        synchronized (this.f) {
            this.e.remove(qg8Var);
        }
    }

    public final void r(qg8 qg8Var) {
        synchronized (this.f) {
            this.e.remove(qg8Var);
        }
        synchronized (this.f) {
            try {
                if (this.k.get() > 0 && this.k.decrementAndGet() > 0) {
                    this.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new rhf(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
