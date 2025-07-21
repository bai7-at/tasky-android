package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ih {
    private static final JsonReader.a a = JsonReader.a.a("k", QueryKeys.SCROLL_POSITION_TOP, QueryKeys.CONTENT_HEIGHT);

    public static hh a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.hasNext()) {
                arrayList.add(rp5.a(jsonReader, lottieComposition));
            }
            jsonReader.h();
            vw3.b(arrayList);
        } else {
            arrayList.add(new rw3(iu3.e(jsonReader, l29.e())));
        }
        return new hh(arrayList);
    }

    static sh b(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.d();
        hh hhVar = null;
        dh dhVar = null;
        boolean z = false;
        dh dhVar2 = null;
        while (jsonReader.l() != JsonReader.Token.END_OBJECT) {
            int r = jsonReader.r(a);
            if (r == 0) {
                hhVar = a(jsonReader, lottieComposition);
            } else if (r != 1) {
                if (r != 2) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else if (jsonReader.l() == JsonReader.Token.STRING) {
                    jsonReader.skipValue();
                    z = true;
                } else {
                    dhVar = th.e(jsonReader, lottieComposition);
                }
            } else if (jsonReader.l() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z = true;
            } else {
                dhVar2 = th.e(jsonReader, lottieComposition);
            }
        }
        jsonReader.i();
        if (z) {
            lottieComposition.a("Lottie doesn't support expressions.");
        }
        return hhVar != null ? hhVar : new mh(dhVar2, dhVar);
    }
}
