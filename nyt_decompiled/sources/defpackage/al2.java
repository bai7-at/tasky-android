package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class al2 implements v39 {
    public static final al2 a = new al2();

    private al2() {
    }

    @Override // defpackage.v39
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f) {
        return Float.valueOf(iu3.g(jsonReader) * f);
    }
}
