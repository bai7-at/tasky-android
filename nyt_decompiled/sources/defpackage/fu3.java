package defpackage;

import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes5.dex */
public abstract class fu3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(at3 at3Var, ym1 ym1Var, jk7 jk7Var) {
        zq3.h(at3Var, "<this>");
        zq3.h(ym1Var, "deserializer");
        zq3.h(jk7Var, "reader");
        up6 up6Var = new up6(jk7Var, null, 2, 0 == true ? 1 : 0);
        try {
            Object z = new s38(at3Var, WriteMode.OBJ, up6Var, ym1Var.getDescriptor(), null).z(ym1Var);
            up6Var.x();
            return z;
        } finally {
            up6Var.X();
        }
    }

    public static final void b(at3 at3Var, ku3 ku3Var, nk7 nk7Var, Object obj) {
        zq3.h(at3Var, "<this>");
        zq3.h(ku3Var, "writer");
        zq3.h(nk7Var, "serializer");
        new t38(ku3Var, at3Var, WriteMode.OBJ, new pt3[WriteMode.values().length]).t(nk7Var, obj);
    }
}
