package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;

/* loaded from: classes5.dex */
public abstract class b1 implements KSerializer {
    public /* synthetic */ b1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(b1 b1Var, c cVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        b1Var.h(cVar, i, obj, z);
    }

    private final int j(c cVar, Object obj) {
        int l = cVar.l(getDescriptor());
        c(obj, l);
        return l;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i);

    protected abstract Iterator d(Object obj);

    @Override // defpackage.ym1
    public Object deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Object obj);

    public final Object f(Decoder decoder, Object obj) {
        Object a;
        zq3.h(decoder, "decoder");
        if (obj == null || (a = k(obj)) == null) {
            a = a();
        }
        int b = b(a);
        c b2 = decoder.b(getDescriptor());
        if (!b2.p()) {
            while (true) {
                int o = b2.o(getDescriptor());
                if (o == -1) {
                    break;
                }
                i(this, b2, b + o, a, false, 8, null);
            }
        } else {
            g(b2, a, b, j(b2, a));
        }
        b2.c(getDescriptor());
        return l(a);
    }

    protected abstract void g(c cVar, Object obj, int i, int i2);

    protected abstract void h(c cVar, int i, Object obj, boolean z);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private b1() {
    }
}
