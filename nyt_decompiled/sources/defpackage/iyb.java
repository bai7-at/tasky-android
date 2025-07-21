package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class iyb extends yla {
    private final eyb a;
    private final q4b b;
    private final hwd c;
    private boolean d = ((Boolean) pla.c().a(mpa.G0)).booleanValue();
    private final zuc e;

    public iyb(eyb eybVar, q4b q4bVar, hwd hwdVar, zuc zucVar) {
        this.a = eybVar;
        this.b = q4bVar;
        this.c = hwdVar;
        this.e = zucVar;
    }

    @Override // defpackage.zla
    public final void h1(zcc zccVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.c != null) {
            try {
                if (!zccVar.zzf()) {
                    this.e.e();
                }
            } catch (RemoteException e) {
                fgb.c("Error in making CSI ping for reporting paid event callback", e);
            }
            this.c.x(zccVar);
        }
    }

    @Override // defpackage.zla
    public final void q2(ee3 ee3Var, gma gmaVar) {
        try {
            this.c.F(gmaVar);
            this.a.j((Activity) fc5.Q1(ee3Var), gmaVar, this.d);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zla
    public final void w3(boolean z) {
        this.d = z;
    }

    @Override // defpackage.zla
    public final q4b zze() {
        return this.b;
    }

    @Override // defpackage.zla
    public final qkc zzf() {
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue()) {
            return this.a.c();
        }
        return null;
    }
}
