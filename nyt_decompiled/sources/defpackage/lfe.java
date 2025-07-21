package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class lfe extends hfe {
    final /* synthetic */ ufe b;

    lfe(ufe ufeVar) {
        this.b = ufeVar;
    }

    @Override // defpackage.hfe
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        gfe gfeVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        gfe gfeVar2;
        obj = this.b.f;
        synchronized (obj) {
            try {
                atomicInteger = this.b.k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.b.k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        gfeVar2 = this.b.b;
                        gfeVar2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                ufe ufeVar = this.b;
                iInterface = ufeVar.m;
                if (iInterface != null) {
                    gfeVar = ufeVar.b;
                    gfeVar.c("Unbind from service.", new Object[0]);
                    ufe ufeVar2 = this.b;
                    context = ufeVar2.a;
                    serviceConnection = ufeVar2.l;
                    context.unbindService(serviceConnection);
                    this.b.g = false;
                    this.b.m = null;
                    this.b.l = null;
                }
                this.b.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
