package kotlinx.serialization.internal;

import defpackage.c04;
import defpackage.cl0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class ObjectSerializer implements KSerializer {
    private final Object a;
    private List b;
    private final c04 c;

    public ObjectSerializer(final String str, Object obj) {
        zq3.h(str, "serialName");
        zq3.h(obj, "objectInstance");
        this.a = obj;
        this.b = kotlin.collections.i.l();
        this.c = kotlin.c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor mo865invoke() {
                final ObjectSerializer objectSerializer = this;
                return SerialDescriptorsKt.d(str, a.d.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
                    {
                        super(1);
                    }

                    public final void b(cl0 cl0Var) {
                        List list;
                        zq3.h(cl0Var, "$this$buildSerialDescriptor");
                        list = ObjectSerializer.this.b;
                        cl0Var.h(list);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((cl0) obj2);
                        return ww8.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.ym1
    public Object deserialize(Decoder decoder) {
        int o;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.c b = decoder.b(descriptor);
        if (b.p() || (o = b.o(getDescriptor())) == -1) {
            ww8 ww8Var = ww8.a;
            b.c(descriptor);
            return this.a;
        }
        throw new SerializationException("Unexpected index " + o);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
