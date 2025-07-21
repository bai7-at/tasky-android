package defpackage;

import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e6d implements d6e {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final j6e c;

    public e6d(Set set, j6e j6eVar) {
        zzflg zzflgVar;
        String str;
        zzflg zzflgVar2;
        String str2;
        this.c = j6eVar;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            d6d d6dVar = (d6d) it2.next();
            Map map = this.a;
            zzflgVar = d6dVar.b;
            str = d6dVar.a;
            map.put(zzflgVar, str);
            Map map2 = this.b;
            zzflgVar2 = d6dVar.c;
            str2 = d6dVar.a;
            map2.put(zzflgVar2, str2);
        }
    }

    @Override // defpackage.d6e
    public final void I(zzflg zzflgVar, String str) {
    }

    @Override // defpackage.d6e
    public final void a(zzflg zzflgVar, String str) {
        this.c.d("task.".concat(String.valueOf(str)));
        if (this.a.containsKey(zzflgVar)) {
            this.c.d("label.".concat(String.valueOf((String) this.a.get(zzflgVar))));
        }
    }

    @Override // defpackage.d6e
    public final void k(zzflg zzflgVar, String str) {
        this.c.e("task.".concat(String.valueOf(str)), "s.");
        if (this.b.containsKey(zzflgVar)) {
            this.c.e("label.".concat(String.valueOf((String) this.b.get(zzflgVar))), "s.");
        }
    }

    @Override // defpackage.d6e
    public final void s(zzflg zzflgVar, String str, Throwable th) {
        this.c.e("task.".concat(String.valueOf(str)), "f.");
        if (this.b.containsKey(zzflgVar)) {
            this.c.e("label.".concat(String.valueOf((String) this.b.get(zzflgVar))), "f.");
        }
    }
}
