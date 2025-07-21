package androidx.compose.runtime.snapshots;

import defpackage.cv3;
import defpackage.yu3;
import defpackage.zq3;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class m extends n implements Iterator, yu3 {

    public static final class a implements Map.Entry, cv3.a {
        private final Object a;
        private Object b;

        a() {
            Map.Entry g = m.this.g();
            zq3.e(g);
            this.a = g.getKey();
            Map.Entry g2 = m.this.g();
            zq3.e(g2);
            this.b = g2.getValue();
        }

        public void a(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m mVar = m.this;
            if (mVar.h().d() != ((n) mVar).c) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            mVar.h().put(getKey(), obj);
            a(obj);
            return value;
        }
    }

    public m(k kVar, Iterator it2) {
        super(kVar, it2);
    }

    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        f();
        if (g() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
