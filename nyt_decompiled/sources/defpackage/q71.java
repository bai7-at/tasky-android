package defpackage;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import androidx.lifecycle.t;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.subauth.ui.SubauthUserUIManager;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager;
import com.nytimes.subauth.ui.login.SubauthLoginActivity;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import java.util.Map;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public abstract class q71 {

    public static final class a {
        private x98 a;

        public w98 a() {
            g16.a(this.a, x98.class);
            return new b(this.a);
        }

        public a b(x98 x98Var) {
            this.a = (x98) g16.b(x98Var);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements w98 {
        private final x98 a;
        private final b b;
        private p76 c;
        private p76 d;
        private p76 e;
        private p76 f;
        private p76 g;
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
                        return pa8.a(this.a.a);
                    case 1:
                        return qa8.a(this.a.a, (NYTUser) this.a.d.get(), (p78) this.a.e.get(), (o98) this.a.c.get(), (com.nytimes.android.subauth.core.purr.a) this.a.f.get(), (PurrDirectiveOverrider) this.a.g.get(), (MutableSharedFlow) this.a.h.get(), (MutableSharedFlow) this.a.i.get(), (MutableSharedFlow) this.a.j.get());
                    case 2:
                        return da8.a(this.a.a);
                    case 3:
                        return oa8.a(this.a.a);
                    case 4:
                        return fa8.a(this.a.a);
                    case 5:
                        return ea8.a(this.a.a);
                    case 6:
                        return ba8.a(this.a.a);
                    case 7:
                        return ma8.a(this.a.a);
                    case 8:
                        return ia8.a(this.a.a);
                    case 9:
                        return new na9(this.a.A());
                    case 10:
                        return new SubauthLoginViewModel((NYTUser) this.a.d.get(), (o98) this.a.c.get(), (p78) this.a.e.get(), (c05) this.a.l.get(), (com.nytimes.android.subauth.core.purr.a) this.a.f.get(), (p60) this.a.n.get(), (dr2) this.a.p.get(), (MutableSharedFlow) this.a.h.get(), (f68) this.a.q.get(), (SubauthLIREFlowAnalyticsManager) this.a.r.get(), (SubauthEnvironment) this.a.s.get());
                    case 11:
                        return ca8.a(this.a.a);
                    case 12:
                        return aa8.a(this.a.a, (ConnectivityManager) this.a.m.get());
                    case 13:
                        return y98.a(this.a.a);
                    case 14:
                        return z98.a(this.a.a, (Resources) this.a.o.get());
                    case 15:
                        return ga8.a(this.a.a);
                    case 16:
                        return ja8.a(this.a.a);
                    case 17:
                        return na8.a(this.a.a, (o98) this.a.c.get(), (MutableSharedFlow) this.a.i.get());
                    case 18:
                        return ka8.a(this.a.a);
                    case 19:
                        return new AccountDeleteViewModel((NYTUser) this.a.d.get(), (MutableSharedFlow) this.a.j.get(), (com.nytimes.subauth.ui.accountdelete.a) this.a.v.get(), (p60) this.a.n.get());
                    case 20:
                        return ha8.a(this.a.a, (h78) this.a.u.get());
                    case 21:
                        return la8.a(this.a.a);
                    default:
                        throw new AssertionError(this.b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map A() {
            return oe4.b(2).c(SubauthLoginViewModel.class, this.t).c(AccountDeleteViewModel.class, this.w).a();
        }

        private void x(x98 x98Var) {
            this.c = nt1.b(new a(this.b, 0));
            this.d = nt1.b(new a(this.b, 2));
            this.e = nt1.b(new a(this.b, 3));
            this.f = nt1.b(new a(this.b, 4));
            this.g = nt1.b(new a(this.b, 5));
            this.h = nt1.b(new a(this.b, 6));
            this.i = nt1.b(new a(this.b, 7));
            this.j = nt1.b(new a(this.b, 8));
            this.k = nt1.b(new a(this.b, 1));
            this.l = nt1.b(new a(this.b, 11));
            this.m = nt1.b(new a(this.b, 13));
            this.n = nt1.b(new a(this.b, 12));
            this.o = nt1.b(new a(this.b, 15));
            this.p = nt1.b(new a(this.b, 14));
            this.q = nt1.b(new a(this.b, 16));
            this.r = nt1.b(new a(this.b, 17));
            this.s = nt1.b(new a(this.b, 18));
            this.t = new a(this.b, 10);
            this.u = nt1.b(new a(this.b, 21));
            this.v = nt1.b(new a(this.b, 20));
            this.w = new a(this.b, 19);
            this.x = nt1.b(new a(this.b, 9));
        }

        private AccountDeleteActivity y(AccountDeleteActivity accountDeleteActivity) {
            p3.b(accountDeleteActivity, (t.b) this.x.get());
            p3.a(accountDeleteActivity, (f68) this.q.get());
            return accountDeleteActivity;
        }

        private SubauthLoginActivity z(SubauthLoginActivity subauthLoginActivity) {
            o78.b(subauthLoginActivity, (t.b) this.x.get());
            o78.a(subauthLoginActivity, (f68) this.q.get());
            return subauthLoginActivity;
        }

        @Override // defpackage.v98
        public void a(SubauthLoginActivity subauthLoginActivity) {
            z(subauthLoginActivity);
        }

        @Override // defpackage.v98
        public void b(AccountDeleteActivity accountDeleteActivity) {
            y(accountDeleteActivity);
        }

        @Override // defpackage.v98
        public SubauthUserUIManager c() {
            return (SubauthUserUIManager) this.k.get();
        }

        private b(x98 x98Var) {
            this.b = this;
            this.a = x98Var;
            x(x98Var);
        }
    }

    public static a a() {
        return new a();
    }
}
