package defpackage;

import com.amazonaws.http.HttpHeader;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.hj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lj5 implements h8 {
    public static final lj5 a = new lj5();
    private static final List b = i.e("__typename");

    private lj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hj5.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        y75 y75Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "AthleticArticle", "AthleticLiveBlog", "Audio", "AudioContainer", "BasicRichTextDoc", "BestSellerBook", "BestSellerBookList", "Block_Beta", "CanonicalUrl", "CardDeck", "CmsPlaygroundBodyDoc", "CuratedAssetComments", "Dispatch", "EmbeddedInteractive", "ExpiredWork", "ExternalWork", "FeedPublication", "GamesInboxMessage", "GamesInboxSegment", "Guide", "HelixNewsletter", "HelixNewsletterBodyVariant", "HelixNewsletterProduct", "Image", "InlineTextDoc", "Interactive", "Keyword", "LegacyCollection", "List", HttpHeader.LOCATION, "Misspell", "MultiListBlock_Beta", "NewsletterConfig", "Organization", "Package", "Page", "PaidPost", "ParentingArticle", "Person", "PersonalizedBlock_Beta", "Playlist", "Podcast", "Program_Beta", "Promo", "RedirectUrl", "ReporterUpdate", "Restaurant", "ScLoadTestChildLevel1", "ScLoadTestChildLevel2", "ScLoadTestChildLevel3", "ScLoadTestParent", "ScoopAuthor", "ScoopCookingTag", "ScoopDesk", "ScoopExampleChild", "ScoopExampleParent", "ScoopImageBlock", "ScoopRecipe", "ScoopRecipeFaq", "ScoopRecipePreparationDoc", "ScoopRecipeServing", "ScoopRecipeStepImages", "ScoopRecipeStructuredIngredientBeta", "ScoopRecipeStructuredIngredientListItemBeta", "ScoopRecipeTextBodyDoc", "ScoopRecipeTime", "ScoopRecipeTip", "ScoopRecipeYield", "ScoopSection", "ScoopStoryFormat", "ScoopTrustModule", "ScoopWirecutterArticle", "ScoopWirecutterAuxiliarySection", "ScoopWirecutterImage", "ScoopWirecutterPageType", "ScoopWirecutterPermalinkPattern", "ScoopWirecutterPrimarySection", "Section", "SkArticle", "SkEmbeddedScoopAuthor", "Slideshow", "Subject", "Title", "Video", "WatchingRecommendation", "WirecutterArticle", "WirecutterArticleBodyDoc"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            y75Var = z75.a.fromJson(jsonReader, w41Var);
        }
        return new hj5.e(str, y75Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, hj5.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.b());
        if (eVar.a() != null) {
            z75.a.toJson(lu3Var, w41Var, eVar.a());
        }
    }
}
