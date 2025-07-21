package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class dd7 {
    private final List a = new ArrayList();
    private bz6 b = bz6.g();
    private Supplier c = new Supplier() { // from class: cd7
        @Override // java.util.function.Supplier
        public final Object get() {
            return k84.b();
        }
    };
    private yl0 d = yl0.a();

    dd7() {
    }

    public dd7 a(u84 u84Var) {
        Objects.requireNonNull(u84Var, "processor");
        this.a.add(u84Var);
        return this;
    }

    public dd7 b(bz6 bz6Var) {
        Objects.requireNonNull(bz6Var, "resource");
        this.b = this.b.l(bz6Var);
        return this;
    }

    public bd7 c() {
        return new bd7(this.b, this.c, this.a, this.d);
    }

    public dd7 d(yl0 yl0Var) {
        Objects.requireNonNull(yl0Var, "clock");
        this.d = yl0Var;
        return this;
    }
}
