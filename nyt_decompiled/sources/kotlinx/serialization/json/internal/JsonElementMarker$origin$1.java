package kotlinx.serialization.json.internal;

import defpackage.gt2;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
/* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements gt2 {
    JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean g(SerialDescriptor serialDescriptor, int i) {
        boolean e;
        zq3.h(serialDescriptor, "p0");
        e = ((JsonElementMarker) this.receiver).e(serialDescriptor, i);
        return Boolean.valueOf(e);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g((SerialDescriptor) obj, ((Number) obj2).intValue());
    }
}
