package defpackage;

import defpackage.r26;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class bl2 implements KSerializer {
    public static final bl2 a = new bl2();
    private static final SerialDescriptor b = new s26("kotlin.Float", r26.e.a);

    private bl2() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return Float.valueOf(decoder.t());
    }

    public void b(Encoder encoder, float f) {
        zq3.h(encoder, "encoder");
        encoder.s(f);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).floatValue());
    }
}
