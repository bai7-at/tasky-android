package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ObjectSerializer;

/* loaded from: classes5.dex */
public final class ax8 implements KSerializer {
    public static final ax8 b = new ax8();
    private final /* synthetic */ ObjectSerializer a = new ObjectSerializer("kotlin.Unit", ww8.a);

    private ax8() {
    }

    public void a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        this.a.deserialize(decoder);
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ww8 ww8Var) {
        zq3.h(encoder, "encoder");
        zq3.h(ww8Var, "value");
        this.a.serialize(encoder, ww8Var);
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        a(decoder);
        return ww8.a;
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }
}
