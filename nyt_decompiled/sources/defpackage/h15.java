package defpackage;

import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class h15 {
    private UserSubscriptionProduct a;
    private UserSubscriptionEntitlement b;
    private UserData c;
    private final f88 d;
    private UserData e;
    private boolean f;
    private boolean g;
    private boolean h;

    public h15(UserSubscriptionProduct userSubscriptionProduct, UserSubscriptionEntitlement userSubscriptionEntitlement, UserData userData, f88 f88Var) {
        zq3.h(userSubscriptionProduct, "product");
        zq3.h(userSubscriptionEntitlement, "requiredEntitlement");
        zq3.h(userData, "user");
        zq3.h(f88Var, "subauthNYTUserDevSettingsOverrides");
        this.a = userSubscriptionProduct;
        this.b = userSubscriptionEntitlement;
        this.c = userData;
        this.d = f88Var;
        this.e = userData;
        e();
    }

    private final void e() {
        UserData userData = this.e;
        Set b = this.d.b();
        if (b != null) {
            userData = UserData.copy$default(userData, 0L, RegiData.copy$default(userData.getRegiData(), null, i.l(), 1, null), GooglePlayData.copy$default(userData.getGooglePlayData(), b, null, 2, null), 1, null);
        }
        this.c = userData;
        this.f = userData.isSignedIn();
        this.g = this.c.hasActiveEntitlement(this.b);
        this.h = this.c.hasLinkedActiveEntitlement(this.b);
    }

    public final UserData a() {
        return this.c;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.h;
    }

    public final void f(UserData userData) {
        zq3.h(userData, "newUser");
        this.e = userData;
        e();
    }
}
