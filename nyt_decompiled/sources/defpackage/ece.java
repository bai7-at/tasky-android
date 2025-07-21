package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class ece {
    private final byte[] a;
    private int b;
    private int c;
    final /* synthetic */ fce d;

    /* synthetic */ ece(fce fceVar, byte[] bArr, dce dceVar) {
        this.d = fceVar;
        this.a = bArr;
    }

    public final ece a(int i) {
        this.c = i;
        return this;
    }

    public final ece b(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        try {
            fce fceVar = this.d;
            if (fceVar.b) {
                fceVar.a.zzj(this.a);
                this.d.a.zzi(this.b);
                this.d.a.zzg(this.c);
                this.d.a.zzh(null);
                this.d.a.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
