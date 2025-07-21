package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class csc implements u7c {
    private final wlb a;

    csc(wlb wlbVar) {
        this.a = wlbVar;
    }

    @Override // defpackage.u7c
    public final void E(Context context) {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.onResume();
        }
    }

    @Override // defpackage.u7c
    public final void l(Context context) {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.destroy();
        }
    }

    @Override // defpackage.u7c
    public final void t(Context context) {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.onPause();
        }
    }
}
