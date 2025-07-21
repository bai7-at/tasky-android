package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class ald extends h0e {
    private static volatile String i;
    private static final Object j = new Object();

    public ald(ksc kscVar, String str, String str2, h3 h3Var, int i2, int i3) {
        super(kscVar, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", h3Var, i2, 1);
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.l(QueryKeys.ENGAGED_SECONDS);
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
            this.e.l(i);
        }
    }
}
