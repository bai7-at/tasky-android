package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.navigation.NavigationSource;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class y25 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final h90 h;
    private final Integer i;
    private final NavigationSource j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final Map q;
    private final Map r;
    private final Map s;
    private final String t;

    public y25(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, h90 h90Var, Integer num, NavigationSource navigationSource, String str6, String str7, String str8, String str9, String str10, String str11, Map map, Map map2, Map map3) {
        String str12 = str;
        zq3.h(str2, TransferTable.COLUMN_TYPE);
        zq3.h(str3, "uri");
        zq3.h(str4, "sectionId");
        zq3.h(str5, "sectionTitle");
        zq3.h(navigationSource, "source");
        this.a = str12;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = h90Var;
        this.i = num;
        this.j = navigationSource;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = map;
        this.r = map2;
        this.s = map3;
        this.t = str12 == null ? "" : str12;
    }

    public final Map a() {
        return this.q;
    }

    public final Map b() {
        return this.r;
    }

    public final Map c() {
        return this.s;
    }

    public final String d() {
        return this.k;
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25Var = (y25) obj;
        return zq3.c(this.a, y25Var.a) && zq3.c(this.b, y25Var.b) && zq3.c(this.c, y25Var.c) && zq3.c(this.d, y25Var.d) && zq3.c(this.e, y25Var.e) && this.f == y25Var.f && this.g == y25Var.g && zq3.c(this.h, y25Var.h) && zq3.c(this.i, y25Var.i) && this.j == y25Var.j && zq3.c(this.k, y25Var.k) && zq3.c(this.l, y25Var.l) && zq3.c(this.m, y25Var.m) && zq3.c(this.n, y25Var.n) && zq3.c(this.o, y25Var.o) && zq3.c(this.p, y25Var.p) && zq3.c(this.q, y25Var.q) && zq3.c(this.r, y25Var.r) && zq3.c(this.s, y25Var.s);
    }

    public final String f() {
        return this.n;
    }

    public final String g() {
        return this.o;
    }

    public final String h() {
        return this.m;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31;
        h90 h90Var = this.h;
        int hashCode2 = (hashCode + (h90Var == null ? 0 : h90Var.hashCode())) * 31;
        Integer num = this.i;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.j.hashCode()) * 31;
        String str2 = this.k;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.q;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.r;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.s;
        return hashCode11 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String i() {
        return this.l;
    }

    public final String j() {
        return this.p;
    }

    public final Integer k() {
        return this.i;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.e;
    }

    public final NavigationSource n() {
        return this.j;
    }

    public final String o() {
        return this.b;
    }

    public final String p() {
        return this.c;
    }

    public final String q() {
        return this.a;
    }

    public final String r() {
        return this.t;
    }

    public final boolean s() {
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return rb5.q(str);
    }

    public final boolean t() {
        if (this.f) {
            String str = this.a;
            if (str == null) {
                str = "";
            }
            if (!rb5.l(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "NavigationItem(url=" + this.a + ", type=" + this.b + ", uri=" + this.c + ", sectionId=" + this.d + ", sectionTitle=" + this.e + ", isInteractiveOrPromo=" + this.f + ", checkCookingRegiWall=" + this.g + ", blockAttributes=" + this.h + ", packageIndex=" + this.i + ", source=" + this.j + ", channelUri=" + this.k + ", et2Label=" + this.l + ", et2Context=" + this.m + ", elementLabel=" + this.n + ", elementName=" + this.o + ", moduleName=" + this.p + ", algos=" + this.q + ", block=" + this.r + ", card=" + this.s + ")";
    }

    public final boolean u() {
        String str = this.a;
        if (!(str != null ? h.P(str, "spelling-bee", false, 2, null) : false)) {
            return false;
        }
        String str2 = this.a;
        return str2 != null && !h.P(str2, ".html", false, 2, null);
    }

    public /* synthetic */ y25(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, h90 h90Var, Integer num, NavigationSource navigationSource, String str6, String str7, String str8, String str9, String str10, String str11, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z, z2, h90Var, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : num, navigationSource, str6, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str7, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : map, (131072 & i) != 0 ? null : map2, (i & 262144) != 0 ? null : map3);
    }
}
