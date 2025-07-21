package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public final class hpf {
    public static final hpf b;
    private final epf a;

    static {
        b = khe.a < 31 ? new hpf() : new hpf(epf.b);
    }

    private hpf(epf epfVar) {
        this.a = epfVar;
    }

    public final LogSessionId a() {
        epf epfVar = this.a;
        epfVar.getClass();
        return epfVar.a;
    }

    public hpf() {
        wad.f(khe.a < 31);
        this.a = null;
    }

    public hpf(LogSessionId logSessionId) {
        this.a = new epf(logSessionId);
    }
}
