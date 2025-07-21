package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z75 implements h8 {
    public static final z75 a = new z75();
    private static final List b = i.o("__typename", "id");

    private z75() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y75 fromJson(JsonReader jsonReader, w41 w41Var) {
        z76 z76Var;
        eq eqVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        dg3 dg3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "Movie", "NewsAlert", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "Playlist", "Podcast", "ProgrammingList", "ProgrammingNode", "ProgrammingPackage", "Promo", "PushAlert", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Restaurant", "Section", "Slideshow", "Storyline", "StoryPackage", "Subject", "TheaterEvent", "TheaterVenue", "Title", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            z76Var = a86.a.fromJson(jsonReader, w41Var);
        } else {
            z76Var = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "Image", "Interactive", "LegacyCollection", "Page", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            eqVar = fq.a.fromJson(jsonReader, w41Var);
        } else {
            eqVar = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "Image", "Interactive", "LegacyCollection", "Package", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Promo", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            dg3Var = gg3.a.fromJson(jsonReader, w41Var);
        }
        dg3 dg3Var2 = dg3Var;
        if (str2 != null) {
            return new y75(str, str2, z76Var, eqVar, dg3Var2);
        }
        vr.a(jsonReader, "id");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, y75 y75Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(y75Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, y75Var.e());
        lu3Var.name("id");
        h8Var.toJson(lu3Var, w41Var, y75Var.b());
        if (y75Var.d() != null) {
            a86.a.toJson(lu3Var, w41Var, y75Var.d());
        }
        if (y75Var.a() != null) {
            fq.a.toJson(lu3Var, w41Var, y75Var.a());
        }
        if (y75Var.c() != null) {
            gg3.a.toJson(lu3Var, w41Var, y75Var.c());
        }
    }
}
