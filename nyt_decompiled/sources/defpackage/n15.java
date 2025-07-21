package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.TaggedDecoder;

/* loaded from: classes5.dex */
public abstract class n15 extends TaggedDecoder {
    protected abstract String Z(String str, String str2);

    protected String a0(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return serialDescriptor.f(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "<this>");
        return c0(a0(serialDescriptor, i));
    }

    protected final String c0(String str) {
        zq3.h(str, "nestedName");
        String str2 = (String) U();
        if (str2 == null) {
            str2 = "";
        }
        return Z(str2, str);
    }
}
