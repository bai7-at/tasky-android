package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class t13 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.ACCOUNT_ID, QueryKeys.DOCUMENT_WIDTH, QueryKeys.TOKEN, "s", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.EXTERNAL_REFERRER, "hd");
    private static final JsonReader.a b = JsonReader.a.a("p", "k");

    static r13 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        fh fhVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        eh ehVar = null;
        jh jhVar = null;
        jh jhVar2 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.d();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        int r = jsonReader.r(b);
                        if (r == 0) {
                            i = jsonReader.nextInt();
                        } else if (r != 1) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            ehVar = th.g(jsonReader, lottieComposition, i);
                        }
                    }
                    jsonReader.i();
                    break;
                case 2:
                    fhVar = th.h(jsonReader, lottieComposition);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    jhVar = th.i(jsonReader, lottieComposition);
                    break;
                case 5:
                    jhVar2 = th.i(jsonReader, lottieComposition);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new r13(str, gradientType, fillType, ehVar, fhVar == null ? new fh(Collections.singletonList(new rw3(100))) : fhVar, jhVar, jhVar2, null, null, z);
    }
}
