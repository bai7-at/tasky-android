package defpackage;

import com.google.android.gms.internal.ads.zzflg;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cuc implements d6e {
    private final Map a;
    private final ina b;

    cuc(ina inaVar, Map map) {
        this.a = map;
        this.b = inaVar;
    }

    @Override // defpackage.d6e
    public final void I(zzflg zzflgVar, String str) {
    }

    @Override // defpackage.d6e
    public final void a(zzflg zzflgVar, String str) {
        if (this.a.containsKey(zzflgVar)) {
            this.b.c(((buc) this.a.get(zzflgVar)).a);
        }
    }

    @Override // defpackage.d6e
    public final void k(zzflg zzflgVar, String str) {
        if (this.a.containsKey(zzflgVar)) {
            this.b.c(((buc) this.a.get(zzflgVar)).b);
        }
    }

    @Override // defpackage.d6e
    public final void s(zzflg zzflgVar, String str, Throwable th) {
        if (this.a.containsKey(zzflgVar)) {
            this.b.c(((buc) this.a.get(zzflgVar)).c);
        }
    }
}
