package defpackage;

import android.content.ContentProvider;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class f92 extends ContentProvider {
    public static final a a = new a(null);
    private static final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, UUID uuid, String str2) {
            zq3.h(uuid, "callId");
            z38 z38Var = z38.a;
            String format = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2}, 4));
            zq3.g(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private a() {
        }
    }

    static {
        String name = f92.class.getName();
        zq3.g(name, "FacebookContentProvider::class.java.name");
        b = name;
    }
}
