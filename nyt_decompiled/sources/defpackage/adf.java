package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class adf implements Api.ApiOptions.Optional {
    private final String a;

    public static class a {
        private String a;

        private a() {
        }

        public static a a(adf adfVar) {
            a aVar = new a();
            String b = adfVar.b();
            if (b != null) {
                aVar.b(b);
            }
            return aVar;
        }

        public final a b(String str) {
            this.a = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final adf c() {
            return new adf(this.a);
        }
    }

    public adf(String str) {
        this.a = str;
    }

    public static a c() {
        return new a();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.a);
        return bundle;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof adf;
    }

    public final int hashCode() {
        return Objects.hashCode(adf.class);
    }
}
