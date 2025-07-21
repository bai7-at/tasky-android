package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class zs8 extends vs8 {
    private final rr5 d;

    public zs8(rr5 rr5Var) {
        this.d = rr5Var;
    }

    @Override // java.util.Iterator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        op0.a(h());
        o(g() + 2);
        return new iy4(this.d, f()[g() - 2], f()[g() - 1]);
    }
}
