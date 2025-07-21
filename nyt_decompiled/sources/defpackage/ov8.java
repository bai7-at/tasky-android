package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class ov8 implements KSerializer {
    public static final ov8 a = new ov8();
    private static final SerialDescriptor b = zj3.a("kotlin.UInt", he0.A(om3.a));

    private ov8() {
    }

    public int a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return lv8.b(decoder.q(getDescriptor()).i());
    }

    public void b(Encoder encoder, int i) {
        zq3.h(encoder, "encoder");
        encoder.j(getDescriptor()).C(i);
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return lv8.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((lv8) obj).f());
    }
}
