package defpackage;

import com.airbnb.lottie.LottieComposition;

/* loaded from: classes.dex */
public class bc4 {
    private static final bc4 b = new bc4();
    private final hd4 a = new hd4(20);

    bc4() {
    }

    public static bc4 b() {
        return b;
    }

    public LottieComposition a(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.a.d(str);
    }

    public void c(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.a.f(str, lottieComposition);
    }
}
