package defpackage;

import defpackage.r26;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class zq7 implements KSerializer {
    public static final zq7 a = new zq7();
    private static final SerialDescriptor b = new s26("kotlin.Short", r26.h.a);

    private zq7() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return Short.valueOf(decoder.s());
    }

    public void b(Encoder encoder, short s) {
        zq3.h(encoder, "encoder");
        encoder.p(s);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).shortValue());
    }
}
