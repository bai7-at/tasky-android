package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.values.EnabledOrDisabled;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class iq implements ci2 {
    private final EnabledOrDisabled a;
    private final Integer b;
    private final SubscriptionLevel c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Edition k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final DeviceOrientation q;
    private final String r;
    private final String s;
    private final String t;
    private final long u;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Firebase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public iq(EnabledOrDisabled enabledOrDisabled, Integer num, SubscriptionLevel subscriptionLevel, String str, String str2, String str3, String str4, String str5, String str6, String str7, Edition edition, String str8, String str9, String str10, String str11, String str12, DeviceOrientation deviceOrientation, String str13, String str14, String str15, long j) {
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str, "networkStatus");
        zq3.h(str2, "nightModeStatus");
        zq3.h(edition, "edition");
        zq3.h(str9, "voiceOverEnabled");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str13, "buildNumber");
        zq3.h(str14, "appVersion");
        zq3.h(str15, "sourceApp");
        this.a = enabledOrDisabled;
        this.b = num;
        this.c = subscriptionLevel;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = edition;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = deviceOrientation;
        this.r = str13;
        this.s = str14;
        this.t = str15;
        this.u = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.d(Channel.Firebase);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("app_version", this.s);
        w52Var.c("assetId", this.g);
        w52Var.c("block_dataId", this.p);
        w52Var.c("block_label", this.o);
        w52Var.a("build_number", this.r);
        w52Var.c("content_type", this.l);
        w52Var.c("data_source", this.n);
        w52Var.a("edition", this.k.getTitle());
        EnabledOrDisabled enabledOrDisabled = this.a;
        w52Var.c("hybridStatus", enabledOrDisabled != null ? enabledOrDisabled.getTitle() : null);
        w52Var.d("meter_count", this.b);
        w52Var.a("network_status", this.d);
        w52Var.a("night_mode", this.e);
        w52Var.a("orientation", this.q.getTitle());
        w52Var.c("page_view_id", this.f);
        w52Var.c("referring_source", this.j);
        w52Var.c("section_name", this.i);
        w52Var.a("source_app", this.t);
        w52Var.a("subscription_level", this.c.getTitle());
        w52Var.e("time_stamp", this.u);
        w52Var.c("url", this.h);
        w52Var.a("voiceOverEnabled", this.m);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.q.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        if (a.a[channel.ordinal()] == 1) {
            return AssetConstants.ARTICLE_TYPE;
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return this.a == iqVar.a && zq3.c(this.b, iqVar.b) && this.c == iqVar.c && zq3.c(this.d, iqVar.d) && zq3.c(this.e, iqVar.e) && zq3.c(this.f, iqVar.f) && zq3.c(this.g, iqVar.g) && zq3.c(this.h, iqVar.h) && zq3.c(this.i, iqVar.i) && zq3.c(this.j, iqVar.j) && this.k == iqVar.k && zq3.c(this.l, iqVar.l) && zq3.c(this.m, iqVar.m) && zq3.c(this.n, iqVar.n) && zq3.c(this.o, iqVar.o) && zq3.c(this.p, iqVar.p) && this.q == iqVar.q && zq3.c(this.r, iqVar.r) && zq3.c(this.s, iqVar.s) && zq3.c(this.t, iqVar.t) && this.u == iqVar.u;
    }

    public int hashCode() {
        EnabledOrDisabled enabledOrDisabled = this.a;
        int hashCode = (enabledOrDisabled == null ? 0 : enabledOrDisabled.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.k.hashCode()) * 31;
        String str6 = this.l;
        int hashCode8 = (((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.m.hashCode()) * 31;
        String str7 = this.n;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        return ((((((((((hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + Long.hashCode(this.u);
    }

    public String toString() {
        return "ArticleEvent(hybridEnabled=" + this.a + ", meterCount=" + this.b + ", subscriptionLevel=" + this.c + ", networkStatus=" + this.d + ", nightModeStatus=" + this.e + ", pageViewId=" + this.f + ", assetId=" + this.g + ", url=" + this.h + ", section=" + this.i + ", referringSource=" + this.j + ", edition=" + this.k + ", contentType=" + this.l + ", voiceOverEnabled=" + this.m + ", dataSource=" + this.n + ", blockLabel=" + this.o + ", blockDataId=" + this.p + ", orientation=" + this.q + ", buildNumber=" + this.r + ", appVersion=" + this.s + ", sourceApp=" + this.t + ", timestampSeconds=" + this.u + ")";
    }
}
