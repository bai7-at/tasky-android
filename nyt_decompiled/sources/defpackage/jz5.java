package defpackage;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;

/* loaded from: classes5.dex */
public abstract class jz5 {
    public static final ym1 a(t1 t1Var, c cVar, String str) {
        zq3.h(t1Var, "<this>");
        zq3.h(cVar, "decoder");
        ym1 c = t1Var.c(cVar, str);
        if (c != null) {
            return c;
        }
        u1.b(str, t1Var.e());
        throw new KotlinNothingValueException();
    }

    public static final nk7 b(t1 t1Var, Encoder encoder, Object obj) {
        zq3.h(t1Var, "<this>");
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        nk7 d = t1Var.d(encoder, obj);
        if (d != null) {
            return d;
        }
        u1.a(zt6.b(obj.getClass()), t1Var.e());
        throw new KotlinNothingValueException();
    }
}
