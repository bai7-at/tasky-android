package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class pn3 implements v39 {
    public static final pn3 a = new pn3();

    private pn3() {
    }

    @Override // defpackage.v39
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(iu3.g(jsonReader) * f));
    }
}
