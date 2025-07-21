package defpackage;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes5.dex */
public final class jd7 implements et4, Closeable {
    private static final Logger g = Logger.getLogger(jd7.class.getName());
    private final List a;
    private final List b;
    private final List c;
    private final ft4 d;
    private final pr0 e;
    private final AtomicBoolean f = new AtomicBoolean(false);

    private static class b {
        private final pr0 a;
        private final ft4 b;
        private final yu6 c;

        b(pr0 pr0Var, ft4 ft4Var, yu6 yu6Var) {
            this.a = pr0Var;
            this.b = ft4Var;
            this.c = yu6Var;
        }
    }

    private static class c {
        private final List a;
        private final ft4 b;

        private c(List list, ft4 ft4Var) {
            this.a = list;
            this.b = ft4Var;
        }
    }

    jd7(final List list, IdentityHashMap identityHashMap, List list2, yl0 yl0Var, bz6 bz6Var, t62 t62Var) {
        long now = yl0Var.now();
        this.a = list;
        List list3 = (List) identityHashMap.entrySet().stream().map(new Function() { // from class: gd7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                yu6 j;
                j = jd7.j(list, (Map.Entry) obj);
                return j;
            }
        }).collect(Collectors.toList());
        this.b = list3;
        this.c = list2;
        ft4 a2 = ft4.a(yl0Var, bz6Var, t62Var, now);
        this.d = a2;
        pr0 pr0Var = new pr0(new Function() { // from class: hd7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ed7 l;
                l = jd7.this.l((lm3) obj);
                return l;
            }
        });
        this.e = pr0Var;
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            yu6 yu6Var = (yu6) it2.next();
            ArrayList arrayList = new ArrayList(list2);
            arrayList.add(new b(pr0Var, a2, yu6Var));
            yu6Var.b();
            new c(arrayList, a2);
            throw null;
        }
    }

    public static kd7 i() {
        return new kd7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yu6 j(List list, Map.Entry entry) {
        lh4.a(entry.getKey());
        lh4.a(entry.getKey());
        lh4.a(entry.getValue());
        return yu6.a(null, hb9.a(null, null, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ed7 l(lm3 lm3Var) {
        return new ed7(this.d, lm3Var, this.b);
    }

    @Override // defpackage.et4
    public dt4 b(String str) {
        if (this.b.isEmpty()) {
            return et4.a().b(str);
        }
        if (str == null || str.isEmpty()) {
            g.fine("Meter requested without instrumentation scope name.");
            str = DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        return new fd7(this.e, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    public gq0 shutdown() {
        if (!this.f.compareAndSet(false, true)) {
            g.info("Multiple close calls");
            return gq0.i();
        }
        if (this.b.isEmpty()) {
            return gq0.i();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.b.iterator();
        if (!it2.hasNext()) {
            return gq0.g(arrayList);
        }
        ((yu6) it2.next()).b();
        throw null;
    }

    public String toString() {
        return "SdkMeterProvider{clock=" + this.d.b() + ", resource=" + this.d.d() + ", metricReaders=" + this.b.stream().map(new Function() { // from class: id7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ((yu6) obj).b();
                return null;
            }
        }).collect(Collectors.toList()) + ", metricProducers=" + this.c + ", views=" + this.a + "}";
    }
}
