package defpackage;

import android.app.Application;
import defpackage.yb3;

/* loaded from: classes4.dex */
public abstract class q61 {

    private static final class a implements yb3.a {
        @Override // yb3.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public yb3 a(Application application) {
            g16.b(application);
            return new b(new mc3(), application);
        }

        private a() {
        }
    }

    private static final class b implements yb3 {
        private final b a;
        private p76 b;
        private p76 c;
        private p76 d;
        private p76 e;
        private p76 f;
        private p76 g;

        private void b(mc3 mc3Var, Application application) {
            ba2 a = xl3.a(application);
            this.b = a;
            this.c = nt1.b(ed3.a(mc3Var, a));
            p76 b = nt1.b(ad3.a(mc3Var));
            this.d = b;
            this.e = nt1.b(lc0.a(this.c, b));
            p76 b2 = nt1.b(yc3.a(mc3Var, this.d));
            this.f = b2;
            this.g = nt1.b(cc3.a(b2));
        }

        @Override // defpackage.xb3
        public bc3 a() {
            return (bc3) this.g.get();
        }

        private b(mc3 mc3Var, Application application) {
            this.a = this;
            b(mc3Var, application);
        }
    }

    public static yb3.a a() {
        return new a();
    }
}
