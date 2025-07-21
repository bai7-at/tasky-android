package com.nytimes.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.nytimes.android.SingleArticleActivity;
import com.nytimes.android.SingleArticleViewModel;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.designsystem.uicompose.composable.CharmBraceletLayoutKt;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.fragment.AssetArgs;
import com.nytimes.android.fragment.VerticalScrollStateKt;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import com.nytimes.android.fragment.b;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.fragment.gateway.PaywallOverlayViewModel;
import com.nytimes.android.gateway.GatewayType;
import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.link.share.GiftShareViewModel;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.m;
import com.nytimes.android.menu.SaveMenuHelper;
import com.nytimes.android.menu.item.MenuTooltipManager;
import com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer;
import com.nytimes.android.messaging.dock.DockViewComposableKt;
import com.nytimes.android.share.ShareAnalyticsReporter;
import com.nytimes.android.share.sheet.ShareSheetViewModel;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.theathletic.AthleticComposablesKt;
import com.nytimes.android.theathletic.AthleticViewModel;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.as0;
import defpackage.bc0;
import defpackage.bd1;
import defpackage.bs0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.c04;
import defpackage.cc7;
import defpackage.ce5;
import defpackage.ci5;
import defpackage.cs0;
import defpackage.cy4;
import defpackage.d5;
import defpackage.d83;
import defpackage.dk0;
import defpackage.dr7;
import defpackage.du8;
import defpackage.e44;
import defpackage.e52;
import defpackage.eb5;
import defpackage.ee5;
import defpackage.em6;
import defpackage.eq7;
import defpackage.et0;
import defpackage.fc;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.fq7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gt7;
import defpackage.gw2;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.ht7;
import defpackage.i5;
import defpackage.it2;
import defpackage.j5;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kg9;
import defpackage.md3;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.nr;
import defpackage.ow7;
import defpackage.ph9;
import defpackage.py1;
import defpackage.qq;
import defpackage.qs2;
import defpackage.rb5;
import defpackage.rg4;
import defpackage.rq;
import defpackage.s42;
import defpackage.s96;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t21;
import defpackage.td4;
import defpackage.ti3;
import defpackage.tq0;
import defpackage.tx1;
import defpackage.u32;
import defpackage.ue4;
import defpackage.uq7;
import defpackage.vn8;
import defpackage.wp7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yr4;
import defpackage.yt;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class SingleArticleActivity extends g implements nr, ht7, fc, gw2 {
    public AbraManager abraManager;
    public AppPreferences appPreferences;
    public rq articleFragmentFactory;
    public ArticlePageEventSender articlePageEventSender;
    public dk0 chartbeatAnalyticsReporter;
    public qq chooser;
    private final c04 f;
    private final c04 g;
    private final c04 h;
    public HasGateway hasGateway;
    public HybridEventListener hybridEventListener;
    public md3 hybridScrollEventManager;
    private final c04 i;
    public ti3 inAppReviewHandler;
    private View k;
    private final c04 l;
    public SubscriberLinkSharingMenuPreparer menuPreparer;
    public MenuTooltipManager menuTooltipManager;
    public OneTapLifecycleObserver oneTapLifecycleObserver;
    public s96 purrUI;
    private final j5 r;
    public SaveMenuHelper saveMenuHelper;
    public ShareAnalyticsReporter shareAnalyticsReporter;
    public uq7 sharingManager;
    public dr7 showReviewClass;
    public gt7 singleAssetPresenter;
    public vn8 tooltipManager;
    private final d83 j = d83.a;
    private MutableStateFlow m = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    private final sy4 n = b0.e(null, null, 2, null);

    public static final class a extends ue4 {
        public a(String str) {
            super(du8.a("__et2_debuggingPageName__", str));
        }
    }

    public SingleArticleActivity() {
        final qs2 qs2Var = null;
        this.f = new s(zt6.b(SingleArticleViewModel.class), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.g = new s(zt6.b(AthleticViewModel.class), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.h = new s(zt6.b(ShareSheetViewModel.class), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.i = new s(zt6.b(GiftShareViewModel.class), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$11
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.l = new s(zt6.b(PaywallOverlayViewModel.class), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        j5 registerForActivityResult = registerForActivityResult(new i5(), new d5() { // from class: xs7
            @Override // defpackage.d5
            public final void a(Object obj) {
                SingleArticleActivity.u1(SingleArticleActivity.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.r = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(File file) {
        this.n.setValue(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(Uri uri) {
        Asset k = X().k();
        String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URL");
        E1(this, k, uri, stringExtra != null && rb5.r(stringExtra), stringExtra, null, 16, null);
    }

    static /* synthetic */ void C1(SingleArticleActivity singleArticleActivity, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = null;
        }
        singleArticleActivity.B1(uri);
    }

    private final void D1(Asset asset, Uri uri, boolean z, String str, String str2) {
        tx1 c;
        PageContext i;
        if (asset == null) {
            if (z) {
                uq7.n(getSharingManager(), this, str, null, null, ShareOrigin.ARTICLE_FRONT, null, null, uri, uri != null ? "screenshot-menu" : null, false, null, null, 3680, null);
            }
        } else {
            getSharingManager().j(this, asset, ShareOrigin.ARTICLE_FRONT, uri, str2, getFeatureFlagUtil().L(), (!getFeatureFlagUtil().o() || (c = W().c()) == null || (i = c.i()) == null) ? null : i.g());
            if (getFeatureFlagUtil().t()) {
                ti3.b(f1(), null, 1, null);
            }
        }
    }

    static /* synthetic */ void E1(SingleArticleActivity singleArticleActivity, Asset asset, Uri uri, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = "share-menu";
        }
        singleArticleActivity.D1(asset, uri, z, str, str2);
    }

    private final void M() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        ee5.a(onBackPressedDispatcher, this, true, new ss2() { // from class: com.nytimes.android.SingleArticleActivity$handleBackPressed$1

            @fc1(c = "com.nytimes.android.SingleArticleActivity$handleBackPressed$1$1", f = "SingleArticleActivity.kt", l = {ContentDeliverySubscriptionType.TRANSACTIONAL}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.SingleArticleActivity$handleBackPressed$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ce5 $this_addCallback;
                int label;
                final /* synthetic */ SingleArticleActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SingleArticleActivity singleArticleActivity, ce5 ce5Var, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = singleArticleActivity;
                    this.$this_addCallback = ce5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$this_addCallback, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    SingleArticleViewModel q1;
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        q1 = this.this$0.q1();
                        HybridEventListener d1 = this.this$0.d1();
                        this.label = 1;
                        obj = q1.m(d1, this);
                        if (obj == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return ww8.a;
                    }
                    this.this$0.x1();
                    this.$this_addCallback.remove();
                    this.this$0.getOnBackPressedDispatcher().l();
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                zq3.h(ce5Var, "$this$addCallback");
                BuildersKt__Builders_commonKt.launch$default(e44.a(SingleArticleActivity.this), null, null, new AnonymousClass1(SingleArticleActivity.this, ce5Var, null), 3, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float V0(float f, boolean z) {
        if (!Z()) {
            return CharmBraceletLayoutKt.b();
        }
        if (!z) {
            f = bu1.g(0);
        }
        return bu1.g(AthleticViewModel.Companion.a() + f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AthleticViewModel Y0() {
        return (AthleticViewModel) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GiftShareViewModel b1() {
        return (GiftShareViewModel) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(final m mVar, final ss2 ss2Var, final ss2 ss2Var2, final ss2 ss2Var3, final ss2 ss2Var4, final gt2 gt2Var, Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(623751758);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(623751758, i, -1, "com.nytimes.android.SingleArticleActivity.AssetContent (SingleArticleActivity.kt:650)");
        }
        if (mVar instanceof m.b) {
            h.z(-1363139192);
            SnackbarUtil snackbarUtil = getSnackbarUtil();
            int i2 = nk6.blank_fragment_unsupported_message;
            String assetType = ((m.b) mVar).a().getAssetType();
            if (assetType == null) {
                assetType = "";
            }
            String string = getString(i2, assetType);
            zq3.g(string, "getString(...)");
            snackbarUtil.B(string, -2, k48.b(nk6.dialog_btn_ok, h, 0), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$AssetContent$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m173invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m173invoke() {
                    SingleArticleActivity.this.finish();
                }
            });
            ww8 ww8Var = ww8.a;
            h.z(-1363138732);
            boolean z = (((i & 14) ^ 6) > 4 && h.S(mVar)) || (i & 6) == 4;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new SingleArticleActivity$AssetContent$2$1(mVar, null);
                h.q(A);
            }
            h.R();
            py1.d(ww8Var, (gt2) A, h, 70);
            h.R();
            composer2 = h;
        } else {
            if (mVar instanceof m.g ? true : mVar instanceof m.i ? true : mVar instanceof m.l ? true : mVar instanceof m.j) {
                h.z(-1363138289);
                py1.d(ww8.a, new SingleArticleActivity$AssetContent$3(mVar, this, null), h, 70);
                int i3 = i << 3;
                HybridWebViewLayoutKt.n(mVar, mVar.e(), ss2Var, ss2Var2, new ss2() { // from class: com.nytimes.android.SingleArticleActivity$AssetContent$5
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }

                    public final void invoke(String str) {
                        PaywallOverlayViewModel h1;
                        zq3.h(str, "it");
                        h1 = SingleArticleActivity.this.h1();
                        h1.g();
                    }
                }, new SingleArticleActivity$AssetContent$4(h1()), ss2Var4, false, false, false, gt2Var, h, (i & 14) | (i3 & 896) | (i3 & 7168) | ((i << 6) & 3670016), (i >> 15) & 14, 896);
                h.R();
                composer2 = h;
            } else {
                composer2 = h;
                composer2.z(-1363137496);
                composer2.z(-1363137465);
                int i4 = i & 14;
                boolean z2 = ((((i & 7168) ^ 3072) > 2048 && composer2.S(ss2Var3)) || (i & 3072) == 2048) | (((i4 ^ 6) > 4 && composer2.S(mVar)) || (i & 6) == 4);
                Object A2 = composer2.A();
                if (z2 || A2 == Composer.a.a()) {
                    A2 = new SingleArticleActivity$AssetContent$6$1(ss2Var3, mVar, null);
                    composer2.q(A2);
                }
                composer2.R();
                py1.d(mVar, (gt2) A2, composer2, i4 | 64);
                composer2.R();
            }
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.SingleArticleActivity$AssetContent$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    SingleArticleActivity.this.h0(mVar, ss2Var, ss2Var2, ss2Var3, ss2Var4, gt2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallOverlayViewModel h1() {
        return (PaywallOverlayViewModel) this.l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(final com.nytimes.android.fragment.b bVar, final x08 x08Var, final float f, final ss2 ss2Var, final boolean z, Composer composer, final int i) {
        Composer h = composer.h(-469516606);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-469516606, i, -1, "com.nytimes.android.SingleArticleActivity.CharmBraceletBottomBar (SingleArticleActivity.kt:526)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        Modifier.a aVar = Modifier.a;
        Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
        h.z(-483455358);
        rg4 a2 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        if (Z()) {
            h.z(-283315949);
            AthleticComposablesKt.c(ss2Var, AthleticViewModel.Companion.a(), Y0().f(), z, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m175invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m175invoke() {
                    AthleticViewModel Y0;
                    Y0 = SingleArticleActivity.this.Y0();
                    Y0.o();
                }
            }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$1$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m176invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m176invoke() {
                    SingleArticleActivity.this.onBackPressed();
                }
            }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m177invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m177invoke() {
                    AthleticViewModel Y0;
                    Y0 = SingleArticleActivity.this.Y0();
                    Y0.j(context, SingleArticleActivity.this.U());
                }
            }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$1$4
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m178invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m178invoke() {
                    AthleticViewModel Y0;
                    Y0 = SingleArticleActivity.this.Y0();
                    Y0.k();
                }
            }, h, ((i >> 9) & 14) | 48 | ((i >> 3) & 7168));
            h.R();
        } else {
            h.z(-283315190);
            DockViewComposableKt.DockViewComposable(bVar.getPosition(), null, null, false, h, 0, 14);
            CharmBraceletLayoutKt.a(BackgroundKt.d(OffsetKt.c(ShadowKt.b(aVar, bu1.g(12), null, false, 0L, 0L, 30, null), 0.0f, bu1.g(((bu1) x08Var.getValue()).n() - f), 1, null), eb5.Companion.a(h, 8).a(), null, 2, null), h, 0, 0);
            h.R();
        }
        h.R();
        h.t();
        h.R();
        h.R();
        py1.d(ww8.a, new SingleArticleActivity$CharmBraceletBottomBar$2(this, null), h, 70);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    SingleArticleActivity.this.i0(bVar, x08Var, f, ss2Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(final m mVar, Composer composer, final int i) {
        Composer h = composer.h(-554491682);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-554491682, i, -1, "com.nytimes.android.SingleArticleActivity.ET2TrackPage (SingleArticleActivity.kt:564)");
        }
        ET2CoroutineScopeKt.e(mVar, new SingleArticleActivity$ET2TrackPage$1(mVar, this, null), h, (i & 14) | 64, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.SingleArticleActivity$ET2TrackPage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    SingleArticleActivity.this.j0(mVar, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j1(String str) {
        tx1 c;
        PageContext i;
        String L = getFeatureFlagUtil().L();
        String str2 = null;
        if (getFeatureFlagUtil().o() && (c = W().c()) != null && (i = c.i()) != null) {
            str2 = i.g();
        }
        return yt.o(str, L, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(final ss2 ss2Var, Composer composer, final int i) {
        sy4 sy4Var;
        Composer h = composer.h(-431044028);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-431044028, i, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen (SingleArticleActivity.kt:277)");
        }
        boolean booleanValue = ((Boolean) y.b(p1().f(), null, h, 8, 1).getValue()).booleanValue();
        h.z(778486092);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(bu1.d(bu1.g(0)), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var2 = (sy4) A;
        h.R();
        float o0 = o0(sy4Var2);
        h.z(778486163);
        boolean b = h.b(o0);
        Object A2 = h.A();
        if (b || A2 == aVar.a()) {
            A2 = y.d(new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$charmBraceletMaxHeight$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final float b() {
                    float o02;
                    AthleticViewModel Y0;
                    float V0;
                    SingleArticleActivity singleArticleActivity = SingleArticleActivity.this;
                    o02 = SingleArticleActivity.o0(sy4Var2);
                    Y0 = SingleArticleActivity.this.Y0();
                    V0 = singleArticleActivity.V0(o02, ((Boolean) Y0.i().getValue()).booleanValue());
                    return V0;
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return bu1.d(b());
                }
            });
            h.q(A2);
        }
        final x08 x08Var = (x08) A2;
        h.R();
        h.z(778486359);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = b0.e(new b.d(0, 0), null, 2, null);
            h.q(A3);
        }
        sy4 sy4Var3 = (sy4) A3;
        h.R();
        x08 b2 = y.b(c1().f(), null, h, 8, 1);
        h.z(778486548);
        Object A4 = h.A();
        if (A4 == aVar.a()) {
            A4 = q1().j();
            h.q(A4);
        }
        h.R();
        yr4 yr4Var = (yr4) y.a((Flow) A4, null, null, h, 56, 2).getValue();
        final bs0 bs0Var = (bs0) h.m(ComposablePositionsKt.b());
        final fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        ph9 a2 = kg9.a(getWindow(), getWindow().getDecorView());
        zq3.g(a2, "getInsetsController(...)");
        h.z(778486873);
        Object A5 = h.A();
        if (A5 == aVar.a()) {
            A5 = ow7.a(0);
            h.q(A5);
        }
        cy4 cy4Var = (cy4) A5;
        h.R();
        BoxWithConstraintsKt.a(null, null, false, zr0.b(h, -241168338, true, new it2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$1

            @fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$1$1", f = "SingleArticleActivity.kt", l = {315}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ bs0 $composablePositions;
                final /* synthetic */ fm1 $density;
                final /* synthetic */ float $maxHeightOfScreen;
                int label;
                final /* synthetic */ SingleArticleActivity this$0;

                @fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$1$1$2", f = "SingleArticleActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ bs0 $composablePositions;
                    final /* synthetic */ fm1 $density;
                    final /* synthetic */ float $maxHeightOfScreen;
                    /* synthetic */ int I$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(bs0 bs0Var, float f, fm1 fm1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$composablePositions = bs0Var;
                        this.$maxHeightOfScreen = f;
                        this.$density = fm1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$composablePositions, this.$maxHeightOfScreen, this.$density, by0Var);
                        anonymousClass2.I$0 = ((Number) obj).intValue();
                        return anonymousClass2;
                    }

                    public final Object invoke(int i, by0 by0Var) {
                        return ((AnonymousClass2) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        kotlin.coroutines.intrinsics.a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                        int i = this.I$0;
                        if (i > 0) {
                            this.$composablePositions.a().put("share", new as0(null, hd5.a(i, this.$maxHeightOfScreen), hn3.b.a(), null, this.$density, null));
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke(((Number) obj).intValue(), (by0) obj2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SingleArticleActivity singleArticleActivity, bs0 bs0Var, float f, fm1 fm1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = singleArticleActivity;
                    this.$composablePositions = bs0Var;
                    this.$maxHeightOfScreen = f;
                    this.$density = fm1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$composablePositions, this.$maxHeightOfScreen, this.$density, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        final SingleArticleActivity singleArticleActivity = this.this$0;
                        Flow onEach = FlowKt.onEach(y.p(new qs2() { // from class: com.nytimes.android.SingleArticleActivity.SingleArticleScreen.1.1.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Integer mo865invoke() {
                                return Integer.valueOf(SingleArticleActivity.this.g1().o());
                            }
                        }), new AnonymousClass2(this.$composablePositions, this.$maxHeightOfScreen, this.$density, null));
                        this.label = 1;
                        if (FlowKt.collect(onEach, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(bc0 bc0Var, Composer composer2, int i2) {
                zq3.h(bc0Var, "$this$BoxWithConstraints");
                if ((i2 & 14) == 0) {
                    i2 |= composer2.S(bc0Var) ? 4 : 2;
                }
                if ((i2 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-241168338, i2, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen.<anonymous> (SingleArticleActivity.kt:297)");
                }
                py1.d(ww8.a, new AnonymousClass1(this, bs0Var, fm1.this.f1(bu1.g(bc0Var.d() - bu1.g(54))), fm1.this, null), composer2, 70);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((bc0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 3072, 7);
        ComposablePositionsKt.a(new SingleArticleActivity$SingleArticleScreen$2(this, null), h, 8);
        py1.d(ww8.a, new SingleArticleActivity$SingleArticleScreen$3(cy4Var, this, null), h, 70);
        if (s0(b2) == GatewayType.BLOCKED) {
            sy4Var = sy4Var3;
            r0(sy4Var, new b.c(0, 0));
        } else {
            sy4Var = sy4Var3;
        }
        final x08 b3 = y.b(q1().getState(), null, h, 8, 1);
        x08 b4 = y.b(q1().k(), null, h, 8, 1);
        x08 b5 = y.b(l1().o(), null, h, 8, 1);
        ViewExtensions.r(a2, l0(b3).d());
        final sy4 sy4Var4 = sy4Var;
        final float b6 = VerticalScrollStateKt.b(q0(sy4Var), ((bu1) x08Var.getValue()).n(), 0.0f, !booleanValue, h, 0, 4);
        NytScaffoldKt.a(null, null, zr0.b(h, 1694763090, true, new gt2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                SingleArticleViewModel.a l0;
                AthleticViewModel Y0;
                com.nytimes.android.fragment.b q0;
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1694763090, i2, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen.<anonymous> (SingleArticleActivity.kt:497)");
                }
                l0 = SingleArticleActivity.l0(b3);
                if (!l0.d()) {
                    Y0 = SingleArticleActivity.this.Y0();
                    boolean booleanValue2 = ((Boolean) Y0.i().getValue()).booleanValue();
                    q0 = SingleArticleActivity.q0(sy4Var4);
                    SingleArticleActivity singleArticleActivity = SingleArticleActivity.this;
                    x08 x08Var2 = x08Var;
                    float f = b6;
                    composer2.z(1579425456);
                    final sy4 sy4Var5 = sy4Var2;
                    Object A6 = composer2.A();
                    if (A6 == Composer.a.a()) {
                        A6 = new ss2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$4$1$1
                            {
                                super(1);
                            }

                            public final void b(float f2) {
                                SingleArticleActivity.p0(sy4.this, f2);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b(((bu1) obj).n());
                                return ww8.a;
                            }
                        };
                        composer2.q(A6);
                    }
                    composer2.R();
                    singleArticleActivity.i0(q0, x08Var2, f, (ss2) A6, booleanValue2, composer2, 265216);
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), l0(b3).d() ? bu1.g(0) : bu1.g(((bu1) x08Var.getValue()).n() - b6), ComposableSingletons$SingleArticleActivityKt.a.a(), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, yr4Var, null, zr0.b(h, 984541987, true, new SingleArticleActivity$SingleArticleScreen$5(b6, this, booleanValue, cy4Var, b3, ss2Var, sy4Var4, b4, b5)), h, 24960, 134217728, 6, 786403);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    SingleArticleActivity.this.k0(ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleArticleViewModel.a l0(x08 x08Var) {
        return (SingleArticleViewModel.a) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareSheetViewModel l1() {
        return (ShareSheetViewModel) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File n1() {
        return (File) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o0(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.nytimes.android.fragment.b q0(sy4 sy4Var) {
        return (com.nytimes.android.fragment.b) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleArticleViewModel q1() {
        return (SingleArticleViewModel) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(sy4 sy4Var, com.nytimes.android.fragment.b bVar) {
        sy4Var.setValue(bVar);
    }

    private final void r1() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), Dispatchers.getIO(), null, new SingleArticleActivity$handleScreenshots$1(this, null), 2, null);
    }

    private static final GatewayType s0(x08 x08Var) {
        return (GatewayType) x08Var.getValue();
    }

    private final boolean s1(String str) {
        return zq3.c(getIntent().getStringExtra("ARTICLE_REFERRING_SOURCE"), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t1(Asset asset) {
        String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URL");
        return uq7.Companion.a(asset) || (stringExtra != null && rb5.r(stringExtra));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(SingleArticleActivity singleArticleActivity, ActivityResult activityResult) {
        zq3.h(singleArticleActivity, "this$0");
        singleArticleActivity.k1().b();
        singleArticleActivity.l1().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v1(MenuItem menuItem) {
        zq3.h(menuItem, "it");
        d83.a.b(new eq7(null, 1, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(Asset asset) {
        if (s1("BNA notification")) {
            dk0 Z0 = Z0();
            Intent intent = getIntent();
            zq3.g(intent, "getIntent(...)");
            Z0.d(intent);
        }
        X().p(asset);
        p1().g(asset);
        b0(asset.getUrl());
        T().c(asset.getUrlOrEmpty());
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1() {
        W().a(new e52.e(), new s42("back", null, null, null, null, null, null, null, null, 510, null), new u32(null, AssetConstants.ARTICLE_TYPE, "tap", 1, null), new qs2() { // from class: com.nytimes.android.SingleArticleActivity$onBackPressedEvent$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                return new SingleArticleActivity.a("ArticleViewController");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(m mVar) {
        if (mVar instanceof m.g) {
            a(((m.g) mVar).a());
            return;
        }
        if (mVar instanceof m.a) {
            c(((m.a) mVar).a());
            return;
        }
        if (mVar instanceof m.h) {
            l(((m.h) mVar).a());
            return;
        }
        if (mVar instanceof m.l) {
            m.l lVar = (m.l) mVar;
            b(lVar.getUrl(), lVar.j());
            return;
        }
        if (mVar instanceof m.i) {
            m.i iVar = (m.i) mVar;
            String url = iVar.a().getUrl();
            b(url != null ? url : "", iVar.a().getUri());
        } else if (mVar instanceof m.j) {
            m.j jVar = (m.j) mVar;
            String url2 = jVar.a().getUrl();
            b(url2 != null ? url2 : "", jVar.a().getUri());
        } else {
            if (mVar instanceof m.b) {
                throw new IllegalStateException("Already managed before");
            }
            if (mVar instanceof m.k) {
                throw new IllegalStateException("Already managed before");
            }
        }
    }

    private final void z1(Fragment fragment) {
        getSupportFragmentManager().p().q(ng6.fragment_container, fragment).h();
    }

    @Override // defpackage.gw2
    public void R0() {
        h1();
        Intent intent = getIntent();
        if (intent != null) {
            h1().e(intent);
        }
    }

    public final void W0() {
        getOneTapLifecycleObserver().onStart(this);
    }

    public final rq X0() {
        rq rqVar = this.articleFragmentFactory;
        if (rqVar != null) {
            return rqVar;
        }
        zq3.z("articleFragmentFactory");
        return null;
    }

    public final dk0 Z0() {
        dk0 dk0Var = this.chartbeatAnalyticsReporter;
        if (dk0Var != null) {
            return dk0Var;
        }
        zq3.z("chartbeatAnalyticsReporter");
        return null;
    }

    @Override // defpackage.ht7
    public void a(Asset asset) {
        zq3.h(asset, "asset");
        String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.CONTENT_SRC");
        String stringExtra2 = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URL");
        String query = (!bd1.j(stringExtra2) || stringExtra2 == null) ? null : Uri.parse(stringExtra2).getQuery();
        String stringExtra3 = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URI");
        ArticleFragmentType a2 = a1().a(asset);
        if (a2 != ArticleFragmentType.BLANK) {
            Fragment a3 = X0().a(asset, query, stringExtra, stringExtra3, stringExtra2, a2);
            w1(asset);
            z1(a3);
            return;
        }
        SnackbarUtil snackbarUtil = getSnackbarUtil();
        int i = nk6.blank_fragment_unsupported_message;
        String assetType = asset.getAssetType();
        if (assetType == null) {
            assetType = "";
        }
        String string = getString(i, assetType);
        zq3.g(string, "getString(...)");
        String string2 = getString(nk6.dialog_btn_ok);
        zq3.g(string2, "getString(...)");
        snackbarUtil.B(string, -2, string2, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$showArticleAsset$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m192invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m192invoke() {
                SingleArticleActivity.this.finish();
            }
        });
        NYTLogger.s(new Exception("Type is BLANK, Article is not supported at this time"));
    }

    public final qq a1() {
        qq qqVar = this.chooser;
        if (qqVar != null) {
            return qqVar;
        }
        zq3.z("chooser");
        return null;
    }

    @Override // defpackage.ht7
    public void b(String str, String str2) {
        zq3.h(str, "url");
        z1(WebViewFragment.Companion.a(new AssetArgs(str2, str, null, null, 0, null, false, getIntent().getBooleanExtra("com.nytimes.android.extra.METER_OVERRIDE", false), true, false, null, 1596, null)));
    }

    @Override // defpackage.ht7
    public void c(AudioAsset audioAsset) {
        zq3.h(audioAsset, "audioAsset");
        String stringExtra = getIntent().getStringExtra("ARTICLE_REFERRING_SOURCE");
        zq3.e(stringExtra);
        td4 mainActivityNavigator = getMainActivityNavigator();
        Context applicationContext = getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        startActivity(mainActivityNavigator.a(applicationContext, audioAsset.getSafeUri(), audioAsset.getUrlOrEmpty(), stringExtra, false));
        finish();
    }

    public final HasGateway c1() {
        HasGateway hasGateway = this.hasGateway;
        if (hasGateway != null) {
            return hasGateway;
        }
        zq3.z("hasGateway");
        return null;
    }

    @Override // defpackage.ht7
    public void d() {
        View view = this.k;
        if (view == null) {
            zq3.z("progressIndicator");
            view = null;
        }
        view.setVisibility(8);
    }

    public final HybridEventListener d1() {
        HybridEventListener hybridEventListener = this.hybridEventListener;
        if (hybridEventListener != null) {
            return hybridEventListener;
        }
        zq3.z("hybridEventListener");
        return null;
    }

    public final md3 e1() {
        md3 md3Var = this.hybridScrollEventManager;
        if (md3Var != null) {
            return md3Var;
        }
        zq3.z("hybridScrollEventManager");
        return null;
    }

    public final ti3 f1() {
        ti3 ti3Var = this.inAppReviewHandler;
        if (ti3Var != null) {
            return ti3Var;
        }
        zq3.z("inAppReviewHandler");
        return null;
    }

    @Override // defpackage.ht7
    public void g() {
        View view = this.k;
        if (view == null) {
            zq3.z("progressIndicator");
            view = null;
        }
        view.setVisibility(0);
    }

    public final SubscriberLinkSharingMenuPreparer g1() {
        SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer = this.menuPreparer;
        if (subscriberLinkSharingMenuPreparer != null) {
            return subscriberLinkSharingMenuPreparer;
        }
        zq3.z("menuPreparer");
        return null;
    }

    public final OneTapLifecycleObserver getOneTapLifecycleObserver() {
        OneTapLifecycleObserver oneTapLifecycleObserver = this.oneTapLifecycleObserver;
        if (oneTapLifecycleObserver != null) {
            return oneTapLifecycleObserver;
        }
        zq3.z("oneTapLifecycleObserver");
        return null;
    }

    public final uq7 getSharingManager() {
        uq7 uq7Var = this.sharingManager;
        if (uq7Var != null) {
            return uq7Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    @Override // defpackage.ht7
    public void h(int i) {
        getSnackbarUtil().A(i, -2, em6.retry, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$showErrorMessage$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m193invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m193invoke() {
                gt7 o1 = SingleArticleActivity.this.o1();
                Bundle extras = SingleArticleActivity.this.getIntent().getExtras();
                zq3.e(extras);
                o1.i(extras);
            }
        });
    }

    public final SaveMenuHelper i1() {
        SaveMenuHelper saveMenuHelper = this.saveMenuHelper;
        if (saveMenuHelper != null) {
            return saveMenuHelper;
        }
        zq3.z("saveMenuHelper");
        return null;
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, com.nytimes.android.utils.snackbar.a
    public boolean isUsingCompose() {
        return true;
    }

    public final ShareAnalyticsReporter k1() {
        ShareAnalyticsReporter shareAnalyticsReporter = this.shareAnalyticsReporter;
        if (shareAnalyticsReporter != null) {
            return shareAnalyticsReporter;
        }
        zq3.z("shareAnalyticsReporter");
        return null;
    }

    @Override // defpackage.ht7
    public void l(Asset asset) {
        zq3.h(asset, "asset");
        Intent intent = new Intent(this, (Class<?>) FullscreenMediaActivity.class);
        intent.fillIn(getIntent(), 2);
        startActivity(intent);
        finish();
    }

    public final dr7 m1() {
        dr7 dr7Var = this.showReviewClass;
        if (dr7Var != null) {
            return dr7Var;
        }
        zq3.z("showReviewClass");
        return null;
    }

    @Override // defpackage.fc
    public void n() {
        Intent intent = getIntent();
        if (intent != null) {
            h1().f(intent);
        }
    }

    public final gt7 o1() {
        gt7 gt7Var = this.singleAssetPresenter;
        if (gt7Var != null) {
            return gt7Var;
        }
        zq3.z("singleAssetPresenter");
        return null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        zq3.h(actionMode, "mode");
        if (getFeatureFlagUtil().r()) {
            MenuItem item = actionMode.getMenu().getItem(1);
            if (zq3.c(item.getTitle(), "Share")) {
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ws7
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        boolean v1;
                        v1 = SingleArticleActivity.v1(menuItem);
                        return v1;
                    }
                });
            }
        }
        super.onActionModeStarted(actionMode);
    }

    @Override // com.nytimes.android.g, com.nytimes.android.articlefront.BaseArticleActivity, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(61286235, true, new gt2() { // from class: com.nytimes.android.SingleArticleActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(61286235, i, -1, "com.nytimes.android.SingleArticleActivity.onCreate.<anonymous> (SingleArticleActivity.kt:250)");
                }
                final SingleArticleActivity singleArticleActivity = SingleArticleActivity.this;
                NytThemeKt.a(false, null, null, zr0.b(composer, -1908460597, true, new gt2() { // from class: com.nytimes.android.SingleArticleActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-1908460597, i2, -1, "com.nytimes.android.SingleArticleActivity.onCreate.<anonymous>.<anonymous> (SingleArticleActivity.kt:251)");
                        }
                        final SingleArticleActivity singleArticleActivity2 = SingleArticleActivity.this;
                        singleArticleActivity2.k0(new ss2() { // from class: com.nytimes.android.SingleArticleActivity.onCreate.1.1.1
                            {
                                super(1);
                            }

                            public final void b(m mVar) {
                                zq3.h(mVar, "it");
                                SingleArticleActivity.this.y1(mVar);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((m) obj);
                                return ww8.a;
                            }
                        }, composer2, 64);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
        if (getFeatureFlagUtil().r()) {
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Observable subscribeOn = this.j.a(fq7.class).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
            zq3.g(subscribeOn, "subscribeOn(...)");
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(subscribeOn, new ss2() { // from class: com.nytimes.android.SingleArticleActivity$onCreate$2
                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    zq3.h(th, "it");
                    NYTLogger.d("Error on highlight and share events listener", th);
                }
            }, (qs2) null, new ss2() { // from class: com.nytimes.android.SingleArticleActivity$onCreate$3
                {
                    super(1);
                }

                public final void b(fq7 fq7Var) {
                    Bundle a2;
                    if (fq7Var == null || (a2 = fq7Var.a()) == null) {
                        return;
                    }
                    if (a2.isEmpty()) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        wp7.Companion.b(a2).show(SingleArticleActivity.this.getSupportFragmentManager(), "TAG_SHARE_TEXT");
                    }
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((fq7) obj);
                    return ww8.a;
                }
            }, 2, (Object) null));
        }
        M();
        r1();
    }

    @Override // com.nytimes.android.articlefront.BaseArticleActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String url;
        zq3.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == ng6.webRefresh) {
            q1().s();
            return true;
        }
        if (itemId == ng6.action_open_in_chrome) {
            WebView webView = (WebView) findViewById(ng6.webView);
            if (webView == null || (url = webView.getUrl()) == null) {
                return true;
            }
            ci5.a(this, url);
            return true;
        }
        if (itemId == ng6.article_front_save) {
            i1().b(X().k());
            if (!getFeatureFlagUtil().t()) {
                return true;
            }
            ti3.b(f1(), null, 1, null);
            return true;
        }
        if (itemId == ng6.article_front_unsave) {
            i1().d(X().k());
            return true;
        }
        if (itemId != ng6.action_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getFeatureFlagUtil().y()) {
            k1().c();
            l1().r(true);
            return true;
        }
        k1().e();
        C1(this, null, 1, null);
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        String U = U();
        if (U != null) {
            if (U.length() <= 0) {
                U = null;
            }
            if (U != null) {
                Z0().f(U);
            }
        }
    }

    @Override // com.nytimes.android.articlefront.BaseArticleActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        Asset k = X().k();
        MenuItem findItem = menu.findItem(ng6.subscriberLinkSharing);
        if (findItem != null) {
            g1().z(findItem, p1().h(), false, X().k());
        }
        MenuItem findItem2 = menu.findItem(ng6.article_front_save);
        if (findItem2 != null) {
            findItem2.setVisible(i1().f(a1().a(k), k));
        }
        MenuItem findItem3 = menu.findItem(ng6.article_front_unsave);
        if (findItem3 != null) {
            findItem3.setVisible(i1().h(a1().a(k), k));
        }
        MenuItem findItem4 = menu.findItem(ng6.action_share);
        if (findItem4 != null) {
            findItem4.setVisible(t1(k));
        }
        boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        this.m.setValue(Boolean.valueOf(onPrepareOptionsMenu));
        return onPrepareOptionsMenu;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        T().B(4);
        m1().c();
        Asset k = X().k();
        if (k != null) {
            i1().c(k);
        }
        Embrace.getInstance().endAppStartup();
    }

    public final vn8 p1() {
        vn8 vn8Var = this.tooltipManager;
        if (vn8Var != null) {
            return vn8Var;
        }
        zq3.z("tooltipManager");
        return null;
    }
}
