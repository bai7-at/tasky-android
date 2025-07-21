package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class pt6 implements pw0 {
    private final String a;
    private final sh b;
    private final sh c;
    private final dh d;
    private final boolean e;

    public pt6(String str, sh shVar, sh shVar2, dh dhVar, boolean z) {
        this.a = str;
        this.b = shVar;
        this.c = shVar2;
        this.d = dhVar;
        this.e = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new ot6(lottieDrawable, aVar, this);
    }

    public dh b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public sh d() {
        return this.b;
    }

    public sh e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
