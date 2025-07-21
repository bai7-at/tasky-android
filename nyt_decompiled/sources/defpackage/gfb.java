package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
final class gfb extends ila {
    final /* synthetic */ kfb c;

    gfb(kfb kfbVar) {
        this.c = kfbVar;
    }

    @Override // defpackage.ila
    public final void a() {
        Context context;
        zzcei zzceiVar;
        Object obj;
        upa upaVar;
        kfb kfbVar = this.c;
        context = kfbVar.e;
        zzceiVar = kfbVar.f;
        spa spaVar = new spa(context, zzceiVar.zza);
        obj = this.c.a;
        synchronized (obj) {
            try {
                dyf.g();
                upaVar = this.c.h;
                vpa.a(upaVar, spaVar);
            } catch (IllegalArgumentException e) {
                fgb.h("Cannot config CSI reporter.", e);
            }
        }
    }
}
