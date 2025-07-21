package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
abstract class c2 extends ReferenceQueue implements Runnable, Iterable {
    final ConcurrentMap a;

    private class b implements Iterator {
        private final Iterator a;
        private Map.Entry b;
        private Object c;

        private void b() {
            if (!this.a.hasNext()) {
                this.b = null;
                this.c = null;
            } else {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = entry;
                lh4.a(entry.getKey());
                throw null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = this.c;
            if (obj == null) {
                throw new NoSuchElementException();
            }
            try {
                return new c(obj, this.b);
            } finally {
                b();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(Iterator it2) {
            this.a = it2;
            b();
        }
    }

    private class c implements Map.Entry {
        private final Object a;
        final Map.Entry b;

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            return this.b.setValue(obj);
        }

        private c(Object obj, Map.Entry entry) {
            this.a = obj;
            this.b = entry;
        }
    }

    protected c2(ConcurrentMap concurrentMap) {
        this.a = concurrentMap;
    }

    public void a() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return;
            } else {
                this.a.remove(poll);
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(this.a.entrySet().iterator());
    }

    public String toString() {
        return this.a.toString();
    }
}
