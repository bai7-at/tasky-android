package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import defpackage.fn2;
import defpackage.tm2;

/* loaded from: classes.dex */
class ah0 {
    private final fn2.c a;
    private final Handler b;

    class a implements Runnable {
        final /* synthetic */ fn2.c a;
        final /* synthetic */ Typeface b;

        a(fn2.c cVar, Typeface typeface) {
            this.a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ fn2.c a;
        final /* synthetic */ int b;

        b(fn2.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    ah0(fn2.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i) {
        this.b.post(new b(this.a, i));
    }

    private void c(Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }

    void b(tm2.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}
