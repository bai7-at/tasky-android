package defpackage;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class m86 implements k92, ci2, on {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final DeviceOrientation i;
    private final String j;
    private final String k;
    private final String l;
    private final SubscriptionLevel m;
    private final String n;
    private final long o;
    private final Edition p;
    private final String q;
    private final String r;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.Firebase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Channel.AppsFlyer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public m86(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DeviceOrientation deviceOrientation, String str9, String str10, String str11, SubscriptionLevel subscriptionLevel, String str12, long j, Edition edition, String str13, String str14) {
        zq3.h(str3, "section");
        zq3.h(str4, "sku");
        zq3.h(str5, "itemId");
        zq3.h(str6, "currency");
        zq3.h(str7, "price");
        zq3.h(str8, "transactionId");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str9, "buildNumber");
        zq3.h(str10, "appVersion");
        zq3.h(str11, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str12, "sourceApp");
        zq3.h(edition, "edition");
        zq3.h(str13, "afRevenue");
        zq3.h(str14, "afCurrency");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = deviceOrientation;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = subscriptionLevel;
        this.n = str12;
        this.o = j;
        this.p = edition;
        this.q = str13;
        this.r = str14;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Facebook, Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            w52Var.a("_valueToSum", this.g);
            w52Var.a("fb_currency", this.f);
            w52Var.a("fb_content_id", this.e);
            w52Var.a("fb_order_id", this.h);
            w52Var.a("Bundle Chosen", this.d);
            w52Var.a("Edition", this.p.getTitle());
            w52Var.a("Network Status", this.l);
            w52Var.a("Orientation", this.i.getTitle());
            w52Var.c("Referring Source", this.a);
            w52Var.a("Section", this.c);
            w52Var.a("Subscription Level", this.m.getTitle());
            w52Var.c("url", this.b);
            return;
        }
        if (i == 2 || i == 3) {
            w52Var.a("CURRENCY", this.f);
            w52Var.a("ITEM_ID", this.e);
            w52Var.a("PRICE", this.g);
            w52Var.a("TRANSACTION_ID", this.h);
            w52Var.a(AFInAppEventParameterName.CURRENCY, this.r);
            w52Var.a(AFInAppEventParameterName.REVENUE, this.q);
            w52Var.a("app_version", this.k);
            w52Var.a("build_number", this.j);
            w52Var.a("bundle", this.d);
            w52Var.a("network_status", this.l);
            w52Var.a("orientation", this.i.getTitle());
            w52Var.c("referring_source", this.a);
            w52Var.a("source_app", this.n);
            w52Var.a("subscription_level", this.m.getTitle());
            w52Var.e("time_stamp", this.o);
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            return "Purchase Succeeded";
        }
        if (i == 2) {
            return "Purchase_Succeeded";
        }
        if (i == 3) {
            return "purchase_succeeded";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m86)) {
            return false;
        }
        m86 m86Var = (m86) obj;
        return zq3.c(this.a, m86Var.a) && zq3.c(this.b, m86Var.b) && zq3.c(this.c, m86Var.c) && zq3.c(this.d, m86Var.d) && zq3.c(this.e, m86Var.e) && zq3.c(this.f, m86Var.f) && zq3.c(this.g, m86Var.g) && zq3.c(this.h, m86Var.h) && this.i == m86Var.i && zq3.c(this.j, m86Var.j) && zq3.c(this.k, m86Var.k) && zq3.c(this.l, m86Var.l) && this.m == m86Var.m && zq3.c(this.n, m86Var.n) && this.o == m86Var.o && this.p == m86Var.p && zq3.c(this.q, m86Var.q) && zq3.c(this.r, m86Var.r);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((((((((((((((((((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + Long.hashCode(this.o)) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public String toString() {
        return "PurchaseSucceededEvent(referringSource=" + this.a + ", url=" + this.b + ", section=" + this.c + ", sku=" + this.d + ", itemId=" + this.e + ", currency=" + this.f + ", price=" + this.g + ", transactionId=" + this.h + ", orientation=" + this.i + ", buildNumber=" + this.j + ", appVersion=" + this.k + ", networkStatus=" + this.l + ", subscriptionLevel=" + this.m + ", sourceApp=" + this.n + ", timestampSeconds=" + this.o + ", edition=" + this.p + ", afRevenue=" + this.q + ", afCurrency=" + this.r + ")";
    }

    public /* synthetic */ m86(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DeviceOrientation deviceOrientation, String str9, String str10, String str11, SubscriptionLevel subscriptionLevel, String str12, long j, Edition edition, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, deviceOrientation, str9, str10, str11, subscriptionLevel, str12, j, edition, (i & 65536) != 0 ? str7 : str13, (i & 131072) != 0 ? str6 : str14);
    }
}
