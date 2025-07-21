package kotlinx.serialization.encoding;

import defpackage.nk7;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public interface d {

    public static final class a {
        public static boolean a(d dVar, SerialDescriptor serialDescriptor, int i) {
            zq3.h(serialDescriptor, "descriptor");
            return true;
        }
    }

    boolean A(SerialDescriptor serialDescriptor, int i);

    void D(SerialDescriptor serialDescriptor, int i, short s);

    void E(SerialDescriptor serialDescriptor, int i, double d);

    void F(SerialDescriptor serialDescriptor, int i, long j);

    void c(SerialDescriptor serialDescriptor);

    Encoder e(SerialDescriptor serialDescriptor, int i);

    void l(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj);

    void m(SerialDescriptor serialDescriptor, int i, char c);

    void o(SerialDescriptor serialDescriptor, int i, byte b);

    void r(SerialDescriptor serialDescriptor, int i, float f);

    void w(SerialDescriptor serialDescriptor, int i, int i2);

    void x(SerialDescriptor serialDescriptor, int i, boolean z);

    void y(SerialDescriptor serialDescriptor, int i, String str);

    void z(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj);
}
