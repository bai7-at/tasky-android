package androidx.lifecycle;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class u {
    private final Map a = new LinkedHashMap();

    public final void a() {
        Iterator it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            ((q) it2.next()).clear();
        }
        this.a.clear();
    }

    public final q b(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return (q) this.a.get(str);
    }

    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, q qVar) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(qVar, "viewModel");
        q qVar2 = (q) this.a.put(str, qVar);
        if (qVar2 != null) {
            qVar2.onCleared();
        }
    }
}
