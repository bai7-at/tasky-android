package com.nytimes.android.devsettings.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.IconKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import com.nytimes.android.devsettings.home.composables.DevSettingsAppBarComposableKt;
import defpackage.bu1;
import defpackage.du8;
import defpackage.eg6;
import defpackage.gt2;
import defpackage.ho1;
import defpackage.l8;
import defpackage.le0;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DevSettingsXmlActivity extends b implements d.e {
    public static final a Companion = new a(null);
    public static final int e = 8;
    public ho1 devSettingsMaterialTheme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity, String str, int i) {
            zq3.h(activity, "activity");
            zq3.h(str, "title");
            activity.startActivity(new Intent(activity, (Class<?>) DevSettingsXmlActivity.class).putExtra("TITLE", str).putExtra("XML_RES_ID", i));
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M() {
        String stringExtra = getIntent().getStringExtra("TITLE");
        return stringExtra == null ? "" : stringExtra;
    }

    public final ho1 N() {
        ho1 ho1Var = this.devSettingsMaterialTheme;
        if (ho1Var != null) {
            return ho1Var;
        }
        zq3.z("devSettingsMaterialTheme");
        return null;
    }

    public final int O() {
        return getIntent().getIntExtra("XML_RES_ID", -1);
    }

    @Override // androidx.preference.d.e
    public boolean f(d dVar, PreferenceScreen preferenceScreen) {
        zq3.h(dVar, "preferenceFragmentCompat");
        zq3.h(preferenceScreen, "preferenceScreen");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        r p = supportFragmentManager.p();
        zq3.g(p, "beginTransaction()");
        DevSettingsXmlFragment devSettingsXmlFragment = new DevSettingsXmlFragment();
        devSettingsXmlFragment.setArguments(le0.a(du8.a(d.ARG_PREFERENCE_ROOT, preferenceScreen.q())));
        p.c(eg6.fragment_container, devSettingsXmlFragment, preferenceScreen.q());
        p.g(preferenceScreen.q());
        p.h();
        return true;
    }

    @Override // com.nytimes.android.devsettings.home.b, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(-1561769042, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlActivity$onCreate$1
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
                    androidx.compose.runtime.b.S(-1561769042, i, -1, "com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.<anonymous> (DevSettingsXmlActivity.kt:51)");
                }
                composer.z(-282019268);
                DevSettingsXmlActivity devSettingsXmlActivity = DevSettingsXmlActivity.this;
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = devSettingsXmlActivity.M();
                    composer.q(A);
                }
                final String str = (String) A;
                composer.R();
                ho1 N = DevSettingsXmlActivity.this.N();
                final DevSettingsXmlActivity devSettingsXmlActivity2 = DevSettingsXmlActivity.this;
                DevSettingsCustomThemeKt.a(false, N, zr0.b(composer, -1991034527, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlActivity$onCreate$1.1
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
                            androidx.compose.runtime.b.S(-1991034527, i2, -1, "com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.<anonymous>.<anonymous> (DevSettingsXmlActivity.kt:55)");
                        }
                        Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer2, 8));
                        final DevSettingsXmlActivity devSettingsXmlActivity3 = DevSettingsXmlActivity.this;
                        final String str2 = str;
                        ScaffoldKt.b(c, null, zr0.b(composer2, -1863460100, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.1.1.1
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
                                    androidx.compose.runtime.b.S(-1863460100, i3, -1, "com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DevSettingsXmlActivity.kt:58)");
                                }
                                final DevSettingsXmlActivity devSettingsXmlActivity4 = DevSettingsXmlActivity.this;
                                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.1.1.1.1
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m360invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m360invoke() {
                                        DevSettingsXmlActivity.this.getOnBackPressedDispatcher().l();
                                    }
                                };
                                final String str3 = str2;
                                DevSettingsAppBarComposableKt.a(qs2Var, zr0.b(composer3, -281216372, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.1.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 11) == 2 && composer4.i()) {
                                            composer4.K();
                                            return;
                                        }
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.S(-281216372, i4, -1, "com.nytimes.android.devsettings.home.DevSettingsXmlActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DevSettingsXmlActivity.kt:61)");
                                        }
                                        IconKt.a(l8.a(oe3.a.a), null, PaddingKt.m(Modifier.a, 0.0f, 0.0f, bu1.g(8), 0.0f, 11, null), 0L, composer4, 432, 8);
                                        TextKt.e(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer4, 6, 0, 65534);
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.R();
                                        }
                                    }
                                }), null, null, composer3, 48, 12);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableSingletons$DevSettingsXmlActivityKt.a.a(), composer2, 384, 12582912, 131066);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 384, 1);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }
}
