package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class sv8 implements KSerializer {
    public static final sv8 a = new sv8();
    private static final SerialDescriptor b = zj3.a("kotlin.ULong", he0.B(xa4.a));

    private sv8() {
    }

    public long a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return pv8.b(decoder.q(getDescriptor()).m());
    }

    public void b(Encoder encoder, long j) {
        zq3.h(encoder, "encoder");
        encoder.j(getDescriptor()).k(j);
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return pv8.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((pv8) obj).g());
    }
}
