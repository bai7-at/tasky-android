package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface le8 {
    default void a(ej9 ej9Var) {
        zq3.h(ej9Var, "id");
        f(ej9Var.b(), ej9Var.a());
    }

    ke8 b(String str, int i);

    List c();

    default ke8 d(ej9 ej9Var) {
        zq3.h(ej9Var, "id");
        return b(ej9Var.b(), ej9Var.a());
    }

    void e(ke8 ke8Var);

    void f(String str, int i);

    void g(String str);
}
