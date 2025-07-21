package defpackage;

import defpackage.hk7;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes5.dex */
public abstract class nl9 {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, uk7 uk7Var) {
        SerialDescriptor a;
        zq3.h(serialDescriptor, "<this>");
        zq3.h(uk7Var, "module");
        if (!zq3.c(serialDescriptor.d(), hk7.a.a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.h(0), uk7Var) : serialDescriptor;
        }
        SerialDescriptor b = jx0.b(uk7Var, serialDescriptor);
        return (b == null || (a = a(b, uk7Var)) == null) ? serialDescriptor : a;
    }

    public static final WriteMode b(at3 at3Var, SerialDescriptor serialDescriptor) {
        zq3.h(at3Var, "<this>");
        zq3.h(serialDescriptor, "desc");
        hk7 d = serialDescriptor.d();
        if (d instanceof hz5) {
            return WriteMode.POLY_OBJ;
        }
        if (zq3.c(d, a.b.a)) {
            return WriteMode.LIST;
        }
        if (!zq3.c(d, a.c.a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor a = a(serialDescriptor.h(0), at3Var.a());
        hk7 d2 = a.d();
        if ((d2 instanceof r26) || zq3.c(d2, hk7.b.a)) {
            return WriteMode.MAP;
        }
        if (at3Var.e().b()) {
            return WriteMode.LIST;
        }
        throw qt3.d(a);
    }
}
