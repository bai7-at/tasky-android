package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class o15 extends xf8 {
    protected abstract String a0(String str, String str2);

    protected abstract String b0(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "<this>");
        return d0(b0(serialDescriptor, i));
    }

    protected final String d0(String str) {
        zq3.h(str, "nestedName");
        String str2 = (String) W();
        if (str2 == null) {
            str2 = "";
        }
        return a0(str2, str);
    }
}
