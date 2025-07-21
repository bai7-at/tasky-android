package defpackage;

import android.content.Context;
import defpackage.qn4;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class bw6 {
    protected final Context a;
    protected final Object b;
    protected c c;

    static class a extends bw6 {
        private final Object d;
        private final Object e;
        private final Object f;
        private boolean g;

        /* renamed from: bw6$a$a, reason: collision with other inner class name */
        private static final class C0130a implements qn4.e {
            private final WeakReference a;

            public C0130a(a aVar) {
                this.a = new WeakReference(aVar);
            }

            @Override // qn4.e
            public void a(Object obj, int i) {
                c cVar;
                a aVar = (a) this.a.get();
                if (aVar == null || (cVar = aVar.c) == null) {
                    return;
                }
                cVar.b(i);
            }

            @Override // qn4.e
            public void d(Object obj, int i) {
                c cVar;
                a aVar = (a) this.a.get();
                if (aVar == null || (cVar = aVar.c) == null) {
                    return;
                }
                cVar.a(i);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object e = qn4.e(context);
            this.d = e;
            Object b = qn4.b(e, "", false);
            this.e = b;
            this.f = qn4.c(e, b);
        }

        @Override // defpackage.bw6
        public void c(b bVar) {
            qn4.d.e(this.f, bVar.a);
            qn4.d.h(this.f, bVar.b);
            qn4.d.g(this.f, bVar.c);
            qn4.d.b(this.f, bVar.d);
            qn4.d.c(this.f, bVar.e);
            if (this.g) {
                return;
            }
            this.g = true;
            qn4.d.f(this.f, qn4.d(new C0130a(this)));
            qn4.d.d(this.f, this.b);
        }
    }

    public static final class b {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
        public String f;
    }

    public interface c {
        void a(int i);

        void b(int i);
    }

    protected bw6(Context context, Object obj) {
        this.a = context;
        this.b = obj;
    }

    public static bw6 b(Context context, Object obj) {
        return new a(context, obj);
    }

    public Object a() {
        return this.b;
    }

    public abstract void c(b bVar);

    public void d(c cVar) {
        this.c = cVar;
    }
}
