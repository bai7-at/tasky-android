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
public final class ha4 implements ci2, on {
    private final String a;
    private final String b;
    private final int c;
    private final Edition d;
    private final String e;
    private final DeviceOrientation f;
    private final String g;
    private final String h;
    private final String i;
    private final SubscriptionLevel j;
    private final String k;
    private final long l;

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

    public ha4(String str, String str2, int i, Edition edition, String str3, DeviceOrientation deviceOrientation, String str4, String str5, String str6, SubscriptionLevel subscriptionLevel, String str7, long j) {
        zq3.h(str, "loginMethod");
        zq3.h(str2, "method");
        zq3.h(edition, "edition");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str4, "buildNumber");
        zq3.h(str5, "appVersion");
        zq3.h(str6, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str7, "sourceApp");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = edition;
        this.e = str3;
        this.f = deviceOrientation;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = subscriptionLevel;
        this.k = str7;
        this.l = j;
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
        w52Var.a("edition", this.d.getTitle());
        w52Var.a("loginMethod", this.a);
        w52Var.a("method", this.b);
        w52Var.a("network_status", this.i);
        w52Var.a("orientation", this.f.getTitle());
        w52Var.c("referring_source", this.e);
        w52Var.a("source_app", this.k);
        w52Var.a("subscription_level", this.j.getTitle());
        w52Var.b("succeeded", this.c);
        w52Var.e("time_stamp", this.l);
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            return "logIn";
        }
        if (i == 2) {
            return "login";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha4)) {
            return false;
        }
        ha4 ha4Var = (ha4) obj;
        return zq3.c(this.a, ha4Var.a) && zq3.c(this.b, ha4Var.b) && this.c == ha4Var.c && this.d == ha4Var.d && zq3.c(this.e, ha4Var.e) && this.f == ha4Var.f && zq3.c(this.g, ha4Var.g) && zq3.c(this.h, ha4Var.h) && zq3.c(this.i, ha4Var.i) && this.j == ha4Var.j && zq3.c(this.k, ha4Var.k) && this.l == ha4Var.l;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return ((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + Long.hashCode(this.l);
    }

    public String toString() {
        return "LoginEvent(loginMethod=" + this.a + ", method=" + this.b + ", succeeded=" + this.c + ", edition=" + this.d + ", referringSource=" + this.e + ", orientation=" + this.f + ", buildNumber=" + this.g + ", appVersion=" + this.h + ", networkStatus=" + this.i + ", subscriptionLevel=" + this.j + ", sourceApp=" + this.k + ", timestampSeconds=" + this.l + ")";
    }
}
