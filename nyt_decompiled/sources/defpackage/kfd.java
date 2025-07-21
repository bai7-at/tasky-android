package defpackage;

import android.view.View;
import com.google.android.gms.internal.pal.h3;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kfd extends h0e {
    private final Map i;
    private final View j;

    public kfd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, Map map, View view) {
        super(kscVar, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", h3Var, i, 85);
        this.i = map;
        this.j = view;
    }

    private final long c(int i) {
        Map map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.h0e
    protected final void a() {
        long[] jArr = (long[]) this.f.invoke(null, new long[]{c(1), c(2)}, this.b.b(), this.j);
        long j = jArr[0];
        this.i.put(1, Long.valueOf(jArr[1]));
        long j2 = jArr[2];
        this.i.put(2, Long.valueOf(jArr[3]));
        synchronized (this.e) {
            this.e.y0(j);
            this.e.x0(j2);
        }
    }
}
