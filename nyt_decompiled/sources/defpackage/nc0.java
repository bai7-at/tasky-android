package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.hybrid.bridge.BridgeCommandOptionsException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class nc0 {
    private final Map a;

    public nc0(Map map) {
        zq3.h(map, "options");
        this.a = map;
    }

    public static /* synthetic */ boolean c(nc0 nc0Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nc0Var.b(str, z);
    }

    private final BridgeCommandOptionsException d(String str, Object obj, String str2, String str3) {
        return new BridgeCommandOptionsException("Error parsing parameter " + str + ": " + obj + " cannot be converted to a " + str2, str3);
    }

    static /* synthetic */ BridgeCommandOptionsException e(nc0 nc0Var, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return nc0Var.d(str, obj, str2, str3);
    }

    private final BridgeCommandOptionsException i(String str) {
        return new BridgeCommandOptionsException("Required parameter " + str + " not specified", null, 2, null);
    }

    public final Object a(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.get(str);
    }

    public final boolean b(String str, boolean z) {
        String obj;
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object obj2 = this.a.get(str);
        return (obj2 == null || (obj = obj2.toString()) == null) ? z : Boolean.parseBoolean(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc0) && zq3.c(this.a, ((nc0) obj).a);
    }

    public final Map f() {
        return this.a;
    }

    public final Map g(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Map h = h(str);
        if (h != null) {
            return h;
        }
        throw i(str);
    }

    public final Map h(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object a = a(str);
        if (a == null) {
            return null;
        }
        try {
            return (Map) a;
        } catch (ClassCastException e) {
            throw d(str, a, "Map<String, Any>", e.getMessage());
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final String j(String str) {
        String obj;
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object obj2 = this.a.get(str);
        if (obj2 == null || (obj = obj2.toString()) == null) {
            throw i(str);
        }
        return obj;
    }

    public final List k(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object obj = this.a.get(str);
        if (!(obj instanceof Collection)) {
            throw e(this, str, obj, "List<String>", null, 8, null);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(i.w(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next()));
        }
        return arrayList;
    }

    public final String l(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object obj = this.a.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public String toString() {
        return "BridgeCommandOptions(options=" + this.a + ")";
    }
}
