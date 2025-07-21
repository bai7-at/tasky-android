package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class NewsletterProductsInput {
    private final nk5 freeTrialSignupTime;
    private final nk5 isFreeTrial;
    private final String productCode;

    public NewsletterProductsInput(String str, nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(str, "productCode");
        zq3.h(nk5Var, "isFreeTrial");
        zq3.h(nk5Var2, "freeTrialSignupTime");
        this.productCode = str;
        this.isFreeTrial = nk5Var;
        this.freeTrialSignupTime = nk5Var2;
    }

    public static /* synthetic */ NewsletterProductsInput copy$default(NewsletterProductsInput newsletterProductsInput, String str, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsletterProductsInput.productCode;
        }
        if ((i & 2) != 0) {
            nk5Var = newsletterProductsInput.isFreeTrial;
        }
        if ((i & 4) != 0) {
            nk5Var2 = newsletterProductsInput.freeTrialSignupTime;
        }
        return newsletterProductsInput.copy(str, nk5Var, nk5Var2);
    }

    public final String component1() {
        return this.productCode;
    }

    public final nk5 component2() {
        return this.isFreeTrial;
    }

    public final nk5 component3() {
        return this.freeTrialSignupTime;
    }

    public final NewsletterProductsInput copy(String str, nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(str, "productCode");
        zq3.h(nk5Var, "isFreeTrial");
        zq3.h(nk5Var2, "freeTrialSignupTime");
        return new NewsletterProductsInput(str, nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsletterProductsInput)) {
            return false;
        }
        NewsletterProductsInput newsletterProductsInput = (NewsletterProductsInput) obj;
        return zq3.c(this.productCode, newsletterProductsInput.productCode) && zq3.c(this.isFreeTrial, newsletterProductsInput.isFreeTrial) && zq3.c(this.freeTrialSignupTime, newsletterProductsInput.freeTrialSignupTime);
    }

    public final nk5 getFreeTrialSignupTime() {
        return this.freeTrialSignupTime;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        return (((this.productCode.hashCode() * 31) + this.isFreeTrial.hashCode()) * 31) + this.freeTrialSignupTime.hashCode();
    }

    public final nk5 isFreeTrial() {
        return this.isFreeTrial;
    }

    public String toString() {
        return "NewsletterProductsInput(productCode=" + this.productCode + ", isFreeTrial=" + this.isFreeTrial + ", freeTrialSignupTime=" + this.freeTrialSignupTime + ")";
    }

    public /* synthetic */ NewsletterProductsInput(String str, nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? nk5.a.b : nk5Var, (i & 4) != 0 ? nk5.a.b : nk5Var2);
    }
}
