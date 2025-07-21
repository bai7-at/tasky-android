package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class ggd {
    private final bic a;

    public ggd(bic bicVar) {
        this.a = bicVar;
    }

    public final /* bridge */ /* synthetic */ Object a(g1e g1eVar, v0e v0eVar, View view, cgd cgdVar) {
        egd egdVar = new egd(this, new iic() { // from class: dgd
            @Override // defpackage.iic
            public final void a(boolean z, Context context, m7c m7cVar) {
            }
        });
        zgc c = this.a.c(new k1c(g1eVar, v0eVar, null), egdVar);
        cgdVar.a(new fgd(this, c));
        return c.i();
    }
}
