package defpackage;

import defpackage.r26;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class l48 implements KSerializer {
    public static final l48 a = new l48();
    private static final SerialDescriptor b = new s26("kotlin.String", r26.i.a);

    private l48() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return decoder.A();
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, String str) {
        zq3.h(encoder, "encoder");
        zq3.h(str, "value");
        encoder.G(str);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
