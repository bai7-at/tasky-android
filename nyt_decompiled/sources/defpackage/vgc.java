package defpackage;

import defpackage.a79;
import java.util.Set;

/* loaded from: classes3.dex */
public final class vgc extends ldc {
    private boolean b;

    protected vgc(Set set) {
        super(set);
    }

    public final synchronized void M0() {
        G0(tgc.a);
        this.b = true;
    }

    public final void zza() {
        G0(new kdc() { // from class: sgc
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((a79.a) obj).a();
            }
        });
    }

    public final void zzb() {
        G0(new kdc() { // from class: rgc
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((a79.a) obj).c();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.b) {
                G0(tgc.a);
                this.b = true;
            }
            G0(new kdc() { // from class: ugc
                @Override // defpackage.kdc
                public final void zza(Object obj) {
                    ((a79.a) obj).d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }
}
