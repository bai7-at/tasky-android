package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public final class jid {
    private final oid a;
    private final String b;
    private qkc c;

    public jid(oid oidVar, String str) {
        this.a = oidVar;
        this.b = str;
    }

    public final synchronized String a() {
        qkc qkcVar;
        try {
            qkcVar = this.c;
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            return null;
        }
        return qkcVar != null ? qkcVar.zzg() : null;
    }

    public final synchronized String b() {
        qkc qkcVar;
        try {
            qkcVar = this.c;
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            return null;
        }
        return qkcVar != null ? qkcVar.zzg() : null;
    }

    public final synchronized void d(zzl zzlVar, int i) {
        this.c = null;
        pid pidVar = new pid(i);
        iid iidVar = new iid(this);
        this.a.a(zzlVar, this.b, pidVar, iidVar);
    }

    public final synchronized boolean e() {
        return this.a.zza();
    }
}
