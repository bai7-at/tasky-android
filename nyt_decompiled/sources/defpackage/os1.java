package defpackage;

import androidx.compose.runtime.saveable.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class os1 implements a {
    private final qs2 a;
    private final /* synthetic */ a b;

    public os1(a aVar, qs2 qs2Var) {
        this.a = qs2Var;
        this.b = aVar;
    }

    @Override // androidx.compose.runtime.saveable.a
    public boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.a
    public a.InterfaceC0052a b(String str, qs2 qs2Var) {
        return this.b.b(str, qs2Var);
    }

    public final void c() {
        this.a.mo865invoke();
    }

    @Override // androidx.compose.runtime.saveable.a
    public Map d() {
        return this.b.d();
    }

    @Override // androidx.compose.runtime.saveable.a
    public Object e(String str) {
        return this.b.e(str);
    }
}
