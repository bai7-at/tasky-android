package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zn1 implements tn1 {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public zn1(String str, String str2, String str3, boolean z) {
        zq3.h(str, "prefValue");
        zq3.h(str2, "title");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return zq3.c(this.a, zn1Var.a) && zq3.c(this.b, zn1Var.b) && zq3.c(this.c, zn1Var.c) && this.d == zn1Var.d;
    }

    @Override // defpackage.tn1
    public String getPrefValue() {
        return this.a;
    }

    @Override // defpackage.tn1
    public boolean getRequestRestart() {
        return this.d;
    }

    @Override // defpackage.tn1
    public String getSummary() {
        return this.c;
    }

    @Override // defpackage.tn1
    public String getTitle() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "DevSettingSimpleChoiceOption(prefValue=" + this.a + ", title=" + this.b + ", summary=" + this.c + ", requestRestart=" + this.d + ")";
    }

    public /* synthetic */ zn1(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
