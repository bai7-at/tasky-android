package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.oy2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class sy2 implements h8 {
    public static final sy2 a = new sy2();
    private static final List b = i.e("__typename");

    private sy2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oy2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        y76 y76Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "Movie", "NewsAlert", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "Playlist", "Podcast", "ProgrammingList", "ProgrammingNode", "ProgrammingPackage", "Promo", "PushAlert", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Restaurant", "Section", "Slideshow", "Storyline", "StoryPackage", "Subject", "TheaterEvent", "TheaterVenue", "Title", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            y76Var = b86.a.fromJson(jsonReader, w41Var);
        }
        return new oy2.e(str, y76Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, oy2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.b());
        if (eVar.a() != null) {
            b86.a.toJson(lu3Var, w41Var, eVar.a());
        }
    }
}
