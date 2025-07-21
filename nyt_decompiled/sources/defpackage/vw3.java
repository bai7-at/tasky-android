package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class vw3 {
    static JsonReader.a a = JsonReader.a.a("k");

    static List a(JsonReader jsonReader, LottieComposition lottieComposition, float f, v39 v39Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.l() == JsonReader.Token.STRING) {
            lottieComposition.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.d();
        while (jsonReader.hasNext()) {
            if (jsonReader.r(a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.l() == JsonReader.Token.NUMBER) {
                    arrayList.add(uw3.c(jsonReader, lottieComposition, f, v39Var, false, z));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(uw3.c(jsonReader, lottieComposition, f, v39Var, true, z));
                    }
                }
                jsonReader.h();
            } else {
                arrayList.add(uw3.c(jsonReader, lottieComposition, f, v39Var, false, z));
            }
        }
        jsonReader.i();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            rw3 rw3Var = (rw3) list.get(i2);
            i2++;
            rw3 rw3Var2 = (rw3) list.get(i2);
            rw3Var.h = Float.valueOf(rw3Var2.g);
            if (rw3Var.c == null && (obj = rw3Var2.b) != null) {
                rw3Var.c = obj;
                if (rw3Var instanceof pp5) {
                    ((pp5) rw3Var).j();
                }
            }
        }
        rw3 rw3Var3 = (rw3) list.get(i);
        if ((rw3Var3.b == null || rw3Var3.c == null) && list.size() > 1) {
            list.remove(rw3Var3);
        }
    }
}
