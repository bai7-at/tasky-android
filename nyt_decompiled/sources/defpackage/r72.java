package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes2.dex */
public final class r72 implements vb8 {
    private final z31 a = new z31();
    private final yb8 b = new yb8();
    private final Deque c = new ArrayDeque();
    private int d;
    private boolean e;

    class a extends zb8 {
        a() {
        }

        @Override // defpackage.xc1
        public void s() {
            r72.this.i(this);
        }
    }

    private static final class b implements ub8 {
        private final long a;
        private final ImmutableList b;

        public b(long j, ImmutableList immutableList) {
            this.a = j;
            this.b = immutableList;
        }

        @Override // defpackage.ub8
        public int a(long j) {
            return this.a > j ? 0 : -1;
        }

        @Override // defpackage.ub8
        public List b(long j) {
            return j >= this.a ? this.b : ImmutableList.x();
        }

        @Override // defpackage.ub8
        public long c(int i) {
            ur.a(i == 0);
            return this.a;
        }

        @Override // defpackage.ub8
        public int d() {
            return 1;
        }
    }

    public r72() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new a());
        }
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(zb8 zb8Var) {
        ur.g(this.c.size() < 2);
        ur.a(!this.c.contains(zb8Var));
        zb8Var.f();
        this.c.addFirst(zb8Var);
    }

    @Override // defpackage.vb8
    public void a(long j) {
    }

    @Override // defpackage.vc1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public yb8 d() {
        ur.g(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // defpackage.vc1
    public void flush() {
        ur.g(!this.e);
        this.b.f();
        this.d = 0;
    }

    @Override // defpackage.vc1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public zb8 b() {
        ur.g(!this.e);
        if (this.d != 2 || this.c.isEmpty()) {
            return null;
        }
        zb8 zb8Var = (zb8) this.c.removeFirst();
        if (this.b.l()) {
            zb8Var.e(4);
        } else {
            yb8 yb8Var = this.b;
            zb8Var.t(this.b.e, new b(yb8Var.e, this.a.a(((ByteBuffer) ur.e(yb8Var.c)).array())), 0L);
        }
        this.b.f();
        this.d = 0;
        return zb8Var;
    }

    @Override // defpackage.vc1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(yb8 yb8Var) {
        ur.g(!this.e);
        ur.g(this.d == 1);
        ur.a(this.b == yb8Var);
        this.d = 2;
    }

    @Override // defpackage.vc1
    public void release() {
        this.e = true;
    }
}
