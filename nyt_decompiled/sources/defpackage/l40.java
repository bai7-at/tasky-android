package defpackage;

import android.os.Handler;
import defpackage.l40;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface l40 {

    public interface a {

        /* renamed from: l40$a$a, reason: collision with other inner class name */
        public static final class C0502a {
            private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: l40$a$a$a, reason: collision with other inner class name */
            static final class C0503a {
                private final Handler a;
                private final a b;
                private boolean c;

                public C0503a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }

                public void d() {
                    this.c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0503a c0503a, int i, long j, long j2) {
                c0503a.b.q(i, j, j2);
            }

            public void b(Handler handler, a aVar) {
                ur.e(handler);
                ur.e(aVar);
                e(aVar);
                this.a.add(new C0503a(handler, aVar));
            }

            public void c(final int i, final long j, final long j2) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    final C0503a c0503a = (C0503a) it2.next();
                    if (!c0503a.c) {
                        c0503a.a.post(new Runnable() { // from class: k40
                            @Override // java.lang.Runnable
                            public final void run() {
                                l40.a.C0502a.d(l40.a.C0502a.C0503a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    C0503a c0503a = (C0503a) it2.next();
                    if (c0503a.b == aVar) {
                        c0503a.d();
                        this.a.remove(c0503a);
                    }
                }
            }
        }

        void q(int i, long j, long j2);
    }

    default long a() {
        return -9223372036854775807L;
    }

    sq8 c();

    long d();

    void f(Handler handler, a aVar);

    void h(a aVar);
}
