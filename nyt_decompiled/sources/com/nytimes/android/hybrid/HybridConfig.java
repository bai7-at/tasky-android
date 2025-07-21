package com.nytimes.android.hybrid;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridConfig {
    public static final a Companion = new a(null);
    private final float a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final Boolean e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final int l;
    private final Map m;
    private final Map n;
    private final Map o;
    private final HybridTcfInfo p;
    private final HybridUserInfo q;
    private final boolean r;
    private final Boolean s;
    private final Boolean t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridConfig(@bt3(name = "BaseFontSize") float f, @bt3(name = "Theme") String str, @bt3(name = "LoggedIn") Boolean bool, @bt3(name = "deepLinkType") String str2, @bt3(name = "Subscriber") Boolean bool2, @bt3(name = "Device") String str3, @bt3(name = "OS") String str4, String str5, @bt3(name = "OSVersion") String str6, @bt3(name = "AppVersion") String str7, @bt3(name = "Timezone") String str8, @bt3(name = "ConnectionStatus") int i, @bt3(name = "AbraConfig") Map<String, String> map, @bt3(name = "AdRequirements") Map<String, String> map2, @bt3(name = "PurrDirectives") Map<String, String> map3, @bt3(name = "tc_info") HybridTcfInfo hybridTcfInfo, HybridUserInfo hybridUserInfo, @bt3(name = "NativeAds") boolean z, Boolean bool3, Boolean bool4) {
        zq3.h(str, "theme");
        zq3.h(str4, "os");
        zq3.h(map3, "purrDirectives");
        this.a = f;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = bool2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = i;
        this.m = map;
        this.n = map2;
        this.o = map3;
        this.p = hybridTcfInfo;
        this.q = hybridUserInfo;
        this.r = z;
        this.s = bool3;
        this.t = bool4;
    }

    public final Map a() {
        return this.m;
    }

    public final Map b() {
        return this.n;
    }

    public final String c() {
        return this.j;
    }

    public final HybridConfig copy(@bt3(name = "BaseFontSize") float f, @bt3(name = "Theme") String str, @bt3(name = "LoggedIn") Boolean bool, @bt3(name = "deepLinkType") String str2, @bt3(name = "Subscriber") Boolean bool2, @bt3(name = "Device") String str3, @bt3(name = "OS") String str4, String str5, @bt3(name = "OSVersion") String str6, @bt3(name = "AppVersion") String str7, @bt3(name = "Timezone") String str8, @bt3(name = "ConnectionStatus") int i, @bt3(name = "AbraConfig") Map<String, String> map, @bt3(name = "AdRequirements") Map<String, String> map2, @bt3(name = "PurrDirectives") Map<String, String> map3, @bt3(name = "tc_info") HybridTcfInfo hybridTcfInfo, HybridUserInfo hybridUserInfo, @bt3(name = "NativeAds") boolean z, Boolean bool3, Boolean bool4) {
        zq3.h(str, "theme");
        zq3.h(str4, "os");
        zq3.h(map3, "purrDirectives");
        return new HybridConfig(f, str, bool, str2, bool2, str3, str4, str5, str6, str7, str8, i, map, map2, map3, hybridTcfInfo, hybridUserInfo, z, bool3, bool4);
    }

    public final float d() {
        return this.a;
    }

    public final int e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridConfig)) {
            return false;
        }
        HybridConfig hybridConfig = (HybridConfig) obj;
        return Float.compare(this.a, hybridConfig.a) == 0 && zq3.c(this.b, hybridConfig.b) && zq3.c(this.c, hybridConfig.c) && zq3.c(this.d, hybridConfig.d) && zq3.c(this.e, hybridConfig.e) && zq3.c(this.f, hybridConfig.f) && zq3.c(this.g, hybridConfig.g) && zq3.c(this.h, hybridConfig.h) && zq3.c(this.i, hybridConfig.i) && zq3.c(this.j, hybridConfig.j) && zq3.c(this.k, hybridConfig.k) && this.l == hybridConfig.l && zq3.c(this.m, hybridConfig.m) && zq3.c(this.n, hybridConfig.n) && zq3.c(this.o, hybridConfig.o) && zq3.c(this.p, hybridConfig.p) && zq3.c(this.q, hybridConfig.q) && this.r == hybridConfig.r && zq3.c(this.s, hybridConfig.s) && zq3.c(this.t, hybridConfig.t);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f;
    }

    public final Boolean h() {
        return this.s;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g.hashCode()) * 31;
        String str3 = this.h;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode9 = (((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.l)) * 31;
        Map map = this.m;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.n;
        int hashCode11 = (((hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31) + this.o.hashCode()) * 31;
        HybridTcfInfo hybridTcfInfo = this.p;
        int hashCode12 = (hashCode11 + (hybridTcfInfo == null ? 0 : hybridTcfInfo.hashCode())) * 31;
        HybridUserInfo hybridUserInfo = this.q;
        int hashCode13 = (((hashCode12 + (hybridUserInfo == null ? 0 : hybridUserInfo.hashCode())) * 31) + Boolean.hashCode(this.r)) * 31;
        Boolean bool3 = this.s;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.t;
        return hashCode14 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final HybridTcfInfo i() {
        return this.p;
    }

    public final String j() {
        return this.h;
    }

    public final Boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.r;
    }

    public final String m() {
        return this.g;
    }

    public final String n() {
        return this.i;
    }

    public final Map o() {
        return this.o;
    }

    public final Boolean p() {
        return this.e;
    }

    public final String q() {
        return this.b;
    }

    public final String r() {
        return this.k;
    }

    public final Boolean s() {
        return this.t;
    }

    public final HybridUserInfo t() {
        return this.q;
    }

    public String toString() {
        return "HybridConfig(baseFontSize=" + this.a + ", theme=" + this.b + ", loggedIn=" + this.c + ", deepLinkType=" + this.d + ", subscriber=" + this.e + ", device=" + this.f + ", os=" + this.g + ", language=" + this.h + ", osVersion=" + this.i + ", appVersion=" + this.j + ", timezone=" + this.k + ", connectionStatus=" + this.l + ", abraConfig=" + this.m + ", adRequirements=" + this.n + ", purrDirectives=" + this.o + ", hybridTcfInfo=" + this.p + ", userInfo=" + this.q + ", nativeAds=" + this.r + ", hasOptedOutOfTracking=" + this.s + ", trackingSensitive=" + this.t + ")";
    }

    public /* synthetic */ HybridConfig(float f, String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Map map, Map map2, Map map3, HybridTcfInfo hybridTcfInfo, HybridUserInfo hybridUserInfo, boolean z, Boolean bool3, Boolean bool4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, str, bool, str2, bool2, str3, (i2 & 64) != 0 ? "Android" : str4, str5, str6, str7, str8, i, (Map<String, String>) map, (Map<String, String>) map2, (Map<String, String>) ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t.i() : map3), (32768 & i2) != 0 ? null : hybridTcfInfo, (65536 & i2) != 0 ? null : hybridUserInfo, (i2 & 131072) != 0 ? true : z, bool3, bool4);
    }

    public /* synthetic */ HybridConfig(float f, boolean z, Boolean bool, String str, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, int i, Map map, Map map2, Map map3, HybridTcfInfo hybridTcfInfo, HybridUserInfo hybridUserInfo, boolean z2, Boolean bool3, Boolean bool4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2.0f : f, (i2 & 2) != 0 ? false : z, bool, str, (i2 & 16) != 0 ? null : bool2, str2, (i2 & 64) != 0 ? "Android" : str3, str4, str5, str6, str7, i, map, map2, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? t.i() : map3, (32768 & i2) != 0 ? null : hybridTcfInfo, (65536 & i2) != 0 ? null : hybridUserInfo, (131072 & i2) != 0 ? true : z2, (262144 & i2) != 0 ? null : bool3, (i2 & 524288) != 0 ? null : bool4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HybridConfig(float f, boolean z, Boolean bool, String str, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, int i, Map map, Map map2, Map map3, HybridTcfInfo hybridTcfInfo, HybridUserInfo hybridUserInfo, boolean z2, Boolean bool3, Boolean bool4) {
        this(f, z ? "dark" : "light", bool, str, bool2, str2, str3, str4, str5, str6, str7, i, (Map<String, String>) map, (Map<String, String>) map2, (Map<String, String>) map3, hybridTcfInfo, hybridUserInfo, z2, bool3, bool4);
        zq3.h(str3, "os");
        zq3.h(map3, "purrDirectives");
    }
}
