package defpackage;

import defpackage.eb7;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class bc5 {
    Queue a;
    final int b;
    final int c;
    private final long d;
    private final AtomicReference e;

    class a implements v3 {
        a() {
        }

        @Override // defpackage.v3
        public void call() {
            int size = bc5.this.a.size();
            bc5 bc5Var = bc5.this;
            int i = 0;
            if (size < bc5Var.b) {
                int i2 = bc5Var.c - size;
                while (i < i2) {
                    bc5 bc5Var2 = bc5.this;
                    bc5Var2.a.add(bc5Var2.a());
                    i++;
                }
                return;
            }
            int i3 = bc5Var.c;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    bc5.this.a.poll();
                    i++;
                }
            }
        }
    }

    public bc5() {
        this(0, 0, 67L);
    }

    private void b(int i) {
        if (mx8.b()) {
            this.a = new ww4(Math.max(this.c, 1024));
        } else {
            this.a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(a());
        }
    }

    protected abstract Object a();

    public void c() {
        eb7.a a2 = mb7.a().a();
        if (!kz4.a(this.e, null, a2)) {
            a2.unsubscribe();
            return;
        }
        a aVar = new a();
        long j = this.d;
        a2.d(aVar, j, j, TimeUnit.SECONDS);
    }

    private bc5(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = new AtomicReference();
        b(i);
        c();
    }
}
