package com.facebook.appevents.cloudbridge;

import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventType;
import defpackage.du8;
import defpackage.g29;
import defpackage.g62;
import defpackage.k94;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AppEventsConversionsAPITransformer {
    public static final AppEventsConversionsAPITransformer a = new AppEventsConversionsAPITransformer();
    private static final Map b;
    public static final Map c;
    public static final Map d;

    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");

        public static final a Companion = new a(null);
        private final String rawValue;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DataProcessingParameterName a(String str) {
                zq3.h(str, "rawValue");
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.valuesCustom()) {
                    if (zq3.c(dataProcessingParameterName.getRawValue(), str)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }

            private a() {
            }
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static DataProcessingParameterName[] valuesCustom() {
            DataProcessingParameterName[] valuesCustom = values();
            return (DataProcessingParameterName[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;

        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ValueTransformationType a(String str) {
                zq3.h(str, "rawValue");
                if (!zq3.c(str, AppEventUserAndAppDataField.EXT_INFO.getRawValue()) && !zq3.c(str, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue()) && !zq3.c(str, CustomEventField.CONTENT_IDS.getRawValue()) && !zq3.c(str, CustomEventField.CONTENTS.getRawValue()) && !zq3.c(str, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    if (!zq3.c(str, AppEventUserAndAppDataField.ADV_TE.getRawValue()) && !zq3.c(str, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                        if (zq3.c(str, CustomEventField.EVENT_TIME.getRawValue())) {
                            return ValueTransformationType.INT;
                        }
                        return null;
                    }
                    return ValueTransformationType.BOOL;
                }
                return ValueTransformationType.ARRAY;
            }

            private a() {
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ValueTransformationType[] valuesCustom() {
            ValueTransformationType[] valuesCustom = values();
            return (ValueTransformationType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class a {
        private ConversionsAPISection a;
        private ConversionsAPICustomEventField b;

        public a(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            zq3.h(conversionsAPICustomEventField, "field");
            this.a = conversionsAPISection;
            this.b = conversionsAPICustomEventField;
        }

        public final ConversionsAPICustomEventField a() {
            return this.b;
        }

        public final ConversionsAPISection b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.a;
            return ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    public static final class b {
        private ConversionsAPISection a;
        private ConversionsAPIUserAndAppDataField b;

        public b(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            zq3.h(conversionsAPISection, "section");
            this.a = conversionsAPISection;
            this.b = conversionsAPIUserAndAppDataField;
        }

        public final ConversionsAPIUserAndAppDataField a() {
            return this.b;
        }

        public final ConversionsAPISection b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.b;
            return hashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ValueTransformationType.valuesCustom().length];
            iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            iArr[ValueTransformationType.INT.ordinal()] = 3;
            a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.valuesCustom().length];
            iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            b = iArr2;
            int[] iArr3 = new int[AppEventType.valuesCustom().length];
            iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair a2 = du8.a(appEventUserAndAppDataField, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair a3 = du8.a(AppEventUserAndAppDataField.APP_USER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair a4 = du8.a(AppEventUserAndAppDataField.ADVERTISER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair a5 = du8.a(AppEventUserAndAppDataField.PAGE_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair a6 = du8.a(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        b = t.m(a2, a3, a4, a5, a6, du8.a(appEventUserAndAppDataField2, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), du8.a(AppEventUserAndAppDataField.APP_TE, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), du8.a(AppEventUserAndAppDataField.CONSIDER_VIEWS, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), du8.a(AppEventUserAndAppDataField.DEVICE_TOKEN, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), du8.a(AppEventUserAndAppDataField.EXT_INFO, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), du8.a(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), du8.a(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), du8.a(AppEventUserAndAppDataField.INSTALL_REFERRER, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), du8.a(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), du8.a(AppEventUserAndAppDataField.RECEIPT_DATA, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), du8.a(AppEventUserAndAppDataField.URL_SCHEMES, new b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), du8.a(AppEventUserAndAppDataField.USER_DATA, new b(conversionsAPISection, null)));
        Pair a7 = du8.a(CustomEventField.EVENT_TIME, new a(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair a8 = du8.a(CustomEventField.EVENT_NAME, new a(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        c = t.m(a7, a8, du8.a(customEventField, new a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), du8.a(CustomEventField.CONTENT_IDS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), du8.a(CustomEventField.CONTENTS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), du8.a(CustomEventField.CONTENT_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), du8.a(CustomEventField.CURRENCY, new a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), du8.a(CustomEventField.DESCRIPTION, new a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), du8.a(CustomEventField.LEVEL, new a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), du8.a(CustomEventField.MAX_RATING_VALUE, new a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), du8.a(CustomEventField.NUM_ITEMS, new a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), du8.a(CustomEventField.PAYMENT_INFO_AVAILABLE, new a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), du8.a(CustomEventField.REGISTRATION_METHOD, new a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), du8.a(CustomEventField.SEARCH_STRING, new a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), du8.a(CustomEventField.SUCCESS, new a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), du8.a(CustomEventField.ORDER_ID, new a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), du8.a(CustomEventField.AD_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        d = t.m(du8.a("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), du8.a("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), du8.a("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), du8.a("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), du8.a("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), du8.a("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), du8.a("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), du8.a("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), du8.a("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), du8.a("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), du8.a("fb_mobile_rate", ConversionsAPIEventName.RATED), du8.a("fb_mobile_search", ConversionsAPIEventName.SEARCHED), du8.a("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), du8.a("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    private AppEventsConversionsAPITransformer() {
    }

    private final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map2 = (Map) it2.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), obj);
        return i.e(linkedHashMap);
    }

    private final AppEventType f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.a aVar = AppEventType.Companion;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        AppEventType a2 = aVar.a((String) obj);
        if (a2 == AppEventType.OTHER) {
            return a2;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            AppEventUserAndAppDataField a3 = AppEventUserAndAppDataField.Companion.a(str);
            if (a3 != null) {
                a.g(map2, map3, a3, value);
            } else {
                boolean c2 = zq3.c(str, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                boolean z = value instanceof String;
                if (a2 == AppEventType.CUSTOM && c2 && z) {
                    ArrayList k = k((String) value);
                    if (k != null) {
                        arrayList.addAll(k);
                    }
                } else if (DataProcessingParameterName.Companion.a(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return a2;
    }

    private final void h(Map map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        b bVar = (b) b.get(appEventUserAndAppDataField);
        ConversionsAPIUserAndAppDataField a2 = bVar == null ? null : bVar.a();
        if (a2 == null) {
            return;
        }
        map.put(a2.getRawValue(), obj);
    }

    private final void i(Map map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
            try {
                g29 g29Var = g29.a;
                map.putAll(g29.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e) {
                k94.e.c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e);
                return;
            }
        }
        b bVar = (b) b.get(appEventUserAndAppDataField);
        ConversionsAPIUserAndAppDataField a2 = bVar == null ? null : bVar.a();
        if (a2 == null) {
            return;
        }
        map.put(a2.getRawValue(), obj);
    }

    private final String j(String str) {
        Map map = d;
        if (!map.containsKey(str)) {
            return str;
        }
        ConversionsAPIEventName conversionsAPIEventName = (ConversionsAPIEventName) map.get(str);
        return conversionsAPIEventName == null ? "" : conversionsAPIEventName.getRawValue();
    }

    public static final ArrayList k(String str) {
        zq3.h(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            g29 g29Var = g29.a;
            for (String str2 : g29.m(new JSONArray(str))) {
                g29 g29Var2 = g29.a;
                arrayList.add(g29.n(new JSONObject(str2)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str3 : map.keySet()) {
                    CustomEventField a2 = CustomEventField.Companion.a(str3);
                    a aVar = (a) c.get(a2);
                    if (a2 != null && aVar != null) {
                        ConversionsAPISection b2 = aVar.b();
                        if (b2 == null) {
                            try {
                                String rawValue = aVar.a().getRawValue();
                                if (a2 == CustomEventField.EVENT_NAME && ((String) map.get(str3)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = a;
                                    Object obj = map.get(str3);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.j((String) obj));
                                } else if (a2 == CustomEventField.EVENT_TIME && ((Integer) map.get(str3)) != null) {
                                    Object obj2 = map.get(str3);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    Object l = l(str3, obj2);
                                    if (l == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    linkedHashMap2.put(rawValue, l);
                                }
                            } catch (ClassCastException e) {
                                k94.e.c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", g62.b(e));
                            }
                        } else if (b2 == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = aVar.a().getRawValue();
                            Object obj3 = map.get(str3);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object l2 = l(str3, obj3);
                            if (l2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(rawValue2, l2);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e2) {
            k94.e.c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object l(String str, Object obj) {
        zq3.h(str, "field");
        zq3.h(obj, "value");
        ValueTransformationType a2 = ValueTransformationType.Companion.a(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (a2 == null || str2 == null) {
            return obj;
        }
        int i = c.a[a2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return h.l(obj.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer l = h.l(str2.toString());
            if (l != null) {
                return Boolean.valueOf(l.intValue() != 0);
            }
            return null;
        }
        try {
            g29 g29Var = g29.a;
            List<??> m = g29.m(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? r1 : m) {
                try {
                    try {
                        g29 g29Var2 = g29.a;
                        r1 = g29.n(new JSONObject((String) r1));
                    } catch (JSONException unused) {
                        g29 g29Var3 = g29.a;
                        r1 = g29.m(new JSONArray((String) r1));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(r1);
            }
            return arrayList;
        } catch (JSONException e) {
            k94.e.c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e);
            return ww8.a;
        }
    }

    public final List a(AppEventType appEventType, Map map, Map map2, Map map3, List list, Object obj) {
        zq3.h(appEventType, "eventType");
        zq3.h(map, "userData");
        zq3.h(map2, "appData");
        zq3.h(map3, "restOfData");
        zq3.h(list, "customEvents");
        Map d2 = d(map, map2, map3);
        int i = c.c[appEventType.ordinal()];
        if (i == 1) {
            return c(d2, obj);
        }
        if (i != 2) {
            return null;
        }
        return b(d2, list);
    }

    public final Map d(Map map, Map map2, Map map3) {
        zq3.h(map, "userData");
        zq3.h(map2, "appData");
        zq3.h(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), map);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List e(Map map) {
        zq3.h(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType f = f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f == AppEventType.OTHER) {
            return null;
        }
        return a(f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    public final void g(Map map, Map map2, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        zq3.h(map, "userData");
        zq3.h(map2, "appData");
        zq3.h(appEventUserAndAppDataField, "field");
        zq3.h(obj, "value");
        b bVar = (b) b.get(appEventUserAndAppDataField);
        if (bVar == null) {
            return;
        }
        int i = c.b[bVar.b().ordinal()];
        if (i == 1) {
            h(map2, appEventUserAndAppDataField, obj);
        } else {
            if (i != 2) {
                return;
            }
            i(map, appEventUserAndAppDataField, obj);
        }
    }
}
