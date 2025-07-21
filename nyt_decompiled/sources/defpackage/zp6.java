package defpackage;

import com.nytimes.android.saved.SavedAssetIndex;
import defpackage.oy2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class zp6 {
    private final List b(List list) {
        oy2.e b;
        if (list == null) {
            list = i.l();
        }
        ArrayList arrayList = new ArrayList();
        for (oy2.c cVar : list) {
            SavedAssetIndex savedAssetIndex = null;
            if (cVar != null && (b = cVar.b()) != null) {
                y76 a = b.a();
                zq3.e(a);
                oy2.d a2 = cVar.a();
                zq3.e(a2);
                String g = a.g();
                String f = a.f();
                String a3 = a2.a();
                zq3.e(a3);
                savedAssetIndex = new SavedAssetIndex(g, a3, f);
            }
            if (savedAssetIndex != null) {
                arrayList.add(savedAssetIndex);
            }
        }
        return arrayList;
    }

    private final String c(oy2.f fVar) {
        if (fVar.b()) {
            return fVar.a();
        }
        return null;
    }

    public final yp6 a(oy2.b bVar) {
        oy2.h a;
        oy2.g a2 = (bVar == null || (a = bVar.a()) == null) ? null : a.a();
        return a2 != null ? new yp6(b(a2.a()), c(a2.b())) : new yp6(i.l(), null);
    }
}
