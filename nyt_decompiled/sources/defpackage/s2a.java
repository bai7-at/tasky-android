package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class s2a {
    public static caa a(h5a h5aVar, caa caaVar, xhe xheVar, List list) {
        if (h5aVar.W(caaVar.zzi())) {
            caa n = h5aVar.n(caaVar.zzi());
            if (n instanceof l1a) {
                return ((l1a) n).b(xheVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", caaVar.zzi()));
        }
        if (!"hasOwnProperty".equals(caaVar.zzi())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", caaVar.zzi()));
        }
        s0f.h("hasOwnProperty", 1, list);
        return h5aVar.W(xheVar.b((caa) list.get(0)).zzi()) ? caa.b0 : caa.c0;
    }

    public static Iterator b(Map map) {
        return new b4a(map.keySet().iterator());
    }
}
