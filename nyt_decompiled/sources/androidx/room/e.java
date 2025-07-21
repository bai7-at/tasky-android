package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import androidx.room.e;
import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e {
    private final String a;
    private final d b;
    private final Executor c;
    private final Context d;
    private int e;
    public d.c f;
    private androidx.room.c g;
    private final androidx.room.b h;
    private final AtomicBoolean i;
    private final ServiceConnection j;
    private final Runnable k;
    private final Runnable l;

    public static final class a extends d.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.d.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.d.c
        public void c(Set set) {
            zq3.h(set, "tables");
            if (e.this.j().get()) {
                return;
            }
            try {
                androidx.room.c h = e.this.h();
                if (h != null) {
                    h.o3(e.this.c(), (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    public static final class b extends b.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l3(e eVar, String[] strArr) {
            zq3.h(eVar, "this$0");
            zq3.h(strArr, "$tables");
            eVar.e().l((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // androidx.room.b
        public void S0(final String[] strArr) {
            zq3.h(strArr, "tables");
            Executor d = e.this.d();
            final e eVar = e.this;
            d.execute(new Runnable() { // from class: hx4
                @Override // java.lang.Runnable
                public final void run() {
                    e.b.l3(e.this, strArr);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(iBinder, "service");
            e.this.m(c.a.O(iBinder));
            e.this.d().execute(e.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
            e.this.d().execute(e.this.g());
            e.this.m(null);
        }
    }

    public e(Context context, String str, Intent intent, d dVar, Executor executor) {
        zq3.h(context, "context");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(intent, "serviceIntent");
        zq3.h(dVar, "invalidationTracker");
        zq3.h(executor, "executor");
        this.a = str;
        this.b = dVar;
        this.c = executor;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.h = new b();
        this.i = new AtomicBoolean(false);
        c cVar = new c();
        this.j = cVar;
        this.k = new Runnable() { // from class: fx4
            @Override // java.lang.Runnable
            public final void run() {
                e.n(e.this);
            }
        };
        this.l = new Runnable() { // from class: gx4
            @Override // java.lang.Runnable
            public final void run() {
                e.k(e.this);
            }
        };
        l(new a((String[]) dVar.j().keySet().toArray(new String[0])));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e eVar) {
        zq3.h(eVar, "this$0");
        eVar.b.p(eVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(e eVar) {
        zq3.h(eVar, "this$0");
        try {
            androidx.room.c cVar = eVar.g;
            if (cVar != null) {
                eVar.e = cVar.y4(eVar.h, eVar.a);
                eVar.b.c(eVar.f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final d e() {
        return this.b;
    }

    public final d.c f() {
        d.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        zq3.z("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final androidx.room.c h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    public final void l(d.c cVar) {
        zq3.h(cVar, "<set-?>");
        this.f = cVar;
    }

    public final void m(androidx.room.c cVar) {
        this.g = cVar;
    }

    public final void o() {
        if (this.i.compareAndSet(false, true)) {
            this.b.p(f());
            try {
                androidx.room.c cVar = this.g;
                if (cVar != null) {
                    cVar.l6(this.h, this.e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            this.d.unbindService(this.j);
        }
    }
}
