package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes3.dex */
public final class d4b extends a0 {
    private final Object a = new Object();
    private volatile jrc b;

    @Override // defpackage.znc
    public final void W5(jrc jrcVar) {
        synchronized (this.a) {
            this.b = jrcVar;
        }
    }

    @Override // defpackage.znc
    public final void b0(boolean z) {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final float zze() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final float zzf() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final float zzg() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final jrc zzi() {
        jrc jrcVar;
        synchronized (this.a) {
            jrcVar = this.b;
        }
        return jrcVar;
    }

    @Override // defpackage.znc
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final boolean zzq() {
        throw new RemoteException();
    }
}
