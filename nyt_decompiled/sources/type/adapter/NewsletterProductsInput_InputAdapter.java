package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.NewsletterProductsInput;

/* loaded from: classes5.dex */
public final class NewsletterProductsInput_InputAdapter implements h8 {
    public static final NewsletterProductsInput_InputAdapter INSTANCE = new NewsletterProductsInput_InputAdapter();

    private NewsletterProductsInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public NewsletterProductsInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, NewsletterProductsInput newsletterProductsInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(newsletterProductsInput, "value");
        lu3Var.name("productCode");
        j8.a.toJson(lu3Var, w41Var, newsletterProductsInput.getProductCode());
        if (newsletterProductsInput.isFreeTrial() instanceof nk5.c) {
            lu3Var.name("isFreeTrial");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) newsletterProductsInput.isFreeTrial());
        }
        if (newsletterProductsInput.getFreeTrialSignupTime() instanceof nk5.c) {
            lu3Var.name("freeTrialSignupTime");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) newsletterProductsInput.getFreeTrialSignupTime());
        }
    }
}
