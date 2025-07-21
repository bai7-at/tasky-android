package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class cv5 {
    private static final SerialDescriptor[] a = new SerialDescriptor[0];

    public static final Set a(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof sg0) {
            return ((sg0) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int e = serialDescriptor.e();
        for (int i = 0; i < e; i++) {
            hashSet.add(serialDescriptor.f(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a : serialDescriptorArr;
    }

    public static final String c(vu3 vu3Var) {
        zq3.h(vu3Var, "<this>");
        String d = vu3Var.d();
        if (d == null) {
            d = "<local class name not available>";
        }
        return d(d);
    }

    public static final String d(String str) {
        zq3.h(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }
}
