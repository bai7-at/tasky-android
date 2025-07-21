package com.google.android.gms.internal.ads;

import defpackage.j64;
import defpackage.tge;
import defpackage.yie;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes3.dex */
abstract class lb extends pb {
    private static final fc r = new fc(lb.class);
    private zzfzv l;
    private final boolean m;
    private final boolean n;

    lb(zzfzv zzfzvVar, boolean z, boolean z2) {
        super(zzfzvVar.size());
        this.l = zzfzvVar;
        this.m = z;
        this.n = z2;
    }

    private final void K(int i, Future future) {
        try {
            P(i, zb.p(future));
        } catch (ExecutionException e) {
            M(e.getCause());
        } catch (Throwable th) {
            M(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void T(zzfzv zzfzvVar) {
        int C = C();
        int i = 0;
        tge.j(C >= 0, "Less than 0 remaining futures");
        if (C == 0) {
            if (zzfzvVar != null) {
                yie g = zzfzvVar.g();
                while (g.hasNext()) {
                    Future future = (Future) g.next();
                    if (!future.isCancelled()) {
                        K(i, future);
                    }
                    i++;
                }
            }
            H();
            Q();
            U(2);
        }
    }

    private final void M(Throwable th) {
        th.getClass();
        if (this.m && !g(th) && O(E(), th)) {
            N(th);
        } else if (th instanceof Error) {
            N(th);
        }
    }

    private static void N(Throwable th) {
        r.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pb
    final void I(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable b = b();
        Objects.requireNonNull(b);
        O(set, b);
    }

    abstract void P(int i, Object obj);

    abstract void Q();

    final void R() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            Q();
            return;
        }
        if (!this.m) {
            final zzfzv zzfzvVar = this.n ? this.l : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.kb
                @Override // java.lang.Runnable
                public final void run() {
                    lb.this.T(zzfzvVar);
                }
            };
            yie g = this.l.g();
            while (g.hasNext()) {
                ((j64) g.next()).a(runnable, zzgeb.INSTANCE);
            }
            return;
        }
        yie g2 = this.l.g();
        final int i = 0;
        while (g2.hasNext()) {
            final j64 j64Var = (j64) g2.next();
            j64Var.a(new Runnable() { // from class: com.google.android.gms.internal.ads.jb
                @Override // java.lang.Runnable
                public final void run() {
                    lb.this.S(j64Var, i);
                }
            }, zzgeb.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void S(j64 j64Var, int i) {
        try {
            if (j64Var.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                K(i, j64Var);
            }
            T(null);
        } catch (Throwable th) {
            T(null);
            throw th;
        }
    }

    void U(int i) {
        this.l = null;
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        zzfzv zzfzvVar = this.l;
        return zzfzvVar != null ? "futures=".concat(zzfzvVar.toString()) : super.d();
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        zzfzv zzfzvVar = this.l;
        U(1);
        if ((zzfzvVar != null) && isCancelled()) {
            boolean v = v();
            yie g = zzfzvVar.g();
            while (g.hasNext()) {
                ((Future) g.next()).cancel(v);
            }
        }
    }
}
