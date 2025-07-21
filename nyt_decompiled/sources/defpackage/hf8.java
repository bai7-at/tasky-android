package defpackage;

import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetailDefault;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class hf8 {
    public static final int f = LottieAnimationDetail.c;
    private final Integer a;
    private final int b;
    private final Integer c;
    private final String d;
    private final LottieAnimationDetail e;

    public hf8(Integer num, int i, Integer num2, String str, LottieAnimationDetail lottieAnimationDetail) {
        zq3.h(str, "route");
        zq3.h(lottieAnimationDetail, "lottieIcon");
        this.a = num;
        this.b = i;
        this.c = num2;
        this.d = str;
        this.e = lottieAnimationDetail;
    }

    public final Integer a() {
        return this.a;
    }

    public final LottieAnimationDetail b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final Integer d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf8)) {
            return false;
        }
        hf8 hf8Var = (hf8) obj;
        return zq3.c(this.a, hf8Var.a) && this.b == hf8Var.b && zq3.c(this.c, hf8Var.c) && zq3.c(this.d, hf8Var.d) && zq3.c(this.e, hf8Var.e);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.b)) * 31;
        Integer num2 = this.c;
        return ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "TabData(icon=" + this.a + ", title=" + this.b + ", testTag=" + this.c + ", route=" + this.d + ", lottieIcon=" + this.e + ")";
    }

    public /* synthetic */ hf8(Integer num, int i, Integer num2, String str, LottieAnimationDetail lottieAnimationDetail, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, i, (i2 & 4) != 0 ? null : num2, str, (i2 & 16) != 0 ? LottieAnimationDetailDefault.a.a() : lottieAnimationDetail);
    }
}
