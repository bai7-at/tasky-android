package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class gzf {
    private final fw9 a;
    private final Map b = new HashMap();
    private final Set c = new HashSet();
    private final Map d = new HashMap();
    private hye e;

    public gzf(fw9 fw9Var) {
        this.a = fw9Var;
    }

    public final void a(hye hyeVar) {
        if (hyeVar != this.e) {
            this.e = hyeVar;
            this.b.clear();
            this.d.clear();
        }
    }
}
