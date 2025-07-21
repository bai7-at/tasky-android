package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
final class suf {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    suf() {
    }

    public final void a(bsf bsfVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(bsfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(og8 og8Var) {
        bsf bsfVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            bsfVar = (bsf) this.b.poll();
                            if (bsfVar == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    bsfVar.b(og8Var);
                }
            }
        }
    }
}
