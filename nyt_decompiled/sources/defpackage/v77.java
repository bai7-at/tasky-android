package defpackage;

import com.nytimes.android.internal.graphql.exceptions.SamizdatException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class v77 implements u77 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String b(String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long n = h.n(str);
        String format = c().format(new Date(timeUnit.toMillis(n != null ? n.longValue() : 0L)));
        zq3.g(format, "format(...)");
        return format;
    }

    private final DateFormat c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    @Override // defpackage.u77
    public SamizdatException a(int i, Response response) {
        zq3.h(response, "response");
        int code = response.code();
        String header$default = Response.header$default(response, "NYT-Error", null, 2, null);
        String header = response.request().header("NYT-Timestamp");
        SamizdatException samizdatException = new SamizdatException(i, code, header$default, header != null ? b(header) : null, Response.header$default(response, "date", null, 2, null), null, 32, null);
        ul8.a.z("Network").e(samizdatException);
        return samizdatException;
    }
}
