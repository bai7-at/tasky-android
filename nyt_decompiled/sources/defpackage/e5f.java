package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class e5f {
    private final byte[] a;
    private int b;
    private int c;
    final /* synthetic */ g5f d;

    /* synthetic */ e5f(g5f g5fVar, byte[] bArr, c5f c5fVar) {
        this.d = g5fVar;
        this.a = bArr;
    }

    public final e5f a(int i) {
        this.c = i;
        return this;
    }

    public final e5f b(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        try {
            g5f g5fVar = this.d;
            if (g5fVar.b) {
                g5fVar.a.zzj(this.a);
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
