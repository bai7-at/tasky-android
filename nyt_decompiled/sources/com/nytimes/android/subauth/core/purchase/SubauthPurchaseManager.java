package com.nytimes.android.subauth.core.purchase;

import android.app.Activity;
import android.content.res.Resources;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.purchase.network.response.LinkResponseJsonAdapter;
import com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse;
import com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront;
import com.nytimes.android.subauth.core.util.ControlledRunner;
import com.nytimes.android.subauth.core.util.CoroutineDataStorePoller;
import com.squareup.moshi.i;
import defpackage.a98;
import defpackage.b59;
import defpackage.b98;
import defpackage.ba1;
import defpackage.bm5;
import defpackage.by0;
import defpackage.c05;
import defpackage.cm5;
import defpackage.d54;
import defpackage.dm5;
import defpackage.e98;
import defpackage.fc1;
import defpackage.hm6;
import defpackage.j86;
import defpackage.kl7;
import defpackage.ml5;
import defpackage.mu7;
import defpackage.n54;
import defpackage.nl5;
import defpackage.ol5;
import defpackage.qz8;
import defpackage.rl5;
import defpackage.s16;
import defpackage.sl5;
import defpackage.ss2;
import defpackage.u16;
import defpackage.ul8;
import defpackage.w28;
import defpackage.w88;
import defpackage.ww8;
import defpackage.xz8;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class SubauthPurchaseManager implements a98, b98 {
    private Job A;
    private final ControlledRunner B;
    private final NYTUser a;
    private final xz8 b;
    private final qz8 c;
    private final c05 d;
    private final j86 e;
    private final kl7 f;
    private final e98 g;
    private final w88 h;
    private final GoogleStoreFront i;
    private final String j;
    private final Resources k;
    private final i l;
    private final ba1 m;
    private final SubauthListenerManager n;
    private final boolean o;
    private final boolean p;
    private final CoroutineDispatcher q;
    private final CoroutineScope r;
    private final LinkResponseJsonAdapter s;
    private CoroutineDataStorePoller t;
    private boolean u;
    private VerifyPurchaseResponse v;
    private n54 w;
    private w28 x;
    private final MutableSharedFlow y;
    private final long z;
    public static final a Companion = new a(null);
    private static final s16.a C = u16.f("lastLinkSku");
    private static final s16.a D = u16.d("lastLinkStatus");
    private static final s16.a E = u16.f("lastSubscriptionId");
    private static final s16.a F = u16.f("lastLinkErrorMessage");
    private static final s16.a G = u16.e("lastPollStoreFront");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s16.a a() {
            return SubauthPurchaseManager.F;
        }

        public final s16.a b() {
            return SubauthPurchaseManager.C;
        }

        public final s16.a c() {
            return SubauthPurchaseManager.D;
        }

        public final s16.a d() {
            return SubauthPurchaseManager.E;
        }

        public final ml5 e(String str) {
            zq3.h(str, "value");
            if (zq3.c(str, ol5.g.b.a())) {
                return ml5.h.d;
            }
            if (zq3.c(str, ol5.c.b.a())) {
                return ml5.d.d;
            }
            if (zq3.c(str, ol5.a.b.a())) {
                return ml5.a.d;
            }
            if (zq3.c(str, ol5.b.b.a())) {
                return ml5.b.d;
            }
            if (zq3.c(str, ol5.e.b.a())) {
                return ml5.f.d;
            }
            if (zq3.c(str, ol5.d.b.a())) {
                return ml5.e.d;
            }
            if (zq3.c(str, ol5.f.b.a())) {
                return ml5.g.d;
            }
            if (zq3.c(str, ol5.h.b.a())) {
                return ml5.i.d;
            }
            return null;
        }

        public final VerifyPurchaseResponse f(String str) {
            zq3.h(str, "value");
            bm5.c cVar = bm5.c.c;
            if (zq3.c(str, cVar.a())) {
                return cVar.b();
            }
            bm5.a aVar = bm5.a.c;
            if (zq3.c(str, aVar.a())) {
                return aVar.b();
            }
            bm5.b bVar = bm5.b.c;
            if (zq3.c(str, bVar.a())) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    public SubauthPurchaseManager(NYTUser nYTUser, xz8 xz8Var, qz8 qz8Var, c05 c05Var, j86 j86Var, kl7 kl7Var, e98 e98Var, w88 w88Var, GoogleStoreFront googleStoreFront, String str, Resources resources, i iVar, ba1 ba1Var, SubauthListenerManager subauthListenerManager, boolean z, boolean z2, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(qz8Var, "userDataDatabaseProvider");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(j86Var, "purchaseDatabaseProvider");
        zq3.h(kl7Var, "sessionRefreshProvider");
        zq3.h(e98Var, "networkManager");
        zq3.h(w88Var, "networkStatus");
        zq3.h(googleStoreFront, "googleStoreFront");
        zq3.h(str, "packageName");
        zq3.h(iVar, "moshi");
        zq3.h(ba1Var, "dataStore");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = nYTUser;
        this.b = xz8Var;
        this.c = qz8Var;
        this.d = c05Var;
        this.e = j86Var;
        this.f = kl7Var;
        this.g = e98Var;
        this.h = w88Var;
        this.i = googleStoreFront;
        this.j = str;
        this.k = resources;
        this.l = iVar;
        this.m = ba1Var;
        this.n = subauthListenerManager;
        this.o = z;
        this.p = z2;
        this.q = coroutineDispatcher;
        this.r = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.s = new LinkResponseJsonAdapter(iVar);
        this.y = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.z = (long) b.b.a(6.0d, DurationUnit.HOURS, DurationUnit.MILLISECONDS);
        this.B = new ControlledRunner();
    }

    private final String L(String str) {
        if (!h.v(str, ".debug", false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - 6);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.lang.String r10, java.lang.String r11, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.M(java.lang.String, java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(defpackage.d54 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.R(d54, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    static /* synthetic */ Object S(SubauthPurchaseManager subauthPurchaseManager, d54 d54Var, String str, String str2, String str3, String str4, PurchaseLinkSource purchaseLinkSource, by0 by0Var, int i, Object obj) {
        return subauthPurchaseManager.R(d54Var, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, purchaseLinkSource, by0Var);
    }

    private final Object T(String str, String str2, by0 by0Var) {
        Object c = this.e.c(new mu7(str, null, null, str2, null, null, null, null, 246, null), true, by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(y28.b r27, java.lang.String r28, java.util.Set r29, defpackage.by0 r30) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.U(y28$b, java.lang.String, java.util.Set, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(defpackage.b59 r7, boolean r8, java.util.Set r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.V(b59, boolean, java.util.Set, by0):java.lang.Object");
    }

    static /* synthetic */ Object W(SubauthPurchaseManager subauthPurchaseManager, b59 b59Var, boolean z, Set set, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            set = b0.e();
        }
        return subauthPurchaseManager.V(b59Var, z, set, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(s16 s16Var) {
        String string;
        String str;
        String string2;
        String str2;
        String string3;
        String str3;
        String string4;
        String str4;
        Resources resources = this.k;
        if (resources != null && (string4 = resources.getString(hm6.subauth_override_verify_purchase_result_pref)) != null && s16Var != null && (str4 = (String) s16Var.c(u16.f(string4))) != null) {
            this.v = Companion.f(str4);
        }
        Resources resources2 = this.k;
        if (resources2 != null && (string3 = resources2.getString(hm6.subauth_override_link_purchase_result_pref)) != null && s16Var != null && (str3 = (String) s16Var.c(u16.f(string3))) != null) {
            ml5 e = Companion.e(str3);
            this.w = e != null ? e.b() : null;
        }
        Resources resources3 = this.k;
        if (resources3 != null && (string2 = resources3.getString(hm6.subauth_disable_products_api_pref)) != null && s16Var != null && (str2 = (String) s16Var.c(u16.f(string2))) != null) {
            this.i.v(!Boolean.parseBoolean(str2));
        }
        Resources resources4 = this.k;
        if (resources4 == null || (string = resources4.getString(hm6.subauth_override_product_details_pref)) == null || s16Var == null || (str = (String) s16Var.c(u16.f(string))) == null) {
            return;
        }
        rl5 a2 = sl5.a(str);
        this.x = a2 != null ? a2.b() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(3:(1:(7:11|12|13|14|15|16|17)(2:24|25))(4:26|27|28|29)|22|23)(5:38|(3:48|49|(1:51)(3:52|41|(1:43)(1:44)))|40|41|(0)(0))|30|(2:32|33)(5:34|(1:36)|15|16|17)))|55|6|7|(0)(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a1, code lost:
    
        r1 = new n54.a(new l54.e(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109 A[Catch: IOException -> 0x0047, Exception -> 0x0075, TryCatch #0 {IOException -> 0x0047, blocks: (B:13:0x003b, B:15:0x0148, B:28:0x006e, B:30:0x00fa, B:32:0x0109, B:34:0x011c, B:49:0x007f, B:52:0x0086, B:41:0x00a1), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c A[Catch: IOException -> 0x0047, Exception -> 0x0075, TryCatch #0 {IOException -> 0x0047, blocks: (B:13:0x003b, B:15:0x0148, B:28:0x006e, B:30:0x00fa, B:32:0x0109, B:34:0x011c, B:49:0x007f, B:52:0x0086, B:41:0x00a1), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r27, defpackage.by0 r28) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.Y(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(java.lang.String r13, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.Z(java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    private final b59 a0(VerifyPurchaseResponse verifyPurchaseResponse) {
        Set b = verifyPurchaseResponse.a().b();
        if (!b.isEmpty()) {
            return new b59.c(b);
        }
        Integer a2 = verifyPurchaseResponse.b().a();
        String b2 = verifyPurchaseResponse.b().b();
        if (a2 != null && a2.intValue() == 500) {
            ul8.a.z("SUBAUTH").d("Failed to verify purchase with NYT: %s %s. Backend server unresponsive. Faking temporary entitlements.", a2, b2);
            return b59.d.a;
        }
        ul8.a.z("SUBAUTH").d("Failed to verify purchase with NYT: %s %s", a2, b2);
        return new b59.a(b2, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(defpackage.y28 r6, java.lang.String r7, java.lang.String r8, java.util.Set r9, defpackage.by0 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$processPurchaseStatus$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$processPurchaseStatus$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$processPurchaseStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$processPurchaseStatus$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$processPurchaseStatus$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$0
            r6 = r5
            y28 r6 = (defpackage.y28) r6
            kotlin.f.b(r10)
            goto L62
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r10)
            goto L4f
        L3d:
            kotlin.f.b(r10)
            boolean r10 = r6 instanceof y28.b
            if (r10 == 0) goto L53
            y28$b r6 = (y28.b) r6
            r0.label = r4
            java.lang.Object r10 = r5.U(r6, r8, r9, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r6 = r10
            y28 r6 = (defpackage.y28) r6
            goto L62
        L53:
            boolean r9 = r6 instanceof y28.a.b
            if (r9 == 0) goto L62
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.T(r7, r8, r0)
            if (r5 != r1) goto L62
            return r1
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.c0(y28, java.lang.String, java.lang.String, java.util.Set, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(defpackage.mu7 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r26, defpackage.by0 r27) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.d0(mu7, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    private final Object e0(d54 d54Var, String str, String str2, by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Save Last Link Status (sku: " + str + "): " + d54Var, new Object[0]);
        Object a2 = PreferencesKt.a(this.m, new SubauthPurchaseManager$saveLastLinkStatus$2(str, d54Var, str2, null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    static /* synthetic */ Object f0(SubauthPurchaseManager subauthPurchaseManager, d54 d54Var, String str, String str2, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return subauthPurchaseManager.e0(d54Var, str, str2, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r8 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[LOOP:0: B:24:0x007b->B:26:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(java.util.Set r6, boolean r7, boolean r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveNYTPurchaseEntitlements$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveNYTPurchaseEntitlements$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveNYTPurchaseEntitlements$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveNYTPurchaseEntitlements$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveNYTPurchaseEntitlements$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r9)
            goto Lb2
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            boolean r7 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r5 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager) r5
            kotlin.f.b(r9)
            goto L5a
        L44:
            kotlin.f.b(r9)
            if (r8 == 0) goto La2
            qz8 r8 = r5.c
            r0.L$0 = r5
            r0.L$1 = r6
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r9 = r8.e(r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            com.nytimes.android.subauth.core.database.userdata.UserData r9 = (com.nytimes.android.subauth.core.database.userdata.UserData) r9
            if (r9 == 0) goto L96
            com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData r8 = r9.getGooglePlayData()
            if (r8 == 0) goto L96
            java.util.Set r8 = r8.getEntitlements()
            if (r8 == 0) goto L96
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i.w(r8, r2)
            r9.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L7b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r8.next()
            com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement r2 = (com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement) r2
            java.lang.String r2 = r2.getRawValue()
            r9.add(r2)
            goto L7b
        L8f:
            java.util.Set r8 = kotlin.collections.i.c1(r9)
            if (r8 == 0) goto L96
            goto L9a
        L96:
            java.util.Set r8 = kotlin.collections.b0.e()
        L9a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r6 = kotlin.collections.i.d1(r6, r8)
        La2:
            qz8 r5 = r5.c
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r5 = r5.j(r6, r7, r0)
            if (r5 != r1) goto Lb2
            return r1
        Lb2:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.g0(java.util.Set, boolean, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:12:0x0033, B:13:0x00ba, B:20:0x0047, B:21:0x0093, B:22:0x009a, B:24:0x009e, B:31:0x005f, B:33:0x007d), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(java.lang.String r12, java.lang.String r13, java.lang.String r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.i0(java.lang.String, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b9 -> B:22:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(java.util.Set r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.j0(java.util.Set, by0):java.lang.Object");
    }

    public final ba1 N() {
        return this.m;
    }

    public final GoogleStoreFront O() {
        return this.i;
    }

    public final CoroutineDispatcher P() {
        return this.q;
    }

    public final SubauthListenerManager Q() {
        return this.n;
    }

    @Override // defpackage.b98
    public void a(rl5 rl5Var) {
        this.x = rl5Var != null ? rl5Var.b() : null;
    }

    @Override // defpackage.b98
    public Object b(by0 by0Var) {
        ul8.a.z("SUBAUTH").a("Forcing Store Purchase Poll", new Object[0]);
        Object b0 = b0(by0Var);
        return b0 == kotlin.coroutines.intrinsics.a.h() ? b0 : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(defpackage.by0 r25) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.b0(by0):java.lang.Object");
    }

    @Override // defpackage.b98
    public void c(boolean z) {
        this.u = z;
    }

    @Override // defpackage.b98
    public Object d(by0 by0Var) {
        h0();
        return ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.a98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$lastLinkNYTAccountToPurchaseStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$lastLinkNYTAccountToPurchaseStatus$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$lastLinkNYTAccountToPurchaseStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$lastLinkNYTAccountToPurchaseStatus$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$lastLinkNYTAccountToPurchaseStatus$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            ba1 r4 = r4.m
            kotlinx.coroutines.flow.Flow r4 = r4.getData()
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r4, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            s16 r5 = (defpackage.s16) r5
            r4 = 0
            if (r5 == 0) goto L51
            s16$a r0 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.D
            java.lang.Object r0 = r5.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L52
        L51:
            r0 = r4
        L52:
            if (r5 == 0) goto L5d
            s16$a r1 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.C
            java.lang.Object r1 = r5.c(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L5e
        L5d:
            r1 = r4
        L5e:
            if (r5 == 0) goto L69
            s16$a r2 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.F
            java.lang.Object r5 = r5.c(r2)
            java.lang.String r5 = (java.lang.String) r5
            goto L6a
        L69:
            r5 = r4
        L6a:
            if (r0 == 0) goto L76
            int r4 = r0.intValue()
            d54$a r0 = defpackage.d54.Companion
            d54 r4 = r0.a(r4, r5)
        L76:
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.e(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.a98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$isProductDetailsSupported$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$isProductDetailsSupported$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$isProductDetailsSupported$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$isProductDetailsSupported$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$isProductDetailsSupported$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r4 = r5.j()
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront r4 = r4.i
            r0.label = r3
            java.lang.Object r4 = r4.s(r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.f(by0):java.lang.Object");
    }

    @Override // defpackage.a98
    public Object g(by0 by0Var) {
        return this.i.p(by0Var);
    }

    @Override // defpackage.b98
    public void h(boolean z) {
        this.i.v(z);
    }

    public final void h0() {
        if (this.o) {
            ul8.a.z("SUBAUTH").a("Polling is Disabled", new Object[0]);
        } else {
            ul8.a.z("SUBAUTH").a("Starting Purchase Polling", new Object[0]);
            BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new SubauthPurchaseManager$startPolling$1(this, null), 3, null);
        }
    }

    @Override // defpackage.a98
    public Flow i() {
        final MutableSharedFlow mutableSharedFlow = this.y;
        final Flow flow = new Flow() { // from class: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1

            /* renamed from: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2", f = "SubauthPurchaseManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        y88 r6 = (defpackage.y88) r6
                        boolean r6 = r6 instanceof y88.a
                        if (r6 == 0) goto L46
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L46
                        return r1
                    L46:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        return new Flow() { // from class: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1

            /* renamed from: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2", f = "SubauthPurchaseManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        y88 r5 = (defpackage.y88) r5
                        java.lang.String r6 = "null cannot be cast to non-null type com.nytimes.android.subauth.core.purchase.analytics.SubauthPurchaseAnalyticsEvent.OnPurchase"
                        defpackage.zq3.f(r5, r6)
                        y88$a r5 = (y88.a) r5
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L48
                        return r1
                    L48:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getPurchaseAnalyticsOnPurchaseEventFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.a98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.util.Set r5, int r6, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getProductDetails$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getProductDetails$1 r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getProductDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getProductDetails$1 r0 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$getProductDetails$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r4 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager) r4
            kotlin.f.b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r7)
            w28 r7 = r4.x
            if (r7 != 0) goto L4b
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront r7 = r4.i
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.o(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            w28 r7 = (defpackage.w28) r7
        L4b:
            boolean r4 = r4.u
            if (r4 == 0) goto L88
            boolean r4 = r7 instanceof w28.b
            if (r4 == 0) goto L88
            w28$b r7 = (w28.b) r7
            java.util.Set r4 = r7.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.i.w(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            v28 r6 = (defpackage.v28) r6
            v28 r6 = r6.a()
            r5.add(r6)
            goto L6a
        L7e:
            java.util.Set r4 = kotlin.collections.i.c1(r5)
            w28$b r5 = new w28$b
            r5.<init>(r4)
            return r5
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.j(java.util.Set, int, by0):java.lang.Object");
    }

    @Override // defpackage.b98
    public void k(dm5 dm5Var) {
        bm5 a2;
        this.v = (dm5Var == null || (a2 = cm5.a(dm5Var)) == null) ? null : a2.b();
    }

    @Override // defpackage.a98
    public Object l(Activity activity, String str, int i, ss2 ss2Var, String str2, Set set, by0 by0Var) {
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new SubauthPurchaseManager$purchaseProduct$4(this, str, i, ss2Var, activity, str2, set, MutableSharedFlow$default, null), 3, null);
        return FlowKt.first(MutableSharedFlow$default, by0Var);
    }

    @Override // defpackage.b98
    public void m(ol5 ol5Var) {
        ml5 a2;
        this.w = (ol5Var == null || (a2 = nl5.a(ol5Var)) == null) ? null : a2.b();
    }

    @Override // defpackage.a98
    public Object n(String str, PurchaseLinkSource purchaseLinkSource, by0 by0Var) {
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new SubauthPurchaseManager$linkNYTAccountToPurchase$2(str, this, purchaseLinkSource, MutableSharedFlow$default, null), 3, null);
        return FlowKt.first(MutableSharedFlow$default, by0Var);
    }

    @Override // defpackage.a98
    public Flow o() {
        return this.y;
    }

    public /* synthetic */ SubauthPurchaseManager(NYTUser nYTUser, xz8 xz8Var, qz8 qz8Var, c05 c05Var, j86 j86Var, kl7 kl7Var, e98 e98Var, w88 w88Var, GoogleStoreFront googleStoreFront, String str, Resources resources, i iVar, ba1 ba1Var, SubauthListenerManager subauthListenerManager, boolean z, boolean z2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nYTUser, xz8Var, qz8Var, c05Var, j86Var, kl7Var, e98Var, w88Var, googleStoreFront, str, (i & 1024) != 0 ? null : resources, iVar, ba1Var, subauthListenerManager, z, z2, (i & 65536) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
