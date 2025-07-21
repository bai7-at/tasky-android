package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GamesLandingPageData {
    private final List A;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final List i;
    private final List j;
    private final boolean k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final List s;
    private final List t;
    private final List u;
    private final BadgeDetailsData v;
    private final BadgeDetailsData w;
    private final BadgeDetailsData x;
    private final BadgeDetailsData y;
    private final List z;

    public GamesLandingPageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list3, List list4, List list5, BadgeDetailsData badgeDetailsData, BadgeDetailsData badgeDetailsData2, BadgeDetailsData badgeDetailsData3, BadgeDetailsData badgeDetailsData4, List list6, List list7) {
        zq3.h(str, "gamesHeadline");
        zq3.h(str2, "gamesSubHeadline");
        zq3.h(str3, "gamesFreeTrialHeadline");
        zq3.h(str4, "gamesFreeTrialSubHeadline");
        zq3.h(str5, "allAccessHeadline");
        zq3.h(str6, "allAccessSubHeadline");
        zq3.h(str7, "allAccessFreeTrialHeadline");
        zq3.h(str8, "allAccessFreeTrialSubHeadline");
        zq3.h(list, "icons");
        zq3.h(list2, "tabOrder");
        zq3.h(str9, "gamesTabTitle");
        zq3.h(str10, "allAccessTabTitle");
        zq3.h(str11, "legalTerms");
        zq3.h(str12, "yearlyAdaIdentifier");
        zq3.h(str13, "monthlyGamesIdentifier");
        zq3.h(str14, "monthlyAdaIdentifier");
        zq3.h(str15, "yearlyGamesIdentifier");
        zq3.h(list3, "skuOverrides");
        zq3.h(list6, "gamesValueProps");
        zq3.h(list7, "allAccessValueProps");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = list;
        this.j = list2;
        this.k = z;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = str14;
        this.r = str15;
        this.s = list3;
        this.t = list4;
        this.u = list5;
        this.v = badgeDetailsData;
        this.w = badgeDetailsData2;
        this.x = badgeDetailsData3;
        this.y = badgeDetailsData4;
        this.z = list6;
        this.A = list7;
    }

    public final boolean A() {
        return this.k;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesLandingPageData)) {
            return false;
        }
        GamesLandingPageData gamesLandingPageData = (GamesLandingPageData) obj;
        return zq3.c(this.a, gamesLandingPageData.a) && zq3.c(this.b, gamesLandingPageData.b) && zq3.c(this.c, gamesLandingPageData.c) && zq3.c(this.d, gamesLandingPageData.d) && zq3.c(this.e, gamesLandingPageData.e) && zq3.c(this.f, gamesLandingPageData.f) && zq3.c(this.g, gamesLandingPageData.g) && zq3.c(this.h, gamesLandingPageData.h) && zq3.c(this.i, gamesLandingPageData.i) && zq3.c(this.j, gamesLandingPageData.j) && this.k == gamesLandingPageData.k && zq3.c(this.l, gamesLandingPageData.l) && zq3.c(this.m, gamesLandingPageData.m) && zq3.c(this.n, gamesLandingPageData.n) && zq3.c(this.o, gamesLandingPageData.o) && zq3.c(this.p, gamesLandingPageData.p) && zq3.c(this.q, gamesLandingPageData.q) && zq3.c(this.r, gamesLandingPageData.r) && zq3.c(this.s, gamesLandingPageData.s) && zq3.c(this.t, gamesLandingPageData.t) && zq3.c(this.u, gamesLandingPageData.u) && zq3.c(this.v, gamesLandingPageData.v) && zq3.c(this.w, gamesLandingPageData.w) && zq3.c(this.x, gamesLandingPageData.x) && zq3.c(this.y, gamesLandingPageData.y) && zq3.c(this.z, gamesLandingPageData.z) && zq3.c(this.A, gamesLandingPageData.A);
    }

    public final List f() {
        return this.u;
    }

    public final List g() {
        return this.A;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + Boolean.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31;
        List list = this.t;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.u;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BadgeDetailsData badgeDetailsData = this.v;
        int hashCode4 = (hashCode3 + (badgeDetailsData == null ? 0 : badgeDetailsData.hashCode())) * 31;
        BadgeDetailsData badgeDetailsData2 = this.w;
        int hashCode5 = (hashCode4 + (badgeDetailsData2 == null ? 0 : badgeDetailsData2.hashCode())) * 31;
        BadgeDetailsData badgeDetailsData3 = this.x;
        int hashCode6 = (hashCode5 + (badgeDetailsData3 == null ? 0 : badgeDetailsData3.hashCode())) * 31;
        BadgeDetailsData badgeDetailsData4 = this.y;
        return ((((hashCode6 + (badgeDetailsData4 != null ? badgeDetailsData4.hashCode() : 0)) * 31) + this.z.hashCode()) * 31) + this.A.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return this.l;
    }

    public final List m() {
        return this.t;
    }

    public final List n() {
        return this.z;
    }

    public final List o() {
        return this.i;
    }

    public final String p() {
        return this.n;
    }

    public final BadgeDetailsData q() {
        return this.v;
    }

    public final String r() {
        return this.q;
    }

    public final BadgeDetailsData s() {
        return this.x;
    }

    public final String t() {
        return this.p;
    }

    public String toString() {
        return "GamesLandingPageData(gamesHeadline=" + this.a + ", gamesSubHeadline=" + this.b + ", gamesFreeTrialHeadline=" + this.c + ", gamesFreeTrialSubHeadline=" + this.d + ", allAccessHeadline=" + this.e + ", allAccessSubHeadline=" + this.f + ", allAccessFreeTrialHeadline=" + this.g + ", allAccessFreeTrialSubHeadline=" + this.h + ", icons=" + this.i + ", tabOrder=" + this.j + ", isAllAccessDefault=" + this.k + ", gamesTabTitle=" + this.l + ", allAccessTabTitle=" + this.m + ", legalTerms=" + this.n + ", yearlyAdaIdentifier=" + this.o + ", monthlyGamesIdentifier=" + this.p + ", monthlyAdaIdentifier=" + this.q + ", yearlyGamesIdentifier=" + this.r + ", skuOverrides=" + this.s + ", gamesUrgencyMessages=" + this.t + ", allAccessUrgencyMessages=" + this.u + ", monthlyAdaBadge=" + this.v + ", yearlyAdaBadge=" + this.w + ", monthlyGamesBadge=" + this.x + ", yearlyGamesBadge=" + this.y + ", gamesValueProps=" + this.z + ", allAccessValueProps=" + this.A + ")";
    }

    public final List u() {
        return this.s;
    }

    public final List v() {
        return this.j;
    }

    public final BadgeDetailsData w() {
        return this.w;
    }

    public final String x() {
        return this.o;
    }

    public final BadgeDetailsData y() {
        return this.y;
    }

    public final String z() {
        return this.r;
    }

    public /* synthetic */ GamesLandingPageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list3, List list4, List list5, BadgeDetailsData badgeDetailsData, BadgeDetailsData badgeDetailsData2, BadgeDetailsData badgeDetailsData3, BadgeDetailsData badgeDetailsData4, List list6, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? i.l() : list, (i & 512) != 0 ? i.l() : list2, (i & 1024) != 0 ? false : z, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? "" : str9, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? i.l() : list3, (i & 524288) != 0 ? i.l() : list4, (i & Constants.MB) != 0 ? i.l() : list5, (i & 2097152) != 0 ? null : badgeDetailsData, (i & 4194304) != 0 ? null : badgeDetailsData2, (i & 8388608) != 0 ? null : badgeDetailsData3, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? badgeDetailsData4 : null, (i & 33554432) != 0 ? i.l() : list6, (i & 67108864) != 0 ? i.l() : list7);
    }
}
