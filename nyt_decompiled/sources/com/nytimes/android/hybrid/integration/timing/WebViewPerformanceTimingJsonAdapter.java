package com.nytimes.android.hybrid.integration.timing;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class WebViewPerformanceTimingJsonAdapter extends JsonAdapter<WebViewPerformanceTiming> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;

    public WebViewPerformanceTimingJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("navigationStart", "unloadEventStart", "unloadEventEnd", "redirectStart", "redirectEnd", "fetchStart", "domainLookupStart", "domainLookupEnd", "connectStart", "connectEnd", "secureConnectionStart", "requestStart", "responseStart", "responseEnd", "domLoading", "domInteractive", "domContentLoadedEventStart", "domContentLoadedEventEnd", "domComplete", "loadEventStart", "loadEventEnd");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "navigationStart");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public WebViewPerformanceTiming fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        Long l10 = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        Long l16 = null;
        Long l17 = null;
        Long l18 = null;
        Long l19 = null;
        Long l20 = null;
        Long l21 = null;
        while (true) {
            Long l22 = l14;
            Long l23 = l13;
            Long l24 = l12;
            Long l25 = l11;
            Long l26 = l10;
            Long l27 = l9;
            Long l28 = l8;
            Long l29 = l7;
            Long l30 = l6;
            Long l31 = l5;
            Long l32 = l4;
            Long l33 = l3;
            Long l34 = l2;
            Long l35 = l;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (l35 == null) {
                    JsonDataException o = c29.o("navigationStart", "navigationStart", jsonReader);
                    zq3.g(o, "missingProperty(...)");
                    throw o;
                }
                long longValue = l35.longValue();
                if (l34 == null) {
                    JsonDataException o2 = c29.o("unloadEventStart", "unloadEventStart", jsonReader);
                    zq3.g(o2, "missingProperty(...)");
                    throw o2;
                }
                long longValue2 = l34.longValue();
                if (l33 == null) {
                    JsonDataException o3 = c29.o("unloadEventEnd", "unloadEventEnd", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                long longValue3 = l33.longValue();
                if (l32 == null) {
                    JsonDataException o4 = c29.o("redirectStart", "redirectStart", jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                long longValue4 = l32.longValue();
                if (l31 == null) {
                    JsonDataException o5 = c29.o("redirectEnd", "redirectEnd", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                long longValue5 = l31.longValue();
                if (l30 == null) {
                    JsonDataException o6 = c29.o("fetchStart", "fetchStart", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                long longValue6 = l30.longValue();
                if (l29 == null) {
                    JsonDataException o7 = c29.o("domainLookupStart", "domainLookupStart", jsonReader);
                    zq3.g(o7, "missingProperty(...)");
                    throw o7;
                }
                long longValue7 = l29.longValue();
                if (l28 == null) {
                    JsonDataException o8 = c29.o("domainLookupEnd", "domainLookupEnd", jsonReader);
                    zq3.g(o8, "missingProperty(...)");
                    throw o8;
                }
                long longValue8 = l28.longValue();
                if (l27 == null) {
                    JsonDataException o9 = c29.o("connectStart", "connectStart", jsonReader);
                    zq3.g(o9, "missingProperty(...)");
                    throw o9;
                }
                long longValue9 = l27.longValue();
                if (l26 == null) {
                    JsonDataException o10 = c29.o("connectEnd", "connectEnd", jsonReader);
                    zq3.g(o10, "missingProperty(...)");
                    throw o10;
                }
                long longValue10 = l26.longValue();
                if (l25 == null) {
                    JsonDataException o11 = c29.o("secureConnectionStart", "secureConnectionStart", jsonReader);
                    zq3.g(o11, "missingProperty(...)");
                    throw o11;
                }
                long longValue11 = l25.longValue();
                if (l24 == null) {
                    JsonDataException o12 = c29.o("requestStart", "requestStart", jsonReader);
                    zq3.g(o12, "missingProperty(...)");
                    throw o12;
                }
                long longValue12 = l24.longValue();
                if (l23 == null) {
                    JsonDataException o13 = c29.o("responseStart", "responseStart", jsonReader);
                    zq3.g(o13, "missingProperty(...)");
                    throw o13;
                }
                long longValue13 = l23.longValue();
                if (l22 == null) {
                    JsonDataException o14 = c29.o("responseEnd", "responseEnd", jsonReader);
                    zq3.g(o14, "missingProperty(...)");
                    throw o14;
                }
                long longValue14 = l22.longValue();
                if (l15 == null) {
                    JsonDataException o15 = c29.o("domLoading", "domLoading", jsonReader);
                    zq3.g(o15, "missingProperty(...)");
                    throw o15;
                }
                long longValue15 = l15.longValue();
                if (l16 == null) {
                    JsonDataException o16 = c29.o("domInteractive", "domInteractive", jsonReader);
                    zq3.g(o16, "missingProperty(...)");
                    throw o16;
                }
                long longValue16 = l16.longValue();
                if (l17 == null) {
                    JsonDataException o17 = c29.o("domContentLoadedEventStart", "domContentLoadedEventStart", jsonReader);
                    zq3.g(o17, "missingProperty(...)");
                    throw o17;
                }
                long longValue17 = l17.longValue();
                if (l18 == null) {
                    JsonDataException o18 = c29.o("domContentLoadedEventEnd", "domContentLoadedEventEnd", jsonReader);
                    zq3.g(o18, "missingProperty(...)");
                    throw o18;
                }
                long longValue18 = l18.longValue();
                if (l19 == null) {
                    JsonDataException o19 = c29.o("domComplete", "domComplete", jsonReader);
                    zq3.g(o19, "missingProperty(...)");
                    throw o19;
                }
                long longValue19 = l19.longValue();
                if (l20 == null) {
                    JsonDataException o20 = c29.o("loadEventStart", "loadEventStart", jsonReader);
                    zq3.g(o20, "missingProperty(...)");
                    throw o20;
                }
                long longValue20 = l20.longValue();
                if (l21 != null) {
                    return new WebViewPerformanceTiming(longValue, longValue2, longValue3, longValue4, longValue5, longValue6, longValue7, longValue8, longValue9, longValue10, longValue11, longValue12, longValue13, longValue14, longValue15, longValue16, longValue17, longValue18, longValue19, longValue20, l21.longValue());
                }
                JsonDataException o21 = c29.o("loadEventEnd", "loadEventEnd", jsonReader);
                zq3.g(o21, "missingProperty(...)");
                throw o21;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 0:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x = c29.x("navigationStart", "navigationStart", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                case 1:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x2 = c29.x("unloadEventStart", "unloadEventStart", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l = l35;
                case 2:
                    l3 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        JsonDataException x3 = c29.x("unloadEventEnd", "unloadEventEnd", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l2 = l34;
                    l = l35;
                case 3:
                    l4 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l4 == null) {
                        JsonDataException x4 = c29.x("redirectStart", "redirectStart", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 4:
                    l5 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        JsonDataException x5 = c29.x("redirectEnd", "redirectEnd", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 5:
                    l6 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l6 == null) {
                        JsonDataException x6 = c29.x("fetchStart", "fetchStart", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 6:
                    l7 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l7 == null) {
                        JsonDataException x7 = c29.x("domainLookupStart", "domainLookupStart", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 7:
                    Long l36 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l36 == null) {
                        JsonDataException x8 = c29.x("domainLookupEnd", "domainLookupEnd", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    l8 = l36;
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 8:
                    l9 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l9 == null) {
                        JsonDataException x9 = c29.x("connectStart", "connectStart", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 9:
                    l10 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l10 == null) {
                        JsonDataException x10 = c29.x("connectEnd", "connectEnd", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 10:
                    l11 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l11 == null) {
                        JsonDataException x11 = c29.x("secureConnectionStart", "secureConnectionStart", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 11:
                    l12 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l12 == null) {
                        JsonDataException x12 = c29.x("requestStart", "requestStart", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    l14 = l22;
                    l13 = l23;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 12:
                    l13 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l13 == null) {
                        JsonDataException x13 = c29.x("responseStart", "responseStart", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    l14 = l22;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 13:
                    l14 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l14 == null) {
                        JsonDataException x14 = c29.x("responseEnd", "responseEnd", jsonReader);
                        zq3.g(x14, "unexpectedNull(...)");
                        throw x14;
                    }
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 14:
                    l15 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l15 == null) {
                        JsonDataException x15 = c29.x("domLoading", "domLoading", jsonReader);
                        zq3.g(x15, "unexpectedNull(...)");
                        throw x15;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 15:
                    l16 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l16 == null) {
                        JsonDataException x16 = c29.x("domInteractive", "domInteractive", jsonReader);
                        zq3.g(x16, "unexpectedNull(...)");
                        throw x16;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 16:
                    l17 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l17 == null) {
                        JsonDataException x17 = c29.x("domContentLoadedEventStart", "domContentLoadedEventStart", jsonReader);
                        zq3.g(x17, "unexpectedNull(...)");
                        throw x17;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 17:
                    l18 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l18 == null) {
                        JsonDataException x18 = c29.x("domContentLoadedEventEnd", "domContentLoadedEventEnd", jsonReader);
                        zq3.g(x18, "unexpectedNull(...)");
                        throw x18;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 18:
                    l19 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l19 == null) {
                        JsonDataException x19 = c29.x("domComplete", "domComplete", jsonReader);
                        zq3.g(x19, "unexpectedNull(...)");
                        throw x19;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 19:
                    l20 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l20 == null) {
                        JsonDataException x20 = c29.x("loadEventStart", "loadEventStart", jsonReader);
                        zq3.g(x20, "unexpectedNull(...)");
                        throw x20;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                case 20:
                    l21 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l21 == null) {
                        JsonDataException x21 = c29.x("loadEventEnd", "loadEventEnd", jsonReader);
                        zq3.g(x21, "unexpectedNull(...)");
                        throw x21;
                    }
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
                default:
                    l14 = l22;
                    l13 = l23;
                    l12 = l24;
                    l11 = l25;
                    l10 = l26;
                    l9 = l27;
                    l8 = l28;
                    l7 = l29;
                    l6 = l30;
                    l5 = l31;
                    l4 = l32;
                    l3 = l33;
                    l2 = l34;
                    l = l35;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewPerformanceTiming webViewPerformanceTiming) {
        zq3.h(hVar, "writer");
        if (webViewPerformanceTiming == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("navigationStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.m()));
        hVar.C("unloadEventStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.u()));
        hVar.C("unloadEventEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.t()));
        hVar.C("redirectStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.o()));
        hVar.C("redirectEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.n()));
        hVar.C("fetchStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.j()));
        hVar.C("domainLookupStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.i()));
        hVar.C("domainLookupEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.h()));
        hVar.C("connectStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.b()));
        hVar.C("connectEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.a()));
        hVar.C("secureConnectionStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.s()));
        hVar.C("requestStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.p()));
        hVar.C("responseStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.r()));
        hVar.C("responseEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.q()));
        hVar.C("domLoading");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.g()));
        hVar.C("domInteractive");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.f()));
        hVar.C("domContentLoadedEventStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.e()));
        hVar.C("domContentLoadedEventEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.d()));
        hVar.C("domComplete");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.c()));
        hVar.C("loadEventStart");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.l()));
        hVar.C("loadEventEnd");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewPerformanceTiming.k()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewPerformanceTiming");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
