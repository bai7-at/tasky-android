package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ly0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class my0 implements h8 {
    public static final my0 a = new my0();
    private static final List b = i.e("__typename");

    private my0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ly0.a fromJson(JsonReader jsonReader, w41 w41Var) {
        fz0 fz0Var;
        cx3 cx3Var;
        e86 e86Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        e56 e56Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            fz0Var = hz0.a.fromJson(jsonReader, w41Var);
        } else {
            fz0Var = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "Image", "Interactive", "LegacyCollection", "Page", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            cx3Var = ex3.a.fromJson(jsonReader, w41Var);
        } else {
            cx3Var = null;
        }
        jsonReader.q();
        jz0 fromJson = kz0.a.fromJson(jsonReader, w41Var);
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "Movie", "NewsAlert", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "Playlist", "Podcast", "ProgrammingList", "ProgrammingNode", "ProgrammingPackage", "Promo", "PushAlert", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Restaurant", "Section", "Slideshow", "Storyline", "StoryPackage", "Subject", "TheaterEvent", "TheaterVenue", "Title", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            e86Var = f86.a.fromJson(jsonReader, w41Var);
        } else {
            e86Var = null;
        }
        if (xa0.c(xa0.e("Promo"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            e56Var = f56.a.fromJson(jsonReader, w41Var);
        }
        return new ly0.a(str, fz0Var, cx3Var, fromJson, e86Var, e56Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ly0.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.f());
        if (aVar.a() != null) {
            hz0.a.toJson(lu3Var, w41Var, aVar.a());
        }
        if (aVar.c() != null) {
            ex3.a.toJson(lu3Var, w41Var, aVar.c());
        }
        kz0.a.toJson(lu3Var, w41Var, aVar.b());
        if (aVar.e() != null) {
            f86.a.toJson(lu3Var, w41Var, aVar.e());
        }
        if (aVar.d() != null) {
            f56.a.toJson(lu3Var, w41Var, aVar.d());
        }
    }
}
