package defpackage;

import java.util.ArrayList;
import kotlin.collections.i;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class xf8 implements Encoder, d {
    private final ArrayList a = new ArrayList();

    private final boolean H(SerialDescriptor serialDescriptor, int i) {
        Z(X(serialDescriptor, i));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void C(int i) {
        Q(Y(), i);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void D(SerialDescriptor serialDescriptor, int i, short s) {
        zq3.h(serialDescriptor, "descriptor");
        S(X(serialDescriptor, i), s);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void E(SerialDescriptor serialDescriptor, int i, double d) {
        zq3.h(serialDescriptor, "descriptor");
        M(X(serialDescriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void F(SerialDescriptor serialDescriptor, int i, long j) {
        zq3.h(serialDescriptor, "descriptor");
        R(X(serialDescriptor, i), j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void G(String str) {
        zq3.h(str, "value");
        T(Y(), str);
    }

    public void I(nk7 nk7Var, Object obj) {
        Encoder.a.c(this, nk7Var, obj);
    }

    protected abstract void J(Object obj, boolean z);

    protected abstract void K(Object obj, byte b);

    protected abstract void L(Object obj, char c);

    protected abstract void M(Object obj, double d);

    protected abstract void N(Object obj, SerialDescriptor serialDescriptor, int i);

    protected abstract void O(Object obj, float f);

    protected Encoder P(Object obj, SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    protected abstract void Q(Object obj, int i);

    protected abstract void R(Object obj, long j);

    protected abstract void S(Object obj, short s);

    protected abstract void T(Object obj, String str);

    protected abstract void U(SerialDescriptor serialDescriptor);

    protected final Object V() {
        return i.w0(this.a);
    }

    protected final Object W() {
        return i.y0(this.a);
    }

    protected abstract Object X(SerialDescriptor serialDescriptor, int i);

    protected final Object Y() {
        if (this.a.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList arrayList = this.a;
        return arrayList.remove(i.n(arrayList));
    }

    protected final void Z(Object obj) {
        this.a.add(obj);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        if (!this.a.isEmpty()) {
            Y();
        }
        U(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.d
    public final Encoder e(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return P(X(serialDescriptor, i), serialDescriptor.h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(double d) {
        M(Y(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        K(Y(), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public d h(SerialDescriptor serialDescriptor, int i) {
        return Encoder.a.a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "enumDescriptor");
        N(Y(), serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return P(Y(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(long j) {
        R(Y(), j);
    }

    public void l(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(nk7Var, "serializer");
        if (H(serialDescriptor, i)) {
            I(nk7Var, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void m(SerialDescriptor serialDescriptor, int i, char c) {
        zq3.h(serialDescriptor, "descriptor");
        L(X(serialDescriptor, i), c);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void o(SerialDescriptor serialDescriptor, int i, byte b) {
        zq3.h(serialDescriptor, "descriptor");
        K(X(serialDescriptor, i), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void p(short s) {
        S(Y(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void q(boolean z) {
        J(Y(), z);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void r(SerialDescriptor serialDescriptor, int i, float f) {
        zq3.h(serialDescriptor, "descriptor");
        O(X(serialDescriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void s(float f) {
        O(Y(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void t(nk7 nk7Var, Object obj);

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(char c) {
        L(Y(), c);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void w(SerialDescriptor serialDescriptor, int i, int i2) {
        zq3.h(serialDescriptor, "descriptor");
        Q(X(serialDescriptor, i), i2);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void x(SerialDescriptor serialDescriptor, int i, boolean z) {
        zq3.h(serialDescriptor, "descriptor");
        J(X(serialDescriptor, i), z);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void y(SerialDescriptor serialDescriptor, int i, String str) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(str, "value");
        T(X(serialDescriptor, i), str);
    }

    @Override // kotlinx.serialization.encoding.d
    public void z(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(nk7Var, "serializer");
        if (H(serialDescriptor, i)) {
            t(nk7Var, obj);
        }
    }
}
