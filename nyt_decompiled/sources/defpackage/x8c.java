package defpackage;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x8c extends ldc implements awa {
    private final Bundle b;

    x8c(Set set) {
        super(set);
        this.b = new Bundle();
    }

    public final synchronized Bundle M0() {
        return new Bundle(this.b);
    }

    @Override // defpackage.awa
    public final synchronized void i0(String str, Bundle bundle) {
        this.b.putAll(bundle);
        G0(new kdc() { // from class: w8c
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((ae5) obj).l();
            }
        });
    }
}
