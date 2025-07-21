package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class id4 {
    private final LinkedHashMap a;

    public id4(int i, float f) {
        this.a = new LinkedHashMap(i, f, true);
    }

    public final Object a(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        return this.a.get(obj);
    }

    public final Set b() {
        Set entrySet = this.a.entrySet();
        zq3.g(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "value");
        return this.a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        return this.a.remove(obj);
    }
}
