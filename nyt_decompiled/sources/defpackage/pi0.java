package defpackage;

import defpackage.pi0;
import defpackage.xc1;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
abstract class pi0 implements vb8 {
    private final ArrayDeque a = new ArrayDeque();
    private final ArrayDeque b;
    private final PriorityQueue c;
    private b d;
    private long e;
    private long f;

    private static final class b extends yb8 implements Comparable {
        private long j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (l() != bVar.l()) {
                return l() ? 1 : -1;
            }
            long j = this.e - bVar.e;
            if (j == 0) {
                j = this.j - bVar.j;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends zb8 {
        private xc1.a f;

        public c(xc1.a aVar) {
            this.f = aVar;
        }

        @Override // defpackage.xc1
        public final void s() {
            this.f.a(this);
        }
    }

    public pi0() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c(new xc1.a() { // from class: oi0
                @Override // xc1.a
                public final void a(xc1 xc1Var) {
                    pi0.this.n((pi0.c) xc1Var);
                }
            }));
        }
        this.c = new PriorityQueue();
    }

    private void m(b bVar) {
        bVar.f();
        this.a.add(bVar);
    }

    @Override // defpackage.vb8
    public void a(long j) {
        this.e = j;
    }

    protected abstract ub8 e();

    protected abstract void f(yb8 yb8Var);

    @Override // defpackage.vc1
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            m((b) z19.j((b) this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            m(bVar);
            this.d = null;
        }
    }

    @Override // defpackage.vc1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public yb8 d() {
        ur.g(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.a.pollFirst();
        this.d = bVar;
        return bVar;
    }

    @Override // defpackage.vc1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public zb8 b() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) z19.j((b) this.c.peek())).e <= this.e) {
            b bVar = (b) z19.j((b) this.c.poll());
            if (bVar.l()) {
                zb8 zb8Var = (zb8) z19.j((zb8) this.b.pollFirst());
                zb8Var.e(4);
                m(bVar);
                return zb8Var;
            }
            f(bVar);
            if (k()) {
                ub8 e = e();
                zb8 zb8Var2 = (zb8) z19.j((zb8) this.b.pollFirst());
                zb8Var2.t(bVar.e, e, Long.MAX_VALUE);
                m(bVar);
                return zb8Var2;
            }
            m(bVar);
        }
        return null;
    }

    protected final zb8 i() {
        return (zb8) this.b.pollFirst();
    }

    protected final long j() {
        return this.e;
    }

    protected abstract boolean k();

    @Override // defpackage.vc1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(yb8 yb8Var) {
        ur.a(yb8Var == this.d);
        b bVar = (b) yb8Var;
        if (bVar.k()) {
            m(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.j = j;
            this.c.add(bVar);
        }
        this.d = null;
    }

    protected void n(zb8 zb8Var) {
        zb8Var.f();
        this.b.add(zb8Var);
    }

    @Override // defpackage.vc1
    public void release() {
    }
}
