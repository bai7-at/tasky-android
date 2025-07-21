package kotlinx.serialization.json;

import defpackage.au3;
import defpackage.cl0;
import defpackage.ct3;
import defpackage.hz5;
import defpackage.ot3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yt3;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class JsonElementSerializer implements KSerializer {
    public static final JsonElementSerializer a = new JsonElementSerializer();
    private static final SerialDescriptor b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonElement", hz5.b.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1
        public final void b(cl0 cl0Var) {
            SerialDescriptor f;
            SerialDescriptor f2;
            SerialDescriptor f3;
            SerialDescriptor f4;
            SerialDescriptor f5;
            zq3.h(cl0Var, "$this$buildSerialDescriptor");
            f = ot3.f(new qs2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerialDescriptor mo865invoke() {
                    return b.a.getDescriptor();
                }
            });
            cl0.b(cl0Var, "JsonPrimitive", f, null, false, 12, null);
            f2 = ot3.f(new qs2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.2
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerialDescriptor mo865invoke() {
                    return yt3.a.getDescriptor();
                }
            });
            cl0.b(cl0Var, "JsonNull", f2, null, false, 12, null);
            f3 = ot3.f(new qs2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.3
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerialDescriptor mo865invoke() {
                    return a.a.getDescriptor();
                }
            });
            cl0.b(cl0Var, "JsonLiteral", f3, null, false, 12, null);
            f4 = ot3.f(new qs2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.4
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerialDescriptor mo865invoke() {
                    return au3.a.getDescriptor();
                }
            });
            cl0.b(cl0Var, "JsonObject", f4, null, false, 12, null);
            f5 = ot3.f(new qs2() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.5
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerialDescriptor mo865invoke() {
                    return ct3.a.getDescriptor();
                }
            });
            cl0.b(cl0Var, "JsonArray", f5, null, false, 12, null);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((cl0) obj);
            return ww8.a;
        }
    });

    private JsonElementSerializer() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return ot3.d(decoder).h();
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonElement jsonElement) {
        zq3.h(encoder, "encoder");
        zq3.h(jsonElement, "value");
        ot3.h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.t(b.a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.t(au3.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.t(ct3.a, jsonElement);
        }
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
