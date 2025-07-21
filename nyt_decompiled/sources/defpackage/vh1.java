package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vh1 implements za3 {
    private final List a;
    private final int b;

    public vh1(List list, int i) {
        zq3.h(list, "interceptors");
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.za3
    public Object a(ab3 ab3Var, by0 by0Var) {
        if (this.b < this.a.size()) {
            return ((ya3) this.a.get(this.b)).a(ab3Var, new vh1(this.a, this.b + 1), by0Var);
        }
        throw new IllegalStateException("Check failed.");
    }
}
