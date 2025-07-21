package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class jx0 {
    public static final vu3 a(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof nx0) {
            return ((nx0) serialDescriptor).b;
        }
        if (serialDescriptor instanceof ck7) {
            return a(((ck7) serialDescriptor).k());
        }
        return null;
    }

    public static final SerialDescriptor b(uk7 uk7Var, SerialDescriptor serialDescriptor) {
        KSerializer c;
        zq3.h(uk7Var, "<this>");
        zq3.h(serialDescriptor, "descriptor");
        vu3 a = a(serialDescriptor);
        if (a == null || (c = uk7.c(uk7Var, a, null, 2, null)) == null) {
            return null;
        }
        return c.getDescriptor();
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, vu3 vu3Var) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(vu3Var, "context");
        return new nx0(serialDescriptor, vu3Var);
    }
}
