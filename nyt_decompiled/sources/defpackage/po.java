package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class po extends z54 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        zq3.h(serialDescriptor, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return "kotlin.collections.ArrayList";
    }
}
