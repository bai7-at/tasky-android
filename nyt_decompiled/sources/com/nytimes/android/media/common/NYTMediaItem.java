package com.nytimes.android.media.common;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.player.PlaybackVolume;
import com.nytimes.android.media.util.VideoUtil;
import defpackage.b22;
import defpackage.v50;
import defpackage.zq3;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import type.VideoProductionType;

/* loaded from: classes4.dex */
public final class NYTMediaItem implements v50 {
    private final Long A;
    private final String B;
    private final boolean C;
    private final String D;
    private final String E;
    private final String F;
    private final Map G;
    private final String H;
    private final boolean I;
    private final String J;
    private final boolean K;
    private final boolean L;
    private final VideoProductionType M;
    private final String N;
    private final VideoUtil.VideoRes O;
    private final ActiveView P;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final Long m;
    private final String n;
    private final AudioPosition o;
    private final AudioType p;
    private final Long q;
    private final String r;
    private final String s;
    private final Long t;
    private final String u;
    private final String v;
    private final String w;
    private final String x;
    private final Boolean y;
    private final PlaybackVolume z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ActiveView {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ActiveView[] $VALUES;
        public static final ActiveView INLINE = new ActiveView("INLINE", 0);
        public static final ActiveView FULL_SCREEN = new ActiveView("FULL_SCREEN", 1);

        private static final /* synthetic */ ActiveView[] $values() {
            return new ActiveView[]{INLINE, FULL_SCREEN};
        }

        static {
            ActiveView[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ActiveView(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ActiveView valueOf(String str) {
            return (ActiveView) Enum.valueOf(ActiveView.class, str);
        }

        public static ActiveView[] values() {
            return (ActiveView[]) $VALUES.clone();
        }
    }

    public NYTMediaItem(String str, String str2, String str3, String str4, long j, boolean z, boolean z2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, AudioPosition audioPosition, AudioType audioType, Long l2, String str11, String str12, Long l3, String str13, String str14, String str15, String str16, Boolean bool, PlaybackVolume playbackVolume, Long l4, String str17, boolean z3, String str18, String str19, String str20, Map map, String str21, boolean z4, String str22, boolean z5, boolean z6, VideoProductionType videoProductionType, String str23, VideoUtil.VideoRes videoRes, ActiveView activeView) {
        zq3.h(str, "mediaId");
        zq3.h(str2, "mediaUrl");
        zq3.h(str3, "displayTitle");
        zq3.h(playbackVolume, "volume");
        zq3.h(map, "assetDfpParameters");
        zq3.h(str22, "uniqueId");
        zq3.h(videoProductionType, "productionType");
        zq3.h(videoRes, "videoRes");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = l;
        this.n = str10;
        this.o = audioPosition;
        this.p = audioType;
        this.q = l2;
        this.r = str11;
        this.s = str12;
        this.t = l3;
        this.u = str13;
        this.v = str14;
        this.w = str15;
        this.x = str16;
        this.y = bool;
        this.z = playbackVolume;
        this.A = l4;
        this.B = str17;
        this.C = z3;
        this.D = str18;
        this.E = str19;
        this.F = str20;
        this.G = map;
        this.H = str21;
        this.I = z4;
        this.J = str22;
        this.K = z5;
        this.L = z6;
        this.M = videoProductionType;
        this.N = str23;
        this.O = videoRes;
        this.P = activeView;
    }

    public static /* synthetic */ NYTMediaItem m(NYTMediaItem nYTMediaItem, String str, String str2, String str3, String str4, long j, boolean z, boolean z2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, AudioPosition audioPosition, AudioType audioType, Long l2, String str11, String str12, Long l3, String str13, String str14, String str15, String str16, Boolean bool, PlaybackVolume playbackVolume, Long l4, String str17, boolean z3, String str18, String str19, String str20, Map map, String str21, boolean z4, String str22, boolean z5, boolean z6, VideoProductionType videoProductionType, String str23, VideoUtil.VideoRes videoRes, ActiveView activeView, int i, int i2, Object obj) {
        return nYTMediaItem.l((i & 1) != 0 ? nYTMediaItem.a : str, (i & 2) != 0 ? nYTMediaItem.b : str2, (i & 4) != 0 ? nYTMediaItem.c : str3, (i & 8) != 0 ? nYTMediaItem.d : str4, (i & 16) != 0 ? nYTMediaItem.e : j, (i & 32) != 0 ? nYTMediaItem.f : z, (i & 64) != 0 ? nYTMediaItem.g : z2, (i & 128) != 0 ? nYTMediaItem.h : str5, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nYTMediaItem.i : str6, (i & 512) != 0 ? nYTMediaItem.j : str7, (i & 1024) != 0 ? nYTMediaItem.k : str8, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nYTMediaItem.l : str9, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nYTMediaItem.m : l, (i & 8192) != 0 ? nYTMediaItem.n : str10, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? nYTMediaItem.o : audioPosition, (i & 32768) != 0 ? nYTMediaItem.p : audioType, (i & 65536) != 0 ? nYTMediaItem.q : l2, (i & 131072) != 0 ? nYTMediaItem.r : str11, (i & 262144) != 0 ? nYTMediaItem.s : str12, (i & 524288) != 0 ? nYTMediaItem.t : l3, (i & Constants.MB) != 0 ? nYTMediaItem.u : str13, (i & 2097152) != 0 ? nYTMediaItem.v : str14, (i & 4194304) != 0 ? nYTMediaItem.w : str15, (i & 8388608) != 0 ? nYTMediaItem.x : str16, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? nYTMediaItem.y : bool, (i & 33554432) != 0 ? nYTMediaItem.z : playbackVolume, (i & 67108864) != 0 ? nYTMediaItem.A : l4, (i & 134217728) != 0 ? nYTMediaItem.B : str17, (i & 268435456) != 0 ? nYTMediaItem.C : z3, (i & 536870912) != 0 ? nYTMediaItem.D : str18, (i & 1073741824) != 0 ? nYTMediaItem.E : str19, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? nYTMediaItem.F : str20, (i2 & 1) != 0 ? nYTMediaItem.G : map, (i2 & 2) != 0 ? nYTMediaItem.H : str21, (i2 & 4) != 0 ? nYTMediaItem.I : z4, (i2 & 8) != 0 ? nYTMediaItem.J : str22, (i2 & 16) != 0 ? nYTMediaItem.K : z5, (i2 & 32) != 0 ? nYTMediaItem.L : z6, (i2 & 64) != 0 ? nYTMediaItem.M : videoProductionType, (i2 & 128) != 0 ? nYTMediaItem.N : str23, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nYTMediaItem.O : videoRes, (i2 & 512) != 0 ? nYTMediaItem.P : activeView);
    }

    public final String A() {
        return this.c;
    }

    public final Long B() {
        return this.m;
    }

    public final String C() {
        return this.n;
    }

    public final String D() {
        return this.a;
    }

    public final String E() {
        return this.b;
    }

    public final String F() {
        return this.B;
    }

    public final Long G() {
        return this.t;
    }

    public final String H() {
        return this.s;
    }

    public final String I() {
        return this.x;
    }

    public final String J() {
        return this.r;
    }

    public final String K() {
        return this.N;
    }

    public final String L() {
        return this.J;
    }

    public final VideoUtil.VideoRes M() {
        return this.O;
    }

    public final String N() {
        return this.k;
    }

    public final boolean O() {
        return this.g;
    }

    public final boolean P() {
        return this.p != null;
    }

    public final boolean Q() {
        return this.f;
    }

    public final boolean R() {
        return this.C;
    }

    public final boolean S() {
        return this.f && this.z == PlaybackVolume.OFF;
    }

    public final boolean T() {
        return this.I;
    }

    public final boolean U() {
        return this.p == null;
    }

    public final Long V() {
        return this.m;
    }

    public final String W() {
        return this.n;
    }

    public final Long X() {
        try {
            return Long.valueOf(Long.parseLong(a()));
        } catch (NumberFormatException unused) {
            NYTLogger.g("error parsing media id", new Object[0]);
            return null;
        }
    }

    public final String Y() {
        return this.b;
    }

    public final Long Z() {
        return this.A;
    }

    @Override // defpackage.v50
    public String a() {
        return this.a;
    }

    public final Long a0() {
        return this.t;
    }

    public final String b() {
        return this.H;
    }

    public final String b0() {
        return this.s;
    }

    public final String c() {
        return this.l;
    }

    public final String c0() {
        return this.D;
    }

    public final Boolean d() {
        return this.y;
    }

    public final String d0() {
        return this.x;
    }

    public final String e() {
        return this.w;
    }

    public final String e0() {
        return this.r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NYTMediaItem)) {
            return false;
        }
        NYTMediaItem nYTMediaItem = (NYTMediaItem) obj;
        return zq3.c(this.a, nYTMediaItem.a) && zq3.c(this.b, nYTMediaItem.b) && zq3.c(this.c, nYTMediaItem.c) && zq3.c(this.d, nYTMediaItem.d) && this.e == nYTMediaItem.e && this.f == nYTMediaItem.f && this.g == nYTMediaItem.g && zq3.c(this.h, nYTMediaItem.h) && zq3.c(this.i, nYTMediaItem.i) && zq3.c(this.j, nYTMediaItem.j) && zq3.c(this.k, nYTMediaItem.k) && zq3.c(this.l, nYTMediaItem.l) && zq3.c(this.m, nYTMediaItem.m) && zq3.c(this.n, nYTMediaItem.n) && this.o == nYTMediaItem.o && this.p == nYTMediaItem.p && zq3.c(this.q, nYTMediaItem.q) && zq3.c(this.r, nYTMediaItem.r) && zq3.c(this.s, nYTMediaItem.s) && zq3.c(this.t, nYTMediaItem.t) && zq3.c(this.u, nYTMediaItem.u) && zq3.c(this.v, nYTMediaItem.v) && zq3.c(this.w, nYTMediaItem.w) && zq3.c(this.x, nYTMediaItem.x) && zq3.c(this.y, nYTMediaItem.y) && this.z == nYTMediaItem.z && zq3.c(this.A, nYTMediaItem.A) && zq3.c(this.B, nYTMediaItem.B) && this.C == nYTMediaItem.C && zq3.c(this.D, nYTMediaItem.D) && zq3.c(this.E, nYTMediaItem.E) && zq3.c(this.F, nYTMediaItem.F) && zq3.c(this.G, nYTMediaItem.G) && zq3.c(this.H, nYTMediaItem.H) && this.I == nYTMediaItem.I && zq3.c(this.J, nYTMediaItem.J) && this.K == nYTMediaItem.K && this.L == nYTMediaItem.L && this.M == nYTMediaItem.M && zq3.c(this.N, nYTMediaItem.N) && this.O == nYTMediaItem.O && this.P == nYTMediaItem.P;
    }

    public final Map f() {
        return this.G;
    }

    public final Long f0() {
        return this.q;
    }

    public final String g() {
        return this.i;
    }

    public final String g0() {
        return this.v;
    }

    public final AudioPosition h() {
        return this.o;
    }

    public final String h0() {
        return this.u;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.m;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.n;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AudioPosition audioPosition = this.o;
        int hashCode10 = (hashCode9 + (audioPosition == null ? 0 : audioPosition.hashCode())) * 31;
        AudioType audioType = this.p;
        int hashCode11 = (hashCode10 + (audioType == null ? 0 : audioType.hashCode())) * 31;
        Long l2 = this.q;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.r;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.s;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l3 = this.t;
        int hashCode15 = (hashCode14 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str10 = this.u;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.v;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.w;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.x;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.y;
        int hashCode20 = (((hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31) + this.z.hashCode()) * 31;
        Long l4 = this.A;
        int hashCode21 = (hashCode20 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str14 = this.B;
        int hashCode22 = (((hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31) + Boolean.hashCode(this.C)) * 31;
        String str15 = this.D;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.E;
        int hashCode24 = (hashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.F;
        int hashCode25 = (((hashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31) + this.G.hashCode()) * 31;
        String str18 = this.H;
        int hashCode26 = (((((((((((hashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31) + Boolean.hashCode(this.I)) * 31) + this.J.hashCode()) * 31) + Boolean.hashCode(this.K)) * 31) + Boolean.hashCode(this.L)) * 31) + this.M.hashCode()) * 31;
        String str19 = this.N;
        int hashCode27 = (((hashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31) + this.O.hashCode()) * 31;
        ActiveView activeView = this.P;
        return hashCode27 + (activeView != null ? activeView.hashCode() : 0);
    }

    public final AudioType i() {
        return this.p;
    }

    public final String i0() {
        return this.J;
    }

    public final boolean j() {
        return zq3.c(this.y, Boolean.TRUE);
    }

    public final String j0() {
        return this.E;
    }

    public final String k() {
        return this.j;
    }

    public final String k0() {
        String str = this.E;
        return str == null ? "" : str;
    }

    public final NYTMediaItem l(String str, String str2, String str3, String str4, long j, boolean z, boolean z2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, AudioPosition audioPosition, AudioType audioType, Long l2, String str11, String str12, Long l3, String str13, String str14, String str15, String str16, Boolean bool, PlaybackVolume playbackVolume, Long l4, String str17, boolean z3, String str18, String str19, String str20, Map map, String str21, boolean z4, String str22, boolean z5, boolean z6, VideoProductionType videoProductionType, String str23, VideoUtil.VideoRes videoRes, ActiveView activeView) {
        zq3.h(str, "mediaId");
        zq3.h(str2, "mediaUrl");
        zq3.h(str3, "displayTitle");
        zq3.h(playbackVolume, "volume");
        zq3.h(map, "assetDfpParameters");
        zq3.h(str22, "uniqueId");
        zq3.h(videoProductionType, "productionType");
        zq3.h(videoRes, "videoRes");
        return new NYTMediaItem(str, str2, str3, str4, j, z, z2, str5, str6, str7, str8, str9, l, str10, audioPosition, audioType, l2, str11, str12, l3, str13, str14, str15, str16, bool, playbackVolume, l4, str17, z3, str18, str19, str20, map, str21, z4, str22, z5, z6, videoProductionType, str23, videoRes, activeView);
    }

    public final PlaybackVolume l0() {
        return this.z;
    }

    public final String m0() {
        return this.F;
    }

    public final NYTMediaItem n(ActiveView activeView) {
        return m(this, null, null, null, null, 0L, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, false, false, null, null, null, activeView, -1, 511, null);
    }

    public final String o() {
        return this.d;
    }

    public final String p() {
        return this.c;
    }

    public final long q() {
        return this.e;
    }

    public final ActiveView r() {
        return this.P;
    }

    public final String s() {
        return this.H;
    }

    public final String t() {
        return this.w;
    }

    public String toString() {
        return "NYTMediaItem(mediaId=" + this.a + ", mediaUrl=" + this.b + ", displayTitle=" + this.c + ", displayDescription=" + this.d + ", durationInMS=" + this.e + ", isAutoPlay=" + this.f + ", isAdPlaying=" + this.g + ", assetUri=" + this.h + ", audioAnalyticsTitle=" + this.i + ", category=" + this.j + ", iconUrl=" + this.k + ", albumArt=" + this.l + ", mediaDurationInSeconds=" + this.m + ", mediaFranchise=" + this.n + ", audioPosition=" + this.o + ", audioType=" + this.p + ", seriesId=" + this.q + ", section=" + this.r + ", playlistName=" + this.s + ", playlistId=" + this.t + ", subscriberUrl=" + this.u + ", shareUrl=" + this.v + ", aspectRatio=" + this.w + ", referringSource=" + this.x + ", areCaptionsAvailable=" + this.y + ", volume=" + this.z + ", parentAssetId=" + this.A + ", parentAssetUri=" + this.B + ", isLive=" + this.C + ", podcastName=" + this.D + ", videoByline=" + this.E + ", webPageUrl=" + this.F + ", assetDfpParameters=" + this.G + ", adUnitTaxonomy=" + this.H + ", isTragedyTagged=" + this.I + ", uniqueId=" + this.J + ", cinemagraph=" + this.K + ", canShowAds=" + this.L + ", productionType=" + this.M + ", transcript=" + this.N + ", videoRes=" + this.O + ", activeView=" + this.P + ")";
    }

    public final String u() {
        return this.h;
    }

    public final String v() {
        return this.i;
    }

    public final boolean w() {
        return this.L;
    }

    public final String x() {
        return this.j;
    }

    public final boolean y() {
        return this.K;
    }

    public final String z() {
        return this.d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NYTMediaItem(java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, long r53, boolean r55, boolean r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.Long r62, java.lang.String r63, com.nytimes.android.media.common.AudioPosition r64, com.nytimes.android.media.common.AudioType r65, java.lang.Long r66, java.lang.String r67, java.lang.String r68, java.lang.Long r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.Boolean r74, com.nytimes.android.media.player.PlaybackVolume r75, java.lang.Long r76, java.lang.String r77, boolean r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.util.Map r82, java.lang.String r83, boolean r84, java.lang.String r85, boolean r86, boolean r87, type.VideoProductionType r88, java.lang.String r89, com.nytimes.android.media.util.VideoUtil.VideoRes r90, com.nytimes.android.media.common.NYTMediaItem.ActiveView r91, int r92, int r93, kotlin.jvm.internal.DefaultConstructorMarker r94) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.common.NYTMediaItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.nytimes.android.media.common.AudioPosition, com.nytimes.android.media.common.AudioType, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.nytimes.android.media.player.PlaybackVolume, java.lang.Long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, boolean, java.lang.String, boolean, boolean, type.VideoProductionType, java.lang.String, com.nytimes.android.media.util.VideoUtil$VideoRes, com.nytimes.android.media.common.NYTMediaItem$ActiveView, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
