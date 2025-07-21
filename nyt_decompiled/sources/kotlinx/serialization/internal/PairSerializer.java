package kotlinx.serialization.internal;

import defpackage.cl0;
import defpackage.du8;
import defpackage.lw3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* loaded from: classes5.dex */
public final class PairSerializer extends lw3 {
    private final SerialDescriptor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(final KSerializer kSerializer, final KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        zq3.h(kSerializer, "keySerializer");
        zq3.h(kSerializer2, "valueSerializer");
        this.c = SerialDescriptorsKt.b("kotlin.Pair", new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(cl0 cl0Var) {
                zq3.h(cl0Var, "$this$buildClassSerialDescriptor");
                cl0.b(cl0Var, "first", KSerializer.this.getDescriptor(), null, false, 12, null);
                cl0.b(cl0Var, "second", kSerializer2.getDescriptor(), null, false, 12, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cl0) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(Pair pair) {
        zq3.h(pair, "<this>");
        return pair.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(Pair pair) {
        zq3.h(pair, "<this>");
        return pair.d();
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair e(Object obj, Object obj2) {
        return du8.a(obj, obj2);
    }
}
