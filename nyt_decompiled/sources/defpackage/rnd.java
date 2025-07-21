package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class rnd implements fqd {
    public final u0e a;

    public rnd(u0e u0eVar) {
        this.a = u0eVar;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.a != null) {
            if (((Boolean) pla.c().a(mpa.nb)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", this.a.d());
            bundle.putBoolean("disable_ml", this.a.c());
        }
    }
}
