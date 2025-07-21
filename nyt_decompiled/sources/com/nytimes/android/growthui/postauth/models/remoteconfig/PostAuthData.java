package com.nytimes.android.growthui.postauth.models.remoteconfig;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PostAuthData {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final List f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final List k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final List s;
    private final List t;

    public PostAuthData(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, List list2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list3, List list4) {
        zq3.h(str, "loginNavigationTitle");
        zq3.h(str2, "accountCreatedNavigationTitle");
        zq3.h(str3, "userMessage");
        zq3.h(str4, "header");
        zq3.h(str5, "freeTrialHeader");
        zq3.h(str6, "productIdentifier");
        zq3.h(str7, "cardHeader");
        zq3.h(str8, "cardSubHeader");
        zq3.h(str9, "cardValuePropsButtonText");
        zq3.h(list2, "valueProps");
        zq3.h(str10, "cardCancelNotice");
        zq3.h(str11, "cardSubscribeButtonText");
        zq3.h(str12, "freeTrialCardSubscribeButtonText");
        zq3.h(str13, "cardContinueButtonText");
        zq3.h(str14, "terms");
        zq3.h(str15, "noInternetTitleText");
        zq3.h(str16, "noInternetDetailsText");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = list2;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = str13;
        this.p = str14;
        this.q = str15;
        this.r = str16;
        this.s = list3;
        this.t = list4;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.t;
    }

    public final String c() {
        return this.l;
    }

    public final String d() {
        return this.o;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthData)) {
            return false;
        }
        PostAuthData postAuthData = (PostAuthData) obj;
        return zq3.c(this.a, postAuthData.a) && zq3.c(this.b, postAuthData.b) && zq3.c(this.c, postAuthData.c) && zq3.c(this.d, postAuthData.d) && zq3.c(this.e, postAuthData.e) && zq3.c(this.f, postAuthData.f) && zq3.c(this.g, postAuthData.g) && zq3.c(this.h, postAuthData.h) && zq3.c(this.i, postAuthData.i) && zq3.c(this.j, postAuthData.j) && zq3.c(this.k, postAuthData.k) && zq3.c(this.l, postAuthData.l) && zq3.c(this.m, postAuthData.m) && zq3.c(this.n, postAuthData.n) && zq3.c(this.o, postAuthData.o) && zq3.c(this.p, postAuthData.p) && zq3.c(this.q, postAuthData.q) && zq3.c(this.r, postAuthData.r) && zq3.c(this.s, postAuthData.s) && zq3.c(this.t, postAuthData.t);
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.m;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        List list = this.f;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        List list2 = this.s;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.t;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String i() {
        return this.n;
    }

    public final String j() {
        return this.e;
    }

    public final List k() {
        return this.f;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.a;
    }

    public final String n() {
        return this.r;
    }

    public final String o() {
        return this.q;
    }

    public final List p() {
        return this.s;
    }

    public final String q() {
        return this.g;
    }

    public final String r() {
        return this.p;
    }

    public final String s() {
        return this.c;
    }

    public final List t() {
        return this.k;
    }

    public String toString() {
        return "PostAuthData(loginNavigationTitle=" + this.a + ", accountCreatedNavigationTitle=" + this.b + ", userMessage=" + this.c + ", header=" + this.d + ", freeTrialHeader=" + this.e + ", gameIcons=" + this.f + ", productIdentifier=" + this.g + ", cardHeader=" + this.h + ", cardSubHeader=" + this.i + ", cardValuePropsButtonText=" + this.j + ", valueProps=" + this.k + ", cardCancelNotice=" + this.l + ", cardSubscribeButtonText=" + this.m + ", freeTrialCardSubscribeButtonText=" + this.n + ", cardContinueButtonText=" + this.o + ", terms=" + this.p + ", noInternetTitleText=" + this.q + ", noInternetDetailsText=" + this.r + ", postAuthOfferUrgencyMessages=" + this.s + ", automatedSkuChanges=" + this.t + ")";
    }

    public /* synthetic */ PostAuthData(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, List list2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? i.l() : list2, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? "" : str10, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? i.l() : list3, (i & 524288) != 0 ? i.l() : list4);
    }
}
