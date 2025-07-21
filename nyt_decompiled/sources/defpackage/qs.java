package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qs implements h8 {
    public static final qs a = new qs();
    private static final List b = i.o("__typename", "id");

    private qs() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ps fromJson(JsonReader jsonReader, w41 w41Var) {
        ws wsVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        es esVar = null;
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
            wsVar = xs.a.fromJson(jsonReader, w41Var);
        } else {
            wsVar = null;
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "Capsule", "CardDeck", "CityGuide", "Dispatch", "EmbeddedInteractive", "FeedPublication", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "Image", "Interactive", "LegacyCollection", "Page", "PaidPost", "ParentingArticle", "Playlist", "Podcast", "Recipe", "RecipeCollection", "RecipeSuperCollection", "ReporterUpdate", "Slideshow", "Storyline", "Video", "WatchingRecommendation", "WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            esVar = fs.a.fromJson(jsonReader, w41Var);
        }
        if (str2 != null) {
            return new ps(str, str2, wsVar, esVar);
        }
        vr.a(jsonReader, "id");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ps psVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(psVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, psVar.d());
        lu3Var.name("id");
        h8Var.toJson(lu3Var, w41Var, psVar.c());
        if (psVar.b() != null) {
            xs.a.toJson(lu3Var, w41Var, psVar.b());
        }
        if (psVar.a() != null) {
            fs.a.toJson(lu3Var, w41Var, psVar.a());
        }
    }
}
