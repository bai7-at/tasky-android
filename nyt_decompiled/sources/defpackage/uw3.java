package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class uw3 {
    private static py7 b;
    private static final Interpolator a = new LinearInterpolator();
    static JsonReader.a c = JsonReader.a.a(QueryKeys.TOKEN, "s", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.DOCUMENT_WIDTH, QueryKeys.VIEW_TITLE, QueryKeys.HOST, "to", "ti");
    static JsonReader.a d = JsonReader.a.a(QueryKeys.SCROLL_POSITION_TOP, QueryKeys.CONTENT_HEIGHT);

    private static WeakReference a(int i) {
        WeakReference weakReference;
        synchronized (uw3.class) {
            weakReference = (WeakReference) g().e(i);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator a2;
        pointF.x = nu4.b(pointF.x, -1.0f, 1.0f);
        pointF.y = nu4.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = nu4.b(pointF2.x, -1.0f, 1.0f);
        float b2 = nu4.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        int i = l29.i(pointF.x, pointF.y, pointF2.x, b2);
        WeakReference a3 = yx3.e() ? null : a(i);
        Interpolator interpolator = a3 != null ? (Interpolator) a3.get() : null;
        if (a3 == null || interpolator == null) {
            try {
                a2 = op5.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                a2 = "The Path cannot loop back on itself.".equals(e.getMessage()) ? op5.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = a2;
            if (!yx3.e()) {
                try {
                    h(i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    static rw3 c(JsonReader jsonReader, LottieComposition lottieComposition, float f, v39 v39Var, boolean z, boolean z2) {
        return (z && z2) ? e(lottieComposition, jsonReader, f, v39Var) : z ? d(lottieComposition, jsonReader, f, v39Var) : f(jsonReader, f, v39Var);
    }

    private static rw3 d(LottieComposition lottieComposition, JsonReader jsonReader, float f, v39 v39Var) {
        Interpolator b2;
        Object obj;
        jsonReader.d();
        PointF pointF = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(c)) {
                case 0:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    obj3 = v39Var.a(jsonReader, f);
                    break;
                case 2:
                    obj2 = v39Var.a(jsonReader, f);
                    break;
                case 3:
                    pointF = iu3.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = iu3.e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = iu3.e(jsonReader, f);
                    break;
                case 7:
                    pointF3 = iu3.e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.i();
        if (z) {
            b2 = a;
            obj = obj3;
        } else {
            b2 = (pointF == null || pointF4 == null) ? a : b(pointF, pointF4);
            obj = obj2;
        }
        rw3 rw3Var = new rw3(lottieComposition, obj3, obj, b2, f2, null);
        rw3Var.o = pointF2;
        rw3Var.p = pointF3;
        return rw3Var;
    }

    private static rw3 e(LottieComposition lottieComposition, JsonReader jsonReader, float f, v39 v39Var) {
        Interpolator interpolator;
        Interpolator b2;
        Interpolator b3;
        Object obj;
        PointF pointF;
        rw3 rw3Var;
        PointF pointF2;
        float f2;
        PointF pointF3;
        jsonReader.d();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        Object obj2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        Object obj3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(c)) {
                case 0:
                    pointF2 = pointF4;
                    f3 = (float) jsonReader.nextDouble();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    obj2 = v39Var.a(jsonReader, f);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    obj3 = v39Var.a(jsonReader, f);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f3;
                    PointF pointF12 = pointF11;
                    if (jsonReader.l() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.d();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int r = jsonReader.r(d);
                            if (r == 0) {
                                JsonReader.Token l = jsonReader.l();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (l == token) {
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    jsonReader.b();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.l() == token ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.h();
                                }
                            } else if (r != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token l2 = jsonReader.l();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (l2 == token2) {
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    jsonReader.b();
                                    f5 = (float) jsonReader.nextDouble();
                                    f7 = jsonReader.l() == token2 ? (float) jsonReader.nextDouble() : f5;
                                    jsonReader.h();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f4, f5);
                        PointF pointF14 = new PointF(f6, f7);
                        jsonReader.i();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f3 = f2;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = iu3.e(jsonReader, f);
                        f3 = f2;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (jsonReader.l() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.d();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF15 = pointF11;
                            int r2 = jsonReader.r(d);
                            if (r2 != 0) {
                                pointF3 = pointF4;
                                if (r2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token l3 = jsonReader.l();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (l3 == token3) {
                                        f11 = (float) jsonReader.nextDouble();
                                        f3 = f3;
                                        f9 = f11;
                                    } else {
                                        float f12 = f3;
                                        jsonReader.b();
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        float nextDouble2 = jsonReader.l() == token3 ? (float) jsonReader.nextDouble() : nextDouble;
                                        jsonReader.h();
                                        f3 = f12;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f11 = nextDouble2;
                                        f9 = nextDouble;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f13 = f3;
                                JsonReader.Token l4 = jsonReader.l();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (l4 == token4) {
                                    f10 = (float) jsonReader.nextDouble();
                                    f3 = f13;
                                    f8 = f10;
                                } else {
                                    jsonReader.b();
                                    f8 = (float) jsonReader.nextDouble();
                                    f10 = jsonReader.l() == token4 ? (float) jsonReader.nextDouble() : f8;
                                    jsonReader.h();
                                    f3 = f13;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f3;
                        PointF pointF16 = new PointF(f8, f9);
                        PointF pointF17 = new PointF(f10, f11);
                        jsonReader.i();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f3 = f2;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = iu3.e(jsonReader, f);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF11 = iu3.e(jsonReader, f);
                    break;
                case 7:
                    pointF4 = iu3.e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f14 = f3;
        PointF pointF19 = pointF11;
        jsonReader.i();
        if (z) {
            interpolator = a;
            obj = obj2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    b2 = b(pointF7, pointF9);
                    b3 = b(pointF8, pointF10);
                    obj = obj3;
                    interpolator = null;
                    if (b2 != null || b3 == null) {
                        pointF = pointF19;
                        rw3Var = new rw3(lottieComposition, obj2, obj, interpolator, f14, null);
                    } else {
                        pointF = pointF19;
                        rw3Var = new rw3(lottieComposition, obj2, obj, b2, b3, f14, null);
                    }
                    rw3Var.o = pointF;
                    rw3Var.p = pointF18;
                    return rw3Var;
                }
                interpolator = a;
            }
            obj = obj3;
        }
        b2 = null;
        b3 = null;
        if (b2 != null) {
        }
        pointF = pointF19;
        rw3Var = new rw3(lottieComposition, obj2, obj, interpolator, f14, null);
        rw3Var.o = pointF;
        rw3Var.p = pointF18;
        return rw3Var;
    }

    private static rw3 f(JsonReader jsonReader, float f, v39 v39Var) {
        return new rw3(v39Var.a(jsonReader, f));
    }

    private static py7 g() {
        if (b == null) {
            b = new py7();
        }
        return b;
    }

    private static void h(int i, WeakReference weakReference) {
        synchronized (uw3.class) {
            b.i(i, weakReference);
        }
    }
}
