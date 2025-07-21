package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class kc4 {
    private static final JsonReader.a a = JsonReader.a.a(QueryKeys.SCROLL_WINDOW_HEIGHT, QueryKeys.HOST, "ip", "op", "fr", QueryKeys.INTERNAL_REFERRER, "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.a b = JsonReader.a.a("id", "layers", QueryKeys.SCROLL_WINDOW_HEIGHT, QueryKeys.HOST, "p", QueryKeys.USER_ID);
    private static final JsonReader.a c = JsonReader.a.a("list");
    private static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static LottieComposition a(JsonReader jsonReader) {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float e = l29.e();
        lb4 lb4Var = new lb4();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        py7 py7Var = new py7();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.d();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader2.r(a)) {
                case 0:
                    i = jsonReader.nextInt();
                    continue;
                case 1:
                    i2 = jsonReader.nextInt();
                    continue;
                case 2:
                    f = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (l29.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        lottieComposition.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    e(jsonReader2, lottieComposition, arrayList2, lb4Var);
                    continue;
                case 7:
                    b(jsonReader2, lottieComposition, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(jsonReader2, hashMap4);
                    continue;
                case 9:
                    c(jsonReader2, lottieComposition, py7Var);
                    continue;
                case 10:
                    f(jsonReader2, arrayList3);
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        lottieComposition.t(new Rect(0, 0, (int) (i * e), (int) (i2 * e)), f, f2, f3, arrayList2, lb4Var, hashMap2, hashMap3, l29.e(), py7Var, hashMap4, arrayList3);
        return lottieComposition;
    }

    private static void b(JsonReader jsonReader, LottieComposition lottieComposition, Map map, Map map2) {
        jsonReader.b();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            lb4 lb4Var = new lb4();
            jsonReader.d();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                int r = jsonReader.r(b);
                if (r == 0) {
                    str = jsonReader.nextString();
                } else if (r == 1) {
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        Layer b2 = yy3.b(jsonReader, lottieComposition);
                        lb4Var.h(b2.e(), b2);
                        arrayList.add(b2);
                    }
                    jsonReader.h();
                } else if (r == 2) {
                    i = jsonReader.nextInt();
                } else if (r == 3) {
                    i2 = jsonReader.nextInt();
                } else if (r == 4) {
                    str2 = jsonReader.nextString();
                } else if (r != 5) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.i();
            if (str2 != null) {
                rc4 rc4Var = new rc4(i, i2, str, str2, str3);
                map2.put(rc4Var.e(), rc4Var);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.h();
    }

    private static void c(JsonReader jsonReader, LottieComposition lottieComposition, py7 py7Var) {
        jsonReader.b();
        while (jsonReader.hasNext()) {
            km2 a2 = lm2.a(jsonReader, lottieComposition);
            py7Var.i(a2.hashCode(), a2);
        }
        jsonReader.h();
    }

    private static void d(JsonReader jsonReader, Map map) {
        jsonReader.d();
        while (jsonReader.hasNext()) {
            if (jsonReader.r(c) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    hm2 a2 = pm2.a(jsonReader);
                    map.put(a2.b(), a2);
                }
                jsonReader.h();
            }
        }
        jsonReader.i();
    }

    private static void e(JsonReader jsonReader, LottieComposition lottieComposition, List list, lb4 lb4Var) {
        jsonReader.b();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer b2 = yy3.b(jsonReader, lottieComposition);
            if (b2.g() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(b2);
            lb4Var.h(b2.e(), b2);
            if (i > 4) {
                j94.c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.h();
    }

    private static void f(JsonReader jsonReader, List list) {
        jsonReader.b();
        while (jsonReader.hasNext()) {
            jsonReader.d();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                int r = jsonReader.r(d);
                if (r == 0) {
                    str = jsonReader.nextString();
                } else if (r == 1) {
                    f = (float) jsonReader.nextDouble();
                } else if (r != 2) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else {
                    f2 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.i();
            list.add(new bf4(str, f, f2));
        }
        jsonReader.h();
    }
}
