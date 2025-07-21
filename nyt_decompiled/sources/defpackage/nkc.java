package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes3.dex */
public final class nkc extends a0 {
    private final Object a = new Object();
    private final znc b;
    private final c4b c;

    public nkc(znc zncVar, c4b c4bVar) {
        this.b = zncVar;
        this.c = c4bVar;
    }

    @Override // defpackage.znc
    public final void W5(jrc jrcVar) {
        synchronized (this.a) {
            try {
                znc zncVar = this.b;
                if (zncVar != null) {
                    zncVar.W5(jrcVar);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        c4b c4bVar = this.c;
        if (c4bVar != null) {
            return c4bVar.zzg();
        }
        return 0.0f;
    }

    @Override // defpackage.znc
    public final float zzg() {
        c4b c4bVar = this.c;
        if (c4bVar != null) {
            return c4bVar.zzh();
        }
        return 0.0f;
    }

    @Override // defpackage.znc
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // defpackage.znc
    public final jrc zzi() {
        synchronized (this.a) {
            try {
                znc zncVar = this.b;
                if (zncVar == null) {
                    return null;
                }
                return zncVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
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
