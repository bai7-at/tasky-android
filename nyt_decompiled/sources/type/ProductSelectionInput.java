package type;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ProductSelectionInput {
    private final nk5 games;
    private final nk5 longReads;
    private final nk5 mapsAndData;
    private final nk5 newsAlerts;
    private final nk5 personalGuidance;
    private final nk5 podcasts;
    private final nk5 productReviews;
    private final nk5 recipes;
    private final nk5 videosAndDocumentaries;
    private final nk5 visualStories;

    public ProductSelectionInput() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final nk5 component1() {
        return this.games;
    }

    public final nk5 component10() {
        return this.visualStories;
    }

    public final nk5 component2() {
        return this.longReads;
    }

    public final nk5 component3() {
        return this.mapsAndData;
    }

    public final nk5 component4() {
        return this.newsAlerts;
    }

    public final nk5 component5() {
        return this.personalGuidance;
    }

    public final nk5 component6() {
        return this.podcasts;
    }

    public final nk5 component7() {
        return this.productReviews;
    }

    public final nk5 component8() {
        return this.recipes;
    }

    public final nk5 component9() {
        return this.videosAndDocumentaries;
    }

    public final ProductSelectionInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10) {
        zq3.h(nk5Var, "games");
        zq3.h(nk5Var2, "longReads");
        zq3.h(nk5Var3, "mapsAndData");
        zq3.h(nk5Var4, "newsAlerts");
        zq3.h(nk5Var5, "personalGuidance");
        zq3.h(nk5Var6, "podcasts");
        zq3.h(nk5Var7, "productReviews");
        zq3.h(nk5Var8, "recipes");
        zq3.h(nk5Var9, "videosAndDocumentaries");
        zq3.h(nk5Var10, "visualStories");
        return new ProductSelectionInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6, nk5Var7, nk5Var8, nk5Var9, nk5Var10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionInput)) {
            return false;
        }
        ProductSelectionInput productSelectionInput = (ProductSelectionInput) obj;
        return zq3.c(this.games, productSelectionInput.games) && zq3.c(this.longReads, productSelectionInput.longReads) && zq3.c(this.mapsAndData, productSelectionInput.mapsAndData) && zq3.c(this.newsAlerts, productSelectionInput.newsAlerts) && zq3.c(this.personalGuidance, productSelectionInput.personalGuidance) && zq3.c(this.podcasts, productSelectionInput.podcasts) && zq3.c(this.productReviews, productSelectionInput.productReviews) && zq3.c(this.recipes, productSelectionInput.recipes) && zq3.c(this.videosAndDocumentaries, productSelectionInput.videosAndDocumentaries) && zq3.c(this.visualStories, productSelectionInput.visualStories);
    }

    public final nk5 getGames() {
        return this.games;
    }

    public final nk5 getLongReads() {
        return this.longReads;
    }

    public final nk5 getMapsAndData() {
        return this.mapsAndData;
    }

    public final nk5 getNewsAlerts() {
        return this.newsAlerts;
    }

    public final nk5 getPersonalGuidance() {
        return this.personalGuidance;
    }

    public final nk5 getPodcasts() {
        return this.podcasts;
    }

    public final nk5 getProductReviews() {
        return this.productReviews;
    }

    public final nk5 getRecipes() {
        return this.recipes;
    }

    public final nk5 getVideosAndDocumentaries() {
        return this.videosAndDocumentaries;
    }

    public final nk5 getVisualStories() {
        return this.visualStories;
    }

    public int hashCode() {
        return (((((((((((((((((this.games.hashCode() * 31) + this.longReads.hashCode()) * 31) + this.mapsAndData.hashCode()) * 31) + this.newsAlerts.hashCode()) * 31) + this.personalGuidance.hashCode()) * 31) + this.podcasts.hashCode()) * 31) + this.productReviews.hashCode()) * 31) + this.recipes.hashCode()) * 31) + this.videosAndDocumentaries.hashCode()) * 31) + this.visualStories.hashCode();
    }

    public String toString() {
        return "ProductSelectionInput(games=" + this.games + ", longReads=" + this.longReads + ", mapsAndData=" + this.mapsAndData + ", newsAlerts=" + this.newsAlerts + ", personalGuidance=" + this.personalGuidance + ", podcasts=" + this.podcasts + ", productReviews=" + this.productReviews + ", recipes=" + this.recipes + ", videosAndDocumentaries=" + this.videosAndDocumentaries + ", visualStories=" + this.visualStories + ")";
    }

    public ProductSelectionInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10) {
        zq3.h(nk5Var, "games");
        zq3.h(nk5Var2, "longReads");
        zq3.h(nk5Var3, "mapsAndData");
        zq3.h(nk5Var4, "newsAlerts");
        zq3.h(nk5Var5, "personalGuidance");
        zq3.h(nk5Var6, "podcasts");
        zq3.h(nk5Var7, "productReviews");
        zq3.h(nk5Var8, "recipes");
        zq3.h(nk5Var9, "videosAndDocumentaries");
        zq3.h(nk5Var10, "visualStories");
        this.games = nk5Var;
        this.longReads = nk5Var2;
        this.mapsAndData = nk5Var3;
        this.newsAlerts = nk5Var4;
        this.personalGuidance = nk5Var5;
        this.podcasts = nk5Var6;
        this.productReviews = nk5Var7;
        this.recipes = nk5Var8;
        this.videosAndDocumentaries = nk5Var9;
        this.visualStories = nk5Var10;
    }

    public /* synthetic */ ProductSelectionInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6, (i & 64) != 0 ? nk5.a.b : nk5Var7, (i & 128) != 0 ? nk5.a.b : nk5Var8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nk5.a.b : nk5Var9, (i & 512) != 0 ? nk5.a.b : nk5Var10);
    }
}
