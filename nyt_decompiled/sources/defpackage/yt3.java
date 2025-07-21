package defpackage;

import defpackage.hk7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes5.dex */
public final class yt3 implements KSerializer {
    public static final yt3 a = new yt3();
    private static final SerialDescriptor b = SerialDescriptorsKt.e("kotlinx.serialization.json.JsonNull", hk7.b.a, new SerialDescriptor[0], null, 8, null);

    private yt3() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        ot3.g(decoder);
        if (decoder.E()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.k();
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonNull jsonNull) {
        zq3.h(encoder, "encoder");
        zq3.h(jsonNull, "value");
        ot3.h(encoder);
        encoder.n();
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
