package defpackage;

import android.app.Application;
import androidx.preference.g;
import com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl;
import com.nytimes.android.internal.pushmessaging.model.a;
import defpackage.f82;

/* loaded from: classes4.dex */
public final class i82 {
    public final a a(Application application) {
        zq3.h(application, "app");
        return a.Companion.a(g.b(application).getString("nyt_push_messaging_env_choice", null));
    }

    public final o82 b() {
        return p82.a;
    }

    public final r82 c(FCMTokenProviderImpl fCMTokenProviderImpl) {
        zq3.h(fCMTokenProviderImpl, "impl");
        return fCMTokenProviderImpl;
    }

    public final s82 d(Application application, a aVar) {
        zq3.h(application, "app");
        zq3.h(aVar, "environment");
        return new s82(application, aVar);
    }

    public final FCMTokenProviderImpl e(f82.b bVar, s82 s82Var) {
        zq3.h(bVar, "settings");
        zq3.h(s82Var, "fcmTokenProviderFactory");
        return s82Var.a(bVar.a(), bVar.b());
    }
}
