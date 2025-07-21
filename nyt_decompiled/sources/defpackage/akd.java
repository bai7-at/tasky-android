package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class akd implements gqd {
    private final Set a;

    akd(Set set) {
        this.a = set;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 8;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add((String) it2.next());
        }
        return zb.h(new fqd() { // from class: wjd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
