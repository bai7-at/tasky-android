package com.nytimes.android.growthui.landingpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.theme.GrowthUIThemeKt;
import com.nytimes.android.growthui.landingpage.components.LocalCompositionsKt;
import defpackage.cy3;
import defpackage.e75;
import defpackage.f46;
import defpackage.gt2;
import defpackage.o76;
import defpackage.qs2;
import defpackage.r53;
import defpackage.ss2;
import defpackage.t43;
import defpackage.t53;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zc5;
import defpackage.zq3;
import defpackage.zr0;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class LandingPageActivity extends com.nytimes.android.growthui.landingpage.a {
    public static final a Companion = new a(null);
    public static final int e = 8;
    public CoroutineScope applicationScope;
    public t43 auth;
    public Map<DataConfigId, cy3> eventsSenderMap;
    public r53 subscription;
    public t53 theme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void d(a aVar, Context context, DataConfigId dataConfigId, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            aVar.c(context, dataConfigId, str);
        }

        public final Intent a(Context context, DataConfigId dataConfigId, String str) {
            zq3.h(context, "context");
            zq3.h(dataConfigId, "configId");
            Intent intent = new Intent(context, (Class<?>) LandingPageActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("CONFIG_ID", dataConfigId);
            intent.putExtra("VARIANT_NAME", str);
            return intent;
        }

        public final Intent b(Activity activity, DataConfigId dataConfigId, String str) {
            zq3.h(activity, "activity");
            zq3.h(dataConfigId, "configId");
            Intent intent = new Intent(activity, (Class<?>) LandingPageActivity.class);
            intent.addFlags(536870912);
            intent.putExtra("CONFIG_ID", dataConfigId);
            intent.putExtra("VARIANT_NAME", str);
            return intent;
        }

        public final void c(Context context, DataConfigId dataConfigId, String str) {
            zq3.h(context, "context");
            zq3.h(dataConfigId, "configId");
            context.startActivity(a(context, dataConfigId, str));
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        BuildersKt__Builders_commonKt.launch$default(N(), null, null, new LandingPageActivity$openLogin$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(zc5 zc5Var) {
        BuildersKt__Builders_commonKt.launch$default(N(), null, null, new LandingPageActivity$openProductSubscriptions$1(this, zc5Var, null), 3, null);
    }

    public final CoroutineScope N() {
        CoroutineScope coroutineScope = this.applicationScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("applicationScope");
        return null;
    }

    public final t43 O() {
        t43 t43Var = this.auth;
        if (t43Var != null) {
            return t43Var;
        }
        zq3.z("auth");
        return null;
    }

    public final Map P() {
        Map<DataConfigId, cy3> map = this.eventsSenderMap;
        if (map != null) {
            return map;
        }
        zq3.z("eventsSenderMap");
        return null;
    }

    public final r53 Q() {
        r53 r53Var = this.subscription;
        if (r53Var != null) {
            return r53Var;
        }
        zq3.z("subscription");
        return null;
    }

    public final t53 R() {
        t53 t53Var = this.theme;
        if (t53Var != null) {
            return t53Var;
        }
        zq3.z("theme");
        return null;
    }

    @Override // com.nytimes.android.growthui.landingpage.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z = extras != null ? extras.getBoolean("IS_FROM_WORDLEBOT_EXTRA") : false;
        Bundle extras2 = getIntent().getExtras();
        Serializable serializable = extras2 != null ? extras2.getSerializable("CONFIG_ID") : null;
        final cy3 cy3Var = (cy3) P().get(serializable instanceof DataConfigId ? (DataConfigId) serializable : null);
        if (cy3Var == null) {
            cy3Var = e75.a;
        }
        tq0.b(this, null, zr0.c(1522250254, true, new gt2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity$onCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    androidx.compose.runtime.b.S(1522250254, i, -1, "com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.<anonymous> (LandingPageActivity.kt:52)");
                }
                t53 R = LandingPageActivity.this.R();
                final cy3 cy3Var2 = cy3Var;
                final LandingPageActivity landingPageActivity = LandingPageActivity.this;
                GrowthUIThemeKt.a(R, zr0.b(composer, 948510281, true, new gt2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity$onCreate$1.1
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
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(948510281, i2, -1, "com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.<anonymous>.<anonymous> (LandingPageActivity.kt:53)");
                        }
                        o76[] o76VarArr = {LocalCompositionsKt.a().c(cy3.this)};
                        final cy3 cy3Var3 = cy3.this;
                        final LandingPageActivity landingPageActivity2 = landingPageActivity;
                        CompositionLocalKt.b(o76VarArr, zr0.b(composer2, 450634121, true, new gt2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(450634121, i3, -1, "com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LandingPageActivity.kt:56)");
                                }
                                final cy3 cy3Var4 = cy3.this;
                                final LandingPageActivity landingPageActivity3 = landingPageActivity2;
                                gt2 gt2Var = new gt2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.1.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void b(zc5 zc5Var, f46 f46Var) {
                                        zq3.h(zc5Var, "offer");
                                        cy3.this.c(zc5Var, f46Var);
                                        landingPageActivity3.T(zc5Var);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        b((zc5) obj, (f46) obj2);
                                        return ww8.a;
                                    }
                                };
                                final cy3 cy3Var5 = cy3.this;
                                gt2 gt2Var2 = new gt2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.1.1.1.2
                                    {
                                        super(2);
                                    }

                                    public final void b(int i4, f46 f46Var) {
                                        zq3.h(f46Var, "tab");
                                        cy3.this.d(f46Var);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        b(((Number) obj).intValue(), (f46) obj2);
                                        return ww8.a;
                                    }
                                };
                                final cy3 cy3Var6 = cy3.this;
                                final LandingPageActivity landingPageActivity4 = landingPageActivity2;
                                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.1.1.1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m552invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m552invoke() {
                                        cy3.this.a();
                                        landingPageActivity4.S();
                                    }
                                };
                                final LandingPageActivity landingPageActivity5 = landingPageActivity2;
                                LandingPageKt.a(gt2Var, gt2Var2, qs2Var, new ss2() { // from class: com.nytimes.android.growthui.landingpage.LandingPageActivity.onCreate.1.1.1.4
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Boolean) obj).booleanValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(boolean z2) {
                                        if (z2) {
                                            LandingPageActivity.this.setResult(-1);
                                        } else {
                                            LandingPageActivity.this.setResult(0);
                                        }
                                        LandingPageActivity.this.finish();
                                    }
                                }, null, composer3, 0, 16);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, 56);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 48, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
        cy3Var.f(this, z);
    }
}
