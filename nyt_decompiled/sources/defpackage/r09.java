package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class r09 implements ci2, on {
    private final Long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final DeviceOrientation m;
    private final String n;
    private final String o;
    private final String p;
    private final SubscriptionLevel q;
    private final String r;
    private final long s;

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

    public r09(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, DeviceOrientation deviceOrientation, String str12, String str13, String str14, SubscriptionLevel subscriptionLevel, String str15, long j) {
        zq3.h(str9, "audioUrl");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str12, "buildNumber");
        zq3.h(str13, "appVersion");
        zq3.h(str14, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str15, "sourceApp");
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = deviceOrientation;
        this.n = str12;
        this.o = str13;
        this.p = str14;
        this.q = subscriptionLevel;
        this.r = str15;
        this.s = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.AppsFlyer);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a("app_version", this.o);
        w52Var.f("audio_duration", this.a);
        w52Var.c("audio_franchise", this.b);
        w52Var.c("audio_id", this.c);
        w52Var.c("audio_name", this.d);
        w52Var.c("audio_position", this.e);
        w52Var.c("audio_primary_playlist_id", this.f);
        w52Var.c("audio_primary_playlist_name", this.g);
        w52Var.c("audio_section", this.h);
        w52Var.c("audio_type", this.i);
        w52Var.a("audio_url", this.j);
        w52Var.a("build_number", this.n);
        w52Var.a("network_status", this.p);
        w52Var.a("orientation", this.m.getTitle());
        w52Var.c("podcast_name", this.l);
        w52Var.c("referral_source", this.k);
        w52Var.a("source_app", this.r);
        w52Var.a("subscription_level", this.q.getTitle());
        w52Var.e("time_stamp", this.s);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.m.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            return "userPlayAudio";
        }
        if (i == 2) {
            return "userplayaudio";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r09)) {
            return false;
        }
        r09 r09Var = (r09) obj;
        return zq3.c(this.a, r09Var.a) && zq3.c(this.b, r09Var.b) && zq3.c(this.c, r09Var.c) && zq3.c(this.d, r09Var.d) && zq3.c(this.e, r09Var.e) && zq3.c(this.f, r09Var.f) && zq3.c(this.g, r09Var.g) && zq3.c(this.h, r09Var.h) && zq3.c(this.i, r09Var.i) && zq3.c(this.j, r09Var.j) && zq3.c(this.k, r09Var.k) && zq3.c(this.l, r09Var.l) && this.m == r09Var.m && zq3.c(this.n, r09Var.n) && zq3.c(this.o, r09Var.o) && zq3.c(this.p, r09Var.p) && this.q == r09Var.q && zq3.c(this.r, r09Var.r) && this.s == r09Var.s;
    }

    public int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.j.hashCode()) * 31;
        String str9 = this.k;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        return ((((((((((((((hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + Long.hashCode(this.s);
    }

    public String toString() {
        return "UserPlayAudioEvent(audioDurationInSeconds=" + this.a + ", audioFranchise=" + this.b + ", audioId=" + this.c + ", audioName=" + this.d + ", audioPosition=" + this.e + ", audioPrimaryPlaylistId=" + this.f + ", audioPrimaryPlaylistName=" + this.g + ", audioSection=" + this.h + ", audioType=" + this.i + ", audioUrl=" + this.j + ", referralSource=" + this.k + ", podcastName=" + this.l + ", orientation=" + this.m + ", buildNumber=" + this.n + ", appVersion=" + this.o + ", networkStatus=" + this.p + ", subscriptionLevel=" + this.q + ", sourceApp=" + this.r + ", timestampSeconds=" + this.s + ")";
    }
}
