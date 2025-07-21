package kotlinx.serialization.encoding;

import defpackage.ym1;
import defpackage.zq3;
import defpackage.zt6;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;

/* loaded from: classes5.dex */
public abstract class a implements Decoder, c {
    @Override // kotlinx.serialization.encoding.Decoder
    public String A() {
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.String");
        return (String) J;
    }

    @Override // kotlinx.serialization.encoding.c
    public final char B(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return x();
    }

    @Override // kotlinx.serialization.encoding.c
    public final byte C(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return H();
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean D(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.c
    public final short F(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return s();
    }

    @Override // kotlinx.serialization.encoding.c
    public final double G(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte H();

    public Object I(ym1 ym1Var, Object obj) {
        zq3.h(ym1Var, "deserializer");
        return z(ym1Var);
    }

    public Object J() {
        throw new SerializationException(zt6.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public c b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.c
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int e(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "enumDescriptor");
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J).intValue();
    }

    @Override // kotlinx.serialization.encoding.c
    public final long f(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return m();
    }

    @Override // kotlinx.serialization.encoding.c
    public final Object g(SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(ym1Var, "deserializer");
        return (ym1Var.getDescriptor().b() || E()) ? I(ym1Var, obj) : k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int i();

    @Override // kotlinx.serialization.encoding.c
    public final int j(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return i();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void k() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.c
    public int l(SerialDescriptor serialDescriptor) {
        return c.a.a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long m();

    @Override // kotlinx.serialization.encoding.c
    public final String n(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return A();
    }

    @Override // kotlinx.serialization.encoding.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder q(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.c
    public Decoder r(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return q(serialDescriptor.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short s();

    @Override // kotlinx.serialization.encoding.Decoder
    public float t() {
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J).floatValue();
    }

    @Override // kotlinx.serialization.encoding.c
    public final float u(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double v() {
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean w() {
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char x() {
        Object J = J();
        zq3.f(J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J).charValue();
    }

    @Override // kotlinx.serialization.encoding.c
    public Object y(SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(ym1Var, "deserializer");
        return I(ym1Var, obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object z(ym1 ym1Var) {
        return Decoder.a.a(this, ym1Var);
    }
}
