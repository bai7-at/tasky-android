package defpackage;

import kotlin.text.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class ho0 implements KSerializer {
    public static final ho0 a = new ho0();
    private static final SerialDescriptor b = SerialDescriptorsKt.c("Color", new SerialDescriptor[0], null, 4, null);
    public static final int c = 8;

    private ho0() {
    }

    public long a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return wn0.d(Long.parseLong(decoder.A(), a.a(16)));
    }

    public void b(Encoder encoder, long j) {
        zq3.h(encoder, "encoder");
        encoder.G(nn0.A(j));
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return nn0.j(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((nn0) obj).B());
    }
}
