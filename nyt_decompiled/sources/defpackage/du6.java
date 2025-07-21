package defpackage;

import com.nytimes.android.growthui.regibundle.models.remoteconfig.RegistrationData;
import com.nytimes.android.growthui.regibundle.models.remoteconfig.SubscriptionData;

/* loaded from: classes4.dex */
public final class du6 {
    private final String a;
    private final RegistrationData b;
    private final SubscriptionData c;
    private final bd5 d;

    public du6(String str, RegistrationData registrationData, SubscriptionData subscriptionData, bd5 bd5Var) {
        zq3.h(str, "loginText");
        zq3.h(registrationData, "registrationData");
        zq3.h(subscriptionData, "subscriptionData");
        zq3.h(bd5Var, "offersState");
        this.a = str;
        this.b = registrationData;
        this.c = subscriptionData;
        this.d = bd5Var;
    }

    public final String a() {
        return this.a;
    }

    public final bd5 b() {
        return this.d;
    }

    public final RegistrationData c() {
        return this.b;
    }

    public final SubscriptionData d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du6)) {
            return false;
        }
        du6 du6Var = (du6) obj;
        return zq3.c(this.a, du6Var.a) && zq3.c(this.b, du6Var.b) && zq3.c(this.c, du6Var.c) && zq3.c(this.d, du6Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RegibundleConfig(loginText=" + this.a + ", registrationData=" + this.b + ", subscriptionData=" + this.c + ", offersState=" + this.d + ")";
    }
}
