package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;

/* loaded from: classes2.dex */
public final class wvd extends bcb {
    private static void x6(final jcb jcbVar) {
        fgb.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        tfb.b.post(new Runnable() { // from class: tud
            @Override // java.lang.Runnable
            public final void run() {
                jcb jcbVar2 = jcb.this;
                if (jcbVar2 != null) {
                    try {
                        jcbVar2.i(1);
                    } catch (RemoteException e) {
                        fgb.i("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // defpackage.ccb
    public final void A4(ee3 ee3Var, boolean z) {
    }

    @Override // defpackage.ccb
    public final void K1(zzl zzlVar, jcb jcbVar) {
        x6(jcbVar);
    }

    @Override // defpackage.ccb
    public final void U1(j9c j9cVar) {
    }

    @Override // defpackage.ccb
    public final void U4(kcb kcbVar) {
    }

    @Override // defpackage.ccb
    public final void i2(fcb fcbVar) {
    }

    @Override // defpackage.ccb
    public final void m2(boolean z) {
    }

    @Override // defpackage.ccb
    public final void p1(zzl zzlVar, jcb jcbVar) {
        x6(jcbVar);
    }

    @Override // defpackage.ccb
    public final void t6(zcc zccVar) {
    }

    @Override // defpackage.ccb
    public final void u3(zzcbb zzcbbVar) {
    }

    @Override // defpackage.ccb
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // defpackage.ccb
    public final qkc zzc() {
        return null;
    }

    @Override // defpackage.ccb
    public final zbb zzd() {
        return null;
    }

    @Override // defpackage.ccb
    public final String zze() {
        return "";
    }

    @Override // defpackage.ccb
    public final void zzm(ee3 ee3Var) {
    }

    @Override // defpackage.ccb
    public final boolean zzo() {
        return false;
    }
}
