package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class t1 implements KSerializer {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, jz5.a(this, cVar, cVar.n(getDescriptor(), 0)), null, 8, null);
    }

    public ym1 c(c cVar, String str) {
        zq3.h(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public nk7 d(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        return encoder.a().e(e(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // defpackage.ym1
    public final Object deserialize(Decoder decoder) {
        Object obj;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        c b = decoder.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (b.p()) {
            obj = b(b);
        } else {
            Object obj2 = null;
            while (true) {
                int o = b.o(getDescriptor());
                if (o != -1) {
                    if (o == 0) {
                        ref$ObjectRef.element = b.n(getDescriptor(), o);
                    } else {
                        if (o != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(o);
                            throw new SerializationException(sb.toString());
                        }
                        T t = ref$ObjectRef.element;
                        if (t == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.element = t;
                        obj2 = c.a.c(b, getDescriptor(), o, jz5.a(this, b, (String) t), null, 8, null);
                    }
                } else {
                    if (obj2 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                    }
                    zq3.f(obj2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                    obj = obj2;
                }
            }
        }
        b.c(descriptor);
        return obj;
    }

    public abstract vu3 e();

    @Override // defpackage.nk7
    public final void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        nk7 b = jz5.b(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        d b2 = encoder.b(descriptor);
        b2.y(getDescriptor(), 0, b.getDescriptor().i());
        SerialDescriptor descriptor2 = getDescriptor();
        zq3.f(b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b2.z(descriptor2, 1, b, obj);
        b2.c(descriptor);
    }
}
