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
public final class ty3 implements ci2, on {
    private final Edition a;
    private final String b;
    private final String c;
    private final SubscriptionLevel d;
    private final String e;
    private final DeviceOrientation f;
    private final String g;
    private final String h;
    private final String i;
    private final long j;

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

    public ty3(Edition edition, String str, String str2, SubscriptionLevel subscriptionLevel, String str3, DeviceOrientation deviceOrientation, String str4, String str5, String str6, long j) {
        zq3.h(edition, "edition");
        zq3.h(str, "networkStatus");
        zq3.h(str2, "referringSource");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str3, "section");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str4, "buildNumber");
        zq3.h(str5, "appVersion");
        zq3.h(str6, "sourceApp");
        this.a = edition;
        this.b = str;
        this.c = str2;
        this.d = subscriptionLevel;
        this.e = str3;
        this.f = deviceOrientation;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("app_version", this.h);
        w52Var.a("build_number", this.g);
        w52Var.a("edition", this.a.getTitle());
        w52Var.a("network_status", this.b);
        w52Var.a("orientation", this.f.getTitle());
        w52Var.a("referring_source", this.c);
        w52Var.a("section", this.e);
        w52Var.a("source_app", this.i);
        w52Var.a("subscription_level", this.d.getTitle());
        w52Var.e("time_stamp", this.j);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.f.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1 || i == 2) {
            return "launch_app";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty3)) {
            return false;
        }
        ty3 ty3Var = (ty3) obj;
        return this.a == ty3Var.a && zq3.c(this.b, ty3Var.b) && zq3.c(this.c, ty3Var.c) && this.d == ty3Var.d && zq3.c(this.e, ty3Var.e) && this.f == ty3Var.f && zq3.c(this.g, ty3Var.g) && zq3.c(this.h, ty3Var.h) && zq3.c(this.i, ty3Var.i) && this.j == ty3Var.j;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + Long.hashCode(this.j);
    }

    public String toString() {
        return "LaunchEvent(edition=" + this.a + ", networkStatus=" + this.b + ", referringSource=" + this.c + ", subscriptionLevel=" + this.d + ", section=" + this.e + ", orientation=" + this.f + ", buildNumber=" + this.g + ", appVersion=" + this.h + ", sourceApp=" + this.i + ", timestampSeconds=" + this.j + ")";
    }
}
