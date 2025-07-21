package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a79;
import defpackage.cf5;
import defpackage.cyd;
import defpackage.d3b;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.fja;
import defpackage.fla;
import defpackage.gie;
import defpackage.h89;
import defpackage.jl;
import defpackage.jq9;
import defpackage.kia;
import defpackage.mpa;
import defpackage.o6;
import defpackage.ora;
import defpackage.pla;
import defpackage.q4b;
import defpackage.qja;
import defpackage.qkc;
import defpackage.r07;
import defpackage.s7;
import defpackage.sof;
import defpackage.tfb;
import defpackage.vka;
import defpackage.w5g;
import defpackage.xvc;
import defpackage.znc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class e0 {
    private final d3b a;
    private final sof b;
    private final AtomicBoolean c;
    private final a79 d;
    final fja e;
    private jq9 f;
    private o6 g;
    private s7[] h;
    private jl i;
    private q4b j;
    private h89 k;
    private String l;
    private final ViewGroup m;
    private int n;
    private boolean o;

    public e0(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, sof.a, null, i);
    }

    private static zzq b(Context context, s7[] s7VarArr, int i) {
        for (s7 s7Var : s7VarArr) {
            if (s7Var.equals(s7.q)) {
                return zzq.X0();
            }
        }
        zzq zzqVar = new zzq(context, s7VarArr);
        zzqVar.zzj = c(i);
        return zzqVar;
    }

    private static boolean c(int i) {
        return i == 1;
    }

    public final void A(h89 h89Var) {
        this.k = h89Var;
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.n3(h89Var == null ? null : new zzfk(h89Var));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final s7[] a() {
        return this.h;
    }

    public final o6 d() {
        return this.g;
    }

    public final s7 e() {
        zzq zzg;
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null && (zzg = q4bVar.zzg()) != null) {
                return vka.c(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        s7[] s7VarArr = this.h;
        if (s7VarArr != null) {
            return s7VarArr[0];
        }
        return null;
    }

    public final cf5 f() {
        return null;
    }

    public final r07 g() {
        qkc qkcVar = null;
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                qkcVar = q4bVar.zzk();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        return r07.d(qkcVar);
    }

    public final a79 i() {
        return this.d;
    }

    public final h89 j() {
        return this.k;
    }

    public final jl k() {
        return this.i;
    }

    public final znc l() {
        q4b q4bVar = this.j;
        if (q4bVar != null) {
            try {
                return q4bVar.zzl();
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String m() {
        q4b q4bVar;
        if (this.l == null && (q4bVar = this.j) != null) {
            try {
                this.l = q4bVar.zzr();
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final void n() {
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.e();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    final /* synthetic */ void o(ee3 ee3Var) {
        this.m.addView((View) fc5.Q1(ee3Var));
    }

    public final void p(xvc xvcVar) {
        try {
            if (this.j == null) {
                if (this.h == null || this.l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.m.getContext();
                zzq b = b(context, this.h, this.n);
                q4b q4bVar = "search_v2".equals(b.zza) ? (q4b) new h(kia.a(), context, b, this.l).d(context, false) : (q4b) new f(kia.a(), context, b, this.l, this.a).d(context, false);
                this.j = q4bVar;
                q4bVar.K4(new gie(this.e));
                jq9 jq9Var = this.f;
                if (jq9Var != null) {
                    this.j.N5(new fla(jq9Var));
                }
                jl jlVar = this.i;
                if (jlVar != null) {
                    this.j.D0(new qja(jlVar));
                }
                if (this.k != null) {
                    this.j.n3(new zzfk(this.k));
                }
                this.j.W2(new cyd(null));
                this.j.q6(this.o);
                q4b q4bVar2 = this.j;
                if (q4bVar2 != null) {
                    try {
                        final ee3 zzn = q4bVar2.zzn();
                        if (zzn != null) {
                            if (((Boolean) ora.f.e()).booleanValue()) {
                                if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                                    tfb.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.c0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            e0.this.o(zzn);
                                        }
                                    });
                                }
                            }
                            this.m.addView((View) fc5.Q1(zzn));
                        }
                    } catch (RemoteException e) {
                        fgb.i("#007 Could not call remote method.", e);
                    }
                }
            }
            q4b q4bVar3 = this.j;
            if (q4bVar3 == null) {
                throw null;
            }
            q4bVar3.p3(this.b.a(this.m.getContext(), xvcVar));
        } catch (RemoteException e2) {
            fgb.i("#007 Could not call remote method.", e2);
        }
    }

    public final void q() {
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.z();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void r() {
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.v();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void s(jq9 jq9Var) {
        try {
            this.f = jq9Var;
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.N5(jq9Var != null ? new fla(jq9Var) : null);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void t(o6 o6Var) {
        this.g = o6Var;
        this.e.I(o6Var);
    }

    public final void u(s7... s7VarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        v(s7VarArr);
    }

    public final void v(s7... s7VarArr) {
        this.h = s7VarArr;
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.x5(b(this.m.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        this.m.requestLayout();
    }

    public final void w(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void x(jl jlVar) {
        try {
            this.i = jlVar;
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.D0(jlVar != null ? new qja(jlVar) : null);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void y(boolean z) {
        this.o = z;
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.q6(z);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void z(cf5 cf5Var) {
        try {
            q4b q4bVar = this.j;
            if (q4bVar != null) {
                q4bVar.W2(new cyd(cf5Var));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    e0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, sof sofVar, q4b q4bVar, int i) {
        zzq zzqVar;
        this.a = new d3b();
        this.d = new a79();
        this.e = new d0(this);
        this.m = viewGroup;
        this.b = sofVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                w5g w5gVar = new w5g(context, attributeSet);
                this.h = w5gVar.b(z);
                this.l = w5gVar.a();
                if (viewGroup.isInEditMode()) {
                    tfb b = kia.b();
                    s7 s7Var = this.h[0];
                    int i2 = this.n;
                    if (s7Var.equals(s7.q)) {
                        zzqVar = zzq.X0();
                    } else {
                        zzq zzqVar2 = new zzq(context, s7Var);
                        zzqVar2.zzj = c(i2);
                        zzqVar = zzqVar2;
                    }
                    b.o(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                kia.b().n(viewGroup, new zzq(context, s7.i), e.getMessage(), e.getMessage());
            }
        }
    }
}
