package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.nytimes.android.internal.pushmessaging.model.a;
import com.nytimes.android.push.NYTPushMessagingUserProviderImpl;
import defpackage.l95;
import defpackage.sa6;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public interface sa6 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: sa6$a$a, reason: collision with other inner class name */
        public static final class C0537a implements g80 {
            C0537a() {
            }

            @Override // defpackage.g80
            public l95.c a() {
                return new l95.c();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(wa2 wa2Var) {
            zq3.h(wa2Var, "it");
        }

        public final g80 b() {
            return new C0537a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ua2 c(Application application, p76 p76Var) {
            zq3.h(application, "application");
            zq3.h(p76Var, "impl");
            if (((bh8) application).a()) {
                return new ua2() { // from class: ra6
                    @Override // defpackage.ua2
                    public final void a(wa2 wa2Var) {
                        sa6.a.d(wa2Var);
                    }
                };
            }
            Object obj = p76Var.get();
            zq3.e(obj);
            return (ua2) obj;
        }

        public final boolean e(com.nytimes.android.internal.pushmessaging.model.a aVar) {
            zq3.h(aVar, "environment");
            return zq3.c(aVar, a.c.d);
        }

        public final CoroutineDispatcher f() {
            return Dispatchers.getIO();
        }

        public final a15 g(NYTPushMessagingUserProviderImpl nYTPushMessagingUserProviderImpl) {
            zq3.h(nYTPushMessagingUserProviderImpl, "nytPushMessagingUserProviderImpl");
            return nYTPushMessagingUserProviderImpl;
        }

        public final NotificationManager h(Application application) {
            zq3.h(application, "application");
            Object systemService = application.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            zq3.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            return (NotificationManager) systemService;
        }

        public final com.nytimes.android.internal.pushmessaging.model.a i(SharedPreferences sharedPreferences) {
            com.nytimes.android.internal.pushmessaging.model.a a2;
            zq3.h(sharedPreferences, "sharedPreferences");
            String string = sharedPreferences.getString("nyt_push_messaging_env_choice", null);
            return (string == null || (a2 = com.nytimes.android.internal.pushmessaging.model.a.Companion.a(string)) == null) ? a.c.d : a2;
        }

        public final f95 j() {
            return new jr6();
        }
    }
}
