package defpackage;

import androidx.compose.runtime.Composer;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.b;
import defpackage.eb5;

/* loaded from: classes4.dex */
public abstract class c27 {
    private static final float a = bu1.g(4);

    public static final b a(RibbonConfig ribbonConfig, String str, Composer composer, int i) {
        zq3.h(ribbonConfig, "config");
        zq3.h(str, "displayName");
        composer.z(-592443212);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-592443212, i, -1, "com.nytimes.android.ribbon.config.brandTab (RibbonTabItem.kt:23)");
        }
        eb5.a aVar = eb5.Companion;
        b bVar = new b(ribbonConfig.getId(), str, ((nn0) ribbonConfig.getBrandColor().invoke(composer, 0)).B(), aVar.b(composer, 8).g(), aVar.b(composer, 8).i(), a, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return bVar;
    }

    public static final b b(RibbonConfig ribbonConfig, String str, Composer composer, int i) {
        zq3.h(ribbonConfig, "config");
        zq3.h(str, "displayName");
        composer.z(270162188);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(270162188, i, -1, "com.nytimes.android.ribbon.config.newsTab (RibbonTabItem.kt:41)");
        }
        eb5.a aVar = eb5.Companion;
        b bVar = new b(ribbonConfig.getId(), str, ((nn0) ribbonConfig.getBrandColor().invoke(composer, 0)).B(), aVar.b(composer, 8).g(), aVar.b(composer, 8).i(), a, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return bVar;
    }
}
