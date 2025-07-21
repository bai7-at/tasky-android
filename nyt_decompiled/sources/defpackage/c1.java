package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
abstract class c1 implements uq0 {
    c1() {
    }

    @Override // defpackage.uq0
    public Object a(Class cls) {
        q76 d = d(cls);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    @Override // defpackage.uq0
    public Set c(Class cls) {
        return (Set) b(cls).get();
    }
}
