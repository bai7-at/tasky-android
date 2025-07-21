package kotlinx.serialization.internal;

import defpackage.qs2;
import defpackage.ym1;
import defpackage.zq3;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;

/* loaded from: classes5.dex */
public abstract class TaggedDecoder implements Decoder, kotlinx.serialization.encoding.c {
    private final ArrayList a = new ArrayList();
    private boolean b;

    private final Object Y(Object obj, qs2 qs2Var) {
        X(obj);
        Object mo865invoke = qs2Var.mo865invoke();
        if (!this.b) {
            W();
        }
        this.b = false;
        return mo865invoke;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String A() {
        return T(W());
    }

    @Override // kotlinx.serialization.encoding.c
    public final char B(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return L(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public final byte C(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return K(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean D(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return J(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract boolean E();

    @Override // kotlinx.serialization.encoding.c
    public final short F(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return S(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public final double G(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return M(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte H() {
        return K(W());
    }

    protected Object I(ym1 ym1Var, Object obj) {
        zq3.h(ym1Var, "deserializer");
        return z(ym1Var);
    }

    protected abstract boolean J(Object obj);

    protected abstract byte K(Object obj);

    protected abstract char L(Object obj);

    protected abstract double M(Object obj);

    protected abstract int N(Object obj, SerialDescriptor serialDescriptor);

    protected abstract float O(Object obj);

    protected Decoder P(Object obj, SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract int Q(Object obj);

    protected abstract long R(Object obj);

    protected abstract short S(Object obj);

    protected abstract String T(Object obj);

    protected final Object U() {
        return kotlin.collections.i.y0(this.a);
    }

    protected abstract Object V(SerialDescriptor serialDescriptor, int i);

    protected final Object W() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(kotlin.collections.i.n(arrayList));
        this.b = true;
        return remove;
    }

    protected final void X(Object obj) {
        this.a.add(obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "enumDescriptor");
        return N(W(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.c
    public final long f(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return R(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public final Object g(SerialDescriptor serialDescriptor, int i, final ym1 ym1Var, final Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(ym1Var, "deserializer");
        return Y(V(serialDescriptor, i), new qs2() { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                return TaggedDecoder.this.E() ? TaggedDecoder.this.I(ym1Var, obj) : TaggedDecoder.this.k();
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int i() {
        return Q(W());
    }

    @Override // kotlinx.serialization.encoding.c
    public final int j(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return Q(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void k() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.c
    public int l(SerialDescriptor serialDescriptor) {
        return c.a.a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long m() {
        return R(W());
    }

    @Override // kotlinx.serialization.encoding.c
    public final String n(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return T(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder q(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return P(W(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.c
    public final Decoder r(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return P(V(serialDescriptor, i), serialDescriptor.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short s() {
        return S(W());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float t() {
        return O(W());
    }

    @Override // kotlinx.serialization.encoding.c
    public final float u(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return O(V(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double v() {
        return M(W());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean w() {
        return J(W());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char x() {
        return L(W());
    }

    @Override // kotlinx.serialization.encoding.c
    public final Object y(SerialDescriptor serialDescriptor, int i, final ym1 ym1Var, final Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(ym1Var, "deserializer");
        return Y(V(serialDescriptor, i), new qs2() { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                return TaggedDecoder.this.I(ym1Var, obj);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract Object z(ym1 ym1Var);
}
