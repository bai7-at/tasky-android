package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class xwb implements uxa {
    final /* synthetic */ ywb a;

    xwb(ywb ywbVar) {
        this.a = ywbVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        Executor executor;
        if (ywb.g(this.a, map)) {
            executor = this.a.c;
            executor.execute(new Runnable() { // from class: wwb
                @Override // java.lang.Runnable
                public final void run() {
                    gxb gxbVar;
                    gxbVar = xwb.this.a.d;
                    gxbVar.n();
                }
            });
        }
    }
}
