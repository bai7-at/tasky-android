package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class za5 implements KSerializer {
    private final KSerializer a;
    private final SerialDescriptor b;

    public za5(KSerializer kSerializer) {
        zq3.h(kSerializer, "serializer");
        this.a = kSerializer;
        this.b = new ck7(kSerializer.getDescriptor());
    }

    @Override // defpackage.ym1
    public Object deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return decoder.E() ? decoder.z(this.a) : decoder.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && za5.class == obj.getClass() && zq3.c(this.a, ((za5) obj).a);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        if (obj == null) {
            encoder.n();
        } else {
            encoder.v();
            encoder.t(this.a, obj);
        }
    }
}
