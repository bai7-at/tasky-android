package defpackage;

import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ai1 implements vj {
    private final List a;
    private final int b;

    public ai1(List list, int i) {
        zq3.h(list, "interceptors");
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.vj
    public Flow a(xj xjVar) {
        zq3.h(xjVar, "request");
        if (this.b < this.a.size()) {
            return ((uj) this.a.get(this.b)).a(xjVar, new ai1(this.a, this.b + 1));
        }
        throw new IllegalStateException("Check failed.");
    }
}
