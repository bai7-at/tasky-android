package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class io extends z54 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        zq3.h(serialDescriptor, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return "kotlin.Array";
    }
}
