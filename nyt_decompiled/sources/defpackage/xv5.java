package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class xv5 {
    public static final int a(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.i().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable a = dk7.a(serialDescriptor);
        Iterator it2 = a.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it2.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            String i5 = ((SerialDescriptor) it2.next()).i();
            if (i5 != null) {
                i3 = i5.hashCode();
            }
            i2 = i4 + i3;
        }
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            int i6 = i * 31;
            hk7 d = ((SerialDescriptor) it3.next()).d();
            i = i6 + (d != null ? d.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }
}
