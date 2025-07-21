package kotlinx.serialization.json.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.l21;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class b {
    private final Map a = l21.a(16);

    public static final class a {
    }

    public final Object a(SerialDescriptor serialDescriptor, a aVar) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        Map map = (Map) this.a.get(serialDescriptor);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(SerialDescriptor serialDescriptor, a aVar, qs2 qs2Var) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        zq3.h(qs2Var, "defaultValue");
        Object a2 = a(serialDescriptor, aVar);
        if (a2 != null) {
            return a2;
        }
        Object mo865invoke = qs2Var.mo865invoke();
        c(serialDescriptor, aVar, mo865invoke);
        return mo865invoke;
    }

    public final void c(SerialDescriptor serialDescriptor, a aVar, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(aVar, TransferTable.COLUMN_KEY);
        zq3.h(obj, "value");
        Map map = this.a;
        Object obj2 = map.get(serialDescriptor);
        if (obj2 == null) {
            obj2 = l21.a(2);
            map.put(serialDescriptor, obj2);
        }
        ((Map) obj2).put(aVar, obj);
    }
}
