package defpackage;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class wga extends cia {
    private static final dia j = new dia();
    private final Context i;

    public wga(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, Context context) {
        super(jgaVar, "F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", u0Var, i, 29);
        this.i = context;
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.l0(QueryKeys.ENGAGED_SECONDS);
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
            this.e.l0(ida.a(str.getBytes(), true));
        }
    }
}
