package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.media.util.VideoUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class z79 {
    private final Object a;
    private final VideoUtil.VideoRes b;
    private final String c;
    private final String d;
    private final boolean e;
    private final Asset f;
    private final String g;
    private final String h;

    public z79(Object obj, VideoUtil.VideoRes videoRes, String str, String str2, boolean z, Asset asset, String str3, String str4) {
        zq3.h(videoRes, "videoRes");
        zq3.h(str3, "referringSource");
        this.a = obj;
        this.b = videoRes;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = asset;
        this.g = str3;
        this.h = str4;
    }

    public final String a() {
        String str = this.c;
        return str == null ? "" : str;
    }

    public final String b() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public final Asset c() {
        return this.f;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z79)) {
            return false;
        }
        z79 z79Var = (z79) obj;
        return zq3.c(this.a, z79Var.a) && this.b == z79Var.b && zq3.c(this.c, z79Var.c) && zq3.c(this.d, z79Var.d) && this.e == z79Var.e && zq3.c(this.f, z79Var.f) && zq3.c(this.g, z79Var.g) && zq3.c(this.h, z79Var.h);
    }

    public final String f() {
        return this.h;
    }

    public final VideoUtil.VideoRes g() {
        return this.b;
    }

    public final Object h() {
        return this.a;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31;
        Asset asset = this.f;
        int hashCode4 = (((hashCode3 + (asset == null ? 0 : asset.hashCode())) * 31) + this.g.hashCode()) * 31;
        String str3 = this.h;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public String toString() {
        return "VideoItemIngredients(videoType=" + this.a + ", videoRes=" + this.b + ", sectionName=" + this.c + ", subSectionName=" + this.d + ", isFromSectionFront=" + this.e + ", parentAsset=" + this.f + ", referringSource=" + this.g + ", uniqueId=" + this.h + ")";
    }

    public /* synthetic */ z79(Object obj, VideoUtil.VideoRes videoRes, String str, String str2, boolean z, Asset asset, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, videoRes, str, str2, z, asset, str3, (i & 128) != 0 ? null : str4);
    }
}
