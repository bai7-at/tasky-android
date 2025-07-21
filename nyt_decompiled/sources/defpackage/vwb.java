package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class vwb implements uxa {
    final /* synthetic */ ywb a;

    vwb(ywb ywbVar) {
        this.a = ywbVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        Executor executor;
        if (ywb.g(this.a, map)) {
            executor = this.a.c;
            executor.execute(new Runnable() { // from class: uwb
                @Override // java.lang.Runnable
                public final void run() {
                    gxb gxbVar;
                    gxbVar = vwb.this.a.d;
                    gxbVar.a();
                }
            });
        }
    }
}
