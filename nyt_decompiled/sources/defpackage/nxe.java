package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class nxe {
    private HashMap a = new HashMap();

    public final pxe a() {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        pxe pxeVar = new pxe(Collections.unmodifiableMap(this.a), null);
        this.a = null;
        return pxeVar;
    }
}
