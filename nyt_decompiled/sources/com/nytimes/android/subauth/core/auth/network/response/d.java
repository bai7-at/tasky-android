package com.nytimes.android.subauth.core.auth.network.response;

import com.nytimes.android.subauth.core.auth.network.response.e;
import defpackage.ul8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public static final a Companion = new a(null);
    private final String a;
    private final JSONObject b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            zq3.h(str, "rawTargetingData");
            try {
                return new e.b(new d(str, null));
            } catch (JSONException e) {
                String str2 = "failed to parse " + str;
                ul8.a.f(e, str2, new Object[0]);
                return new e.a.c(e, str2);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        try {
            Result.a aVar = Result.a;
            return Result.b(this.b.toString(2));
        } catch (Exception e) {
            Result.a aVar2 = Result.a;
            return Result.b(f.a(e));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "TargetingData(rawTargetingData=" + this.a + ")";
    }

    private d(String str) {
        this.a = str;
        this.b = new JSONObject(str);
    }
}
