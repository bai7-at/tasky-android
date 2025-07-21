package defpackage;

import java.util.Collection;

/* loaded from: classes5.dex */
final class t85 implements ey7 {
    private static final ey7 a = new t85();

    t85() {
    }

    static ey7 a() {
        return a;
    }

    @Override // defpackage.ey7
    public gq0 export(Collection collection) {
        return gq0.i();
    }

    @Override // defpackage.ey7
    public gq0 shutdown() {
        return gq0.i();
    }

    public String toString() {
        return "NoopSpanExporter{}";
    }
}
