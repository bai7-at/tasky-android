package defpackage;

import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;

/* loaded from: classes4.dex */
public final class un8 implements yr4 {
    private final it2 a;
    private final LottieAnimationDetail b;
    private final qs2 c;

    public un8(it2 it2Var, LottieAnimationDetail lottieAnimationDetail, qs2 qs2Var) {
        zq3.h(it2Var, "content");
        zq3.h(qs2Var, "onDismiss");
        this.a = it2Var;
        this.b = lottieAnimationDetail;
        this.c = qs2Var;
    }

    public final it2 a() {
        return this.a;
    }

    public final LottieAnimationDetail b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un8)) {
            return false;
        }
        un8 un8Var = (un8) obj;
        return zq3.c(this.a, un8Var.a) && zq3.c(this.b, un8Var.b) && zq3.c(this.c, un8Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LottieAnimationDetail lottieAnimationDetail = this.b;
        return ((hashCode + (lottieAnimationDetail == null ? 0 : lottieAnimationDetail.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TooltipLargeMessageState(content=" + this.a + ", lottieAnimation=" + this.b + ", onDismiss=" + this.c + ")";
    }
}
