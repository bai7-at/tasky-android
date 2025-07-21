package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* loaded from: classes5.dex */
public abstract class hu3 implements KSerializer {
    private final KSerializer a;

    public hu3(KSerializer kSerializer) {
        zq3.h(kSerializer, "tSerializer");
        this.a = kSerializer;
    }

    protected abstract JsonElement a(JsonElement jsonElement);

    protected JsonElement b(JsonElement jsonElement) {
        zq3.h(jsonElement, "element");
        return jsonElement;
    }

    @Override // defpackage.ym1
    public final Object deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        lt3 d = ot3.d(decoder);
        return d.d().d(this.a, a(d.h()));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.nk7
    public final void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        pt3 e = ot3.e(encoder);
        e.B(b(TreeJsonEncoderKt.c(e.d(), obj, this.a)));
    }
}
