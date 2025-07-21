package androidx.work;

import androidx.work.Data;
import defpackage.xk3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends xk3 {
    @Override // defpackage.xk3
    public Data a(List list) {
        zq3.h(list, "inputs");
        Data.a aVar = new Data.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.putAll(((Data) it2.next()).e());
        }
        aVar.d(linkedHashMap);
        return aVar.a();
    }
}
