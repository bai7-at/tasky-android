package defpackage;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.fcmprovider.FCMService;
import com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl;
import defpackage.f82;
import defpackage.g82;

/* loaded from: classes4.dex */
public abstract class n61 {

    private static final class a implements g82.a {
        private f82.b a;
        private Application b;

        @Override // g82.a
        public g82 build() {
            g16.a(this.a, f82.b.class);
            g16.a(this.b, Application.class);
            return new b(new i82(), this.a, this.b);
        }

        @Override // g82.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.b = (Application) g16.b(application);
            return this;
        }

        @Override // g82.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(f82.b bVar) {
            this.a = (f82.b) g16.b(bVar);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements g82 {
        private final i82 a;
        private final f82.b b;
        private final Application c;
        private final b d;
        private p76 e;
        private p76 f;
        private p76 g;
        private p76 h;

        private static final class a implements p76 {
            private final b a;
            private final int b;

            a(b bVar, int i) {
                this.a = bVar;
                this.b = i;
            }

            @Override // defpackage.p76
            public Object get() {
                int i = this.b;
                if (i == 0) {
                    return m82.a(this.a.a, (FCMTokenProviderImpl) this.a.f.get());
                }
                if (i == 1) {
                    return n82.a(this.a.a, this.a.b, (s82) this.a.e.get());
                }
                if (i == 2) {
                    return l82.a(this.a.a, this.a.c, this.a.i());
                }
                if (i == 3) {
                    return k82.a(this.a.a);
                }
                throw new AssertionError(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.nytimes.android.internal.pushmessaging.model.a i() {
            return j82.a(this.a, this.c);
        }

        private void j(i82 i82Var, f82.b bVar, Application application) {
            this.e = nt1.b(new a(this.d, 2));
            this.f = nt1.b(new a(this.d, 1));
            this.g = nt1.b(new a(this.d, 0));
            this.h = nt1.b(new a(this.d, 3));
        }

        private FCMService k(FCMService fCMService) {
            q82.a(fCMService, (r82) this.g.get());
            return fCMService;
        }

        @Override // defpackage.g82
        public h82 a() {
            return new h82((r82) this.g.get(), (o82) this.h.get());
        }

        @Override // defpackage.g82
        public void b(FCMService fCMService) {
            k(fCMService);
        }

        private b(i82 i82Var, f82.b bVar, Application application) {
            this.d = this;
            this.a = i82Var;
            this.b = bVar;
            this.c = application;
            j(i82Var, bVar, application);
        }
    }

    public static g82.a a() {
        return new a();
    }
}
