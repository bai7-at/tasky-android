package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class cid implements jq9, bgc {
    private koa a;

    @Override // defpackage.bgc
    public final synchronized void X() {
    }

    public final synchronized void a(koa koaVar) {
        this.a = koaVar;
    }

    @Override // defpackage.jq9
    public final synchronized void v() {
        koa koaVar = this.a;
        if (koaVar != null) {
            try {
                koaVar.zzb();
            } catch (RemoteException e) {
                fgb.h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // defpackage.bgc
    public final synchronized void zzs() {
        koa koaVar = this.a;
        if (koaVar != null) {
            try {
                koaVar.zzb();
            } catch (RemoteException e) {
                fgb.h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
