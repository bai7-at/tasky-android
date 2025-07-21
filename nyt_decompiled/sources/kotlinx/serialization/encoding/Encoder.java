package kotlinx.serialization.encoding;

import defpackage.nk7;
import defpackage.uk7;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public interface Encoder {

    public static final class a {
        public static d a(Encoder encoder, SerialDescriptor serialDescriptor, int i) {
            zq3.h(serialDescriptor, "descriptor");
            return encoder.b(serialDescriptor);
        }

        public static void b(Encoder encoder) {
        }

        public static void c(Encoder encoder, nk7 nk7Var, Object obj) {
            zq3.h(nk7Var, "serializer");
            if (nk7Var.getDescriptor().b()) {
                encoder.t(nk7Var, obj);
            } else if (obj == null) {
                encoder.n();
            } else {
                encoder.v();
                encoder.t(nk7Var, obj);
            }
        }

        public static void d(Encoder encoder, nk7 nk7Var, Object obj) {
            zq3.h(nk7Var, "serializer");
            nk7Var.serialize(encoder, obj);
        }
    }

    void C(int i);

    void G(String str);

    uk7 a();

    d b(SerialDescriptor serialDescriptor);

    void f(double d);

    void g(byte b);

    d h(SerialDescriptor serialDescriptor, int i);

    void i(SerialDescriptor serialDescriptor, int i);

    Encoder j(SerialDescriptor serialDescriptor);

    void k(long j);

    void n();

    void p(short s);

    void q(boolean z);

    void s(float f);

    void t(nk7 nk7Var, Object obj);

    void u(char c);

    void v();
}
