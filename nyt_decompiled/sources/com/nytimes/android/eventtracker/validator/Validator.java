package com.nytimes.android.eventtracker.validator;

import android.webkit.JavascriptInterface;
import com.nytimes.android.eventtracker.model.Event;
import defpackage.by0;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public interface Validator {
    public static final a Companion = a.a;

    @et3(generateAdapter = true)
    public static final class Result {
        private final Boolean a;
        private final boolean b;
        private final String c;
        private final List d;

        public Result(Boolean bool, boolean z, String str, List list) {
            zq3.h(str, "version");
            zq3.h(list, "messages");
            this.a = bool;
            this.b = z;
            this.c = str;
            this.d = list;
        }

        public final boolean a() {
            return this.b;
        }

        public final List b() {
            return this.d;
        }

        public final Boolean c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return zq3.c(this.a, result.a) && this.b == result.b && zq3.c(this.c, result.c) && zq3.c(this.d, result.d);
        }

        public int hashCode() {
            Boolean bool = this.a;
            return ((((((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Result(valid=" + this.a + ", flush=" + this.b + ", version=" + this.c + ", messages=" + this.d + ")";
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    Object a(Event event, by0 by0Var);

    @JavascriptInterface
    void log(String str);
}
