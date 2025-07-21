package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xz2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yz2 implements h8 {
    public static final yz2 a = new yz2();
    private static final List b = i.e("__typename");

    private yz2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xz2.a fromJson(JsonReader jsonReader, w41 w41Var) {
        lr lrVar;
        aq aqVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        gr grVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "Movie", "NewsAlert", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "Playlist", "Podcast", "ProgrammingList", "ProgrammingNode", "ProgrammingPackage", "Promo", "PushAlert", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Restaurant", "Section", "Slideshow", "Storyline", "StoryPackage", "Subject", "TheaterEvent", "TheaterVenue", "Title", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            lrVar = mr.a.fromJson(jsonReader, w41Var);
        } else {
            lrVar = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "Image", "Interactive", "LegacyCollection", "Page", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            aqVar = bq.a.fromJson(jsonReader, w41Var);
        } else {
            aqVar = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "Image", "Interactive", "LegacyCollection", "Package", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Promo", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            grVar = hr.a.fromJson(jsonReader, w41Var);
        }
        return new xz2.a(str, lrVar, aqVar, grVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xz2.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.d());
        if (aVar.c() != null) {
            mr.a.toJson(lu3Var, w41Var, aVar.c());
        }
        if (aVar.a() != null) {
            bq.a.toJson(lu3Var, w41Var, aVar.a());
        }
        if (aVar.b() != null) {
            hr.a.toJson(lu3Var, w41Var, aVar.b());
        }
    }
}
