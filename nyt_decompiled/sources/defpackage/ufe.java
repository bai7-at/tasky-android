package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfwf;
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
public final class ufe {
    private static final Map o = new HashMap();
    private final Context a;
    private final gfe b;
    private boolean g;
    private final Intent h;
    private ServiceConnection l;
    private IInterface m;
    private final tee n;
    private final List d = new ArrayList();
    private final Set e = new HashSet();
    private final Object f = new Object();
    private final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: ife
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ufe.j(ufe.this);
        }
    };
    private final AtomicInteger k = new AtomicInteger(0);
    private final String c = "OverlayDisplayService";
    private final WeakReference i = new WeakReference(null);

    public ufe(Context context, gfe gfeVar, String str, Intent intent, tee teeVar, mfe mfeVar) {
        this.a = context;
        this.b = gfeVar;
        this.h = intent;
        this.n = teeVar;
    }

    public static /* synthetic */ void j(ufe ufeVar) {
        ufeVar.b.c("reportBinderDeath", new Object[0]);
        lh4.a(ufeVar.i.get());
        ufeVar.b.c("%s : Binder has died.", ufeVar.c);
        Iterator it2 = ufeVar.d.iterator();
        while (it2.hasNext()) {
            ((hfe) it2.next()).c(ufeVar.v());
        }
        ufeVar.d.clear();
        synchronized (ufeVar.f) {
            ufeVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final ufe ufeVar, final qg8 qg8Var) {
        ufeVar.e.add(qg8Var);
        qg8Var.a().b(new me5() { // from class: jfe
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                ufe.this.t(qg8Var, og8Var);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(ufe ufeVar, hfe hfeVar) {
        if (ufeVar.m != null || ufeVar.g) {
            if (!ufeVar.g) {
                hfeVar.run();
                return;
            } else {
                ufeVar.b.c("Waiting to bind to the service.", new Object[0]);
                ufeVar.d.add(hfeVar);
                return;
            }
        }
        ufeVar.b.c("Initiate binding to the service.", new Object[0]);
        ufeVar.d.add(hfeVar);
        tfe tfeVar = new tfe(ufeVar, null);
        ufeVar.l = tfeVar;
        ufeVar.g = true;
        if (ufeVar.a.bindService(ufeVar.h, tfeVar, 1)) {
            return;
        }
        ufeVar.b.c("Failed to bind to the service.", new Object[0]);
        ufeVar.g = false;
        Iterator it2 = ufeVar.d.iterator();
        while (it2.hasNext()) {
            ((hfe) it2.next()).c(new zzfwf());
        }
        ufeVar.d.clear();
    }

    static /* bridge */ /* synthetic */ void q(ufe ufeVar) {
        ufeVar.b.c("linkToDeath", new Object[0]);
        try {
            ufeVar.m.asBinder().linkToDeath(ufeVar.j, 0);
        } catch (RemoteException e) {
            ufeVar.b.b(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(ufe ufeVar) {
        ufeVar.b.c("unlinkToDeath", new Object[0]);
        ufeVar.m.asBinder().unlinkToDeath(ufeVar.j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((qg8) it2.next()).d(v());
        }
        this.e.clear();
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

    public final void s(hfe hfeVar, qg8 qg8Var) {
        c().post(new kfe(this, hfeVar.b(), qg8Var, hfeVar));
    }

    final /* synthetic */ void t(qg8 qg8Var, og8 og8Var) {
        synchronized (this.f) {
            this.e.remove(qg8Var);
        }
    }

    public final void u() {
        c().post(new lfe(this));
    }
}
