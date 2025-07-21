package kotlinx.serialization.encoding;

import defpackage.uk7;
import defpackage.ym1;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, SerialDescriptor serialDescriptor) {
            zq3.h(serialDescriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return cVar.y(serialDescriptor, i, ym1Var, obj);
        }
    }

    char B(SerialDescriptor serialDescriptor, int i);

    byte C(SerialDescriptor serialDescriptor, int i);

    boolean D(SerialDescriptor serialDescriptor, int i);

    short F(SerialDescriptor serialDescriptor, int i);

    double G(SerialDescriptor serialDescriptor, int i);

    uk7 a();

    void c(SerialDescriptor serialDescriptor);

    long f(SerialDescriptor serialDescriptor, int i);

    Object g(SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj);

    int j(SerialDescriptor serialDescriptor, int i);

    int l(SerialDescriptor serialDescriptor);

    String n(SerialDescriptor serialDescriptor, int i);

    int o(SerialDescriptor serialDescriptor);

    boolean p();

    Decoder r(SerialDescriptor serialDescriptor, int i);

    float u(SerialDescriptor serialDescriptor, int i);

    Object y(SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj);
}
