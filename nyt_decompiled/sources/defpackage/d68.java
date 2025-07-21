package defpackage;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.SubauthUserManager;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;
import com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import java.util.concurrent.TimeUnit;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public interface d68 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final TimeUnit b = TimeUnit.SECONDS;

        private a() {
        }

        public final TimeUnit a() {
            return b;
        }
    }

    NYTUser h();

    PurrDirectiveOverrider i();

    Retrofit.Builder j();

    kl7 k();

    NYTUserImpl l();

    qz8 m();

    com.nytimes.android.subauth.core.purr.a n();

    SubauthListenerManager o();

    xz8 p();

    SubauthPurchaseManager q();

    SubauthUserManager r();

    SubauthEnvironment s();

    c05 t();

    p78 u();
}
