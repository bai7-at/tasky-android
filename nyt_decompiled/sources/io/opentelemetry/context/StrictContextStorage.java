package io.opentelemetry.context;

import defpackage.cd9;
import defpackage.hx0;
import defpackage.lh4;
import io.opentelemetry.context.StrictContextStorage;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes5.dex */
final class StrictContextStorage implements b, AutoCloseable {
    private static final Logger c = Logger.getLogger(StrictContextStorage.class.getName());
    private final b a;
    private final a b = a.e();

    static class CallerStackTrace extends Throwable {
    }

    static class a extends cd9 {
        private final ConcurrentHashMap f;

        a(ConcurrentHashMap concurrentHashMap) {
            super(false, false, concurrentHashMap);
            this.f = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }

        static a e() {
            return new a(new ConcurrentHashMap());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean g(CallerStackTrace callerStackTrace) {
            throw null;
        }

        List f() {
            List list = (List) this.f.values().stream().filter(new Predicate() { // from class: io.opentelemetry.context.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean g;
                    lh4.a(obj);
                    g = StrictContextStorage.a.g(null);
                    return g;
                }
            }).collect(Collectors.toList());
            this.f.clear();
            return list;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.interrupted()) {
                try {
                    Reference remove = remove();
                    if (remove != null) {
                        lh4.a(this.f.remove(remove));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    private StrictContextStorage(b bVar) {
        this.a = bVar;
    }

    static AssertionError b(CallerStackTrace callerStackTrace) {
        new StringBuilder().append("Thread [");
        throw null;
    }

    static StrictContextStorage d(b bVar) {
        return new StrictContextStorage(bVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.b.a();
        List f = this.b.f();
        if (f.isEmpty()) {
            return;
        }
        if (f.size() > 1) {
            c.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it2 = f.iterator();
            while (it2.hasNext()) {
                lh4.a(it2.next());
                c.log(Level.SEVERE, "Scope leaked", (Throwable) b(null));
            }
        }
        lh4.a(f.get(0));
        throw b(null);
    }

    @Override // io.opentelemetry.context.b
    public hx0 current() {
        return this.a.current();
    }
}
