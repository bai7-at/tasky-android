package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class vo7 implements pw0 {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final ch d;
    private final fh e;
    private final boolean f;

    public vo7(String str, boolean z, Path.FillType fillType, ch chVar, fh fhVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = chVar;
        this.e = fhVar;
        this.f = z2;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new rf2(lottieDrawable, aVar, this);
    }

    public ch b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public fh e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
