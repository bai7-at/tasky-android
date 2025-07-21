package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
public class jw1 {
    private static final JsonReader.a f = JsonReader.a.a("ef");
    private static final JsonReader.a g = JsonReader.a.a("nm", QueryKeys.INTERNAL_REFERRER);
    private ch a;
    private dh b;
    private dh c;
    private dh d;
    private dh e;

    private void a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.d();
        String str = "";
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(g);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                str.hashCode();
                switch (str) {
                    case "Distance":
                        this.d = th.e(jsonReader, lottieComposition);
                        break;
                    case "Opacity":
                        this.b = th.f(jsonReader, lottieComposition, false);
                        break;
                    case "Direction":
                        this.c = th.f(jsonReader, lottieComposition, false);
                        break;
                    case "Shadow Color":
                        this.a = th.c(jsonReader, lottieComposition);
                        break;
                    case "Softness":
                        this.e = th.e(jsonReader, lottieComposition);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.s();
                jsonReader.skipValue();
            }
        }
        jsonReader.i();
    }

    iw1 b(JsonReader jsonReader, LottieComposition lottieComposition) {
        dh dhVar;
        dh dhVar2;
        dh dhVar3;
        dh dhVar4;
        while (jsonReader.hasNext()) {
            if (jsonReader.r(f) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    a(jsonReader, lottieComposition);
                }
                jsonReader.h();
            }
        }
        ch chVar = this.a;
        if (chVar == null || (dhVar = this.b) == null || (dhVar2 = this.c) == null || (dhVar3 = this.d) == null || (dhVar4 = this.e) == null) {
            return null;
        }
        return new iw1(chVar, dhVar, dhVar2, dhVar3, dhVar4);
    }
}
