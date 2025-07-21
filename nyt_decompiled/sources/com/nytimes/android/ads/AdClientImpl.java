package com.nytimes.android.ads;

import android.content.Context;
import com.nytimes.abtests.DFPToggleGMAVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.ads.a;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.d96;
import defpackage.g7;
import defpackage.z58;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AdClientImpl implements com.nytimes.android.ads.a {
    public static final a Companion = new a(null);
    private final z58 a;
    private final d96 b;
    private final g7 c;
    private final AbraManager d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdConfiguration.values().length];
            try {
                iArr[AdConfiguration.RDP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdConfiguration.NPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdConfiguration.LTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public AdClientImpl(Context context, z58 z58Var, d96 d96Var, g7 g7Var, AbraManager abraManager) {
        zq3.h(context, "context");
        zq3.h(z58Var, "subauthClient");
        zq3.h(d96Var, "purrManagerClient");
        zq3.h(g7Var, "adOverridePreferences");
        zq3.h(abraManager, "abraManager");
        this.a = z58Var;
        this.b = d96Var;
        this.c = g7Var;
        this.d = abraManager;
        this.e = DeviceUtils.u(context, false, false, 3, null);
        this.f = "/29390238/nyt";
        this.g = !DeviceUtils.C(context);
        this.h = DeviceUtils.a(context);
    }

    private final String k() {
        return (this.a.F() && this.a.O()) ? "sub,cr" : this.a.F() ? "sub" : this.a.O() ? "cr" : this.a.q() ? "regi" : "anon";
    }

    @Override // com.nytimes.android.ads.a
    public boolean a() {
        return this.c.a();
    }

    @Override // com.nytimes.android.ads.a
    public String b() {
        String c = this.c.c();
        if (c == null || c.length() == 0) {
            return null;
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.nytimes.android.ads.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ads.AdClientImpl$getAdPrivacy$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ads.AdClientImpl$getAdPrivacy$1 r0 = (com.nytimes.android.ads.AdClientImpl$getAdPrivacy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ads.AdClientImpl$getAdPrivacy$1 r0 = new com.nytimes.android.ads.AdClientImpl$getAdPrivacy$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.ads.AdClientImpl r4 = (com.nytimes.android.ads.AdClientImpl) r4
            kotlin.f.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            d96 r5 = r4.b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
            java.lang.Class<com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3> r0 = com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3.class
            com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective r5 = r5.getDirective(r0)
            com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3 r5 = (com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3) r5
            if (r5 == 0) goto L56
            com.nytimes.android.subauth.core.purr.directive.AdConfiguration r5 = r5.getValue()
            goto L57
        L56:
            r5 = 0
        L57:
            d96 r4 = r4.b
            java.lang.String r4 = r4.g()
            if (r5 != 0) goto L61
            r5 = -1
            goto L69
        L61:
            int[] r0 = com.nytimes.android.ads.AdClientImpl.b.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L69:
            if (r5 == r3) goto La5
            r0 = 2
            if (r5 == r0) goto L8d
            r0 = 3
            if (r5 == r0) goto L74
            l7$a r4 = l7.a.b
            goto La7
        L74:
            if (r4 == 0) goto L8a
            int r5 = r4.length()
            if (r5 != 0) goto L7d
            goto L8a
        L7d:
            l7$e r5 = new l7$e
            l7$b r0 = l7.b.b
            java.lang.String r0 = r0.a()
            r5.<init>(r0, r4)
        L88:
            r4 = r5
            goto La7
        L8a:
            l7$b r4 = l7.b.b
            goto La7
        L8d:
            if (r4 == 0) goto La2
            int r5 = r4.length()
            if (r5 != 0) goto L96
            goto La2
        L96:
            l7$e r5 = new l7$e
            l7$c r0 = l7.c.b
            java.lang.String r0 = r0.a()
            r5.<init>(r0, r4)
            goto L88
        La2:
            l7$c r4 = l7.c.b
            goto La7
        La5:
            l7$d r4 = l7.d.b
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.AdClientImpl.c(by0):java.lang.Object");
    }

    @Override // com.nytimes.android.ads.a
    public long d() {
        return a.C0234a.a(this);
    }

    @Override // com.nytimes.android.ads.a
    public String e() {
        return this.f;
    }

    @Override // com.nytimes.android.ads.a
    public String f() {
        return k();
    }

    @Override // com.nytimes.android.ads.a
    public String g() {
        return this.h;
    }

    @Override // com.nytimes.android.ads.a
    public String getAppVersion() {
        return this.e;
    }

    @Override // com.nytimes.android.ads.a
    public String h() {
        return a.C0234a.b(this);
    }

    @Override // com.nytimes.android.ads.a
    public boolean i() {
        return this.g;
    }

    @Override // com.nytimes.android.ads.a
    public boolean j() {
        AbraTest test = this.d.getTest(DFPToggleGMAVariants.testNameKey);
        if (test == null) {
            return this.c.b();
        }
        String abraVariant = test.getAbraMetaData().getAbraVariant();
        if (abraVariant == null) {
            abraVariant = DFPToggleGMAVariants.ENABLED.getVariantName();
        }
        return zq3.c(abraVariant, DFPToggleGMAVariants.ENABLED.getVariantName());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.nytimes.android.ads.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ads.AdClientImpl$getNytCookies$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ads.AdClientImpl$getNytCookies$1 r0 = (com.nytimes.android.ads.AdClientImpl$getNytCookies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ads.AdClientImpl$getNytCookies$1 r0 = new com.nytimes.android.ads.AdClientImpl$getNytCookies$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            z58 r4 = r4.a
            r0.label = r3
            java.lang.Object r5 = r4.n(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r4 = r5
            java.util.Map r4 = (java.util.Map) r4
            boolean r4 = r4.isEmpty()
            r0 = 0
            if (r4 != 0) goto L4a
            goto L4b
        L4a:
            r5 = r0
        L4b:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L56
            c05$a r4 = defpackage.c05.Companion
            r0 = 0
            java.lang.String r0 = r4.a(r5, r0)
        L56:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.AdClientImpl.n(by0):java.lang.Object");
    }
}
