package kotlinx.serialization.json;

import defpackage.ot3;
import defpackage.qt3;
import defpackage.r26;
import defpackage.ut3;
import defpackage.yt3;
import defpackage.zq3;
import defpackage.zt6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class b implements KSerializer {
    public static final b a = new b();
    private static final SerialDescriptor b = SerialDescriptorsKt.e("kotlinx.serialization.json.JsonPrimitive", r26.i.a, new SerialDescriptor[0], null, 8, null);

    private b() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonPrimitive deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        JsonElement h = ot3.d(decoder).h();
        if (h instanceof JsonPrimitive) {
            return (JsonPrimitive) h;
        }
        throw qt3.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + zt6.b(h.getClass()), h.toString());
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonPrimitive jsonPrimitive) {
        zq3.h(encoder, "encoder");
        zq3.h(jsonPrimitive, "value");
        ot3.h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.t(yt3.a, JsonNull.INSTANCE);
        } else {
            encoder.t(a.a, (ut3) jsonPrimitive);
        }
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
