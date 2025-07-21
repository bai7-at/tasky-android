package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class e {
    private final Uri a;
    private final String b;
    private final String c;

    public static final class a {
        public static final C0098a d = new C0098a(null);
        private Uri a;
        private String b;
        private String c;

        /* renamed from: androidx.navigation.e$a$a, reason: collision with other inner class name */
        public static final class C0098a {
            public /* synthetic */ C0098a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Uri uri) {
                zq3.h(uri, "uri");
                a aVar = new a(null);
                aVar.b(uri);
                return aVar;
            }

            private C0098a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return new e(this.a, this.b, this.c);
        }

        public final a b(Uri uri) {
            zq3.h(uri, "uri");
            this.a = uri;
            return this;
        }

        private a() {
        }
    }

    public e(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb.append(" action=");
            sb.append(a());
        }
        if (b() != null) {
            sb.append(" mimetype=");
            sb.append(b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        zq3.h(intent, "intent");
    }
}
