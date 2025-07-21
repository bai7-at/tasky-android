package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final class pr0 {
    private final Map a = new ConcurrentHashMap();
    private final Map b = new ConcurrentHashMap();
    private final Map c = new ConcurrentHashMap();
    private final Map d = new ConcurrentHashMap();
    private final Object e = new Object();
    private final Set f = Collections.newSetFromMap(new IdentityHashMap());
    private final Function g;

    public pr0(Function function) {
        this.g = function;
    }

    private Object i(lm3 lm3Var) {
        Object apply = this.g.apply(lm3Var);
        synchronized (this.e) {
            this.f.add(apply);
        }
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map k(String str) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l(String str) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(String str, String str2, hv hvVar, String str3) {
        return i(lm3.a(str).d(str2).c(str3).b(hvVar).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map n(String str) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(String str, hv hvVar, String str2) {
        return i(lm3.a(str).d(str2).b(hvVar).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map p(String str) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(String str, hv hvVar, String str2) {
        return i(lm3.a(str).c(str2).b(hvVar).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(hv hvVar, String str) {
        return i(lm3.a(str).b(hvVar).a());
    }

    public Object j(final String str, final String str2, String str3, final hv hvVar) {
        return (str2 == null || str3 == null) ? str2 != null ? ((Map) this.b.computeIfAbsent(str, new Function() { // from class: jr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map n;
                n = pr0.n((String) obj);
                return n;
            }
        })).computeIfAbsent(str2, new Function() { // from class: kr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object o;
                o = pr0.this.o(str, hvVar, (String) obj);
                return o;
            }
        }) : str3 != null ? ((Map) this.c.computeIfAbsent(str, new Function() { // from class: lr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map p;
                p = pr0.p((String) obj);
                return p;
            }
        })).computeIfAbsent(str3, new Function() { // from class: mr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object q;
                q = pr0.this.q(str, hvVar, (String) obj);
                return q;
            }
        }) : this.a.computeIfAbsent(str, new Function() { // from class: nr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object r;
                r = pr0.this.r(hvVar, (String) obj);
                return r;
            }
        }) : ((Map) ((Map) this.d.computeIfAbsent(str, new Function() { // from class: gr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map k;
                k = pr0.k((String) obj);
                return k;
            }
        })).computeIfAbsent(str2, new Function() { // from class: hr0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map l;
                l = pr0.l((String) obj);
                return l;
            }
        })).computeIfAbsent(str3, new Function() { // from class: ir0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object m;
                m = pr0.this.m(str, str2, hvVar, (String) obj);
                return m;
            }
        });
    }
}
