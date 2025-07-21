package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.List;

/* loaded from: classes.dex */
public abstract class th {
    private static List a(JsonReader jsonReader, float f, LottieComposition lottieComposition, v39 v39Var) {
        return vw3.a(jsonReader, lottieComposition, f, v39Var, false);
    }

    private static List b(JsonReader jsonReader, LottieComposition lottieComposition, v39 v39Var) {
        return vw3.a(jsonReader, lottieComposition, 1.0f, v39Var, false);
    }

    static ch c(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new ch(b(jsonReader, lottieComposition, co0.a));
    }

    static nh d(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new nh(a(jsonReader, l29.e(), lottieComposition, ht1.a));
    }

    public static dh e(JsonReader jsonReader, LottieComposition lottieComposition) {
        return f(jsonReader, lottieComposition, true);
    }

    public static dh f(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) {
        return new dh(a(jsonReader, z ? l29.e() : 1.0f, lottieComposition, al2.a));
    }

    static eh g(JsonReader jsonReader, LottieComposition lottieComposition, int i) {
        return new eh(b(jsonReader, lottieComposition, new q13(i)));
    }

    static fh h(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new fh(b(jsonReader, lottieComposition, pn3.a));
    }

    static jh i(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new jh(vw3.a(jsonReader, lottieComposition, l29.e(), jx5.a, true));
    }

    static kh j(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new kh(b(jsonReader, lottieComposition, ra7.a));
    }

    static lh k(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new lh(a(jsonReader, l29.e(), lottieComposition, to7.a));
    }
}
