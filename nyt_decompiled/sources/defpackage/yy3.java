package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class yy3 {
    private static final JsonReader.a a = JsonReader.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", QueryKeys.TOKEN, "ef", QueryKeys.SITE_VISIT_REFERRER, "st", QueryKeys.SCROLL_WINDOW_HEIGHT, QueryKeys.HOST, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final JsonReader.a b = JsonReader.a.a(QueryKeys.SUBDOMAIN, Tag.A);
    private static final JsonReader.a c = JsonReader.a.a("ty", "nm");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer a(LottieComposition lottieComposition) {
        Rect b2 = lottieComposition.b();
        return new Layer(Collections.emptyList(), lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new qh(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    public static Layer b(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList;
        boolean z;
        float f;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.d();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        Layer.LayerType layerType = null;
        String str = null;
        nh nhVar = null;
        oh ohVar = null;
        dh dhVar = null;
        l90 l90Var = null;
        iw1 iw1Var = null;
        long j = 0;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        long j2 = -1;
        float f7 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        qh qhVar = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    j = jsonReader.nextInt();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (nextInt >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[nextInt];
                        break;
                    }
                case 4:
                    j2 = jsonReader.nextInt();
                    break;
                case 5:
                    i = (int) (jsonReader.nextInt() * l29.e());
                    break;
                case 6:
                    i2 = (int) (jsonReader.nextInt() * l29.e());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    qhVar = rh.g(jsonReader, lottieComposition);
                    break;
                case 9:
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[nextInt2];
                        int i4 = a.a[matteType2.ordinal()];
                        if (i4 == 1) {
                            lottieComposition.a("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            lottieComposition.a("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.s(1);
                        break;
                    } else {
                        lottieComposition.a("Unsupported matte type: " + nextInt2);
                        break;
                    }
                case 10:
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(df4.a(jsonReader, lottieComposition));
                    }
                    lottieComposition.s(arrayList2.size());
                    jsonReader.h();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        pw0 a2 = qw0.a(jsonReader, lottieComposition);
                        if (a2 != null) {
                            arrayList3.add(a2);
                        }
                    }
                    jsonReader.h();
                    break;
                case 12:
                    jsonReader.d();
                    while (jsonReader.hasNext()) {
                        int r = jsonReader.r(b);
                        if (r == 0) {
                            nhVar = th.d(jsonReader, lottieComposition);
                        } else if (r != 1) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.b();
                            if (jsonReader.hasNext()) {
                                ohVar = ph.a(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.h();
                        }
                    }
                    jsonReader.i();
                    break;
                case 13:
                    jsonReader.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.d();
                        while (jsonReader.hasNext()) {
                            int r2 = jsonReader.r(c);
                            if (r2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    l90Var = m90.b(jsonReader, lottieComposition);
                                } else if (nextInt3 == 25) {
                                    iw1Var = new jw1().b(jsonReader, lottieComposition);
                                }
                            } else if (r2 != 1) {
                                jsonReader.s();
                                jsonReader.skipValue();
                            } else {
                                arrayList4.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.i();
                    }
                    jsonReader.h();
                    lottieComposition.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f7 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    f4 = (float) (jsonReader.nextDouble() * l29.e());
                    break;
                case 17:
                    f5 = (float) (jsonReader.nextDouble() * l29.e());
                    break;
                case 18:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    dhVar = th.f(jsonReader, lottieComposition, false);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                case 22:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 23:
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[nextInt4];
                        break;
                    } else {
                        lottieComposition.a("Unsupported Blend Mode: " + nextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    }
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.i();
        ArrayList arrayList5 = new ArrayList();
        if (f2 > 0.0f) {
            arrayList = arrayList2;
            z = z2;
            arrayList5.add(new rw3(lottieComposition, valueOf, valueOf, null, 0.0f, Float.valueOf(f2)));
            f = 0.0f;
        } else {
            arrayList = arrayList2;
            z = z2;
            f = 0.0f;
        }
        if (f6 <= f) {
            f6 = lottieComposition.f();
        }
        arrayList5.add(new rw3(lottieComposition, valueOf2, valueOf2, null, f2, Float.valueOf(f6)));
        arrayList5.add(new rw3(lottieComposition, valueOf, valueOf, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            lottieComposition.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (qhVar == null) {
                qhVar = new qh();
            }
            qhVar.m(z);
        }
        return new Layer(arrayList3, lottieComposition, str2, j, layerType, j2, str, arrayList, qhVar, i, i2, i3, f7, f3, f4, f5, nhVar, ohVar, arrayList5, matteType2, dhVar, z3, l90Var, iw1Var, lBlendMode2);
    }
}
