package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.pal.h3;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class fdd extends h0e {
    public fdd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", h3Var, i, 24);
    }

    private final void c() {
        AdvertisingIdClient h = this.b.h();
        if (h == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = h.getInfo();
            String d = wvc.d(info.getId());
            if (d != null) {
                synchronized (this.e) {
                    this.e.v0(d);
                    this.e.u0(info.isLimitAdTrackingEnabled());
                    this.e.V(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.h0e
    protected final void a() {
        if (this.b.q()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.v0((String) this.f.invoke(null, this.b.b()));
        }
    }

    @Override // defpackage.h0e
    public final Void b() {
        if (this.b.r()) {
            super.b();
            return null;
        }
        if (this.b.q()) {
            c();
        }
        return null;
    }

    @Override // defpackage.h0e, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
