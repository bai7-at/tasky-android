package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class ot4 implements k92 {
    private final String a;
    private final String b;
    private final DeviceOrientation c;
    private final SubscriptionLevel d;
    private final String e;
    private final Edition f;

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

    public ot4(String str, String str2, DeviceOrientation deviceOrientation, SubscriptionLevel subscriptionLevel, String str3, Edition edition) {
        zq3.h(str2, "section");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str3, "networkStatus");
        zq3.h(edition, "edition");
        this.a = str;
        this.b = str2;
        this.c = deviceOrientation;
        this.d = subscriptionLevel;
        this.e = str3;
        this.f = edition;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.d(Channel.Facebook);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("Edition", this.f.getTitle());
        w52Var.a("Network Status", this.e);
        w52Var.a("Orientation", this.c.getTitle());
        w52Var.c("Section", this.b);
        w52Var.a("Subscription Level", this.d.getTitle());
        w52Var.c("url", this.a);
        if (channel == Channel.Firebase) {
            w52Var.a("orientation", this.c.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        if (a.a[channel.ordinal()] == 1) {
            return "Metered Content";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot4)) {
            return false;
        }
        ot4 ot4Var = (ot4) obj;
        return zq3.c(this.a, ot4Var.a) && zq3.c(this.b, ot4Var.b) && this.c == ot4Var.c && this.d == ot4Var.d && zq3.c(this.e, ot4Var.e) && this.f == ot4Var.f;
    }

    public int hashCode() {
        String str = this.a;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "MeteredContentEvent(url=" + this.a + ", section=" + this.b + ", orientation=" + this.c + ", subscriptionLevel=" + this.d + ", networkStatus=" + this.e + ", edition=" + this.f + ")";
    }
}
