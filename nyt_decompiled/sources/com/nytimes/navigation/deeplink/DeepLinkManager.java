package com.nytimes.navigation.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.navigation.deeplink.base.AnalyticsDisabler;
import defpackage.b65;
import defpackage.bd1;
import defpackage.by0;
import defpackage.cd1;
import defpackage.kd1;
import defpackage.md1;
import defpackage.pf9;
import defpackage.rb5;
import defpackage.zq3;
import io.reactivex.Maybe;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.rx2.RxMaybeKt;

/* loaded from: classes4.dex */
public final class DeepLinkManager {
    public static final a g = new a(null);
    public static final int h = 8;
    private final AnalyticsDisabler a;
    private final md1 b;
    private final cd1 c;
    private final pf9 d;
    private final kd1 e;
    private final AppPreferences f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String str) {
            zq3.h(str, "url");
            return bd1.a.g(str);
        }

        public final boolean b(String str) {
            return bd1.f(str);
        }

        public final boolean c(String str) {
            zq3.h(str, "url");
            return !d(str);
        }

        public final boolean d(String str) {
            zq3.h(str, "url");
            return b(str) || rb5.l(str);
        }

        private a() {
        }
    }

    public DeepLinkManager(AnalyticsDisabler analyticsDisabler, md1 md1Var, cd1 cd1Var, pf9 pf9Var, kd1 kd1Var, AppPreferences appPreferences) {
        zq3.h(analyticsDisabler, "analyticsDisabler");
        zq3.h(md1Var, "deepLinkingReferrer");
        zq3.h(cd1Var, "provider");
        zq3.h(pf9Var, "webWall");
        zq3.h(kd1Var, "transformer");
        zq3.h(appPreferences, "appPreferences");
        this.a = analyticsDisabler;
        this.b = md1Var;
        this.c = cd1Var;
        this.d = pf9Var;
        this.e = kd1Var;
        this.f = appPreferences;
    }

    private final Object a(Context context, Uri uri, String str, boolean z, b65 b65Var, by0 by0Var) {
        this.a.a(str);
        if (this.e.a(uri)) {
            uri = this.e.b(uri);
        }
        Uri uri2 = uri;
        return this.c.a(uri2).a(context, uri2, str, b65Var, z, by0Var);
    }

    static /* synthetic */ Object b(DeepLinkManager deepLinkManager, Context context, Uri uri, String str, boolean z, b65 b65Var, by0 by0Var, int i, Object obj) {
        if ((i & 16) != 0) {
            b65Var = null;
        }
        return deepLinkManager.a(context, uri, str, z, b65Var, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r16, android.content.Intent r17, boolean r18, java.lang.String r19, boolean r20, defpackage.by0 r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$1 r2 = (com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
        L15:
            r6 = r2
            goto L1d
        L17:
            com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$1 r2 = new com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$1
            r2.<init>(r15, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r6.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r6.label
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L42
            if (r2 != r11) goto L3a
            boolean r0 = r6.Z$1
            boolean r2 = r6.Z$0
            java.lang.Object r3 = r6.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.f.b(r1)
            r14 = r0
            r13 = r2
            r12 = r3
            goto L9a
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            kotlin.f.b(r1)
            java.lang.String r1 = r17.getAction()
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = defpackage.zq3.c(r2, r1)
            if (r1 != 0) goto L52
            return r10
        L52:
            com.nytimes.android.utils.AppPreferences r1 = r0.f
            java.lang.String r2 = "FreshInstallLaunch"
            boolean r1 = r1.n(r2, r11)
            if (r1 == 0) goto L63
            com.nytimes.android.utils.AppPreferences r1 = r0.f
            java.lang.String r2 = "DeferredOnboarding"
            r1.f(r2, r11)
        L63:
            md1 r1 = r0.b
            r2 = r17
            java.lang.String r3 = r1.e(r2)
            android.net.Uri r1 = r17.getData()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r4 = defpackage.bd1.j(r1)
            android.net.Uri r2 = r17.getData()
            defpackage.zq3.e(r2)
            r12 = r19
            r6.L$0 = r12
            r13 = r18
            r6.Z$0 = r13
            r14 = r20
            r6.Z$1 = r14
            r6.label = r11
            r5 = 0
            r7 = 16
            r8 = 0
            r0 = r15
            r1 = r16
            java.lang.Object r1 = b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r9) goto L9a
            return r9
        L9a:
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 == 0) goto Lb0
            java.lang.String r0 = "isMagicLinkLogin"
            r1.putExtra(r0, r13)
            java.lang.String r0 = "emailAddress"
            r1.putExtra(r0, r12)
            if (r14 == 0) goto Laf
            java.lang.String r0 = "com.nytimes.android.extra.EXTRA_IN_APP_DEEPLINK"
            r1.putExtra(r0, r11)
        Laf:
            r10 = r1
        Lb0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.navigation.deeplink.DeepLinkManager.c(android.content.Context, android.content.Intent, boolean, java.lang.String, boolean, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.fragment.app.f r11, java.lang.String r12, java.lang.String r13, defpackage.by0 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$3
            if (r0 == 0) goto L14
            r0 = r14
            com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$3 r0 = (com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$3 r0 = new com.nytimes.navigation.deeplink.DeepLinkManager$getLaunchIntent$3
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.f.b(r14)
            goto L8c
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r7.L$3
            r13 = r10
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r7.L$2
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r7.L$1
            r11 = r10
            androidx.fragment.app.f r11 = (androidx.fragment.app.f) r11
            java.lang.Object r10 = r7.L$0
            com.nytimes.navigation.deeplink.DeepLinkManager r10 = (com.nytimes.navigation.deeplink.DeepLinkManager) r10
            kotlin.f.b(r14)
        L4c:
            r1 = r10
            r4 = r13
            goto L65
        L4f:
            kotlin.f.b(r14)
            pf9 r14 = r10.d
            r7.L$0 = r10
            r7.L$1 = r11
            r7.L$2 = r12
            r7.L$3 = r13
            r7.label = r3
            java.lang.Object r14 = r14.a(r11, r12, r7)
            if (r14 != r0) goto L4c
            return r0
        L65:
            com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse r14 = (com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse) r14
            com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse r10 = com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse.SUCCESS
            r13 = 0
            if (r14 != r10) goto L8d
            android.net.Uri r3 = android.net.Uri.parse(r12)
            java.lang.String r10 = "parse(...)"
            defpackage.zq3.g(r3, r10)
            r7.L$0 = r13
            r7.L$1 = r13
            r7.L$2 = r13
            r7.L$3 = r13
            r7.label = r2
            r5 = 0
            r6 = 0
            r8 = 16
            r9 = 0
            r2 = r11
            java.lang.Object r14 = b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L8c
            return r0
        L8c:
            return r14
        L8d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.navigation.deeplink.DeepLinkManager.d(androidx.fragment.app.f, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    public final Object f(Context context, String str, b65 b65Var, by0 by0Var) {
        Uri parse = Uri.parse(str);
        zq3.g(parse, "parse(...)");
        return a(context, parse, b65Var.j(), false, b65Var, by0Var);
    }

    public final Maybe g(Context context, Intent intent, boolean z, String str) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        return RxMaybeKt.rxMaybe$default(null, new DeepLinkManager$getLaunchIntentMaybe$1(this, context, intent, str, z, null), 1, null);
    }

    public final boolean h(Uri uri) {
        zq3.h(uri, "uri");
        return this.c.c(uri);
    }
}
