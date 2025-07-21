package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class dw8 implements KSerializer {
    public static final dw8 a = new dw8();
    private static final SerialDescriptor b = zj3.a("kotlin.UShort", he0.C(xq7.a));

    private dw8() {
    }

    public short a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return aw8.b(decoder.q(getDescriptor()).s());
    }

    public void b(Encoder encoder, short s) {
        zq3.h(encoder, "encoder");
        encoder.j(getDescriptor()).p(s);
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return aw8.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((aw8) obj).f());
    }
}
