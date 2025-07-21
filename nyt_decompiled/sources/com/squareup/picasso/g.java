package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.picasso.NetworkRequestHandler;
import defpackage.au1;
import defpackage.cg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
class g {
    final b a;
    final Context b;
    final ExecutorService c;
    final au1 d;
    final Map e;
    final Map f;
    final Map g;
    final Set h;
    final Handler i;
    final Handler j;
    final cg0 k;
    final t l;
    final List m;
    final c n;
    final boolean o;
    boolean p;

    private static class a extends Handler {
        private final g a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        class RunnableC0473a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0473a(Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.a.what);
            }
        }

        a(Looper looper, g gVar) {
            super(looper);
            this.a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.v((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.a.o((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.o.post(new RunnableC0473a(message));
                    break;
                case 4:
                    this.a.p((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.a.u((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.a.q((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.a.n();
                    break;
                case 9:
                    this.a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.a.s(message.obj);
                    break;
                case 12:
                    this.a.t(message.obj);
                    break;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {
        private final g a;

        c(g gVar) {
            this.a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(TransferTable.COLUMN_STATE)) {
                    this.a.b(intent.getBooleanExtra(TransferTable.COLUMN_STATE, false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.a.f(((ConnectivityManager) w.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    g(Context context, ExecutorService executorService, Handler handler, au1 au1Var, cg0 cg0Var, t tVar) {
        b bVar = new b();
        this.a = bVar;
        bVar.start();
        w.i(bVar.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new a(bVar.getLooper(), this);
        this.d = au1Var;
        this.j = handler;
        this.k = cg0Var;
        this.l = tVar;
        this.m = new ArrayList(4);
        this.p = w.q(context);
        this.o = w.p(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.n = cVar;
        cVar.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        Bitmap bitmap = cVar.m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.m.add(cVar);
        if (this.i.hasMessages(7)) {
            return;
        }
        this.i.sendEmptyMessageDelayed(7, 200L);
    }

    private void i() {
        if (this.f.isEmpty()) {
            return;
        }
        Iterator it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) it2.next();
            it2.remove();
            if (aVar.g().m) {
                w.t("Dispatcher", "replaying", aVar.i().d());
            }
            w(aVar, false);
        }
    }

    private void j(List list) {
        if (list == null || list.isEmpty() || !((com.squareup.picasso.c) list.get(0)).q().m) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.squareup.picasso.c cVar = (com.squareup.picasso.c) it2.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(w.k(cVar));
        }
        w.t("Dispatcher", "delivered", sb.toString());
    }

    private void k(com.squareup.picasso.a aVar) {
        Object k = aVar.k();
        if (k != null) {
            aVar.k = true;
            this.f.put(k, aVar);
        }
    }

    private void l(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h = cVar.h();
        if (h != null) {
            k(h);
        }
        List i = cVar.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                k((com.squareup.picasso.a) i.get(i2));
            }
        }
    }

    void b(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    void c(com.squareup.picasso.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void d(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void e(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void h(com.squareup.picasso.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void m(boolean z) {
        this.p = z;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(com.squareup.picasso.a aVar) {
        String d = aVar.d();
        com.squareup.picasso.c cVar = (com.squareup.picasso.c) this.e.get(d);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.e.remove(d);
                if (aVar.g().m) {
                    w.t("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.h.contains(aVar.j())) {
            this.g.remove(aVar.k());
            if (aVar.g().m) {
                w.u("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) this.f.remove(aVar.k());
        if (aVar2 == null || !aVar2.g().m) {
            return;
        }
        w.u("Dispatcher", "canceled", aVar2.i().d(), "from replaying");
    }

    void p(com.squareup.picasso.c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.p())) {
            this.k.b(cVar.n(), cVar.s());
        }
        this.e.remove(cVar.n());
        a(cVar);
        if (cVar.q().m) {
            w.u("Dispatcher", "batched", w.k(cVar), "for completion");
        }
    }

    void q(com.squareup.picasso.c cVar, boolean z) {
        if (cVar.q().m) {
            String k = w.k(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            w.u("Dispatcher", "batched", k, sb.toString());
        }
        this.e.remove(cVar.n());
        a(cVar);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof o) {
            ((o) executorService).b(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.h.add(obj)) {
            Iterator it2 = this.e.values().iterator();
            while (it2.hasNext()) {
                com.squareup.picasso.c cVar = (com.squareup.picasso.c) it2.next();
                boolean z = cVar.q().m;
                com.squareup.picasso.a h = cVar.h();
                List i = cVar.i();
                boolean z2 = (i == null || i.isEmpty()) ? false : true;
                if (h != null || z2) {
                    if (h != null && h.j().equals(obj)) {
                        cVar.f(h);
                        this.g.put(h.k(), h);
                        if (z) {
                            w.u("Dispatcher", "paused", h.b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = i.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = (com.squareup.picasso.a) i.get(size);
                            if (aVar.j().equals(obj)) {
                                cVar.f(aVar);
                                this.g.put(aVar.k(), aVar);
                                if (z) {
                                    w.u("Dispatcher", "paused", aVar.b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (cVar.c()) {
                        it2.remove();
                        if (z) {
                            w.u("Dispatcher", "canceled", w.k(cVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.h.remove(obj)) {
            Iterator it2 = this.g.values().iterator();
            ArrayList arrayList = null;
            while (it2.hasNext()) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) it2.next();
                if (aVar.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it2.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void u(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        boolean z = false;
        if (this.c.isShutdown()) {
            q(cVar, false);
            return;
        }
        if (cVar.w(this.p, this.o ? ((ConnectivityManager) w.o(this.b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.q().m) {
                w.t("Dispatcher", "retrying", w.k(cVar));
            }
            if (cVar.k() instanceof NetworkRequestHandler.ContentLengthException) {
                cVar.i |= NetworkPolicy.NO_CACHE.index;
            }
            cVar.n = this.c.submit(cVar);
            return;
        }
        if (this.o && cVar.x()) {
            z = true;
        }
        q(cVar, z);
        if (z) {
            l(cVar);
        }
    }

    void v(com.squareup.picasso.a aVar) {
        w(aVar, true);
    }

    void w(com.squareup.picasso.a aVar, boolean z) {
        if (this.h.contains(aVar.j())) {
            this.g.put(aVar.k(), aVar);
            if (aVar.g().m) {
                w.u("Dispatcher", "paused", aVar.b.d(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = (com.squareup.picasso.c) this.e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.c.isShutdown()) {
            if (aVar.g().m) {
                w.u("Dispatcher", "ignored", aVar.b.d(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c g = com.squareup.picasso.c.g(aVar.g(), this, this.k, this.l, aVar);
        g.n = this.c.submit(g);
        this.e.put(aVar.d(), g);
        if (z) {
            this.f.remove(aVar.k());
        }
        if (aVar.g().m) {
            w.t("Dispatcher", "enqueued", aVar.b.d());
        }
    }
}
