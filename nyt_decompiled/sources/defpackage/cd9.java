package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class cd9 extends c2 {
    private static final ThreadLocal d = new a();
    private static final AtomicLong e = new AtomicLong();
    private final Thread b;
    private final boolean c;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b();
        }
    }

    static final class b {
        private Object a;
        private int b;

        b() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ((b) obj).a == this.a;
            }
            lh4.a(obj);
            throw null;
        }

        public int hashCode() {
            return this.b;
        }
    }

    public cd9(boolean z, boolean z2, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.c = z2;
        if (!z) {
            this.b = null;
            return;
        }
        Thread thread = new Thread(this);
        this.b = thread;
        thread.setName("weak-ref-cleaner-" + e.getAndIncrement());
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    @Override // defpackage.c2
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.c2, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // defpackage.c2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
