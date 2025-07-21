package defpackage;

import java.util.Queue;

/* loaded from: classes2.dex */
public class xu4 {
    private final gd4 a;

    class a extends gd4 {
        a(long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.gd4
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {
        private static final Queue d = x19.e(0);
        private int a;
        private int b;
        private Object c;

        private b() {
        }

        static b a(Object obj, int i, int i2) {
            b bVar;
            Queue queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i, i2);
            return bVar;
        }

        private void b(Object obj, int i, int i2) {
            this.c = obj;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public xu4(long j) {
        this.a = new a(j);
    }

    public Object a(Object obj, int i, int i2) {
        b a2 = b.a(obj, i, i2);
        Object f = this.a.f(a2);
        a2.c();
        return f;
    }

    public void b(Object obj, int i, int i2, Object obj2) {
        this.a.j(b.a(obj, i, i2), obj2);
    }
}
