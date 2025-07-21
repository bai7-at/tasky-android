package defpackage;

import android.os.RemoteException;
import defpackage.a79;

/* loaded from: classes3.dex */
public final class pqc extends a79.a {
    private final rkc a;

    public pqc(rkc rkcVar) {
        this.a = rkcVar;
    }

    private static jrc f(rkc rkcVar) {
        znc W = rkcVar.W();
        if (W == null) {
            return null;
        }
        try {
            return W.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // a79.a
    public final void a() {
        jrc f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.zze();
        } catch (RemoteException e) {
            fgb.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // a79.a
    public final void c() {
        jrc f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.zzg();
        } catch (RemoteException e) {
            fgb.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // a79.a
    public final void e() {
        jrc f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.zzi();
        } catch (RemoteException e) {
            fgb.h("Unable to call onVideoEnd()", e);
        }
    }
}
