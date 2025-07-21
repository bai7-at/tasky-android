package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class vk0 implements pw0 {
    private final String a;
    private final sh b;
    private final jh c;
    private final boolean d;
    private final boolean e;

    public vk0(String str, sh shVar, jh jhVar, boolean z, boolean z2) {
        this.a = str;
        this.b = shVar;
        this.c = jhVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new cz1(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public sh c() {
        return this.b;
    }

    public jh d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
