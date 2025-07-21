package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.md8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class py8 {
    private final Context a;
    private final o30 b;
    private final w42 c;
    private final bk9 d;
    private final Executor e;
    private final md8 f;
    private final ul0 g;
    private final ul0 h;
    private final nl0 i;

    public py8(Context context, o30 o30Var, w42 w42Var, bk9 bk9Var, Executor executor, md8 md8Var, ul0 ul0Var, ul0 ul0Var2, nl0 nl0Var) {
        this.a = context;
        this.b = o30Var;
        this.c = w42Var;
        this.d = bk9Var;
        this.e = executor;
        this.f = md8Var;
        this.g = ul0Var;
        this.h = ul0Var2;
        this.i = nl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(as8 as8Var) {
        return Boolean.valueOf(this.c.h0(as8Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(as8 as8Var) {
        return this.c.y(as8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, as8 as8Var, long j) {
        this.c.n0(iterable);
        this.c.q1(as8Var, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.c.w(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            this.i.h(((Integer) r0.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it2.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(as8 as8Var, long j) {
        this.c.q1(as8Var, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(as8 as8Var, int i) {
        this.d.a(as8Var, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final as8 as8Var, final int i, Runnable runnable) {
        try {
            try {
                md8 md8Var = this.f;
                final w42 w42Var = this.c;
                Objects.requireNonNull(w42Var);
                md8Var.b(new md8.a() { // from class: gy8
                    @Override // md8.a
                    public final Object execute() {
                        return Integer.valueOf(w42.this.u());
                    }
                });
                if (k()) {
                    u(as8Var, i);
                } else {
                    this.f.b(new md8.a() { // from class: hy8
                        @Override // md8.a
                        public final Object execute() {
                            Object s;
                            s = py8.this.s(as8Var, i);
                            return s;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.d.a(as8Var, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public c42 j(zr8 zr8Var) {
        md8 md8Var = this.f;
        final nl0 nl0Var = this.i;
        Objects.requireNonNull(nl0Var);
        return zr8Var.a(c42.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new x02(f12.b("proto"), ((ol0) md8Var.b(new md8.a() { // from class: fy8
            @Override // md8.a
            public final Object execute() {
                return nl0.this.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public BackendResponse u(final as8 as8Var, int i) {
        BackendResponse b;
        zr8 zr8Var = this.b.get(as8Var.b());
        long j = 0;
        BackendResponse e = BackendResponse.e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f.b(new md8.a() { // from class: iy8
                @Override // md8.a
                public final Object execute() {
                    Boolean l;
                    l = py8.this.l(as8Var);
                    return l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f.b(new md8.a() { // from class: jy8
                    @Override // md8.a
                    public final Object execute() {
                        Iterable m;
                        m = py8.this.m(as8Var);
                        return m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (zr8Var == null) {
                    ca4.a("Uploader", "Unknown backend for %s, deleting event batch for it...", as8Var);
                    b = BackendResponse.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((hr5) it2.next()).b());
                    }
                    if (as8Var.e()) {
                        arrayList.add(j(zr8Var));
                    }
                    b = zr8Var.b(p30.a().b(arrayList).c(as8Var.c()).a());
                }
                e = b;
                if (e.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f.b(new md8.a() { // from class: ky8
                        @Override // md8.a
                        public final Object execute() {
                            Object n;
                            n = py8.this.n(iterable, as8Var, j2);
                            return n;
                        }
                    });
                    this.d.b(as8Var, i + 1, true);
                    return e;
                }
                this.f.b(new md8.a() { // from class: ly8
                    @Override // md8.a
                    public final Object execute() {
                        Object o;
                        o = py8.this.o(iterable);
                        return o;
                    }
                });
                if (e.c() == BackendResponse.Status.OK) {
                    j = Math.max(j2, e.b());
                    if (as8Var.e()) {
                        this.f.b(new md8.a() { // from class: my8
                            @Override // md8.a
                            public final Object execute() {
                                Object p;
                                p = py8.this.p();
                                return p;
                            }
                        });
                    }
                } else if (e.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        String j3 = ((hr5) it3.next()).b().j();
                        if (hashMap.containsKey(j3)) {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        } else {
                            hashMap.put(j3, 1);
                        }
                    }
                    this.f.b(new md8.a() { // from class: ny8
                        @Override // md8.a
                        public final Object execute() {
                            Object q;
                            q = py8.this.q(hashMap);
                            return q;
                        }
                    });
                }
            }
            this.f.b(new md8.a() { // from class: oy8
                @Override // md8.a
                public final Object execute() {
                    Object r;
                    r = py8.this.r(as8Var, j2);
                    return r;
                }
            });
            return e;
        }
    }

    public void v(final as8 as8Var, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: ey8
            @Override // java.lang.Runnable
            public final void run() {
                py8.this.t(as8Var, i, runnable);
            }
        });
    }
}
