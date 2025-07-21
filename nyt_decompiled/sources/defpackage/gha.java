package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.u0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class gha extends cia {
    public gha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", u0Var, i, 24);
    }

    private final void c() {
        AdvertisingIdClient h = this.b.h();
        if (h == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = h.getInfo();
            String id = info.getId();
            int i = mga.b;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                id = ida.a(bArr, true);
            }
            if (id != null) {
                synchronized (this.e) {
                    this.e.r0(id);
                    this.e.q0(info.isLimitAdTrackingEnabled());
                    this.e.R(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.cia
    protected final void a() {
        if (this.b.q()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.r0((String) this.f.invoke(null, this.b.b()));
        }
    }

    @Override // defpackage.cia
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

    @Override // defpackage.cia, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
