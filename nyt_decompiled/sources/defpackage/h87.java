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
public final class h87 implements ci2, on {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final Edition f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final DeviceOrientation k;
    private final String l;
    private final String m;
    private final String n;
    private final SubscriptionLevel o;
    private final String p;
    private final long q;

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

    public h87(String str, String str2, String str3, String str4, int i, Edition edition, String str5, String str6, String str7, String str8, DeviceOrientation deviceOrientation, String str9, String str10, String str11, SubscriptionLevel subscriptionLevel, String str12, long j) {
        zq3.h(str, "actionTaken");
        zq3.h(str4, "method");
        zq3.h(edition, "edition");
        zq3.h(str5, "referringSource");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str9, "buildNumber");
        zq3.h(str10, "appVersion");
        zq3.h(str11, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str12, "sourceApp");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = edition;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = deviceOrientation;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = subscriptionLevel;
        this.p = str12;
        this.q = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("actionTaken", this.a);
        w52Var.a("app_version", this.m);
        w52Var.c("block_dataId", this.j);
        w52Var.c("block_label", this.i);
        w52Var.a("build_number", this.l);
        w52Var.c("data_source", this.h);
        w52Var.a("edition", this.f.getTitle());
        w52Var.a("method", this.d);
        w52Var.a("network_status", this.n);
        w52Var.a("orientation", this.k.getTitle());
        w52Var.a("referring_source", this.g);
        w52Var.c("section", this.c);
        w52Var.a("source_app", this.p);
        w52Var.a("subscription_level", this.o.getTitle());
        w52Var.b("succeeded", this.e);
        w52Var.e("time_stamp", this.q);
        w52Var.c("url", this.b);
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            return "articleSaved";
        }
        if (i == 2) {
            return "articlesaved";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h87)) {
            return false;
        }
        h87 h87Var = (h87) obj;
        return zq3.c(this.a, h87Var.a) && zq3.c(this.b, h87Var.b) && zq3.c(this.c, h87Var.c) && zq3.c(this.d, h87Var.d) && this.e == h87Var.e && this.f == h87Var.f && zq3.c(this.g, h87Var.g) && zq3.c(this.h, h87Var.h) && zq3.c(this.i, h87Var.i) && zq3.c(this.j, h87Var.j) && this.k == h87Var.k && zq3.c(this.l, h87Var.l) && zq3.c(this.m, h87Var.m) && zq3.c(this.n, h87Var.n) && this.o == h87Var.o && zq3.c(this.p, h87Var.p) && this.q == h87Var.q;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return ((((((((((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + Long.hashCode(this.q);
    }

    public String toString() {
        return "SaveEvent(actionTaken=" + this.a + ", url=" + this.b + ", section=" + this.c + ", method=" + this.d + ", succeeded=" + this.e + ", edition=" + this.f + ", referringSource=" + this.g + ", dataSource=" + this.h + ", blockLabel=" + this.i + ", blockDataId=" + this.j + ", orientation=" + this.k + ", buildNumber=" + this.l + ", appVersion=" + this.m + ", networkStatus=" + this.n + ", subscriptionLevel=" + this.o + ", sourceApp=" + this.p + ", timestampSeconds=" + this.q + ")";
    }
}
