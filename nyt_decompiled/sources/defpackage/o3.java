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
public final class o3 implements ci2, on {
    private final Edition a;
    private final String b;
    private final String c;
    private final SubscriptionLevel d;
    private final DeviceOrientation e;
    private final String f;
    private final String g;
    private final String h;
    private final long i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Firebase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.AppsFlyer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public o3(Edition edition, String str, String str2, SubscriptionLevel subscriptionLevel, DeviceOrientation deviceOrientation, String str3, String str4, String str5, long j) {
        zq3.h(edition, "edition");
        zq3.h(str, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str3, "buildNumber");
        zq3.h(str4, "appVersion");
        zq3.h(str5, "sourceApp");
        this.a = edition;
        this.b = str;
        this.c = str2;
        this.d = subscriptionLevel;
        this.e = deviceOrientation;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("app_version", this.g);
        w52Var.a("build_number", this.f);
        w52Var.a("edition", this.a.getTitle());
        w52Var.a("network_status", this.b);
        w52Var.a("orientation", this.e.getTitle());
        w52Var.c("referring_source", this.c);
        w52Var.a("source_app", this.h);
        w52Var.a("subscription_level", this.d.getTitle());
        w52Var.e("time_stamp", this.i);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.e.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1 || i == 2) {
            return "account_creation_succeeded";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return this.a == o3Var.a && zq3.c(this.b, o3Var.b) && zq3.c(this.c, o3Var.c) && this.d == o3Var.d && this.e == o3Var.e && zq3.c(this.f, o3Var.f) && zq3.c(this.g, o3Var.g) && zq3.c(this.h, o3Var.h) && this.i == o3Var.i;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Long.hashCode(this.i);
    }

    public String toString() {
        return "AccountCreationSucceededEvent(edition=" + this.a + ", networkStatus=" + this.b + ", referringSource=" + this.c + ", subscriptionLevel=" + this.d + ", orientation=" + this.e + ", buildNumber=" + this.f + ", appVersion=" + this.g + ", sourceApp=" + this.h + ", timestampSeconds=" + this.i + ")";
    }
}
