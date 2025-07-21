package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class lw3 implements KSerializer {
    private final KSerializer a;
    private final KSerializer b;

    public /* synthetic */ lw3(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract Object a(Object obj);

    protected final KSerializer b() {
        return this.a;
    }

    protected abstract Object c(Object obj);

    protected final KSerializer d() {
        return this.b;
    }

    @Override // defpackage.ym1
    public Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object e;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        c b = decoder.b(descriptor);
        if (b.p()) {
            e = e(c.a.c(b, getDescriptor(), 0, b(), null, 8, null), c.a.c(b, getDescriptor(), 1, d(), null, 8, null));
        } else {
            obj = cu8.a;
            obj2 = cu8.a;
            Object obj5 = obj;
            Object obj6 = obj2;
            while (true) {
                int o = b.o(getDescriptor());
                if (o == -1) {
                    obj3 = cu8.a;
                    if (obj5 == obj3) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    obj4 = cu8.a;
                    if (obj6 == obj4) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    e = e(obj5, obj6);
                } else if (o == 0) {
                    obj5 = c.a.c(b, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (o != 1) {
                        throw new SerializationException("Invalid index: " + o);
                    }
                    obj6 = c.a.c(b, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        b.c(descriptor);
        return e;
    }

    protected abstract Object e(Object obj, Object obj2);

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        d b = encoder.b(getDescriptor());
        b.z(getDescriptor(), 0, this.a, a(obj));
        b.z(getDescriptor(), 1, this.b, c(obj));
        b.c(getDescriptor());
    }

    private lw3(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }
}
