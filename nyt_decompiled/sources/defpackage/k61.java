package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.api.EventTrackerApi;
import com.nytimes.android.eventtracker.buffer.db.BufferedEventDatabase;
import com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.Validator;
import com.nytimes.android.eventtracker.validator.fetcher.ValidatorApi;
import defpackage.f52;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class k61 {

    private static final class a implements f52.a {
        private Application a;
        private EventTracker.a b;

        @Override // f52.a
        public f52 build() {
            g16.a(this.a, Application.class);
            g16.a(this.b, EventTracker.a.class);
            return new b(this.a, this.b);
        }

        @Override // f52.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(EventTracker.a aVar) {
            this.b = (EventTracker.a) g16.b(aVar);
            return this;
        }

        @Override // f52.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.a = (Application) g16.b(application);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements f52 {
        private final EventTracker.a a;
        private final Application b;
        private final b c;
        private p76 d;
        private p76 e;

        private jl7 A() {
            return s32.a(B(), this.a);
        }

        private SharedPreferences B() {
            return lq7.a(this.b);
        }

        private SourceOfTruth C() {
            return a39.a(n(), t());
        }

        private m28 D() {
            return d39.a(C(), m(), r());
        }

        private Validator E() {
            return p39.a(q(), v(), l(), z(), jq7.a());
        }

        private ValidatorApi F() {
            return e39.a(nt1.a(this.e));
        }

        private rf9 G() {
            return ls3.a(this.b);
        }

        private ab b() {
            return n32.a(B(), this.a);
        }

        private an c() {
            return t32.a(ed0.a());
        }

        private fu d() {
            return o32.a(this.a);
        }

        private nd0 e() {
            return fd0.a(f());
        }

        private BufferedEventDatabase f() {
            return gd0.a(this.b);
        }

        private cm0 g() {
            return p32.a(this.b);
        }

        private g32 h() {
            return hd0.a(e());
        }

        private z32 i() {
            return id0.a(this.b, this.a);
        }

        private u42 j() {
            return ld0.a(this.a, h(), k(), jq7.a());
        }

        private EventTrackerApi k() {
            return z52.a(nt1.a(this.e), this.a);
        }

        private x52 l() {
            return j39.a(z(), i39.a());
        }

        private Fetcher m() {
            return b39.a(this.a, F(), z(), q(), l(), m39.a());
        }

        private xe2 n() {
            return f39.a(t());
        }

        private void o(Application application, EventTracker.a aVar) {
            ba2 a = xl3.a(application);
            this.d = a;
            this.e = kq7.a(a);
        }

        private DefaultEventCoordinator p(DefaultEventCoordinator defaultEventCoordinator) {
            eh1.e(defaultEventCoordinator, this.a);
            eh1.o(defaultEventCoordinator, E());
            eh1.n(defaultEventCoordinator, A());
            eh1.a(defaultEventCoordinator, b());
            eh1.c(defaultEventCoordinator, d());
            eh1.l(defaultEventCoordinator, s());
            eh1.b(defaultEventCoordinator, c());
            eh1.d(defaultEventCoordinator, g());
            eh1.g(defaultEventCoordinator, h());
            eh1.k(defaultEventCoordinator, i());
            eh1.j(defaultEventCoordinator, j());
            eh1.i(defaultEventCoordinator, kd0.a());
            eh1.h(defaultEventCoordinator, u());
            eh1.f(defaultEventCoordinator, jq7.a());
            eh1.m(defaultEventCoordinator, y());
            return defaultEventCoordinator;
        }

        private JavascriptEngine q() {
            return ks3.a(G(), jq7.a());
        }

        private rp4 r() {
            return c39.a(this.a);
        }

        private ls4 s() {
            return q32.a(this.a);
        }

        private File t() {
            return g39.a(this.b);
        }

        private c44 u() {
            return jd0.a(this.b);
        }

        private lc7 v() {
            return n39.a(w(), x());
        }

        private lc7 w() {
            return o39.a(D());
        }

        private lc7 x() {
            return l39.a(z());
        }

        private String y() {
            return r32.a(this.b);
        }

        private yz6 z() {
            return k39.a(this.b);
        }

        @Override // defpackage.f52
        public void a(DefaultEventCoordinator defaultEventCoordinator) {
            p(defaultEventCoordinator);
        }

        private b(Application application, EventTracker.a aVar) {
            this.c = this;
            this.a = aVar;
            this.b = application;
            o(application, aVar);
        }
    }

    public static f52.a a() {
        return new a();
    }
}
