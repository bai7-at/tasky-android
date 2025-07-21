package androidx.datastore.preferences.core;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.s16;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MutablePreferences extends s16 {
    private final Map a;
    private final AtomicBoolean b;

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    @Override // defpackage.s16
    public Map a() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.a);
        zq3.g(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // defpackage.s16
    public boolean b(s16.a aVar) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        return this.a.containsKey(aVar);
    }

    @Override // defpackage.s16
    public Object c(s16.a aVar) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        return this.a.get(aVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return zq3.c(this.a, ((MutablePreferences) obj).a);
        }
        return false;
    }

    public final void f() {
        if (this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        this.b.set(true);
    }

    public final void h(s16.b... bVarArr) {
        zq3.h(bVarArr, "pairs");
        f();
        if (bVarArr.length <= 0) {
            return;
        }
        s16.b bVar = bVarArr[0];
        throw null;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final Object i(s16.a aVar) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        f();
        return this.a.remove(aVar);
    }

    public final void j(s16.a aVar, Object obj) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        k(aVar, obj);
    }

    public final void k(s16.a aVar, Object obj) {
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        f();
        if (obj == null) {
            i(aVar);
            return;
        }
        if (!(obj instanceof Set)) {
            this.a.put(aVar, obj);
            return;
        }
        Map map = this.a;
        Set unmodifiableSet = Collections.unmodifiableSet(i.c1((Iterable) obj));
        zq3.g(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(aVar, unmodifiableSet);
    }

    public String toString() {
        return i.u0(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, new ss2() { // from class: androidx.datastore.preferences.core.MutablePreferences$toString$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry entry) {
                zq3.h(entry, "entry");
                return "  " + ((s16.a) entry.getKey()).a() + " = " + entry.getValue();
            }
        }, 24, null);
    }

    public MutablePreferences(Map map, boolean z) {
        zq3.h(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }
}
