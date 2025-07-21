package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.apollographql.apollo.ApolloClient;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.SubauthUserManager;
import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager;
import com.nytimes.android.subauth.core.database.DatabaseManager;
import com.nytimes.android.subauth.core.database.SubauthDatabase;
import com.nytimes.android.subauth.core.di.SubauthModule;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;
import com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager;
import com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.squareup.moshi.i;
import java.util.Set;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class n71 {

    public static final class a {
        private SubauthModule a;
        private h68 b;
        private SubauthNetworkModule c;
        private x50 d;
        private i96 e;
        private t68 f;

        public e68 a() {
            if (this.a == null) {
                this.a = new SubauthModule();
            }
            if (this.b == null) {
                this.b = new h68();
            }
            if (this.c == null) {
                this.c = new SubauthNetworkModule();
            }
            if (this.d == null) {
                this.d = new x50();
            }
            if (this.e == null) {
                this.e = new i96();
            }
            g16.a(this.f, t68.class);
            return new b(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public a b(h68 h68Var) {
            this.b = (h68) g16.b(h68Var);
            return this;
        }

        public a c(t68 t68Var) {
            this.f = (t68) g16.b(t68Var);
            return this;
        }

        public a d(SubauthModule subauthModule) {
            this.a = (SubauthModule) g16.b(subauthModule);
            return this;
        }

        public a e(SubauthNetworkModule subauthNetworkModule) {
            this.c = (SubauthNetworkModule) g16.b(subauthNetworkModule);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements e68 {
        private p76 A;
        private p76 B;
        private p76 C;
        private p76 D;
        private p76 E;
        private p76 F;
        private p76 G;
        private p76 H;
        private p76 I;
        private p76 J;
        private p76 K;
        private p76 L;
        private p76 M;
        private p76 N;
        private p76 O;
        private p76 P;
        private p76 Q;
        private p76 R;
        private p76 S;
        private p76 T;
        private p76 U;
        private p76 V;
        private p76 W;
        private p76 X;
        private p76 Y;
        private p76 Z;
        private final SubauthNetworkModule a;
        private p76 a0;
        private final t68 b;
        private p76 b0;
        private final h68 c;
        private final SubauthModule d;
        private final i96 e;
        private final x50 f;
        private final b g;
        private p76 h;
        private p76 i;
        private p76 j;
        private p76 k;
        private p76 l;
        private p76 m;
        private p76 n;
        private p76 o;
        private p76 p;
        private p76 q;
        private p76 r;
        private p76 s;
        private p76 t;
        private p76 u;
        private p76 v;
        private p76 w;
        private p76 x;
        private p76 y;
        private p76 z;

        private static final class a implements p76 {
            private final b a;
            private final int b;

            a(b bVar, int i) {
                this.a = bVar;
                this.b = i;
            }

            @Override // defpackage.p76
            public Object get() {
                switch (this.b) {
                    case 0:
                        return p88.a(this.a.a, (OkHttpClient) this.a.h.get(), (i) this.a.i.get());
                    case 1:
                        return n88.a(this.a.a, this.a.b);
                    case 2:
                        return k88.a(this.a.a);
                    case 3:
                        return r88.a(this.a.a, (Resources) g16.d(this.a.b.getResources()), (ba1) this.a.k.get());
                    case 4:
                        return i68.a(this.a.c, this.a.b);
                    case 5:
                        return x78.a(this.a.d, this.a.b, (xz8) this.a.H.get(), (NYTSubauthPollAPI) this.a.I.get(), (c05) this.a.u.get(), (ba1) this.a.k.get(), (w88) this.a.D.get(), (SubauthListenerManager) this.a.r.get());
                    case 6:
                        return e88.a(this.a.d, (UserDetailsManager) this.a.G.get());
                    case 7:
                        return d88.a(this.a.d, (ba1) this.a.k.get(), (vz8) this.a.E.get(), (qz8) this.a.F.get(), (c05) this.a.u.get(), (SubauthListenerManager) this.a.r.get());
                    case 8:
                        return u88.a(this.a.a, (ApolloClient) this.a.B.get(), (wz8) this.a.C.get(), (w88) this.a.D.get(), (SubauthListenerManager) this.a.r.get());
                    case 9:
                        return q88.a(this.a.a, this.a.b, (w13) this.a.m.get(), (x13) this.a.n.get(), (Set) this.a.o.get(), (Interceptor) this.a.w.get(), (z86) this.a.x.get(), (su4) this.a.A.get());
                    case 10:
                        return i88.a(this.a.a, this.a.b);
                    case 11:
                        return j88.a(this.a.a, this.a.b);
                    case 12:
                        return o88.a(this.a.a);
                    case 13:
                        return t78.a(this.a.d, (u86) this.a.v.get());
                    case 14:
                        return v78.a(this.a.d, (c05) this.a.u.get());
                    case 15:
                        return j68.a(this.a.c, this.a.b, (DatabaseManager) this.a.t.get(), (ba1) this.a.k.get());
                    case 16:
                        return o68.a(this.a.c, (SubauthDatabase) this.a.p.get(), (NYTUserImpl) this.a.s.get());
                    case 17:
                        return n68.a(this.a.c, this.a.b);
                    case 18:
                        return r68.a(this.a.c, this.a.b, (f88) this.a.q.get(), (SubauthListenerManager) this.a.r.get());
                    case 19:
                        return s68.a(this.a.c, this.a.b);
                    case 20:
                        return m78.a();
                    case 21:
                        return j96.a(this.a.e, this.a.b);
                    case 22:
                        return a60.a(this.a.f, (qu4) this.a.y.get(), (ru4) this.a.z.get());
                    case 23:
                        return y50.a(this.a.f, this.a.b);
                    case 24:
                        return z50.a(this.a.f, this.a.b);
                    case EventType.SUBS /* 25 */:
                        return v88.a(this.a.a, (SubauthListenerManager) this.a.r.get());
                    case EventType.CDN /* 26 */:
                        return b60.a(this.a.f, this.a.b);
                    case 27:
                        return p68.a(this.a.c, (DatabaseManager) this.a.t.get());
                    case 28:
                        return l88.a(this.a.a, (Retrofit.Builder) this.a.j.get(), (SubauthEnvironment) this.a.l.get());
                    case BuildConfig.VERSION_CODE /* 29 */:
                        return k68.a(this.a.c, (DatabaseManager) this.a.t.get());
                    case 30:
                        return b88.a(this.a.d, (Application) g16.d(this.a.b.getApplication()), (ba1) this.a.k.get(), (NYTTargetingAPI) this.a.L.get(), (c05) this.a.u.get(), (ng8) this.a.M.get(), (w88) this.a.D.get());
                    case 31:
                        return m88.a(this.a.a, (Retrofit.Builder) this.a.j.get(), (SubauthEnvironment) this.a.l.get());
                    case 32:
                        return c88.a(this.a.d, (ba1) this.a.k.get());
                    case 33:
                        return q68.a(this.a.c, (NYTUserImpl) this.a.s.get());
                    case 34:
                        return a88.a(this.a.d, this.a.b, (NYTUser) this.a.O.get(), (UserAPI) this.a.P.get(), (xz8) this.a.H.get(), (c05) this.a.u.get(), (kl7) this.a.J.get(), (mg8) this.a.N.get(), (ba1) this.a.k.get(), (SubauthListenerManager) this.a.r.get(), (w88) this.a.D.get());
                    case 35:
                        return t88.a(this.a.a, (Retrofit.Builder) this.a.j.get(), (SubauthEnvironment) this.a.l.get());
                    case 36:
                        return z78.a(this.a.d, this.a.b, (NYTUser) this.a.O.get(), (xz8) this.a.H.get(), (c05) this.a.u.get(), (qz8) this.a.F.get(), (j86) this.a.K.get(), (kl7) this.a.J.get(), (e98) this.a.R.get(), (GoogleStoreFront) this.a.S.get(), (i) this.a.i.get(), (ba1) this.a.k.get(), (SubauthListenerManager) this.a.r.get(), (w88) this.a.D.get());
                    case 37:
                        return s88.a(this.a.a, (Retrofit.Builder) this.a.j.get(), (SubauthEnvironment) this.a.l.get());
                    case 38:
                        return r78.a(this.a.d, this.a.b);
                    case 39:
                        return y78.a(this.a.d, (SubauthPurchaseManager) this.a.T.get());
                    case 40:
                        return w78.a(this.a.d, this.a.b, (s86) this.a.X.get(), (o96) this.a.Y.get(), (MutableSharedFlow) this.a.Z.get(), (PurrDirectiveOverrider) this.a.a0.get(), (u86) this.a.v.get(), (SubauthListenerManager) this.a.r.get());
                    case 41:
                        return u78.a(this.a.d, this.a.b, (ApolloClient) this.a.B.get(), (n96) this.a.V.get(), (xe8) this.a.W.get(), (SubauthListenerManager) this.a.r.get(), (w88) this.a.D.get());
                    case 42:
                        return k96.a(this.a.e);
                    case 43:
                        return l96.a(this.a.e);
                    case 44:
                        return m68.a(this.a.c, this.a.b, (c05) this.a.u.get());
                    case 45:
                        return s78.a(this.a.d);
                    case 46:
                        return l68.a(this.a.c, this.a.b);
                    default:
                        throw new AssertionError(this.b);
                }
            }
        }

        private void m0(SubauthModule subauthModule, h68 h68Var, SubauthNetworkModule subauthNetworkModule, x50 x50Var, i96 i96Var, t68 t68Var) {
            this.h = nt1.b(new a(this.g, 1));
            this.i = nt1.b(new a(this.g, 2));
            this.j = nt1.b(new a(this.g, 0));
            this.k = nt1.b(new a(this.g, 4));
            this.l = nt1.b(new a(this.g, 3));
            this.m = nt1.b(new a(this.g, 10));
            this.n = nt1.b(new a(this.g, 11));
            this.o = nt1.b(new a(this.g, 12));
            this.p = nt1.b(new a(this.g, 17));
            this.q = nt1.b(new a(this.g, 19));
            this.r = nt1.b(new a(this.g, 20));
            this.s = nt1.b(new a(this.g, 18));
            this.t = nt1.b(new a(this.g, 16));
            this.u = nt1.b(new a(this.g, 15));
            this.v = nt1.b(new a(this.g, 14));
            this.w = nt1.b(new a(this.g, 13));
            this.x = nt1.b(new a(this.g, 21));
            this.y = nt1.b(new a(this.g, 23));
            this.z = nt1.b(new a(this.g, 24));
            this.A = nt1.b(new a(this.g, 22));
            this.B = nt1.b(new a(this.g, 9));
            this.C = nt1.b(new a(this.g, 25));
            this.D = nt1.b(new a(this.g, 26));
            this.E = nt1.b(new a(this.g, 8));
            this.F = nt1.b(new a(this.g, 27));
            this.G = nt1.b(new a(this.g, 7));
            this.H = nt1.b(new a(this.g, 6));
            this.I = nt1.b(new a(this.g, 28));
            this.J = nt1.b(new a(this.g, 5));
            this.K = nt1.b(new a(this.g, 29));
            this.L = nt1.b(new a(this.g, 31));
            this.M = nt1.b(new a(this.g, 32));
            this.N = nt1.b(new a(this.g, 30));
            this.O = nt1.b(new a(this.g, 33));
            this.P = nt1.b(new a(this.g, 35));
            this.Q = nt1.b(new a(this.g, 34));
            this.R = nt1.b(new a(this.g, 37));
            this.S = nt1.b(new a(this.g, 38));
            this.T = nt1.b(new a(this.g, 36));
            this.U = nt1.b(new a(this.g, 39));
            this.V = nt1.b(new a(this.g, 42));
            this.W = nt1.b(new a(this.g, 43));
            this.X = nt1.b(new a(this.g, 41));
            this.Y = nt1.b(new a(this.g, 44));
            this.Z = nt1.b(new a(this.g, 45));
            this.a0 = nt1.b(new a(this.g, 46));
            this.b0 = nt1.b(new a(this.g, 40));
        }

        @Override // defpackage.d68
        public NYTUser h() {
            return (NYTUser) this.O.get();
        }

        @Override // defpackage.d68
        public PurrDirectiveOverrider i() {
            return (PurrDirectiveOverrider) this.a0.get();
        }

        @Override // defpackage.d68
        public Retrofit.Builder j() {
            return (Retrofit.Builder) this.j.get();
        }

        @Override // defpackage.d68
        public kl7 k() {
            return (kl7) this.J.get();
        }

        @Override // defpackage.d68
        public NYTUserImpl l() {
            return (NYTUserImpl) this.s.get();
        }

        @Override // defpackage.d68
        public qz8 m() {
            return (qz8) this.F.get();
        }

        @Override // defpackage.d68
        public com.nytimes.android.subauth.core.purr.a n() {
            return (com.nytimes.android.subauth.core.purr.a) this.b0.get();
        }

        @Override // defpackage.d68
        public SubauthListenerManager o() {
            return (SubauthListenerManager) this.r.get();
        }

        @Override // defpackage.d68
        public xz8 p() {
            return (xz8) this.H.get();
        }

        @Override // defpackage.d68
        public SubauthPurchaseManager q() {
            return (SubauthPurchaseManager) this.T.get();
        }

        @Override // defpackage.d68
        public SubauthUserManager r() {
            return (SubauthUserManager) this.Q.get();
        }

        @Override // defpackage.d68
        public SubauthEnvironment s() {
            return (SubauthEnvironment) this.l.get();
        }

        @Override // defpackage.d68
        public c05 t() {
            return (c05) this.u.get();
        }

        @Override // defpackage.d68
        public p78 u() {
            return (p78) this.U.get();
        }

        private b(SubauthModule subauthModule, h68 h68Var, SubauthNetworkModule subauthNetworkModule, x50 x50Var, i96 i96Var, t68 t68Var) {
            this.g = this;
            this.a = subauthNetworkModule;
            this.b = t68Var;
            this.c = h68Var;
            this.d = subauthModule;
            this.e = i96Var;
            this.f = x50Var;
            m0(subauthModule, h68Var, subauthNetworkModule, x50Var, i96Var, t68Var);
        }
    }

    public static a a() {
        return new a();
    }
}
