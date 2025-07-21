package com.nytimes.android.internal.auth;

import android.app.Application;
import android.content.res.Resources;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import com.nytimes.android.internal.auth.signing.util.RSASigner;
import defpackage.bc1;
import defpackage.ds7;
import defpackage.e22;
import defpackage.fm8;
import defpackage.fw3;
import defpackage.iv6;
import defpackage.qs2;
import defpackage.rv3;
import defpackage.w77;
import defpackage.xv3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SamizdatSigning$Builder {
    private Application a;
    private String b;
    private String c;
    private GraphQlEnvironment d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private boolean i;

    public SamizdatSigning$Builder(Application application, String str, String str2, GraphQlEnvironment graphQlEnvironment, Integer num, String str3, String str4, String str5, boolean z) {
        this.a = application;
        this.b = str;
        this.c = str2;
        this.d = graphQlEnvironment;
        this.e = num;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z;
    }

    public final SamizdatSigning$Builder b(String str) {
        zq3.h(str, "alphaRndr");
        this.f = str;
        return this;
    }

    public final SamizdatSigning$Builder c(String str) {
        zq3.h(str, "appVersion");
        this.c = str;
        return this;
    }

    public final SamizdatSigning$Builder d(Application application) {
        zq3.h(application, "application");
        this.a = application;
        return this;
    }

    public final SamizdatSigning$Builder e(String str) {
        zq3.h(str, "betaRndr");
        this.g = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamizdatSigning$Builder)) {
            return false;
        }
        SamizdatSigning$Builder samizdatSigning$Builder = (SamizdatSigning$Builder) obj;
        return zq3.c(this.a, samizdatSigning$Builder.a) && zq3.c(this.b, samizdatSigning$Builder.b) && zq3.c(this.c, samizdatSigning$Builder.c) && this.d == samizdatSigning$Builder.d && zq3.c(this.e, samizdatSigning$Builder.e) && zq3.c(this.f, samizdatSigning$Builder.f) && zq3.c(this.g, samizdatSigning$Builder.g) && zq3.c(this.h, samizdatSigning$Builder.h) && this.i == samizdatSigning$Builder.i;
    }

    public final ds7 f() {
        e22 iv6Var;
        if (this.i) {
            Integer num = this.e;
            zq3.e(num);
            int intValue = num.intValue();
            String str = this.f;
            zq3.e(str);
            String str2 = this.g;
            zq3.e(str2);
            String str3 = this.h;
            zq3.e(str3);
            iv6Var = new bc1(intValue, str, str2, str3);
        } else {
            Integer num2 = this.e;
            zq3.e(num2);
            int intValue2 = num2.intValue();
            String str4 = this.f;
            zq3.e(str4);
            String str5 = this.g;
            zq3.e(str5);
            String str6 = this.h;
            zq3.e(str6);
            iv6Var = new iv6(intValue2, str4, str5, str6);
        }
        fw3 fw3Var = new fw3(iv6Var.d(), iv6Var.b());
        rv3 rv3Var = new rv3(iv6Var.a(), iv6Var.c());
        Application application = this.a;
        zq3.e(application);
        Resources resources = application.getResources();
        zq3.g(resources, "getResources(...)");
        final w77 w77Var = new w77(resources, rv3Var, fw3Var);
        RSASigner rSASigner = new RSASigner(new qs2() { // from class: com.nytimes.android.internal.auth.SamizdatSigning$Builder$build$keyHolderProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final xv3 mo865invoke() {
                GraphQlEnvironment graphQlEnvironment;
                w77 w77Var2 = w77.this;
                graphQlEnvironment = this.d;
                return w77Var2.a(graphQlEnvironment);
            }
        });
        fm8 fm8Var = new fm8();
        String str7 = this.b;
        zq3.e(str7);
        String str8 = this.c;
        zq3.e(str8);
        return new ds7(fm8Var, rSASigner, str7, str8);
    }

    public final SamizdatSigning$Builder g(String str) {
        zq3.h(str, "gammaRndr");
        this.h = str;
        return this;
    }

    public final SamizdatSigning$Builder h(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public int hashCode() {
        Application application = this.a;
        int hashCode = (application == null ? 0 : application.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GraphQlEnvironment graphQlEnvironment = this.d;
        int hashCode4 = (hashCode3 + (graphQlEnvironment == null ? 0 : graphQlEnvironment.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return ((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.i);
    }

    public final SamizdatSigning$Builder i(String str) {
        zq3.h(str, "nytAppType");
        this.b = str;
        return this;
    }

    public String toString() {
        return "Builder(application=" + this.a + ", nytAppType=" + this.b + ", appVersion=" + this.c + ", graphQlEnvironment=" + this.d + ", keystoreResource=" + this.e + ", alphaRndr=" + this.f + ", betaRndr=" + this.g + ", gammaRndr=" + this.h + ", allowNonProductionEnvironments=" + this.i + ")";
    }

    public /* synthetic */ SamizdatSigning$Builder(Application application, String str, String str2, GraphQlEnvironment graphQlEnvironment, Integer num, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : application, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : graphQlEnvironment, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z);
    }
}
