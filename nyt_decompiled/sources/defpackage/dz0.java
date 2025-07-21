package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.ribbon.destinations.cooking.CookingCarouselModule;
import com.nytimes.android.ribbon.destinations.cooking.CookingHeroData;
import com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData;
import com.nytimes.android.ribbon.destinations.cooking.RecipeCardData;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class dz0 {
    public static final y25 a(CookingCarouselModule cookingCarouselModule, int i, String str) {
        zq3.h(cookingCarouselModule, "<this>");
        zq3.h(str, "blockLabel");
        String d = cookingCarouselModule.d();
        NavigationSource navigationSource = NavigationSource.XPN_CTA;
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(d, AssetConstants.ARTICLE_TYPE, "", "", "", false, false, null, null, navigationSource, null, "view all recipes", "cooking panel", null, null, "view all", null, t.m(a, du8.a("label", lowerCase)), null, 286976, null);
    }

    public static final y25 b(CookingHeroData cookingHeroData, int i, String str, int i2) {
        zq3.h(cookingHeroData, "<this>");
        zq3.h(str, "blockLabel");
        String j = cookingHeroData.j();
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        String f = cookingHeroData.f();
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(j, AssetConstants.ARTICLE_TYPE, "", "", "", false, false, null, null, navigationSource, null, f, "cooking panel", null, null, null, null, t.m(a, du8.a("label", lowerCase)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }

    public static final y25 c(ProgrammedArticleData programmedArticleData, int i, String str, int i2) {
        zq3.h(programmedArticleData, "<this>");
        zq3.h(str, "blockLabel");
        String g = programmedArticleData.g();
        String f = programmedArticleData.f();
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        String c = programmedArticleData.c();
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(g, AssetConstants.ARTICLE_TYPE, f, "", "", false, false, null, null, navigationSource, null, c, "cooking panel", null, null, null, null, t.m(a, du8.a("label", lowerCase)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }

    public static final y25 d(RecipeCardData recipeCardData, int i, String str, int i2) {
        String str2;
        zq3.h(recipeCardData, "<this>");
        zq3.h(str, "blockLabel");
        String b = recipeCardData.b();
        String g = recipeCardData.g();
        if (g == null) {
            String b2 = recipeCardData.b();
            zq3.e(b2);
            str2 = b2;
        } else {
            str2 = g;
        }
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(b, AssetConstants.ARTICLE_TYPE, str2, "", "", false, false, null, null, navigationSource, null, "", "cooking panel", null, null, null, null, t.m(a, du8.a("label", lowerCase)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }
}
