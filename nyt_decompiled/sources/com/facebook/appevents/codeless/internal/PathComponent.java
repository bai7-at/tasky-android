package com.facebook.appevents.codeless.internal;

import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PathComponent {
    public static final a i = new a(null);
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;

    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] valuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PathComponent(JSONObject jSONObject) {
        zq3.h(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        zq3.g(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        zq3.g(optString, "component.optString(PATH_TEXT_KEY)");
        this.d = optString;
        String optString2 = jSONObject.optString("tag");
        zq3.g(optString2, "component.optString(PATH_TAG_KEY)");
        this.e = optString2;
        String optString3 = jSONObject.optString("description");
        zq3.g(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = optString3;
        String optString4 = jSONObject.optString("hint");
        zq3.g(optString4, "component.optString(PATH_HINT_KEY)");
        this.g = optString4;
        this.h = jSONObject.optInt("match_bitmask");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.h;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.d;
    }
}
