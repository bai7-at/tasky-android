package defpackage;

import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class yh7 extends z74 {
    public static final int e = 0;
    private final String b;
    private final StyledText c;
    private final String d;

    public /* synthetic */ yh7(String str, StyledText styledText, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, styledText, (i & 4) != 0 ? null : str2);
    }

    @Override // defpackage.z74, defpackage.l34
    public String a() {
        return this.d;
    }

    public final StyledText b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh7)) {
            return false;
        }
        yh7 yh7Var = (yh7) obj;
        return zq3.c(this.b, yh7Var.b) && zq3.c(this.c, yh7Var.c) && zq3.c(this.d, yh7Var.d);
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SectionTitleLockup(id=" + this.b + ", title=" + this.c + ", testTag=" + this.d + ")";
    }

    public yh7(String str, StyledText styledText, String str2) {
        zq3.h(str, "id");
        zq3.h(styledText, "title");
        this.b = str;
        this.c = styledText;
        this.d = str2;
    }
}
