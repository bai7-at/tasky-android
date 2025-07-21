package defpackage;

import com.google.android.gms.internal.pal.zzqc;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class eqf {
    private static final eqf b = new eqf();
    private final AtomicReference a = new AtomicReference(new qsf(new orf(), null));

    public static eqf b() {
        return b;
    }

    public final cbf a(frf frfVar, tdf tdfVar) {
        try {
            try {
                return ((qsf) this.a.get()).a(frfVar, tdfVar);
            } catch (GeneralSecurityException e) {
                throw new zzqc("Creating a LegacyProtoKey failed", e);
            }
        } catch (GeneralSecurityException unused) {
            return new jpf(frfVar, tdfVar);
        }
    }

    public final synchronized void c(vnf vnfVar) {
        orf orfVar = new orf((qsf) this.a.get());
        orfVar.a(vnfVar);
        this.a.set(new qsf(orfVar, null));
    }

    public final synchronized void d(eof eofVar) {
        orf orfVar = new orf((qsf) this.a.get());
        orfVar.b(eofVar);
        this.a.set(new qsf(orfVar, null));
    }

    public final synchronized void e(nqf nqfVar) {
        orf orfVar = new orf((qsf) this.a.get());
        orfVar.c(nqfVar);
        this.a.set(new qsf(orfVar, null));
    }

    public final synchronized void f(wqf wqfVar) {
        orf orfVar = new orf((qsf) this.a.get());
        orfVar.d(wqfVar);
        this.a.set(new qsf(orfVar, null));
    }
}
