package kotlinx.serialization.descriptors;

import defpackage.hk7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public interface SerialDescriptor {

    public static final class a {
        public static List a(SerialDescriptor serialDescriptor) {
            return i.l();
        }

        public static boolean b(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean c(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    boolean b();

    int c(String str);

    hk7 d();

    int e();

    String f(int i);

    List g(int i);

    List getAnnotations();

    SerialDescriptor h(int i);

    String i();

    boolean isInline();

    boolean j(int i);
}
