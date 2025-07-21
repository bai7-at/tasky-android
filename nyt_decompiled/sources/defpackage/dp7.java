package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class dp7 implements pw0 {
    private final String a;
    private final int b;
    private final lh c;
    private final boolean d;

    public dp7(String str, int i, lh lhVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = lhVar;
        this.d = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new ro7(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public lh c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
