package com.nytimes.android.messaging.postloginregioffers.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt;
import com.nytimes.android.messaging.postloginregioffers.model.PostRegiLoginOfferConfig;
import com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel;
import defpackage.c04;
import defpackage.cc7;
import defpackage.e52;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.l86;
import defpackage.qs2;
import defpackage.qv6;
import defpackage.s42;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.u32;
import defpackage.ww8;
import defpackage.y32;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class PostRegiLoginOfferBaseActivity extends com.nytimes.android.messaging.postloginregioffers.view.a {
    public static final a Companion = new a(null);
    public static final int h = 8;
    public ET2CoroutineScope e;
    public String f;
    private final c04 g;
    public qv6 remoteConfig;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String str) {
            zq3.h(context, "context");
            zq3.h(str, "offerType");
            Intent intent = new Intent(context, (Class<?>) (zq3.c(str, "PLO_AA") ? NewPostLoginOfferActivity.class : NewPostRegiOfferActivity.class));
            intent.putExtra("OFFER_TYPE", str);
            intent.setFlags(268435456);
            return intent;
        }

        private a() {
        }
    }

    public PostRegiLoginOfferBaseActivity() {
        final qs2 qs2Var = null;
        this.g = new s(zt6.b(PostRegiLoginOfferViewModel.class), new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$special$$inlined$viewModels$default$3
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostRegiLoginOfferViewModel R() {
        return (PostRegiLoginOfferViewModel) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(PostRegiLoginOfferViewModel.a aVar) {
        if (zq3.c(aVar, PostRegiLoginOfferViewModel.a.b.a)) {
            X();
        } else if (zq3.c(aVar, PostRegiLoginOfferViewModel.a.c.a)) {
            finish();
        } else if (zq3.c(aVar, PostRegiLoginOfferViewModel.a.C0364a.a)) {
            finish();
        }
    }

    private final void T() {
        ET2PageScope.DefaultImpls.a(P(), new e52.d(), new s42(zq3.c(Q(), "PRO_AA") ? "post regi offer" : "post login offer", zq3.c(Q(), "PRO_AA") ? "all access pro" : "all access plo", null, null, null, null, null, null, null, 508, null), new u32(null, zq3.c(Q(), "PRO_AA") ? "post regi offer" : "post login offer", null, 5, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(String str, String str2) {
        ET2PageScope.DefaultImpls.a(P(), new e52.e(), new s42(zq3.c(Q(), "PRO_AA") ? "post regi offer" : "post login offer", "all access " + str, null, null, null, null, null, new y32(null, null, null, str2, null, null, 55, null), null, 380, null), new u32(null, zq3.c(Q(), "PRO_AA") ? "all access pro" : "all access plo", "tap", 1, null), null, 8, null);
    }

    private final void X() {
        l86.a.b(this);
    }

    public final void L(Composer composer, final int i) {
        Composer h2 = composer.h(-1894326670);
        if (b.G()) {
            b.S(-1894326670, i, -1, "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content (PostRegiLoginOfferBaseActivity.kt:82)");
        }
        NytThemeKt.a(false, null, null, zr0.b(h2, -740454686, true, new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$Content$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                PostRegiLoginOfferViewModel R;
                PostRegiLoginOfferViewModel R2;
                PostRegiLoginOfferViewModel R3;
                PostRegiLoginOfferViewModel R4;
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-740454686, i2, -1, "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.<anonymous> (PostRegiLoginOfferBaseActivity.kt:84)");
                }
                R = PostRegiLoginOfferBaseActivity.this.R();
                final HashMap hashMap = (HashMap) y.b(R.p(), null, composer2, 8, 1).getValue();
                R2 = PostRegiLoginOfferBaseActivity.this.R();
                final boolean booleanValue = ((Boolean) y.b(R2.s(), null, composer2, 8, 1).getValue()).booleanValue();
                R3 = PostRegiLoginOfferBaseActivity.this.R();
                final PostRegiLoginOfferConfig postRegiLoginOfferConfig = (PostRegiLoginOfferConfig) y.b(R3.l(), null, composer2, 8, 1).getValue();
                PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity = PostRegiLoginOfferBaseActivity.this;
                R4 = postRegiLoginOfferBaseActivity.R();
                postRegiLoginOfferBaseActivity.S((PostRegiLoginOfferViewModel.a) y.b(R4.o(), null, composer2, 8, 1).getValue());
                Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer2, 8));
                final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity2 = PostRegiLoginOfferBaseActivity.this;
                ScaffoldKt.b(c, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer2, 1986494948, true, new it2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$Content$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i3) {
                        zq3.h(ym5Var, "it");
                        if ((i3 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1986494948, i3, -1, "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.<anonymous>.<anonymous> (PostRegiLoginOfferBaseActivity.kt:91)");
                        }
                        Modifier d = BackgroundKt.d(SizeKt.d(Modifier.a, 0.0f, 1, null), eb5.Companion.a(composer3, 8).d(), null, 2, null);
                        final PostRegiLoginOfferConfig postRegiLoginOfferConfig2 = postRegiLoginOfferConfig;
                        final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity3 = postRegiLoginOfferBaseActivity2;
                        final HashMap<String, String> hashMap2 = hashMap;
                        final boolean z = booleanValue;
                        LazyDslKt.a(d, null, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LazyListScope) obj);
                                return ww8.a;
                            }

                            public final void invoke(LazyListScope lazyListScope) {
                                zq3.h(lazyListScope, "$this$LazyColumn");
                                final PostRegiLoginOfferConfig postRegiLoginOfferConfig3 = PostRegiLoginOfferConfig.this;
                                final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity4 = postRegiLoginOfferBaseActivity3;
                                final HashMap<String, String> hashMap3 = hashMap2;
                                final boolean z2 = z;
                                LazyListScope.d(lazyListScope, null, null, zr0.c(-1532388400, true, new it2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.1.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // defpackage.it2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(h04 h04Var, Composer composer4, int i4) {
                                        PostRegiLoginOfferViewModel R5;
                                        PostRegiLoginOfferViewModel R6;
                                        zq3.h(h04Var, "$this$item");
                                        if ((i4 & 81) == 16 && composer4.i()) {
                                            composer4.K();
                                            return;
                                        }
                                        if (b.G()) {
                                            b.S(-1532388400, i4, -1, "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostRegiLoginOfferBaseActivity.kt:99)");
                                        }
                                        if (PostRegiLoginOfferConfig.this != null) {
                                            R5 = postRegiLoginOfferBaseActivity4.R();
                                            String str = (String) y.b(R5.m(), null, composer4, 8, 1).getValue();
                                            R6 = postRegiLoginOfferBaseActivity4.R();
                                            boolean booleanValue2 = ((Boolean) y.b(R6.n(), null, composer4, 8, 1).getValue()).booleanValue();
                                            PostRegiLoginOfferConfig postRegiLoginOfferConfig4 = PostRegiLoginOfferConfig.this;
                                            HashMap<String, String> hashMap4 = hashMap3;
                                            boolean z3 = z2;
                                            final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity5 = postRegiLoginOfferBaseActivity4;
                                            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.1.1.1.1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m602invoke();
                                                    return ww8.a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m602invoke() {
                                                    PostRegiLoginOfferViewModel R7;
                                                    PostRegiLoginOfferBaseActivity.this.U("learn more", "drop down");
                                                    R7 = PostRegiLoginOfferBaseActivity.this.R();
                                                    R7.x();
                                                }
                                            };
                                            final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity6 = postRegiLoginOfferBaseActivity4;
                                            final PostRegiLoginOfferConfig postRegiLoginOfferConfig5 = PostRegiLoginOfferConfig.this;
                                            qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.1.1.1.1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m603invoke();
                                                    return ww8.a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m603invoke() {
                                                    PostRegiLoginOfferViewModel R7;
                                                    PostRegiLoginOfferBaseActivity.this.U("subscribe now", "button");
                                                    boolean c2 = zq3.c(PostRegiLoginOfferBaseActivity.this.Q(), "PRO_AA");
                                                    String str2 = c2 ? "post regi offer" : "post login offer";
                                                    R7 = PostRegiLoginOfferBaseActivity.this.R();
                                                    R7.u(PostRegiLoginOfferBaseActivity.this, c2, postRegiLoginOfferConfig5.getSku(), str2);
                                                }
                                            };
                                            final PostRegiLoginOfferBaseActivity postRegiLoginOfferBaseActivity7 = postRegiLoginOfferBaseActivity4;
                                            PostRegiLoginOfferComponentsKt.c(str, booleanValue2, postRegiLoginOfferConfig4, hashMap4, z3, qs2Var, qs2Var2, new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.Content.1.1.1.1.3
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m604invoke();
                                                    return ww8.a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m604invoke() {
                                                    PostRegiLoginOfferBaseActivity.this.U("continue", "button");
                                                    PostRegiLoginOfferBaseActivity.this.finish();
                                                }
                                            }, composer4, 4608);
                                        }
                                        if (b.G()) {
                                            b.R();
                                        }
                                    }
                                }), 3, null);
                            }
                        }, composer3, 0, 254);
                        composer3.z(-818849577);
                        if (booleanValue) {
                            PostRegiLoginOfferComponentsKt.g(composer3, 0);
                        }
                        composer3.R();
                        if (hashMap.isEmpty()) {
                            PostRegiLoginOfferComponentsKt.a("Cannot Connect.", "Could not fetch product data from Google Play. Please retry.", composer3, 54);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 0, 12582912, 131070);
                if (b.G()) {
                    b.R();
                }
            }
        }), h2, 3072, 7);
        if (b.G()) {
            b.R();
        }
        cc7 k = h2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$Content$2
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
                    PostRegiLoginOfferBaseActivity.this.L(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final ET2CoroutineScope P() {
        ET2CoroutineScope eT2CoroutineScope = this.e;
        if (eT2CoroutineScope != null) {
            return eT2CoroutineScope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final String Q() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        zq3.z("offerType");
        return null;
    }

    public final void V(ET2CoroutineScope eT2CoroutineScope) {
        zq3.h(eT2CoroutineScope, "<set-?>");
        this.e = eT2CoroutineScope;
    }

    public final void W(String str) {
        zq3.h(str, "<set-?>");
        this.f = str;
    }

    @Override // com.nytimes.android.messaging.postloginregioffers.view.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        W(String.valueOf((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("OFFER_TYPE")));
        V(ET2CoroutineScopeKt.b(this, new PostRegiLoginOfferBaseActivity$onCreate$1(this, null)));
        T();
        tq0.b(this, null, zr0.c(1816335227, true, new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity$onCreate$2
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
                if (b.G()) {
                    b.S(1816335227, i, -1, "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity.onCreate.<anonymous> (PostRegiLoginOfferBaseActivity.kt:75)");
                }
                PostRegiLoginOfferBaseActivity.this.L(composer, 8);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
