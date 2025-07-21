package com.google.android.gms.internal.ads;

import defpackage.gke;
import defpackage.kge;
import defpackage.lge;
import defpackage.oke;
import defpackage.pke;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class xb implements Runnable {
    final Future a;
    final gke b;

    xb(Future future, gke gkeVar) {
        this.a = future;
        this.b = gkeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Object obj = this.a;
        if ((obj instanceof oke) && (a = pke.a((oke) obj)) != null) {
            this.b.zza(a);
            return;
        }
        try {
            this.b.zzb(zb.p(this.a));
        } catch (ExecutionException e) {
            this.b.zza(e.getCause());
        } catch (Throwable th) {
            this.b.zza(th);
        }
    }

    public final String toString() {
        kge a = lge.a(this);
        a.a(this.b);
        return a.toString();
    }
}
