package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class wle {
    private final ConcurrentMap a;
    private final List b;
    private final sle c;
    private final Class d;
    private final pxe e;

    /* synthetic */ wle(ConcurrentMap concurrentMap, List list, sle sleVar, pxe pxeVar, Class cls, vle vleVar) {
        this.a = concurrentMap;
        this.b = list;
        this.c = sleVar;
        this.d = cls;
        this.e = pxeVar;
    }

    public final sle a() {
        return this.c;
    }

    public final pxe b() {
        return this.e;
    }

    public final Class c() {
        return this.d;
    }

    public final Collection d() {
        return this.a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.a.get(new ule(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean f() {
        return !this.e.a().isEmpty();
    }
}
