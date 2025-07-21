package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class g37 implements pw0 {
    private final String a;
    private final sh b;

    public g37(String str, sh shVar) {
        this.a = str;
        this.b = shVar;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new h37(lottieDrawable, aVar, this);
    }

    public sh b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
