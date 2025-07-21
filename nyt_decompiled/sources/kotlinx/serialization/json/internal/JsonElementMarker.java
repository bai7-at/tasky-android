package kotlinx.serialization.json.internal;

import defpackage.ty1;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class JsonElementMarker {
    private final ty1 a;
    private boolean b;

    public JsonElementMarker(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        this.a = new ty1(serialDescriptor, new JsonElementMarker$origin$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(SerialDescriptor serialDescriptor, int i) {
        boolean z = !serialDescriptor.j(i) && serialDescriptor.h(i).b();
        this.b = z;
        return z;
    }

    public final boolean b() {
        return this.b;
    }

    public final void c(int i) {
        this.a.a(i);
    }

    public final int d() {
        return this.a.d();
    }
}
