package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class ru3 {
    public static final Object a(at3 at3Var, ym1 ym1Var, InputStream inputStream) {
        zq3.h(at3Var, "<this>");
        zq3.h(ym1Var, "deserializer");
        zq3.h(inputStream, "stream");
        hs3 hs3Var = new hs3(inputStream);
        try {
            return fu3.a(at3Var, ym1Var, hs3Var);
        } finally {
            hs3Var.b();
        }
    }
}
