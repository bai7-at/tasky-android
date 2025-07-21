package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.video.VideoType;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class s09 implements ci2, on {
    private final String a;
    private final String b;
    private final String c;
    private final Long d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final VideoType j;
    private final String k;
    private final String l;
    private final String m;
    private final long n;
    private final String o;
    private final String p;
    private final Integer q;
    private final Integer r;
    private final Edition s;
    private final DeviceOrientation t;
    private final String u;
    private final String v;
    private final String w;
    private final SubscriptionLevel x;
    private final String y;
    private final long z;

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

    public s09(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, VideoType videoType, String str9, String str10, String str11, long j, String str12, String str13, Integer num, Integer num2, Edition edition, DeviceOrientation deviceOrientation, String str14, String str15, String str16, SubscriptionLevel subscriptionLevel, String str17, long j2) {
        zq3.h(str, "videoName");
        zq3.h(str3, "videoId");
        zq3.h(videoType, "videoType");
        zq3.h(str10, "device");
        zq3.h(str11, "autoPlaySettings");
        zq3.h(edition, "edition");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str14, "buildNumber");
        zq3.h(str15, "appVersion");
        zq3.h(str16, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str17, "sourceApp");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = videoType;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = j;
        this.o = str12;
        this.p = str13;
        this.q = num;
        this.r = num2;
        this.s = edition;
        this.t = deviceOrientation;
        this.u = str14;
        this.v = str15;
        this.w = str16;
        this.x = subscriptionLevel;
        this.y = str17;
        this.z = j2;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.c("agentId", this.k);
        w52Var.a("app_version", this.v);
        w52Var.c("aspect_ratio", this.p);
        w52Var.a("autoplay_video_settings", this.m);
        w52Var.a("build_number", this.u);
        w52Var.d("captions_available", this.q);
        w52Var.d("captions_enabled", this.r);
        w52Var.e("clientEventTime", this.n);
        w52Var.a("device", this.l);
        w52Var.a("edition", this.s.getTitle());
        w52Var.a("network_status", this.w);
        w52Var.a("orientation", this.t.getTitle());
        w52Var.c("referring_source", this.o);
        w52Var.c("regiId", this.b);
        w52Var.a("source_app", this.y);
        w52Var.a("subscription_level", this.x.getTitle());
        w52Var.e("time_stamp", this.z);
        w52Var.f("videoDuration", this.d);
        w52Var.c("videoFranchise", this.e);
        w52Var.a("videoId", this.c);
        w52Var.a("videoName", this.a);
        w52Var.c("videoPlaylistId", this.g);
        w52Var.c("videoPlaylistName", this.h);
        w52Var.c("videoSection", this.f);
        w52Var.a("videoType", this.j.getTitle());
        w52Var.c("videoUrl", this.i);
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1 || i == 2) {
            return "user_play";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s09)) {
            return false;
        }
        s09 s09Var = (s09) obj;
        return zq3.c(this.a, s09Var.a) && zq3.c(this.b, s09Var.b) && zq3.c(this.c, s09Var.c) && zq3.c(this.d, s09Var.d) && zq3.c(this.e, s09Var.e) && zq3.c(this.f, s09Var.f) && zq3.c(this.g, s09Var.g) && zq3.c(this.h, s09Var.h) && zq3.c(this.i, s09Var.i) && this.j == s09Var.j && zq3.c(this.k, s09Var.k) && zq3.c(this.l, s09Var.l) && zq3.c(this.m, s09Var.m) && this.n == s09Var.n && zq3.c(this.o, s09Var.o) && zq3.c(this.p, s09Var.p) && zq3.c(this.q, s09Var.q) && zq3.c(this.r, s09Var.r) && this.s == s09Var.s && this.t == s09Var.t && zq3.c(this.u, s09Var.u) && zq3.c(this.v, s09Var.v) && zq3.c(this.w, s09Var.w) && this.x == s09Var.x && zq3.c(this.y, s09Var.y) && this.z == s09Var.z;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        Long l = this.d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode8 = (((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.j.hashCode()) * 31;
        String str7 = this.k;
        int hashCode9 = (((((((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + Long.hashCode(this.n)) * 31;
        String str8 = this.o;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.q;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.r;
        return ((((((((((((((((hashCode12 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + Long.hashCode(this.z);
    }

    public String toString() {
        return "UserPlayEvent(videoName=" + this.a + ", regiId=" + this.b + ", videoId=" + this.c + ", videoDurationInSecs=" + this.d + ", videoFranchise=" + this.e + ", videoSection=" + this.f + ", videoPlaylistId=" + this.g + ", videoPlaylistName=" + this.h + ", videoUrl=" + this.i + ", videoType=" + this.j + ", agentId=" + this.k + ", device=" + this.l + ", autoPlaySettings=" + this.m + ", clientEventTime=" + this.n + ", referringSource=" + this.o + ", aspectRatio=" + this.p + ", captionsAvailable=" + this.q + ", captionsEnabled=" + this.r + ", edition=" + this.s + ", orientation=" + this.t + ", buildNumber=" + this.u + ", appVersion=" + this.v + ", networkStatus=" + this.w + ", subscriptionLevel=" + this.x + ", sourceApp=" + this.y + ", timestampSeconds=" + this.z + ")";
    }
}
