package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class pha extends cia {
    private static volatile String i;
    private static final Object j = new Object();

    public pha(jga jgaVar, String str, String str2, u0 u0Var, int i2, int i3) {
        super(jgaVar, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", u0Var, i2, 1);
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.o(QueryKeys.ENGAGED_SECONDS);
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = (String) this.f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.e) {
            this.e.o(i);
        }
    }
}
