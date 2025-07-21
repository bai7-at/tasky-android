package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bx0 implements h8 {
    public static final bx0 a = new bx0();
    private static final List b = i.e("__typename");

    private bx0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.h fromJson(JsonReader jsonReader, w41 w41Var) {
        ee7 ee7Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        rd7 rd7Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "Movie", "NewsAlert", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "Playlist", "Podcast", "ProgrammingList", "ProgrammingNode", "ProgrammingPackage", "Promo", "PushAlert", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Restaurant", "Section", "Slideshow", "Storyline", "StoryPackage", "Subject", "TheaterEvent", "TheaterVenue", "Title", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ee7Var = fe7.a.fromJson(jsonReader, w41Var);
        } else {
            ee7Var = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "Image", "Interactive", "LegacyCollection", "Page", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            rd7Var = td7.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        return new tw0.h(str, ee7Var, rd7Var, de7.a.fromJson(jsonReader, w41Var));
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.d());
        if (hVar.c() != null) {
            fe7.a.toJson(lu3Var, w41Var, hVar.c());
        }
        if (hVar.a() != null) {
            td7.a.toJson(lu3Var, w41Var, hVar.a());
        }
        de7.a.toJson(lu3Var, w41Var, hVar.b());
    }
}
