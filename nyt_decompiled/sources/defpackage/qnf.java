package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class qnf implements qgf {
    private final acd a;
    private final fyb b;
    private final l0c c;
    private final nnf d;
    private final SparseArray e;
    private uvd f;
    private frb g;
    private kod h;
    private boolean i;

    public qnf(acd acdVar) {
        acdVar.getClass();
        this.a = acdVar;
        this.f = new uvd(khe.M(), acdVar, new qtd() { // from class: fkf
            @Override // defpackage.qtd
            public final void a(Object obj, p0a p0aVar) {
            }
        });
        fyb fybVar = new fyb();
        this.b = fybVar;
        this.c = new l0c();
        this.d = new nnf(fybVar);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void Z(qnf qnfVar) {
        final tgf X = qnfVar.X();
        qnfVar.b0(X, 1028, new srd() { // from class: bhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
        qnfVar.f.e();
    }

    private final tgf c0(zzf zzfVar) {
        this.g.getClass();
        n1c a = zzfVar == null ? null : this.d.a(zzfVar);
        if (zzfVar != null && a != null) {
            return Y(a, a.n(zzfVar.a, this.b).c, zzfVar);
        }
        int zzd = this.g.zzd();
        n1c zzn = this.g.zzn();
        if (zzd >= zzn.c()) {
            zzn = n1c.a;
        }
        return Y(zzn, zzd, null);
    }

    private final tgf d0(int i, zzf zzfVar) {
        frb frbVar = this.g;
        frbVar.getClass();
        if (zzfVar != null) {
            return this.d.a(zzfVar) != null ? c0(zzfVar) : Y(n1c.a, i, zzfVar);
        }
        n1c zzn = frbVar.zzn();
        if (i >= zzn.c()) {
            zzn = n1c.a;
        }
        return Y(zzn, i, null);
    }

    private final tgf e0() {
        return c0(this.d.d());
    }

    private final tgf f0() {
        return c0(this.d.e());
    }

    private final tgf g0(zzce zzceVar) {
        zzf zzfVar;
        return (!(zzceVar instanceof zziz) || (zzfVar = ((zziz) zzceVar).zzj) == null) ? X() : c0(zzfVar);
    }

    @Override // defpackage.y0g
    public final void A(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        final tgf d0 = d0(i, zzfVar);
        b0(d0, 1001, new srd() { // from class: olf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.y0g
    public final void B(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        final tgf d0 = d0(i, zzfVar);
        b0(d0, ContentMediaFormat.FULL_CONTENT_EPISODE, new srd() { // from class: okf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void C(final String str, final long j, final long j2) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.PREVIEW_EPISODE, new srd(str, j2, j) { // from class: njf
            public final /* synthetic */ String b;

            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void D(final prf prfVar) {
        final tgf f0 = f0();
        b0(f0, 1032, new srd() { // from class: bnf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void E(final Exception exc) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.FULL_CONTENT_PODCAST, new srd() { // from class: enf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void F(List list, zzf zzfVar) {
        frb frbVar = this.g;
        frbVar.getClass();
        this.d.h(list, zzfVar, frbVar);
    }

    @Override // defpackage.qgf
    public final void G(final Exception exc) {
        final tgf f0 = f0();
        b0(f0, 1029, new srd() { // from class: vmf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void H(final w5b w5bVar) {
        final tgf X = X();
        b0(X, 14, new srd() { // from class: hnf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void I(final int i, final long j) {
        final tgf e0 = e0();
        b0(e0, 1018, new srd() { // from class: wjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).d(tgf.this, i, j);
            }
        });
    }

    @Override // defpackage.rnb
    public final void J(final zzce zzceVar) {
        final tgf g0 = g0(zzceVar);
        b0(g0, 10, new srd() { // from class: rkf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).h(tgf.this, zzceVar);
            }
        });
    }

    @Override // defpackage.rnb
    public final void K(final cza czaVar, final int i) {
        final tgf X = X();
        b0(X, 1, new srd(czaVar, i) { // from class: fif
            public final /* synthetic */ cza b;

            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.o7g
    public final void L(final int i, final long j, final long j2) {
        final tgf c0 = c0(this.d.c());
        b0(c0, ContentMediaFormat.PARTIAL_CONTENT_MOVIE, new srd() { // from class: jif
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).k(tgf.this, i, j, j2);
            }
        });
    }

    @Override // defpackage.rnb
    public final void M(final int i, final int i2) {
        final tgf f0 = f0();
        b0(f0, 24, new srd(i, i2) { // from class: knf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void N(final String str) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.EXTRA_EPISODE, new srd() { // from class: hhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void O(final float f) {
        final tgf f0 = f0();
        b0(f0, 22, new srd(f) { // from class: mif
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void P(final boolean z, final int i) {
        final tgf X = X();
        b0(X, -1, new srd(z, i) { // from class: bjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void Q(final e8f e8fVar) {
        final tgf e0 = e0();
        b0(e0, 1020, new srd() { // from class: ulf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).o(tgf.this, e8fVar);
            }
        });
    }

    @Override // defpackage.y0g
    public final void R(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar, final IOException iOException, final boolean z) {
        final tgf d0 = d0(i, zzfVar);
        b0(d0, ContentMediaFormat.FULL_CONTENT_MOVIE, new srd() { // from class: vif
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).l(tgf.this, mzfVar, vzfVar, iOException, z);
            }
        });
    }

    @Override // defpackage.rnb
    public final void S(final zzce zzceVar) {
        final tgf g0 = g0(zzceVar);
        b0(g0, 10, new srd() { // from class: zjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.y0g
    public final void T(int i, zzf zzfVar, final vzf vzfVar) {
        final tgf d0 = d0(i, zzfVar);
        b0(d0, ContentMediaFormat.PARTIAL_CONTENT_GENERIC, new srd() { // from class: lkf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).q(tgf.this, vzfVar);
            }
        });
    }

    @Override // defpackage.qgf
    public final void U(final e8f e8fVar) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.PARTIAL_CONTENT_PODCAST, new srd() { // from class: mmf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void V(final int i, final long j, final long j2) {
        final tgf f0 = f0();
        b0(f0, 1011, new srd(i, j, j2) { // from class: sif
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void W(final wmc wmcVar) {
        final tgf f0 = f0();
        b0(f0, 25, new srd() { // from class: amf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                tgf tgfVar = tgf.this;
                wmc wmcVar2 = wmcVar;
                ((xgf) obj).n(tgfVar, wmcVar2);
                int i = wmcVar2.a;
            }
        });
    }

    protected final tgf X() {
        return c0(this.d.b());
    }

    protected final tgf Y(n1c n1cVar, int i, zzf zzfVar) {
        zzf zzfVar2 = true == n1cVar.o() ? null : zzfVar;
        long zza = this.a.zza();
        boolean z = n1cVar.equals(this.g.zzn()) && i == this.g.zzd();
        long j = 0;
        if (zzfVar2 == null || !zzfVar2.b()) {
            if (z) {
                j = this.g.zzj();
            } else if (!n1cVar.o()) {
                long j2 = n1cVar.e(i, this.c, 0L).l;
                j = khe.I(0L);
            }
        } else if (z && this.g.zzb() == zzfVar2.b && this.g.zzc() == zzfVar2.c) {
            j = this.g.zzk();
        }
        return new tgf(zza, n1cVar, i, zzfVar2, j, this.g.zzn(), this.g.zzd(), this.d.b(), this.g.zzk(), this.g.zzm());
    }

    @Override // defpackage.rnb
    public final void a(final boolean z) {
        final tgf X = X();
        b0(X, 7, new srd(z) { // from class: hjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    final /* synthetic */ void a0(frb frbVar, xgf xgfVar, p0a p0aVar) {
        xgfVar.a(frbVar, new vgf(p0aVar, this.e));
    }

    @Override // defpackage.rnb
    public final void b(final boolean z) {
        final tgf X = X();
        b0(X, 3, new srd(z) { // from class: fhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    protected final void b0(tgf tgfVar, int i, srd srdVar) {
        this.e.put(i, tgfVar);
        uvd uvdVar = this.f;
        uvdVar.d(i, srdVar);
        uvdVar.c();
    }

    @Override // defpackage.qgf
    public final void c() {
        if (this.i) {
            return;
        }
        final tgf X = X();
        this.i = true;
        b0(X, -1, new srd() { // from class: dmf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void d(final long j) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.EXTRA_GENERIC, new srd(j) { // from class: ejf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void e(final hib hibVar) {
        final tgf X = X();
        b0(X, 12, new srd() { // from class: zgf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void f(final String str, final long j, final long j2) {
        final tgf f0 = f0();
        b0(f0, 1016, new srd(str, j2, j) { // from class: ymf
            public final /* synthetic */ String b;

            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void g(final Object obj, final long j) {
        final tgf f0 = f0();
        b0(f0, 26, new srd() { // from class: smf
            @Override // defpackage.srd
            public final void zza(Object obj2) {
                ((xgf) obj2).j(tgf.this, obj, j);
            }
        });
    }

    @Override // defpackage.qgf
    public final void h(final Exception exc) {
        final tgf f0 = f0();
        b0(f0, 1030, new srd() { // from class: pif
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void i(final long j, final int i) {
        final tgf e0 = e0();
        b0(e0, 1021, new srd(j, i) { // from class: ikf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void j() {
        kod kodVar = this.h;
        wad.b(kodVar);
        kodVar.e(new Runnable() { // from class: pmf
            @Override // java.lang.Runnable
            public final void run() {
                qnf.Z(qnf.this);
            }
        });
    }

    @Override // defpackage.qgf
    public final void k(final String str) {
        final tgf f0 = f0();
        b0(f0, 1019, new srd() { // from class: tjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void l(final e8f e8fVar) {
        final tgf e0 = e0();
        b0(e0, ContentMediaFormat.EXTRA_MOVIE, new srd() { // from class: ukf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void m(final zpb zpbVar, final zpb zpbVar2, final int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        nnf nnfVar = this.d;
        frb frbVar = this.g;
        frbVar.getClass();
        nnfVar.g(frbVar);
        final tgf X = X();
        b0(X, 11, new srd() { // from class: jmf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).m(tgf.this, zpbVar, zpbVar2, i);
            }
        });
    }

    @Override // defpackage.qgf
    public final void n(xgf xgfVar) {
        this.f.f(xgfVar);
    }

    @Override // defpackage.y0g
    public final void o(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        final tgf d0 = d0(i, zzfVar);
        b0(d0, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, new srd() { // from class: jhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void p(final boolean z, final int i) {
        final tgf X = X();
        b0(X, 5, new srd(z, i) { // from class: ckf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void q(final frb frbVar, Looper looper) {
        zzgaa zzgaaVar;
        boolean z = true;
        if (this.g != null) {
            zzgaaVar = this.d.b;
            if (!zzgaaVar.isEmpty()) {
                z = false;
            }
        }
        wad.f(z);
        frbVar.getClass();
        this.g = frbVar;
        this.h = this.a.a(looper, null);
        this.f = this.f.a(looper, new qtd() { // from class: yif
            @Override // defpackage.qtd
            public final void a(Object obj, p0a p0aVar) {
                qnf.this.a0(frbVar, (xgf) obj, p0aVar);
            }
        });
    }

    @Override // defpackage.qgf
    public final void r(final e8f e8fVar) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.PREVIEW_GENERIC, new srd() { // from class: dhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void s(xgf xgfVar) {
        this.f.b(xgfVar);
    }

    @Override // defpackage.rnb
    public final void t(final boolean z) {
        final tgf f0 = f0();
        b0(f0, 23, new srd(z) { // from class: hif
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void u(final l6a l6aVar, final g8f g8fVar) {
        final tgf f0 = f0();
        b0(f0, 1017, new srd() { // from class: rlf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).p(tgf.this, l6aVar, g8fVar);
            }
        });
    }

    @Override // defpackage.rnb
    public final void v(final mhc mhcVar) {
        final tgf X = X();
        b0(X, 2, new srd() { // from class: kjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void w(n1c n1cVar, final int i) {
        frb frbVar = this.g;
        frbVar.getClass();
        this.d.i(frbVar);
        final tgf X = X();
        b0(X, 0, new srd(i) { // from class: dif
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void x(final mmb mmbVar) {
        final tgf X = X();
        b0(X, 13, new srd() { // from class: lhf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.qgf
    public final void y(final l6a l6aVar, final g8f g8fVar) {
        final tgf f0 = f0();
        b0(f0, ContentMediaFormat.PREVIEW_MOVIE, new srd() { // from class: gmf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).c(tgf.this, l6aVar, g8fVar);
            }
        });
    }

    @Override // defpackage.qgf
    public final void z(final prf prfVar) {
        final tgf f0 = f0();
        b0(f0, 1031, new srd() { // from class: xlf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }

    @Override // defpackage.rnb
    public final void zzh(final int i) {
        final tgf X = X();
        b0(X, 4, new srd() { // from class: xkf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((xgf) obj).g(tgf.this, i);
            }
        });
    }

    @Override // defpackage.rnb
    public final void zzi(final int i) {
        final tgf X = X();
        b0(X, 6, new srd(i) { // from class: qjf
            @Override // defpackage.srd
            public final void zza(Object obj) {
            }
        });
    }
}
