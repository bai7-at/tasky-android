package androidx.compose.runtime.snapshots;

import defpackage.yu3;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class o extends n implements Iterator, yu3 {
    public o(k kVar, Iterator it2) {
        super(kVar, it2);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry i = i();
        if (i == null) {
            throw new IllegalStateException();
        }
        f();
        return i.getKey();
    }
}
