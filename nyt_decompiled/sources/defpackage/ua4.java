package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import java.nio.charset.Charset;
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
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class ua4 implements ky6 {
    public static final a c = new a(null);
    private static final byte[] d;
    private static final byte[] e;
    private static final byte[] f;
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
        Charset charset = yj0.b;
        byte[] bytes = ",".getBytes(charset);
        zq3.g(bytes, "getBytes(...)");
        d = bytes;
        byte[] bytes2 = "[".getBytes(charset);
        zq3.g(bytes2, "getBytes(...)");
        e = bytes2;
        byte[] bytes3 = "]".getBytes(charset);
        zq3.g(bytes3, "getBytes(...)");
        f = bytes3;
    }

    public ua4(String str, InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = str;
        this.b = internalLogger;
    }

    private final Map b(String str, String str2, String str3, String str4) {
        return t.m(du8.a("DD-API-KEY", str2), du8.a("DD-EVP-ORIGIN", str3), du8.a("DD-EVP-ORIGIN-VERSION", str4), du8.a("DD-REQUEST-ID", str));
    }

    private final String c(String str, ua1 ua1Var) {
        Locale locale = Locale.US;
        String str2 = this.a;
        if (str2 == null) {
            str2 = ua1Var.i().getIntakeEndpoint();
        }
        String format = String.format(locale, "%s/api/v2/logs?%s=%s", Arrays.copyOf(new Object[]{str2, "ddsource", str}, 3));
        zq3.g(format, "format(...)");
        return format;
    }

    @Override // defpackage.ky6
    public dy6 a(ua1 ua1Var, iy6 iy6Var, List list, byte[] bArr) {
        zq3.h(ua1Var, "context");
        zq3.h(iy6Var, "executionContext");
        zq3.h(list, "batchData");
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "randomUUID().toString()");
        String c2 = c(ua1Var.j(), ua1Var);
        Map b = b(uuid, ua1Var.b(), ua1Var.j(), ua1Var.g());
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((bp6) it2.next()).a());
        }
        return new dy6(uuid, "Logs Request", c2, b, ByteArrayExtKt.b(arrayList, d, e, f, this.b), Constants.APPLICATION_JSON);
    }
}
