package kotlinx.serialization.json;

import defpackage.he0;
import defpackage.ot3;
import defpackage.pv8;
import defpackage.qt3;
import defpackage.r26;
import defpackage.ut3;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.text.h;
import kotlin.text.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
final class a implements KSerializer {
    public static final a a = new a();
    private static final SerialDescriptor b = SerialDescriptorsKt.a("kotlinx.serialization.json.JsonLiteral", r26.i.a);

    private a() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ut3 deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        JsonElement h = ot3.d(decoder).h();
        if (h instanceof ut3) {
            return (ut3) h;
        }
        throw qt3.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + zt6.b(h.getClass()), h.toString());
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ut3 ut3Var) {
        zq3.h(encoder, "encoder");
        zq3.h(ut3Var, "value");
        ot3.h(encoder);
        if (ut3Var.f()) {
            encoder.G(ut3Var.a());
            return;
        }
        if (ut3Var.c() != null) {
            encoder.j(ut3Var.c()).G(ut3Var.a());
            return;
        }
        Long n = h.n(ut3Var.a());
        if (n != null) {
            encoder.k(n.longValue());
            return;
        }
        pv8 h = s.h(ut3Var.a());
        if (h != null) {
            encoder.j(he0.G(pv8.b).getDescriptor()).k(h.g());
            return;
        }
        Double i = h.i(ut3Var.a());
        if (i != null) {
            encoder.f(i.doubleValue());
            return;
        }
        Boolean b1 = h.b1(ut3Var.a());
        if (b1 != null) {
            encoder.q(b1.booleanValue());
        } else {
            encoder.G(ut3Var.a());
        }
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
