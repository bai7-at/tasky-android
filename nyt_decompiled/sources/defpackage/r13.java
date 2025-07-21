package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes.dex */
public class r13 implements pw0 {
    private final GradientType a;
    private final Path.FillType b;
    private final eh c;
    private final fh d;
    private final jh e;
    private final jh f;
    private final String g;
    private final dh h;
    private final dh i;
    private final boolean j;

    public r13(String str, GradientType gradientType, Path.FillType fillType, eh ehVar, fh fhVar, jh jhVar, jh jhVar2, dh dhVar, dh dhVar2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = ehVar;
        this.d = fhVar;
        this.e = jhVar;
        this.f = jhVar2;
        this.g = str;
        this.h = dhVar;
        this.i = dhVar2;
        this.j = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, a aVar) {
        return new s13(lottieDrawable, lottieComposition, aVar, this);
    }

    public jh b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public eh d() {
        return this.c;
    }

    public GradientType e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public fh g() {
        return this.d;
    }

    public jh h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
