package defpackage;

import androidx.lifecycle.q;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes4.dex */
public final class na9 implements t.b {
    private final Map b;

    public na9(Map map) {
        zq3.h(map, "viewModels");
        this.b = map;
    }

    @Override // androidx.lifecycle.t.b
    public q a(Class cls) {
        zq3.h(cls, "modelClass");
        p76 p76Var = (p76) this.b.get(cls);
        q qVar = p76Var != null ? (q) p76Var.get() : null;
        zq3.f(qVar, "null cannot be cast to non-null type T of com.nytimes.subauth.ui.di.ViewModelFactory.create");
        return qVar;
    }
}
