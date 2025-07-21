package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class xo7 implements pw0 {
    private final String a;
    private final List b;
    private final boolean c;

    public xo7(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new zv0(lottieDrawable, aVar, this, lottieComposition);
    }

    public List b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
