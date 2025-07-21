package com.nytimes.android.entitlements.subauth;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.api.config.model.CampaignCodes;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.a98;
import defpackage.b98;
import defpackage.by0;
import defpackage.ck6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.lk6;
import defpackage.ly3;
import defpackage.n98;
import defpackage.ry3;
import defpackage.ww8;
import defpackage.y88;
import defpackage.z88;
import defpackage.zq3;
import io.reactivex.subjects.PublishSubject;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class SubauthPurchaseClientImpl implements z88 {
    private final Subauth a;
    private final n98 b;
    private final NetworkStatus c;
    private final ly3 d;
    private final PublishSubject e;
    private final ry3 f;
    private final MutableSharedFlow g;
    private final SharedPreferences h;
    private final String i;
    private final String j;
    private final String k;
    private final MutableSharedFlow l;
    private boolean m;
    private String n;
    private String o;

    @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$1", f = "SubauthPurchaseClientImpl.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y88 y88Var, by0 by0Var) {
            return ((AnonymousClass1) create(y88Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = SubauthPurchaseClientImpl.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                y88 y88Var = (y88) this.L$0;
                MutableSharedFlow mutableSharedFlow = SubauthPurchaseClientImpl.this.g;
                this.label = 1;
                if (mutableSharedFlow.emit(y88Var, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$2", f = "SubauthPurchaseClientImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.i((Throwable) this.L$0, "Unable to get purchase analytics flow", new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CampaignCodeSource.values().length];
            try {
                iArr[CampaignCodeSource.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CampaignCodeSource.GATEWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CampaignCodeSource.SUBSCRIBE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CampaignCodeSource.TOAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CampaignCodeSource.METER_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CampaignCodeSource.SPLASH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CampaignCodeSource.TOP_STORIES_SUB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CampaignCodeSource.AF_SUB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public SubauthPurchaseClientImpl(Subauth subauth, n98 n98Var, NetworkStatus networkStatus, ly3 ly3Var, PublishSubject publishSubject, ry3 ry3Var, MutableSharedFlow mutableSharedFlow, SharedPreferences sharedPreferences, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, Resources resources) {
        zq3.h(subauth, "subauth");
        zq3.h(n98Var, "subauthUserClient");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(ly3Var, "latestCampaignCodes");
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(ry3Var, "launchAccountBenefitsHelper");
        zq3.h(mutableSharedFlow, "purchaseAnalyticsEventFlow");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(coroutineScope, "applicationScope");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(resources, "resources");
        this.a = subauth;
        this.b = n98Var;
        this.c = networkStatus;
        this.d = ly3Var;
        this.e = publishSubject;
        this.f = ry3Var;
        this.g = mutableSharedFlow;
        this.h = sharedPreferences;
        String string = resources.getString(lk6.subauth_offline_error);
        zq3.g(string, "getString(...)");
        this.i = string;
        String string2 = resources.getString(lk6.link_success);
        zq3.g(string2, "getString(...)");
        this.j = string2;
        String string3 = resources.getString(ck6.com_nytimes_android_phoenix_beta_disable_forced_link);
        zq3.g(string3, "getString(...)");
        this.k = string3;
        this.l = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(FlowKt.flowOn(m().o(), coroutineDispatcher), new AnonymousClass1(null)), new AnonymousClass2(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(androidx.fragment.app.f r13, boolean r14, defpackage.by0 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeForceLoginAndLink$1
            if (r0 == 0) goto L13
            r0 = r15
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeForceLoginAndLink$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeForceLoginAndLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeForceLoginAndLink$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeForceLoginAndLink$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 3
            r10 = 2
            r3 = 1
            r11 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3c
            if (r1 == r10) goto L38
            if (r1 != r2) goto L30
            kotlin.f.b(r15)
            goto L98
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            kotlin.f.b(r15)
            goto L80
        L3c:
            java.lang.Object r12 = r0.L$0
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl r12 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl) r12
            kotlin.f.b(r15)
            goto L65
        L44:
            kotlin.f.b(r15)
            if (r14 == 0) goto L8d
            java.lang.String r14 = "No current user. Forcing login."
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.nytimes.android.logging.NYTLogger.d(r14, r15)
            n98 r1 = r12.b
            r0.L$0 = r12
            r0.label = r3
            r3 = 1
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r2 = r13
            r6 = r0
            java.lang.Object r15 = n98.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r9) goto L65
            return r9
        L65:
            oa4 r15 = (defpackage.oa4) r15
            boolean r13 = r15 instanceof oa4.c
            if (r13 == 0) goto L83
            java.lang.String r13 = "Login success. Attempting link."
            java.lang.Object[] r14 = new java.lang.Object[r11]
            com.nytimes.android.logging.NYTLogger.d(r13, r14)
            com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r13 = com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource.LINK_PURCHASE_AFTER_LOGIN
            r14 = 0
            r0.L$0 = r14
            r0.label = r10
            java.lang.Object r12 = r12.h(r13, r0)
            if (r12 != r9) goto L80
            return r9
        L80:
            ww8 r12 = defpackage.ww8.a
            return r12
        L83:
            java.lang.String r12 = "Login failure / cancel. Cannot link."
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.nytimes.android.logging.NYTLogger.d(r12, r13)
            ww8 r12 = defpackage.ww8.a
            return r12
        L8d:
            com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r13 = com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource.RE_LINK_ON_APP_OPEN
            r0.label = r2
            java.lang.Object r12 = r12.h(r13, r0)
            if (r12 != r9) goto L98
            return r9
        L98:
            ww8 r12 = defpackage.ww8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.g(androidx.fragment.app.f, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r11, defpackage.by0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L3c
            if (r1 == r9) goto L34
            if (r1 != r8) goto L2c
            kotlin.f.b(r12)
            goto L8a
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r0.L$0
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl r10 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl) r10
            kotlin.f.b(r12)
            goto L53
        L3c:
            kotlin.f.b(r12)
            a98 r1 = r10.m()
            r0.L$0 = r10
            r0.label = r9
            r2 = 0
            r5 = 1
            r6 = 0
            r3 = r11
            r4 = r0
            java.lang.Object r12 = a98.a.a(r1, r2, r3, r4, r5, r6)
            if (r12 != r7) goto L53
            return r7
        L53:
            r11 = r12
            d54 r11 = (defpackage.d54) r11
            boolean r1 = r11 instanceof d54.d
            r2 = 0
            if (r1 == 0) goto L63
            java.lang.String r11 = "Link Success!"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.nytimes.android.logging.NYTLogger.d(r11, r1)
            goto L79
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Link failure: "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.nytimes.android.logging.NYTLogger.d(r11, r1)
        L79:
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r10.l
            java.lang.Boolean r11 = defpackage.cc0.a(r9)
            r0.L$0 = r12
            r0.label = r8
            java.lang.Object r10 = r10.emit(r11, r0)
            if (r10 != r7) goto L8a
            return r7
        L8a:
            ww8 r10 = defpackage.ww8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.h(com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$getCampaignCode$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$getCampaignCode$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$getCampaignCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$getCampaignCode$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$getCampaignCode$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource r5 = (com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl r4 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl) r4
            kotlin.f.b(r6)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            ly3 r6 = r4.d
            io.reactivex.Observable r6 = r6.get()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.awaitFirst(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.nytimes.android.api.config.model.CampaignCodes r6 = (com.nytimes.android.api.config.model.CampaignCodes) r6
            defpackage.zq3.e(r6)
            java.lang.String r4 = r4.k(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.j(com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource, by0):java.lang.Object");
    }

    private final String k(CampaignCodes campaignCodes, CampaignCodeSource campaignCodeSource) {
        switch (campaignCodeSource == null ? -1 : a.a[campaignCodeSource.ordinal()]) {
            case 1:
                return campaignCodes.getSubscribe();
            case 2:
                return campaignCodes.getGateway();
            case 3:
                return campaignCodes.getSubscribeAd();
            case 4:
                return campaignCodes.getToast();
            case 5:
                return campaignCodes.getMeterCard();
            case 6:
                return campaignCodes.getSplash();
            case 7:
                return campaignCodes.getTopStoriesSub();
            case 8:
                return campaignCodes.getAfSub();
            default:
                return null;
        }
    }

    private final b98 l() {
        return this.a.e();
    }

    private final a98 m() {
        return this.a.j();
    }

    @Override // defpackage.z88
    public Object H(Iterable iterable, int i, by0 by0Var) {
        return m().j(i.c1(iterable), i, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(android.content.Context r17, java.lang.String r18, com.nytimes.android.subauth.core.auth.models.RegiInterface r19, java.lang.String r20, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r21, defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.J(android.content.Context, java.lang.String, com.nytimes.android.subauth.core.auth.models.RegiInterface, java.lang.String, com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(androidx.fragment.app.f r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.K(androidx.fragment.app.f, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(androidx.fragment.app.f r18, java.lang.String r19, com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource r20, java.lang.String r21, java.lang.String r22, defpackage.by0 r23) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.M(androidx.fragment.app.f, java.lang.String, com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.z88
    public String S() {
        return this.o;
    }

    @Override // defpackage.z88
    public Object b(by0 by0Var) {
        Object b = l().b(by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$isProductDetailsSupported$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$isProductDetailsSupported$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$isProductDetailsSupported$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$isProductDetailsSupported$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl$isProductDetailsSupported$1
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
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            a98 r4 = r4.m()
            r0.label = r3
            java.lang.Object r4 = r4.f(r0)
            if (r4 != r1) goto L47
            return r1
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl.f(by0):java.lang.Object");
    }

    @Override // defpackage.z88
    public Flow i() {
        return m().i();
    }

    @Override // defpackage.z88
    public String t() {
        return this.n;
    }
}
