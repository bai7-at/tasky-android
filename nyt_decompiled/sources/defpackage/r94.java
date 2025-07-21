package defpackage;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.logging.remote.stream.data.JsonObjectAdapter;
import com.nytimes.android.logging.remote.stream.data.LoggerRemoteStreamMessage;
import com.nytimes.android.logging.remote.stream.data.LoggerRemoteStreamMessageData;
import com.nytimes.android.logging.remote.stream.data.LoggerRemoteStreamMessageKind;
import com.nytimes.android.logging.remote.stream.data.LoggerRemoteStreamMessageLocation;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.gw6;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class r94 {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private static final Pattern g = Pattern.compile("(\\$\\d+)+$");
    private final String a;
    private final String b;
    private final String c;
    private final i d;
    private JsonAdapter e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r94(String str, String str2, String str3) {
        zq3.h(str3, "sessionId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        i d = new i.b().b(new JsonObjectAdapter()).d();
        this.d = d;
        JsonAdapter c = d.c(LoggerRemoteStreamMessage.class);
        zq3.g(c, "adapter(...)");
        this.e = c;
    }

    private final LoggerRemoteStreamMessage b(StackTraceElement stackTraceElement, long j, int i, gw6 gw6Var, String str, String str2) {
        String fileName = stackTraceElement != null ? stackTraceElement.getFileName() : null;
        String str3 = EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
        if (fileName == null) {
            fileName = EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
        }
        String f2 = f(stackTraceElement);
        if (f2 != null) {
            str3 = f2;
        }
        LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind = new LoggerRemoteStreamMessageKind(new LoggerRemoteStreamMessageData(j, i, new LoggerRemoteStreamMessageLocation(fileName, str3, stackTraceElement != null ? stackTraceElement.getLineNumber() : -1), str == null ? "" : str, str2), gw6Var.a());
        String str4 = this.c;
        String str5 = this.a;
        String str6 = str5 == null ? DatasetUtils.UNKNOWN_IDENTITY_ID : str5;
        String str7 = this.b;
        String str8 = str7 == null ? DatasetUtils.UNKNOWN_IDENTITY_ID : str7;
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        return new LoggerRemoteStreamMessage(str4, str6, null, str8, loggerRemoteStreamMessageKind, uuid, 4, null);
    }

    static /* synthetic */ LoggerRemoteStreamMessage c(r94 r94Var, StackTraceElement stackTraceElement, long j, int i, gw6 gw6Var, String str, String str2, int i2, Object obj) {
        return r94Var.b(stackTraceElement, (i2 & 2) != 0 ? Calendar.getInstance().getTimeInMillis() : j, i, gw6Var, str, str2);
    }

    private final StackTraceElement d(gw6 gw6Var) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = gw6Var instanceof gw6.b ? 12 : 5;
        if (stackTrace.length > i) {
            return stackTrace[i];
        }
        return null;
    }

    private final String e(Throwable th) {
        if (th == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private final String f(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return null;
        }
        String className = stackTraceElement.getClassName();
        Matcher matcher = g.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        zq3.e(className);
        zq3.e(className);
        String substring = className.substring(h.g0(className, '.', 0, false, 6, null) + 1);
        zq3.g(substring, "substring(...)");
        if (substring.length() <= 23) {
            zq3.e(substring);
            return substring;
        }
        zq3.e(substring);
        String substring2 = substring.substring(0, 23);
        zq3.g(substring2, "substring(...)");
        return substring2;
    }

    private final LoggerRemoteStreamMessage g(int i, String str, Throwable th, Object... objArr) {
        gw6.b bVar = gw6.b.b;
        return c(this, d(bVar), 0L, i, bVar, str, e(th), 2, null);
    }

    public final String a(int i, String str, Throwable th, Object... objArr) {
        zq3.h(objArr, "args");
        String json = this.e.toJson(g(i, str, th, objArr));
        zq3.g(json, "toJson(...)");
        return json;
    }
}
