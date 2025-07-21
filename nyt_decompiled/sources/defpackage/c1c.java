package defpackage;

import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.zb;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c1c implements pdd {
    public final List a;

    public c1c(List list) {
        this.a = list;
    }

    @Override // defpackage.pdd
    public final void zzq() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            zb.r((j64) it2.next(), new b1c(this), lc.b());
        }
    }

    public c1c(u0c u0cVar) {
        this.a = Collections.singletonList(zb.h(u0cVar));
    }
}
