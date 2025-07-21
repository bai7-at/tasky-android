package com.nytimes.android;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.nytimes.android.SingleArticleViewModel;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.fragment.b;
import com.nytimes.android.fragment.gateway.PaywallComposableKt;
import com.nytimes.android.fragment.gateway.PaywallOverlayViewModel;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.m;
import com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer;
import com.nytimes.android.share.dialog.NYTShareDialogKt;
import com.nytimes.android.share.sheet.NYTShareBottomSheetKt;
import com.nytimes.android.share.sheet.ShareSheetViewModel;
import com.nytimes.android.theathletic.AthleticComposablesKt;
import com.nytimes.android.theathletic.AthleticViewModel;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cs0;
import defpackage.cy4;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j5;
import defpackage.ju7;
import defpackage.nk6;
import defpackage.py1;
import defpackage.ql3;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sl0;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yp7;
import defpackage.zq3;
import defpackage.zr0;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes2.dex */
final class SingleArticleActivity$SingleArticleScreen$5 extends Lambda implements it2 {
    final /* synthetic */ x08 $articleState$delegate;
    final /* synthetic */ x08 $debugMode$delegate;
    final /* synthetic */ cy4 $giftShareRemaining;
    final /* synthetic */ ss2 $onAssetContentLoaded;
    final /* synthetic */ x08 $showShareBottomSheet$delegate;
    final /* synthetic */ float $toolbarHeight;
    final /* synthetic */ boolean $tooltipLinkSharingVisible;
    final /* synthetic */ sy4 $verticalScrollState$delegate;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$SingleArticleScreen$5(float f, SingleArticleActivity singleArticleActivity, boolean z, cy4 cy4Var, x08 x08Var, ss2 ss2Var, sy4 sy4Var, x08 x08Var2, x08 x08Var3) {
        super(3);
        this.$toolbarHeight = f;
        this.this$0 = singleArticleActivity;
        this.$tooltipLinkSharingVisible = z;
        this.$giftShareRemaining = cy4Var;
        this.$articleState$delegate = x08Var;
        this.$onAssetContentLoaded = ss2Var;
        this.$verticalScrollState$delegate = sy4Var;
        this.$debugMode$delegate = x08Var2;
        this.$showShareBottomSheet$delegate = x08Var3;
    }

    private static final boolean c(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(ym5 ym5Var, Composer composer, int i) {
        SingleArticleViewModel.a l0;
        SingleArticleViewModel.a l02;
        SingleArticleViewModel q1;
        boolean m0;
        boolean n0;
        Asset asset;
        File n1;
        SingleArticleViewModel.a l03;
        File n12;
        final Uri uri;
        SingleArticleViewModel.a l04;
        Image extractImage;
        Image.ImageCrop crops;
        ImageDimension square640;
        zq3.h(ym5Var, "it");
        if ((i & 81) == 16 && composer.i()) {
            composer.K();
            return;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(984541987, i, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen.<anonymous> (SingleArticleActivity.kt:344)");
        }
        Modifier.a aVar = Modifier.a;
        l0 = SingleArticleActivity.l0(this.$articleState$delegate);
        Modifier m = PaddingKt.m(aVar, 0.0f, 0.0f, 0.0f, l0.d() ? bu1.g(0) : this.$toolbarHeight, 7, null);
        final SingleArticleActivity singleArticleActivity = this.this$0;
        x08 x08Var = this.$articleState$delegate;
        final ss2 ss2Var = this.$onAssetContentLoaded;
        final boolean z = this.$tooltipLinkSharingVisible;
        final sy4 sy4Var = this.$verticalScrollState$delegate;
        x08 x08Var2 = this.$debugMode$delegate;
        composer.z(733328855);
        Alignment.a aVar2 = Alignment.a;
        rg4 g = BoxKt.g(aVar2.o(), false, composer, 0);
        composer.z(-1323940314);
        int a = cs0.a(composer, 0);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(m);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a2);
        } else {
            composer.p();
        }
        Composer a3 = Updater.a(composer);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        c.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        l02 = SingleArticleActivity.l0(x08Var);
        DownloadState c2 = l02.c();
        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m179invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m179invoke() {
                SingleArticleViewModel q12;
                q12 = SingleArticleActivity.this.q1();
                q12.s();
            }
        };
        q1 = singleArticleActivity.q1();
        RefreshableContentKt.a(c2, qs2Var, null, null, null, null, q1.l(), 0.0f, null, null, 0L, eb5.Companion.a(composer, 8).p(), null, false, false, zr0.b(composer, -1260265130, true, new it2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(final m mVar, Composer composer2, int i2) {
                AthleticViewModel Y0;
                PaywallOverlayViewModel h1;
                AthleticViewModel Y02;
                zq3.h(mVar, "webViewContent");
                if ((i2 & 14) == 0) {
                    i2 |= composer2.S(mVar) ? 4 : 2;
                }
                if ((i2 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1260265130, i2, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen.<anonymous>.<anonymous>.<anonymous> (SingleArticleActivity.kt:354)");
                }
                final SingleArticleActivity singleArticleActivity2 = SingleArticleActivity.this;
                final ss2 ss2Var2 = ss2Var;
                final boolean z2 = z;
                final sy4 sy4Var2 = sy4Var;
                composer2.z(-483455358);
                Modifier.a aVar3 = Modifier.a;
                rg4 a4 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                composer2.z(-1323940314);
                int a5 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                qs2 a6 = companion2.a();
                it2 c3 = LayoutKt.c(aVar3);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a6);
                } else {
                    composer2.p();
                }
                Composer a7 = Updater.a(composer2);
                Updater.c(a7, a4, companion2.e());
                Updater.c(a7, o2, companion2.g());
                gt2 b2 = companion2.b();
                if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                    a7.q(Integer.valueOf(a5));
                    a7.v(Integer.valueOf(a5), b2);
                }
                c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                composer2.z(2089982437);
                Y0 = singleArticleActivity2.Y0();
                if (((Boolean) Y0.g().getValue()).booleanValue()) {
                    final Context context = (Context) composer2.m(AndroidCompositionLocals_androidKt.g());
                    Y02 = singleArticleActivity2.Y0();
                    ET2CoroutineScopeKt.e(Y02.g(), new SingleArticleActivity$SingleArticleScreen$5$1$2$1$1(singleArticleActivity2, null), composer2, 64, 0);
                    AthleticComposablesKt.e(new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m180invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m180invoke() {
                            AthleticViewModel Y03;
                            Y03 = SingleArticleActivity.this.Y0();
                            Y03.m(context);
                        }
                    }, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$3
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m181invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m181invoke() {
                            AthleticViewModel Y03;
                            Y03 = SingleArticleActivity.this.Y0();
                            Y03.l();
                        }
                    }, composer2, 0);
                }
                composer2.R();
                int i3 = i2 & 14;
                singleArticleActivity2.j0(mVar, composer2, i3 | 64);
                h1 = singleArticleActivity2.h1();
                PaywallComposableKt.a(mVar, h1, zr0.b(composer2, -203484242, true, new gt2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$4

                    /* renamed from: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$4$1, reason: invalid class name */
                    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                        AnonymousClass1(Object obj) {
                            super(1, obj, SingleArticleViewModel.class, "onProgressChanged", "onProgressChanged(Z)V", 0);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z) {
                            ((SingleArticleViewModel) this.receiver).t(z);
                        }
                    }

                    /* renamed from: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$4$4, reason: invalid class name */
                    /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements gt2 {
                        AnonymousClass4(Object obj) {
                            super(2, obj, SingleArticleViewModel.class, "toggleExpansion", "toggleExpansion(ZLjava/lang/String;)V", 0);
                        }

                        public final void g(boolean z, String str) {
                            ((SingleArticleViewModel) this.receiver).x(z, str);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            g(((Boolean) obj).booleanValue(), (String) obj2);
                            return ww8.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        SingleArticleViewModel q12;
                        SingleArticleViewModel q13;
                        if ((i4 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-203484242, i4, -1, "com.nytimes.android.SingleArticleActivity.SingleArticleScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SingleArticleActivity.kt:374)");
                        }
                        SingleArticleActivity singleArticleActivity3 = SingleArticleActivity.this;
                        m mVar2 = mVar;
                        q12 = SingleArticleActivity.this.q1();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(q12);
                        final SingleArticleActivity singleArticleActivity4 = SingleArticleActivity.this;
                        ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$4.2
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return ww8.a;
                            }

                            public final void invoke(boolean z3) {
                                SingleArticleViewModel q14;
                                q14 = SingleArticleActivity.this.q1();
                                q14.w(z3);
                            }
                        };
                        ss2 ss2Var4 = ss2Var2;
                        final m mVar3 = mVar;
                        final boolean z3 = z2;
                        final SingleArticleActivity singleArticleActivity5 = SingleArticleActivity.this;
                        final sy4 sy4Var3 = sy4Var2;
                        ss2 ss2Var5 = new ss2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$4.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(com.nytimes.android.fragment.b bVar) {
                                zq3.h(bVar, "scrollState");
                                SingleArticleActivity.r0(sy4Var3, bVar);
                                if ((bVar instanceof b.c) && (m.this instanceof m.g) && !z3) {
                                    singleArticleActivity5.e1().a();
                                }
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((com.nytimes.android.fragment.b) obj);
                                return ww8.a;
                            }
                        };
                        q13 = SingleArticleActivity.this.q1();
                        singleArticleActivity3.h0(mVar2, anonymousClass1, ss2Var3, ss2Var4, ss2Var5, new AnonymousClass4(q13), composer3, 2097152);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer2, i3 | 448);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((m) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), composer, 8, 196608, 30652);
        composer.z(1579420021);
        m0 = SingleArticleActivity.m0(x08Var2);
        if (m0) {
            AirTrafficControlDebugModeKt.a(boxScopeInstance.c(aVar, aVar2.m()), composer, 0, 0);
        }
        composer.R();
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        composer.z(1579420183);
        n0 = SingleArticleActivity.n0(this.$showShareBottomSheet$delegate);
        if (n0) {
            composer.z(773894976);
            composer.z(-492369756);
            Object A = composer.A();
            Composer.a aVar3 = Composer.a;
            if (A == aVar3.a()) {
                androidx.compose.runtime.e eVar = new androidx.compose.runtime.e(py1.j(EmptyCoroutineContext.a, composer));
                composer.q(eVar);
                A = eVar;
            }
            composer.R();
            final CoroutineScope a4 = ((androidx.compose.runtime.e) A).a();
            composer.R();
            final sl0 sl0Var = (sl0) composer.m(CompositionLocalsKt.d());
            final SheetState n = ModalBottomSheet_androidKt.n(true, null, composer, 6, 2);
            l04 = SingleArticleActivity.l0(this.$articleState$delegate);
            m mVar = (m) l04.c().a();
            final Asset a5 = mVar != null ? mVar.a() : null;
            String title = a5 != null ? a5.getTitle() : null;
            String url = (a5 == null || (extractImage = a5.extractImage()) == null || (crops = extractImage.getCrops()) == null || (square640 = crops.getSquare640()) == null) ? null : square640.getUrl();
            composer.z(1579420760);
            Object A2 = composer.A();
            if (A2 == aVar3.a()) {
                A2 = b0.e(Boolean.FALSE, null, 2, null);
                composer.q(A2);
            }
            final sy4 sy4Var2 = (sy4) A2;
            composer.R();
            boolean c3 = c(sy4Var2);
            Application application = this.this$0.getApplication();
            zq3.g(application, "getApplication(...)");
            boolean c4 = ql3.c(application);
            final SingleArticleActivity singleArticleActivity2 = this.this$0;
            qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m182invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m182invoke() {
                    String j1;
                    SingleArticleActivity.this.k1().f();
                    String U = SingleArticleActivity.this.U();
                    if (U != null) {
                        sl0 sl0Var2 = sl0Var;
                        j1 = SingleArticleActivity.this.j1(U);
                        sl0Var2.c(new androidx.compose.ui.text.a(j1, null, null, 6, null));
                    }
                }
            };
            final SingleArticleActivity singleArticleActivity3 = this.this$0;
            qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m183invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m183invoke() {
                    ShareSheetViewModel l1;
                    SingleArticleActivity$SingleArticleScreen$5.d(sy4Var2, true);
                    Asset asset2 = Asset.this;
                    String safeUri = asset2 != null ? asset2.getSafeUri() : null;
                    if (safeUri != null) {
                        l1 = singleArticleActivity3.l1();
                        final SingleArticleActivity singleArticleActivity4 = singleArticleActivity3;
                        final sy4 sy4Var3 = sy4Var2;
                        final sl0 sl0Var2 = sl0Var;
                        l1.n(safeUri, new ss2() { // from class: com.nytimes.android.SingleArticleActivity.SingleArticleScreen.5.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m184invoke(((Result) obj).j());
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m184invoke(Object obj) {
                                j5 j5Var;
                                String j1;
                                SingleArticleActivity$SingleArticleScreen$5.d(sy4Var3, false);
                                String U = SingleArticleActivity.this.U();
                                if (U != null) {
                                    SingleArticleActivity singleArticleActivity5 = SingleArticleActivity.this;
                                    sl0 sl0Var3 = sl0Var2;
                                    if (Result.h(obj)) {
                                        Application application2 = singleArticleActivity5.getApplication();
                                        zq3.g(application2, "getApplication(...)");
                                        Intent a6 = ql3.a(application2, U, (yp7) obj);
                                        if (a6 != null) {
                                            j5Var = singleArticleActivity5.r;
                                            j5Var.a(a6);
                                            j1 = singleArticleActivity5.j1(U);
                                            sl0Var3.c(new androidx.compose.ui.text.a(j1, null, null, 6, null));
                                        } else {
                                            String string = singleArticleActivity5.getString(nk6.unable_to_share_to_instagram_stories);
                                            zq3.g(string, "getString(...)");
                                            com.nytimes.android.libs.messagingarchitecture.betasettings.c.b(singleArticleActivity5, string);
                                        }
                                    }
                                    SingleArticleActivity singleArticleActivity6 = SingleArticleActivity.this;
                                    Throwable e = Result.e(obj);
                                    if (e != null) {
                                        String string2 = singleArticleActivity6.getString(nk6.unable_to_share_to_instagram_stories);
                                        zq3.g(string2, "getString(...)");
                                        com.nytimes.android.libs.messagingarchitecture.betasettings.c.b(singleArticleActivity6, string2);
                                        NYTLogger.h(e);
                                    }
                                }
                            }
                        });
                    }
                }
            };
            final SingleArticleActivity singleArticleActivity4 = this.this$0;
            qs2 qs2Var4 = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.4
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m185invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m185invoke() {
                    SingleArticleActivity.this.k1().g();
                    SingleArticleActivity.C1(SingleArticleActivity.this, null, 1, null);
                }
            };
            final SingleArticleActivity singleArticleActivity5 = this.this$0;
            asset = null;
            NYTShareBottomSheetKt.c(title, url, n, qs2Var2, qs2Var3, qs2Var4, null, c4, c3, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.5

                @fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$5$1", f = "SingleArticleActivity.kt", l = {456}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ SheetState $articleShareBottomSheet;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SheetState sheetState, by0 by0Var) {
                        super(2, by0Var);
                        this.$articleShareBottomSheet = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass1(this.$articleShareBottomSheet, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            SheetState sheetState = this.$articleShareBottomSheet;
                            this.label = 1;
                            if (sheetState.k(this) == h) {
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
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m186invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m186invoke() {
                    Job launch$default;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(n, null), 3, null);
                    final SingleArticleActivity singleArticleActivity6 = singleArticleActivity5;
                    launch$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.android.SingleArticleActivity.SingleArticleScreen.5.5.2
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Throwable) obj);
                            return ww8.a;
                        }

                        public final void invoke(Throwable th) {
                            ShareSheetViewModel l1;
                            l1 = SingleArticleActivity.this.l1();
                            l1.r(false);
                        }
                    });
                }
            }, composer, 0, 64);
        } else {
            asset = null;
        }
        composer.R();
        n1 = this.this$0.n1();
        if (n1 != null) {
            l03 = SingleArticleActivity.l0(this.$articleState$delegate);
            m mVar2 = (m) l03.c().a();
            final Asset a6 = mVar2 != null ? mVar2.a() : asset;
            n12 = this.this$0.n1();
            if (n12 != null) {
                Application application2 = this.this$0.getApplication();
                zq3.g(application2, "getApplication(...)");
                uri = ql3.b(application2, n12);
            } else {
                uri = asset;
            }
            if (!this.$tooltipLinkSharingVisible || this.$giftShareRemaining.d() <= 0) {
                composer.z(1579424572);
                final SingleArticleActivity singleArticleActivity6 = this.this$0;
                qs2 qs2Var5 = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m189invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m189invoke() {
                        SingleArticleActivity.this.A1(null);
                        SingleArticleActivity.this.k1().d();
                        SingleArticleActivity.this.B1(uri);
                    }
                };
                final SingleArticleActivity singleArticleActivity7 = this.this$0;
                NYTShareDialogKt.a(qs2Var5, null, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.9
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m190invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m190invoke() {
                        SingleArticleActivity.this.A1(null);
                    }
                }, composer, 0, 2);
                composer.R();
            } else {
                composer.z(1579424037);
                final SingleArticleActivity singleArticleActivity8 = this.this$0;
                qs2 qs2Var6 = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m187invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m187invoke() {
                        SingleArticleActivity.this.A1(null);
                        SubscriberLinkSharingMenuPreparer g1 = SingleArticleActivity.this.g1();
                        Asset asset2 = a6;
                        String url2 = asset2 != null ? asset2.getUrl() : null;
                        if (url2 == null) {
                            url2 = "";
                        }
                        Asset asset3 = a6;
                        String displayTitle = asset3 != null ? asset3.getDisplayTitle() : null;
                        g1.w(url2, displayTitle != null ? displayTitle : "", uri);
                    }
                };
                final SingleArticleActivity singleArticleActivity9 = this.this$0;
                NYTShareDialogKt.e(qs2Var6, null, new qs2() { // from class: com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5.7
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m188invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m188invoke() {
                        SingleArticleActivity.this.A1(null);
                    }
                }, composer, 0, 2);
                composer.R();
            }
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
    }
}
