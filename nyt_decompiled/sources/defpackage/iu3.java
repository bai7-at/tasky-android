package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class iu3 {
    private static final JsonReader.a a = JsonReader.a.a(QueryKeys.SCROLL_POSITION_TOP, QueryKeys.CONTENT_HEIGHT);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(JsonReader jsonReader, float f) {
        jsonReader.b();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.l() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.h();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF b(JsonReader jsonReader, float f) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF c(JsonReader jsonReader, float f) {
        jsonReader.d();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                f2 = g(jsonReader);
            } else if (r != 1) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                f3 = g(jsonReader);
            }
        }
        jsonReader.i();
        return new PointF(f2 * f, f3 * f);
    }

    static int d(JsonReader jsonReader) {
        jsonReader.b();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.h();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static PointF e(JsonReader jsonReader, float f) {
        int i = a.a[jsonReader.l().ordinal()];
        if (i == 1) {
            return b(jsonReader, f);
        }
        if (i == 2) {
            return a(jsonReader, f);
        }
        if (i == 3) {
            return c(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.l());
    }

    static List f(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(e(jsonReader, f));
            jsonReader.h();
        }
        jsonReader.h();
        return arrayList;
    }

    static float g(JsonReader jsonReader) {
        JsonReader.Token l = jsonReader.l();
        int i = a.a[l.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + l);
        }
        jsonReader.b();
        float nextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.h();
        return nextDouble;
    }
}
