package defpackage;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.pal.h3;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r7d extends h0e {
    private static final j1e j = new j1e();
    private final Context i;

    public r7d(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, Context context) {
        super(kscVar, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", h3Var, i, 29);
        this.i = context;
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.p0(QueryKeys.ENGAGED_SECONDS);
        AtomicReference a = j.a(this.i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                try {
                    if (a.get() == null) {
                        a.set((String) this.f.invoke(null, this.i));
                    }
                } finally {
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.e) {
            this.e.p0(zsa.a(str.getBytes(), true));
        }
    }
}
