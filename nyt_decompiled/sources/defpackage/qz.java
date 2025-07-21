package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public abstract class qz {
    public static final Api.ClientKey a;
    public static final Api.ClientKey b;
    private static final Api.AbstractClientBuilder c;
    private static final Api.AbstractClientBuilder d;
    public static final Api e;
    public static final Api f;
    public static final Api g;
    public static final r76 h;
    public static final a31 i;
    public static final j13 j;

    public static class a implements Api.ApiOptions.Optional {
        public static final a d = new C0518a().b();
        private final String a;
        private final boolean b;
        private final String c;

        public a(C0518a c0518a) {
            this.a = c0518a.a;
            this.b = c0518a.b.booleanValue();
            this.c = c0518a.c;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.a);
            bundle.putBoolean("force_save_dialog", this.b);
            bundle.putString("log_session_id", this.c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equal(this.a, aVar.a) && this.b == aVar.b && Objects.equal(this.c, aVar.c);
        }

        public int hashCode() {
            return Objects.hashCode(this.a, Boolean.valueOf(this.b), this.c);
        }

        /* renamed from: qz$a$a, reason: collision with other inner class name */
        public static class C0518a {
            protected String a;
            protected Boolean b;
            protected String c;

            public C0518a() {
                this.b = Boolean.FALSE;
            }

            public C0518a a(String str) {
                this.c = str;
                return this;
            }

            public a b() {
                return new a(this);
            }

            public C0518a(a aVar) {
                this.b = Boolean.FALSE;
                this.a = aVar.a;
                this.b = Boolean.valueOf(aVar.b);
                this.c = aVar.c;
            }
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        b = clientKey2;
        gbb gbbVar = new gbb();
        c = gbbVar;
        t5c t5cVar = new t5c();
        d = t5cVar;
        e = sz.c;
        f = new Api("Auth.CREDENTIALS_API", gbbVar, clientKey);
        g = new Api("Auth.GOOGLE_SIGN_IN_API", t5cVar, clientKey2);
        h = sz.d;
        i = new y8f();
        j = new kie();
    }
}
