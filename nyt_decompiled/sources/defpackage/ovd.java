package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ovd implements oid {
    private final Context a;
    private final Executor b;
    protected final aob c;
    private final hwd d;
    private final gyd e;
    private final zzcei f;
    private final ViewGroup g;
    private final v7e h;
    private final q1e i;
    private j64 j;

    protected ovd(Context context, Executor executor, aob aobVar, gyd gydVar, hwd hwdVar, q1e q1eVar, zzcei zzceiVar) {
        this.a = context;
        this.b = executor;
        this.c = aobVar;
        this.e = gydVar;
        this.d = hwdVar;
        this.i = q1eVar;
        this.f = zzceiVar;
        this.g = new FrameLayout(context);
        this.h = aobVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized c6c l(eyd eydVar) {
        nvd nvdVar = (nvd) eydVar;
        if (((Boolean) pla.c().a(mpa.a8)).booleanValue()) {
            kyb kybVar = new kyb(this.g);
            e6c e6cVar = new e6c();
            e6cVar.e(this.a);
            e6cVar.i(nvdVar.a);
            g6c j = e6cVar.j();
            mdc mdcVar = new mdc();
            mdcVar.f(this.d, this.b);
            mdcVar.o(this.d, this.b);
            return d(kybVar, j, mdcVar.q());
        }
        hwd c = hwd.c(this.d);
        mdc mdcVar2 = new mdc();
        mdcVar2.e(c, this.b);
        mdcVar2.j(c, this.b);
        mdcVar2.k(c, this.b);
        mdcVar2.l(c, this.b);
        mdcVar2.f(c, this.b);
        mdcVar2.o(c, this.b);
        mdcVar2.p(c);
        kyb kybVar2 = new kyb(this.g);
        e6c e6cVar2 = new e6c();
        e6cVar2.e(this.a);
        e6cVar2.i(nvdVar.a);
        return d(kybVar2, e6cVar2.j(), mdcVar2.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x0070, B:24:0x0078, B:25:0x008d, B:27:0x00a6, B:29:0x00aa, B:30:0x00b3, B:34:0x0042), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x0070, B:24:0x0078, B:25:0x008d, B:27:0x00a6, B:29:0x00aa, B:30:0x00b3, B:34:0x0042), top: B:2:0x0001 }] */
    @Override // defpackage.oid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, defpackage.mid r10, defpackage.nid r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovd.a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, mid, nid):boolean");
    }

    protected abstract c6c d(kyb kybVar, g6c g6cVar, odc odcVar);

    final /* synthetic */ void j() {
        this.d.n(w2e.d(6, null, null));
    }

    public final void k(zzw zzwVar) {
        this.i.K(zzwVar);
    }

    @Override // defpackage.oid
    public final boolean zza() {
        j64 j64Var = this.j;
        return (j64Var == null || j64Var.isDone()) ? false : true;
    }
}
