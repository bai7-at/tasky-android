package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class quf {
    private HashMap a = new HashMap();

    public final gvf a() {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        gvf gvfVar = new gvf(Collections.unmodifiableMap(this.a), null);
        this.a = null;
        return gvfVar;
    }
}
