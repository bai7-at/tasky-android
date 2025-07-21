package kotlinx.serialization.encoding;

import defpackage.nk7;
import defpackage.y65;
import defpackage.zq3;
import defpackage.zt6;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class b implements Encoder, d {
    @Override // kotlinx.serialization.encoding.d
    public boolean A(SerialDescriptor serialDescriptor, int i) {
        return d.a.a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C(int i) {
        J(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.d
    public final void D(SerialDescriptor serialDescriptor, int i, short s) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            p(s);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void E(SerialDescriptor serialDescriptor, int i, double d) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            f(d);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void F(SerialDescriptor serialDescriptor, int i, long j) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            k(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void G(String str) {
        zq3.h(str, "value");
        J(str);
    }

    public boolean H(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return true;
    }

    public void I(nk7 nk7Var, Object obj) {
        Encoder.a.c(this, nk7Var, obj);
    }

    public void J(Object obj) {
        zq3.h(obj, "value");
        throw new SerializationException("Non-serializable " + zt6.b(obj.getClass()) + " is not supported by " + zt6.b(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public d b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.d
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.d
    public final Encoder e(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return H(serialDescriptor, i) ? j(serialDescriptor.h(i)) : y65.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f(double d) {
        J(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(byte b) {
        J(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public d h(SerialDescriptor serialDescriptor, int i) {
        return Encoder.a.a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void i(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "enumDescriptor");
        J(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(long j) {
        J(Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.d
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
        if (H(serialDescriptor, i)) {
            u(c);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.d
    public final void o(SerialDescriptor serialDescriptor, int i, byte b) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            g(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void p(short s) {
        J(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void q(boolean z) {
        J(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.d
    public final void r(SerialDescriptor serialDescriptor, int i, float f) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            s(f);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(float f) {
        J(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(nk7 nk7Var, Object obj) {
        Encoder.a.d(this, nk7Var, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(char c) {
        J(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v() {
        Encoder.a.b(this);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void w(SerialDescriptor serialDescriptor, int i, int i2) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            C(i2);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void x(SerialDescriptor serialDescriptor, int i, boolean z) {
        zq3.h(serialDescriptor, "descriptor");
        if (H(serialDescriptor, i)) {
            q(z);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void y(SerialDescriptor serialDescriptor, int i, String str) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(str, "value");
        if (H(serialDescriptor, i)) {
            G(str);
        }
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
