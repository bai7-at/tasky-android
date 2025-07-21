package defpackage;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class y7g implements gke {
    final /* synthetic */ qq9 a;

    y7g(qq9 qq9Var) {
        this.a = qq9Var;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        evc evcVar;
        uuc uucVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        dyf.q().w(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        qq9 qq9Var = this.a;
        evcVar = qq9Var.n;
        uucVar = qq9Var.f;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        atomicInteger = this.a.e0;
        ktd.c(evcVar, uucVar, "sgf", pair, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        fgb.e("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) pla.c().a(mpa.w9)).booleanValue()) {
            atomicBoolean = this.a.Z;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.a.e0;
            if (atomicInteger2.getAndIncrement() < ((Integer) pla.c().a(mpa.x9)).intValue()) {
                this.a.T6();
            }
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        evc evcVar;
        uuc uucVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        fgb.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) pla.c().a(mpa.w9)).booleanValue()) {
            qq9 qq9Var = this.a;
            evcVar = qq9Var.n;
            uucVar = qq9Var.f;
            atomicInteger = qq9Var.e0;
            ktd.c(evcVar, uucVar, "sgs", new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.a.Z;
            atomicBoolean.set(true);
        }
    }
}
