package com.nytimes.android.internal.auth;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.o73;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SamizdatHeader$Builder {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private qs2 i;
    private qs2 j;

    public SamizdatHeader$Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(str4, "deviceType");
        zq3.h(qs2Var, "buildTypeOverride");
        zq3.h(qs2Var2, "deviceWidth");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = qs2Var;
        this.j = qs2Var2;
    }

    public final SamizdatHeader$Builder a(String str) {
        zq3.h(str, "appVersion");
        this.b = str;
        return this;
    }

    public final o73 b() {
        String str = this.a;
        zq3.e(str);
        String str2 = this.b;
        zq3.e(str2);
        String str3 = this.c;
        zq3.e(str3);
        String str4 = this.d;
        String str5 = this.e;
        zq3.e(str5);
        String str6 = this.f;
        zq3.e(str6);
        String str7 = this.g;
        String str8 = this.h;
        zq3.e(str8);
        return new o73(str, str2, str3, str4, str5, str6, str7, str8, this.i, this.j);
    }

    public final SamizdatHeader$Builder c(String str) {
        zq3.h(str, "buildType");
        this.h = str;
        return this;
    }

    public final SamizdatHeader$Builder d(qs2 qs2Var) {
        zq3.h(qs2Var, "buildTypeOverride");
        this.i = qs2Var;
        return this;
    }

    public final SamizdatHeader$Builder e(String str) {
        zq3.h(str, "deviceModel");
        this.e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamizdatHeader$Builder)) {
            return false;
        }
        SamizdatHeader$Builder samizdatHeader$Builder = (SamizdatHeader$Builder) obj;
        return zq3.c(this.a, samizdatHeader$Builder.a) && zq3.c(this.b, samizdatHeader$Builder.b) && zq3.c(this.c, samizdatHeader$Builder.c) && zq3.c(this.d, samizdatHeader$Builder.d) && zq3.c(this.e, samizdatHeader$Builder.e) && zq3.c(this.f, samizdatHeader$Builder.f) && zq3.c(this.g, samizdatHeader$Builder.g) && zq3.c(this.h, samizdatHeader$Builder.h) && zq3.c(this.i, samizdatHeader$Builder.i) && zq3.c(this.j, samizdatHeader$Builder.j);
    }

    public final SamizdatHeader$Builder f(String str) {
        zq3.h(str, "deviceType");
        this.d = str;
        return this;
    }

    public final SamizdatHeader$Builder g(qs2 qs2Var) {
        zq3.h(qs2Var, "deviceWidth");
        this.j = qs2Var;
        return this;
    }

    public final SamizdatHeader$Builder h(String str) {
        zq3.h(str, "nytAppType");
        this.a = str;
        return this;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        return ((((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final SamizdatHeader$Builder i(String str) {
        zq3.h(str, "osVersion");
        this.c = str;
        return this;
    }

    public final SamizdatHeader$Builder j(String str) {
        zq3.h(str, "userAgent");
        this.f = str;
        return this;
    }

    public String toString() {
        return "Builder(nytAppType=" + this.a + ", appVersion=" + this.b + ", osVersion=" + this.c + ", deviceType=" + this.d + ", deviceModel=" + this.e + ", userAgent=" + this.f + ", clientId=" + this.g + ", buildType=" + this.h + ", buildTypeOverride=" + this.i + ", deviceWidth=" + this.j + ")";
    }

    public /* synthetic */ SamizdatHeader$Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, qs2 qs2Var, qs2 qs2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "android" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? new qs2() { // from class: com.nytimes.android.internal.auth.SamizdatHeader$Builder.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var, (i & 512) != 0 ? new qs2() { // from class: com.nytimes.android.internal.auth.SamizdatHeader$Builder.2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var2);
    }
}
