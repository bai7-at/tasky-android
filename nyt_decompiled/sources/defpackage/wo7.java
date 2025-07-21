package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class wo7 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.DOCUMENT_WIDTH, "fillEnabled", QueryKeys.EXTERNAL_REFERRER, "hd");

    static vo7 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        fh fhVar = null;
        String str = null;
        ch chVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                chVar = th.c(jsonReader, lottieComposition);
            } else if (r == 2) {
                fhVar = th.h(jsonReader, lottieComposition);
            } else if (r == 3) {
                z = jsonReader.nextBoolean();
            } else if (r == 4) {
                i = jsonReader.nextInt();
            } else if (r != 5) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                z2 = jsonReader.nextBoolean();
            }
        }
        if (fhVar == null) {
            fhVar = new fh(Collections.singletonList(new rw3(100)));
        }
        return new vo7(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, chVar, fhVar, z2);
    }
}
