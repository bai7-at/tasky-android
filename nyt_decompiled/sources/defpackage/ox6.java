package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class ox6 implements pw0 {
    private final String a;
    private final dh b;
    private final dh c;
    private final qh d;
    private final boolean e;

    public ox6(String str, dh dhVar, dh dhVar2, qh qhVar, boolean z) {
        this.a = str;
        this.b = dhVar;
        this.c = dhVar2;
        this.d = qhVar;
        this.e = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new px6(lottieDrawable, aVar, this);
    }

    public dh b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public dh d() {
        return this.c;
    }

    public qh e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
