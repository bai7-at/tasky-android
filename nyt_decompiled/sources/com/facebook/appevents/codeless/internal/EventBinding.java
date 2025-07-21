package com.facebook.appevents.codeless.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.po5;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class EventBinding {
    public static final a j = new a(null);
    private final String a;
    private final MappingMethod b;
    private final ActionType c;
    private final String d;
    private final List e;
    private final List f;
    private final String g;
    private final String h;
    private final String i;

    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] valuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventBinding a(JSONObject jSONObject) {
            int length;
            zq3.h(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            zq3.g(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            zq3.g(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            zq3.g(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            zq3.g(string3, "mapping.getString(\"event_type\")");
            zq3.g(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            zq3.g(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i = 0;
            if (length2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    zq3.g(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i3 >= length2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                    zq3.g(jSONObject3, "jsonParameter");
                    arrayList2.add(new po5(jSONObject3));
                    if (i4 >= length) {
                        break;
                    }
                    i = i4;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            zq3.g(string, "eventName");
            zq3.g(string4, "appVersion");
            zq3.g(optString2, "componentId");
            zq3.g(optString, "pathType");
            zq3.g(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            zq3.g(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private a() {
        }
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List list, List list2, String str3, String str4, String str5) {
        zq3.h(str, "eventName");
        zq3.h(mappingMethod, "method");
        zq3.h(actionType, TransferTable.COLUMN_TYPE);
        zq3.h(str2, "appVersion");
        zq3.h(list, "path");
        zq3.h(list2, "parameters");
        zq3.h(str3, "componentId");
        zq3.h(str4, "pathType");
        zq3.h(str5, "activityName");
        this.a = str;
        this.b = mappingMethod;
        this.c = actionType;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.a;
    }

    public final List c() {
        List unmodifiableList = Collections.unmodifiableList(this.f);
        zq3.g(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List d() {
        List unmodifiableList = Collections.unmodifiableList(this.e);
        zq3.g(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
