package kotlinx.serialization.encoding;

import defpackage.ym1;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public interface Decoder {

    public static final class a {
        public static Object a(Decoder decoder, ym1 ym1Var) {
            zq3.h(ym1Var, "deserializer");
            return ym1Var.deserialize(decoder);
        }
    }

    String A();

    boolean E();

    byte H();

    c b(SerialDescriptor serialDescriptor);

    int e(SerialDescriptor serialDescriptor);

    int i();

    Void k();

    long m();

    Decoder q(SerialDescriptor serialDescriptor);

    short s();

    float t();

    double v();

    boolean w();

    char x();

    Object z(ym1 ym1Var);
}
