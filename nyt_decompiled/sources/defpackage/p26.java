package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class p26 extends z54 {
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p26(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        zq3.h(serialDescriptor, "primitive");
        this.c = serialDescriptor.i() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return this.c;
    }
}
