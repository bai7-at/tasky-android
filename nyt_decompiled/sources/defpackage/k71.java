package defpackage;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;
import defpackage.ca6;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class k71 {

    private static final class a implements ca6.a {
        private Application a;
        private PushMessaging.c b;
        private a15 c;
        private r82 d;
        private String e;
        private CoroutineScope f;

        @Override // ca6.a
        public ca6 build() {
            g16.a(this.a, Application.class);
            g16.a(this.b, PushMessaging.c.class);
            g16.a(this.c, a15.class);
            g16.a(this.d, r82.class);
            g16.a(this.e, String.class);
            g16.a(this.f, CoroutineScope.class);
            return new b(new ga6(), this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @Override // ca6.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.e = (String) g16.b(str);
            return this;
        }

        @Override // ca6.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Application application) {
            this.a = (Application) g16.b(application);
            return this;
        }

        @Override // ca6.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a c(CoroutineScope coroutineScope) {
            this.f = (CoroutineScope) g16.b(coroutineScope);
            return this;
        }

        @Override // ca6.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a e(r82 r82Var) {
            this.d = (r82) g16.b(r82Var);
            return this;
        }

        @Override // ca6.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a d(a15 a15Var) {
            this.c = (a15) g16.b(a15Var);
            return this;
        }

        @Override // ca6.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a f(PushMessaging.c cVar) {
            this.b = (PushMessaging.c) g16.b(cVar);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements ca6 {
        private final PushMessaging.c a;
        private final a15 b;
        private final r82 c;
        private final ga6 d;
        private final Application e;
        private final String f;
        private final CoroutineScope g;
        private final b h;
        private p76 i;
        private p76 j;
        private p76 k;
        private p76 l;
        private p76 m;
        private p76 n;

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
                    return new SubscriptionManagerImpl(this.a.a, this.a.b, this.a.c, (PushSubscriptionAPI) this.a.j.get(), (PushMessagingDao) this.a.k.get(), (vf8) this.a.m.get(), this.a.f, this.a.w(), pa6.a(this.a.d), ia6.a(this.a.d), this.a.g);
                }
                if (i == 1) {
                    return ka6.a(this.a.d, this.a.v(), this.a.r());
                }
                if (i == 2) {
                    return ja6.a(this.a.d, this.a.e, this.a.a, this.a.f);
                }
                if (i == 3) {
                    return ma6.a(this.a.d, this.a.e);
                }
                if (i == 4) {
                    return na6.a(this.a.d, (TagMetadataAPI) this.a.l.get(), this.a.a, (PushMessagingDao) this.a.k.get());
                }
                if (i == 5) {
                    return oa6.a(this.a.d, this.a.v(), this.a.r());
                }
                throw new AssertionError(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.nytimes.android.internal.pushmessaging.model.a r() {
            return ha6.a(this.d, this.a);
        }

        private void s(ga6 ga6Var, Application application, PushMessaging.c cVar, a15 a15Var, r82 r82Var, String str, CoroutineScope coroutineScope) {
            this.i = new a(this.h, 2);
            this.j = nt1.b(new a(this.h, 1));
            this.k = nt1.b(new a(this.h, 3));
            this.l = nt1.b(new a(this.h, 5));
            this.m = nt1.b(new a(this.h, 4));
            this.n = nt1.b(new a(this.h, 0));
        }

        private SubscriptionWorker t(SubscriptionWorker subscriptionWorker) {
            sb8.a(subscriptionWorker, (SubscriptionManagerImpl) this.n.get());
            return subscriptionWorker;
        }

        private TagManagerWorker u(TagManagerWorker tagManagerWorker) {
            wf8.a(tagManagerWorker, (vf8) this.m.get());
            return tagManagerWorker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Retrofit.Builder v() {
            return la6.a(this.d, nt1.a(this.i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public qj9 w() {
            return qa6.a(this.d, this.e);
        }

        @Override // defpackage.ca6
        public fa6 a() {
            return new fa6((SubscriptionManagerImpl) this.n.get());
        }

        @Override // defpackage.ca6
        public void b(TagManagerWorker tagManagerWorker) {
            u(tagManagerWorker);
        }

        @Override // defpackage.ca6
        public void c(SubscriptionWorker subscriptionWorker) {
            t(subscriptionWorker);
        }

        private b(ga6 ga6Var, Application application, PushMessaging.c cVar, a15 a15Var, r82 r82Var, String str, CoroutineScope coroutineScope) {
            this.h = this;
            this.a = cVar;
            this.b = a15Var;
            this.c = r82Var;
            this.d = ga6Var;
            this.e = application;
            this.f = str;
            this.g = coroutineScope;
            s(ga6Var, application, cVar, a15Var, r82Var, str, coroutineScope);
        }
    }

    public static ca6.a a() {
        return new a();
    }
}
