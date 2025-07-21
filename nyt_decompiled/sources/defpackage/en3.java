package defpackage;

import defpackage.r26;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class en3 implements KSerializer {
    public static final en3 a = new en3();
    private static final SerialDescriptor b = new s26("kotlin.Int", r26.f.a);

    private en3() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return Integer.valueOf(decoder.i());
    }

    public void b(Encoder encoder, int i) {
        zq3.h(encoder, "encoder");
        encoder.C(i);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.nk7
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).intValue());
    }
}
