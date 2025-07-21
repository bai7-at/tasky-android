package com.nytimes.android.devsettings.home;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.android.devsettings.home.composables.DevSettingsFragmentComposableKt;
import com.nytimes.android.devsettings.home.composables.DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1;
import defpackage.eg6;
import defpackage.it2;
import defpackage.py1;
import defpackage.t5;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DevSettingsXmlActivityKt {
    public static final ComposableSingletons$DevSettingsXmlActivityKt a = new ComposableSingletons$DevSettingsXmlActivityKt();
    public static it2 b = zr0.c(2043730659, false, new it2() { // from class: com.nytimes.android.devsettings.home.ComposableSingletons$DevSettingsXmlActivityKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(ym5 ym5Var, Composer composer, int i) {
            zq3.h(ym5Var, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(2043730659, i, -1, "com.nytimes.android.devsettings.home.ComposableSingletons$DevSettingsXmlActivityKt.lambda-1.<anonymous> (DevSettingsXmlActivity.kt:71)");
            }
            int i2 = eg6.fragment_container;
            composer.z(1030991906);
            String simpleName = DevSettingsXmlFragment.class.getSimpleName();
            zq3.g(simpleName, "getSimpleName(...)");
            ComponentActivity b2 = t5.b(composer, 0);
            zq3.f(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = ((f) b2).getSupportFragmentManager();
            zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
            DevSettingsFragmentComposableKt.a(i2, null, null, composer, 0, 6);
            composer.z(1340571363);
            boolean S = composer.S(simpleName);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                Object k0 = supportFragmentManager.k0(simpleName);
                if (k0 == null) {
                    k0 = new DevSettingsXmlFragment();
                }
                A = k0;
                composer.q(A);
            }
            Fragment fragment = (Fragment) A;
            composer.R();
            zq3.e(fragment);
            py1.d(fragment, new DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1(supportFragmentManager, fragment, i2, simpleName, null), composer, 72);
            composer.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
