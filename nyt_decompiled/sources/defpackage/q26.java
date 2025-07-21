package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class q26 extends in0 {
    private final SerialDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q26(KSerializer kSerializer) {
        super(kSerializer, null);
        zq3.h(kSerializer, "primitiveSerializer");
        this.b = new p26(kSerializer.getDescriptor());
    }

    @Override // defpackage.b1
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.b1, defpackage.ym1
    public final Object deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // defpackage.in0, kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final o26 a() {
        return (o26) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(o26 o26Var) {
        zq3.h(o26Var, "<this>");
        return o26Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(o26 o26Var, int i) {
        zq3.h(o26Var, "<this>");
        o26Var.b(i);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(o26 o26Var, int i, Object obj) {
        zq3.h(o26Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // defpackage.in0, defpackage.nk7
    public final void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        int e = e(obj);
        SerialDescriptor serialDescriptor = this.b;
        d h = encoder.h(serialDescriptor, e);
        u(h, obj, e);
        h.c(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(o26 o26Var) {
        zq3.h(o26Var, "<this>");
        return o26Var.a();
    }

    protected abstract void u(d dVar, Object obj, int i);
}
