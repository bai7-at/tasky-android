package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.ProductSelectionInput;

/* loaded from: classes5.dex */
public final class ProductSelectionInput_InputAdapter implements h8 {
    public static final ProductSelectionInput_InputAdapter INSTANCE = new ProductSelectionInput_InputAdapter();

    private ProductSelectionInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public ProductSelectionInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, ProductSelectionInput productSelectionInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(productSelectionInput, "value");
        if (productSelectionInput.getGames() instanceof nk5.c) {
            lu3Var.name("games");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getGames());
        }
        if (productSelectionInput.getLongReads() instanceof nk5.c) {
            lu3Var.name("longReads");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getLongReads());
        }
        if (productSelectionInput.getMapsAndData() instanceof nk5.c) {
            lu3Var.name("mapsAndData");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getMapsAndData());
        }
        if (productSelectionInput.getNewsAlerts() instanceof nk5.c) {
            lu3Var.name("newsAlerts");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getNewsAlerts());
        }
        if (productSelectionInput.getPersonalGuidance() instanceof nk5.c) {
            lu3Var.name("personalGuidance");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getPersonalGuidance());
        }
        if (productSelectionInput.getPodcasts() instanceof nk5.c) {
            lu3Var.name("podcasts");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getPodcasts());
        }
        if (productSelectionInput.getProductReviews() instanceof nk5.c) {
            lu3Var.name("productReviews");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getProductReviews());
        }
        if (productSelectionInput.getRecipes() instanceof nk5.c) {
            lu3Var.name("recipes");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getRecipes());
        }
        if (productSelectionInput.getVideosAndDocumentaries() instanceof nk5.c) {
            lu3Var.name("videosAndDocumentaries");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getVideosAndDocumentaries());
        }
        if (productSelectionInput.getVisualStories() instanceof nk5.c) {
            lu3Var.name("visualStories");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) productSelectionInput.getVisualStories());
        }
    }
}
