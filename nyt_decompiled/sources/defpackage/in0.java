package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class in0 extends b1 {
    private final KSerializer a;

    public /* synthetic */ in0(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // defpackage.b1
    protected final void g(c cVar, Object obj, int i, int i2) {
        zq3.h(cVar, "decoder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h(cVar, i + i3, obj, false);
        }
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public abstract SerialDescriptor getDescriptor();

    @Override // defpackage.b1
    protected void h(c cVar, int i, Object obj, boolean z) {
        zq3.h(cVar, "decoder");
        n(obj, i, c.a.c(cVar, getDescriptor(), i, this.a, null, 8, null));
    }

    protected abstract void n(Object obj, int i, Object obj2);

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        int e = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        d h = encoder.h(descriptor, e);
        Iterator d = d(obj);
        for (int i = 0; i < e; i++) {
            h.z(getDescriptor(), i, this.a, d.next());
        }
        h.c(descriptor);
    }

    private in0(KSerializer kSerializer) {
        super(null);
        this.a = kSerializer;
    }
}
