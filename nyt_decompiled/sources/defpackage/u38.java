package defpackage;

import java.util.Set;
import kotlin.collections.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class u38 {
    private static final Set a = b0.j(he0.F(lv8.b).getDescriptor(), he0.G(pv8.b).getDescriptor(), he0.E(hv8.b).getDescriptor(), he0.H(aw8.b).getDescriptor());

    public static final boolean a(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && zq3.c(serialDescriptor, nt3.k());
    }

    public static final boolean b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
