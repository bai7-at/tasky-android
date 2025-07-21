package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfho;

/* loaded from: classes3.dex */
public final class svb implements u7c {
    private final s2e a;

    public svb(s2e s2eVar) {
        this.a = s2eVar;
    }

    @Override // defpackage.u7c
    public final void E(Context context) {
        try {
            this.a.z();
            if (context != null) {
                this.a.x(context);
            }
        } catch (zzfho e) {
            fgb.h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // defpackage.u7c
    public final void l(Context context) {
        try {
            this.a.l();
        } catch (zzfho e) {
            fgb.h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // defpackage.u7c
    public final void t(Context context) {
        try {
            this.a.y();
        } catch (zzfho e) {
            fgb.h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
