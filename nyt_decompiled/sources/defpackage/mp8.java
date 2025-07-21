package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class mp8 implements ky6 {
    public static final a c = new a(null);
    private static final byte[] d;
    private final String a;
    private final InternalLogger b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        byte[] bytes = "\n".getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        d = bytes;
    }

    public mp8(String str, InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = str;
        this.b = internalLogger;
    }

    private final Map b(String str, String str2, String str3, String str4) {
        return t.m(du8.a("DD-API-KEY", str2), du8.a("DD-EVP-ORIGIN", str3), du8.a("DD-EVP-ORIGIN-VERSION", str4), du8.a("DD-REQUEST-ID", str));
    }

    @Override // defpackage.ky6
    public dy6 a(ua1 ua1Var, iy6 iy6Var, List list, byte[] bArr) {
        zq3.h(ua1Var, "context");
        zq3.h(iy6Var, "executionContext");
        zq3.h(list, "batchData");
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "randomUUID().toString()");
        Locale locale = Locale.US;
        String str = this.a;
        if (str == null) {
            str = ua1Var.i().getIntakeEndpoint();
        }
        String format = String.format(locale, "%s/api/v2/spans", Arrays.copyOf(new Object[]{str}, 1));
        zq3.g(format, "format(...)");
        Map b = b(uuid, ua1Var.b(), ua1Var.j(), ua1Var.g());
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((bp6) it2.next()).a());
        }
        return new dy6(uuid, "Traces Request", format, b, ByteArrayExtKt.c(arrayList, d, null, null, this.b, 6, null), "text/plain;charset=UTF-8");
    }
}
