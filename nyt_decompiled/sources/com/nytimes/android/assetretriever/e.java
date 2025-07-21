package com.nytimes.android.assetretriever;

import android.content.Intent;
import android.os.Bundle;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class e {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Bundle bundle) {
            zq3.h(bundle, "bundle");
            return c(bundle.getString("com.nytimes.android.extra.ASSET_URI"), bundle.getString("com.nytimes.android.extra.ASSET_URL"));
        }

        public final e b(Intent intent) {
            zq3.h(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            return a(extras);
        }

        public final e c(String str, String str2) {
            if (str != null) {
                return new b(str);
            }
            if (str2 != null) {
                return new c(str2);
            }
            throw new Exception("Both uri and url are null");
        }

        private a() {
        }
    }

    public static final class b extends e {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            zq3.h(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Uri(uri=" + this.a + ")";
        }
    }

    public static final class c extends e {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            zq3.h(str, "url");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Url(url=" + this.a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
