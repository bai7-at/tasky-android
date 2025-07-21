package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class trc {
    private final u6c a;
    private final zfc b;
    private final k8c c;
    private final x8c d;
    private final n9c e;
    private final lcc f;
    private final Executor g;
    private final vfc h;
    private final gxb i;
    private final ela j;
    private final kdb k;
    private final gfa l;
    private final ccc m;
    private final a8d n;
    private final d8e o;
    private final zuc p;
    private final k6e q;
    private final gwb r;
    private final zrc s;

    public trc(u6c u6cVar, k8c k8cVar, x8c x8cVar, n9c n9cVar, lcc lccVar, Executor executor, vfc vfcVar, gxb gxbVar, ela elaVar, kdb kdbVar, gfa gfaVar, ccc cccVar, a8d a8dVar, d8e d8eVar, zuc zucVar, k6e k6eVar, zfc zfcVar, gwb gwbVar, zrc zrcVar) {
        this.a = u6cVar;
        this.c = k8cVar;
        this.d = x8cVar;
        this.e = n9cVar;
        this.f = lccVar;
        this.g = executor;
        this.h = vfcVar;
        this.i = gxbVar;
        this.j = elaVar;
        this.k = kdbVar;
        this.l = gfaVar;
        this.m = cccVar;
        this.n = a8dVar;
        this.o = d8eVar;
        this.p = zucVar;
        this.q = k6eVar;
        this.b = zfcVar;
        this.r = gwbVar;
        this.s = zrcVar;
    }

    public static final j64 j(wlb wlbVar, String str, String str2) {
        final ugb ugbVar = new ugb();
        wlbVar.zzN().N(new mnb() { // from class: krc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str3, String str4) {
                ugb ugbVar2 = ugb.this;
                if (z) {
                    ugbVar2.c(null);
                    return;
                }
                ugbVar2.d(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        wlbVar.J0(str, str2, null);
        return ugbVar;
    }

    final /* synthetic */ void c() {
        this.a.v();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f.zzb(str, str2);
    }

    final /* synthetic */ void e() {
        this.c.zzb();
    }

    final /* synthetic */ void f(View view) {
        this.j.a();
    }

    final /* synthetic */ void g(wlb wlbVar, wlb wlbVar2, Map map) {
        this.i.c(wlbVar);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) pla.c().a(mpa.L9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.s.b(motionEvent);
        }
        this.j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final wlb wlbVar, boolean z, wxa wxaVar) {
        onb zzN = wlbVar.zzN();
        jq9 jq9Var = new jq9() { // from class: lrc
            @Override // defpackage.jq9
            public final void v() {
                trc.this.c();
            }
        };
        cwa cwaVar = new cwa() { // from class: mrc
            @Override // defpackage.cwa
            public final void zzb(String str, String str2) {
                trc.this.d(str, str2);
            }
        };
        wq9 wq9Var = new wq9() { // from class: nrc
            @Override // defpackage.wq9
            public final void zzg() {
                trc.this.e();
            }
        };
        src srcVar = new src(this);
        kdb kdbVar = this.k;
        a8d a8dVar = this.n;
        d8e d8eVar = this.o;
        zuc zucVar = this.p;
        zzN.q0(jq9Var, this.d, this.e, cwaVar, wq9Var, z, wxaVar, this.j, srcVar, kdbVar, a8dVar, d8eVar, zucVar, this.q, null, this.b, null, null, this.r);
        wlbVar.setOnTouchListener(new View.OnTouchListener() { // from class: orc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                trc.this.h(view, motionEvent);
                return false;
            }
        });
        wlbVar.setOnClickListener(new View.OnClickListener() { // from class: prc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
                trc.this.f(view);
            }
        });
        if (((Boolean) pla.c().a(mpa.v2)).booleanValue()) {
            this.l.c().a((View) wlbVar);
        }
        this.h.C0(wlbVar, this.g);
        this.h.C0(new via() { // from class: qrc
            @Override // defpackage.via
            public final void R(uia uiaVar) {
                onb zzN2 = wlb.this.zzN();
                Rect rect = uiaVar.d;
                zzN2.k0(rect.left, rect.top, false);
            }
        }, this.g);
        this.h.M0((View) wlbVar);
        wlbVar.e0("/trackActiveViewUnit", new uxa() { // from class: rrc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                trc.this.g(wlbVar, (wlb) obj, map);
            }
        });
        this.i.k(wlbVar);
    }
}
