package defpackage;

import defpackage.r26;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class uw1 implements KSerializer {
    public static final uw1 a = new uw1();
    private static final SerialDescriptor b = new s26("kotlin.time.Duration", r26.i.a);

    private uw1() {
    }

    public long a(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return b.b.g(decoder.A());
    }

    public void b(Encoder encoder, long j) {
        zq3.h(encoder, "encoder");
        encoder.G(b.J(j));
    }

    @Override // defpackage.ym1
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return b.f(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((b) obj).N());
    }
}
