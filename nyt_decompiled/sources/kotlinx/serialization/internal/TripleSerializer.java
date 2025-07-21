package kotlinx.serialization.internal;

import defpackage.cl0;
import defpackage.cu8;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;

/* loaded from: classes5.dex */
public final class TripleSerializer implements KSerializer {
    private final KSerializer a;
    private final KSerializer b;
    private final KSerializer c;
    private final SerialDescriptor d;

    public TripleSerializer(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        zq3.h(kSerializer, "aSerializer");
        zq3.h(kSerializer2, "bSerializer");
        zq3.h(kSerializer3, "cSerializer");
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        this.d = SerialDescriptorsKt.b("kotlin.Triple", new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1
            {
                super(1);
            }

            public final void b(cl0 cl0Var) {
                KSerializer kSerializer4;
                KSerializer kSerializer5;
                KSerializer kSerializer6;
                zq3.h(cl0Var, "$this$buildClassSerialDescriptor");
                kSerializer4 = TripleSerializer.this.a;
                cl0.b(cl0Var, "first", kSerializer4.getDescriptor(), null, false, 12, null);
                kSerializer5 = TripleSerializer.this.b;
                cl0.b(cl0Var, "second", kSerializer5.getDescriptor(), null, false, 12, null);
                kSerializer6 = TripleSerializer.this.c;
                cl0.b(cl0Var, "third", kSerializer6.getDescriptor(), null, false, 12, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cl0) obj);
                return ww8.a;
            }
        });
    }

    private final Triple d(kotlinx.serialization.encoding.c cVar) {
        Object c = c.a.c(cVar, getDescriptor(), 0, this.a, null, 8, null);
        Object c2 = c.a.c(cVar, getDescriptor(), 1, this.b, null, 8, null);
        Object c3 = c.a.c(cVar, getDescriptor(), 2, this.c, null, 8, null);
        cVar.c(getDescriptor());
        return new Triple(c, c2, c3);
    }

    private final Triple e(kotlinx.serialization.encoding.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = cu8.a;
        obj2 = cu8.a;
        obj3 = cu8.a;
        while (true) {
            int o = cVar.o(getDescriptor());
            if (o == -1) {
                cVar.c(getDescriptor());
                obj4 = cu8.a;
                if (obj == obj4) {
                    throw new SerializationException("Element 'first' is missing");
                }
                obj5 = cu8.a;
                if (obj2 == obj5) {
                    throw new SerializationException("Element 'second' is missing");
                }
                obj6 = cu8.a;
                if (obj3 != obj6) {
                    return new Triple(obj, obj2, obj3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (o == 0) {
                obj = c.a.c(cVar, getDescriptor(), 0, this.a, null, 8, null);
            } else if (o == 1) {
                obj2 = c.a.c(cVar, getDescriptor(), 1, this.b, null, 8, null);
            } else {
                if (o != 2) {
                    throw new SerializationException("Unexpected index " + o);
                }
                obj3 = c.a.c(cVar, getDescriptor(), 2, this.c, null, 8, null);
            }
        }
    }

    @Override // defpackage.ym1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        kotlinx.serialization.encoding.c b = decoder.b(getDescriptor());
        return b.p() ? d(b) : e(b);
    }

    @Override // defpackage.nk7
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Triple triple) {
        zq3.h(encoder, "encoder");
        zq3.h(triple, "value");
        kotlinx.serialization.encoding.d b = encoder.b(getDescriptor());
        b.z(getDescriptor(), 0, this.a, triple.d());
        b.z(getDescriptor(), 1, this.b, triple.e());
        b.z(getDescriptor(), 2, this.c, triple.f());
        b.c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.d;
    }
}
