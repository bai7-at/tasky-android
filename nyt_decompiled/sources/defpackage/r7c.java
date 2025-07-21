package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class r7c extends ldc {
    private boolean b;

    public r7c(Set set) {
        super(set);
        this.b = false;
    }

    public final synchronized void zza() {
        if (this.b) {
            return;
        }
        G0(new kdc() { // from class: q7c
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((t7c) obj).zzq();
            }
        });
        this.b = true;
    }
}
