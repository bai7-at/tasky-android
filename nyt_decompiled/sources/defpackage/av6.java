package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.values.RegiMethod;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class av6 implements k92 {
    private final RegiMethod a;
    private final DeviceOrientation b;
    private final SubscriptionLevel c;
    private final String d;
    private final Edition e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public av6(RegiMethod regiMethod, DeviceOrientation deviceOrientation, SubscriptionLevel subscriptionLevel, String str, Edition edition) {
        zq3.h(regiMethod, "method");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str, "networkStatus");
        zq3.h(edition, "edition");
        this.a = regiMethod;
        this.b = deviceOrientation;
        this.c = subscriptionLevel;
        this.d = str;
        this.e = edition;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.d(Channel.Facebook);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("Edition", this.e.getTitle());
        w52Var.a("Method", this.a.getTitle());
        w52Var.a("Network Status", this.d);
        w52Var.a("Orientation", this.b.getTitle());
        w52Var.a("Subscription Level", this.c.getTitle());
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        if (a.a[channel.ordinal()] == 1) {
            return "Account Creation Succeeded";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av6)) {
            return false;
        }
        av6 av6Var = (av6) obj;
        return this.a == av6Var.a && this.b == av6Var.b && this.c == av6Var.c && zq3.c(this.d, av6Var.d) && this.e == av6Var.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "RegistrationSucceededEvent(method=" + this.a + ", orientation=" + this.b + ", subscriptionLevel=" + this.c + ", networkStatus=" + this.d + ", edition=" + this.e + ")";
    }
}
