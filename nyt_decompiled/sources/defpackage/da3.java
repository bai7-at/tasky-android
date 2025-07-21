package defpackage;

import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import com.nytimes.android.unfear.reader.model.ImageElement;

/* loaded from: classes4.dex */
public final class da3 extends ki0 {
    public static final int i = StyledText.d;
    private final String b;
    private final String c;
    private final ImageElement d;
    private final StyledText e;
    private final int f;
    private final String g;
    private final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da3(String str, String str2, ImageElement imageElement, StyledText styledText, int i2, String str3, String str4) {
        super(null);
        zq3.h(str, "uri");
        zq3.h(styledText, "title");
        zq3.h(str3, "carouselName");
        zq3.h(str4, "carouselLabel");
        this.b = str;
        this.c = str2;
        this.d = imageElement;
        this.e = styledText;
        this.f = i2;
        this.g = str3;
        this.h = str4;
    }

    @Override // defpackage.j38
    public String c() {
        return this.b;
    }

    @Override // defpackage.j38
    public String d() {
        return this.c;
    }

    @Override // defpackage.ki0
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da3)) {
            return false;
        }
        da3 da3Var = (da3) obj;
        return zq3.c(this.b, da3Var.b) && zq3.c(this.c, da3Var.c) && zq3.c(this.d, da3Var.d) && zq3.c(this.e, da3Var.e) && this.f == da3Var.f && zq3.c(this.g, da3Var.g) && zq3.c(this.h, da3Var.h);
    }

    @Override // defpackage.ki0
    public String f() {
        return this.g;
    }

    @Override // defpackage.ki0
    public int g() {
        return this.f;
    }

    public final ImageElement h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageElement imageElement = this.d;
        return ((((((((hashCode2 + (imageElement != null ? imageElement.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final StyledText i() {
        return this.e;
    }

    public String toString() {
        return "HorizontalArticleThumbnailTitleLockup(uri=" + this.b + ", url=" + this.c + ", image=" + this.d + ", title=" + this.e + ", index=" + this.f + ", carouselName=" + this.g + ", carouselLabel=" + this.h + ")";
    }
}
