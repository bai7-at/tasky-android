package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class kv8 implements KSerializer {
    public static final kv8 a = new kv8();
    private static final SerialDescriptor b = zj3.a("kotlin.UByte", he0.w(mf0.a));

    private kv8() {
    }

    public byte a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return hv8.b(decoder.q(getDescriptor()).H());
    }

    public void b(Encoder encoder, byte b2) {
        zq3.h(encoder, "encoder");
        encoder.j(getDescriptor()).g(b2);
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return hv8.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((hv8) obj).f());
    }
}
