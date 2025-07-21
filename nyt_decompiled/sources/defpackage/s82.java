package defpackage;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl;
import defpackage.aj2;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class s82 {
    public static final a Companion = new a(null);
    private final Application a;
    private final com.nytimes.android.internal.pushmessaging.model.a b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s82(Application application, com.nytimes.android.internal.pushmessaging.model.a aVar) {
        zq3.h(application, "application");
        zq3.h(aVar, "environment");
        this.a = application;
        this.b = aVar;
    }

    public final FCMTokenProviderImpl a(d85 d85Var, Set set) {
        zq3.h(set, "nonDefaultEnvironment");
        Object i = ((d85Var == null || !set.contains(this.b)) ? uh2.k() : uh2.r(this.a, new aj2.b().e(d85Var.d()).c(d85Var.b()).b(d85Var.a()).f(d85Var.e()).d(d85Var.c()).a(), "FirebaseAppFactory.nonDefaultFirebaseApp")).i(FirebaseMessaging.class);
        zq3.f(i, "null cannot be cast to non-null type com.google.firebase.messaging.FirebaseMessaging");
        return new FCMTokenProviderImpl((FirebaseMessaging) i);
    }
}
