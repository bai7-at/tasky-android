package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class hr7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;

    public hr7(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
    }

    public static /* synthetic */ hr7 b(hr7 hr7Var, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hr7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = hr7Var.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = hr7Var.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = hr7Var.d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = hr7Var.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = hr7Var.f;
        }
        return hr7Var.a(str, str6, str7, str8, z2, str5);
    }

    public final hr7 a(String str, String str2, String str3, String str4, boolean z, String str5) {
        return new hr7(str, str2, str3, str4, z, str5);
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr7)) {
            return false;
        }
        hr7 hr7Var = (hr7) obj;
        return zq3.c(this.a, hr7Var.a) && zq3.c(this.b, hr7Var.b) && zq3.c(this.c, hr7Var.c) && zq3.c(this.d, hr7Var.d) && this.e == hr7Var.e && zq3.c(this.f, hr7Var.f);
    }

    public final String f() {
        return this.f;
    }

    public final boolean g() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str5 = this.f;
        return i2 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ShowkaseBrowserScreenMetadata(currentGroup=" + this.a + ", currentComponentName=" + this.b + ", currentComponentStyleName=" + this.c + ", currentComponentKey=" + this.d + ", isSearchActive=" + this.e + ", searchQuery=" + this.f + ")";
    }

    public /* synthetic */ hr7(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5);
    }
}
