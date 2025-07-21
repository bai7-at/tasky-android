package defpackage;

import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import com.nytimes.android.unfear.reader.model.ImageElement;

/* loaded from: classes4.dex */
public final class h59 extends ki0 {
    public static final int k = StyledText.d;
    private final String b;
    private final String c;
    private final ImageElement d;
    private final StyledText e;
    private final String f;
    private final String g;
    private final int h;
    private final String i;
    private final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h59(String str, String str2, ImageElement imageElement, StyledText styledText, String str3, String str4, int i, String str5, String str6) {
        super(null);
        zq3.h(str, "uri");
        zq3.h(styledText, "title");
        zq3.h(str5, "carouselName");
        zq3.h(str6, "carouselLabel");
        this.b = str;
        this.c = str2;
        this.d = imageElement;
        this.e = styledText;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = str5;
        this.j = str6;
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
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h59)) {
            return false;
        }
        h59 h59Var = (h59) obj;
        return zq3.c(this.b, h59Var.b) && zq3.c(this.c, h59Var.c) && zq3.c(this.d, h59Var.d) && zq3.c(this.e, h59Var.e) && zq3.c(this.f, h59Var.f) && zq3.c(this.g, h59Var.g) && this.h == h59Var.h && zq3.c(this.i, h59Var.i) && zq3.c(this.j, h59Var.j);
    }

    @Override // defpackage.ki0
    public String f() {
        return this.i;
    }

    @Override // defpackage.ki0
    public int g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageElement imageElement = this.d;
        int hashCode3 = (((hashCode2 + (imageElement == null ? 0 : imageElement.hashCode())) * 31) + this.e.hashCode()) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return ((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final ImageElement i() {
        return this.d;
    }

    public final String j() {
        return this.f;
    }

    public final StyledText k() {
        return this.e;
    }

    public String toString() {
        return "VerticalArticleThumbnailTitleLockup(uri=" + this.b + ", url=" + this.c + ", image=" + this.d + ", title=" + this.e + ", sectionName=" + this.f + ", byline=" + this.g + ", index=" + this.h + ", carouselName=" + this.i + ", carouselLabel=" + this.j + ")";
    }
}
