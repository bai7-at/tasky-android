package okhttp3.logging;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ad0;
import defpackage.gm0;
import defpackage.i63;
import defpackage.sd0;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* loaded from: classes5.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    zq3.h(str, "message");
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || h.w(str, "identity", true) || h.w(str, EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP, true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        this.logger.log(headers.name(i) + ": " + value);
    }

    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m1105deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        char c;
        String sb;
        Charset charset;
        Long l;
        zq3.h(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(request.url());
        sb2.append(connection != null ? zq3.q(" ", connection.protocol()) : "");
        String sb3 = sb2.toString();
        if (!z2 && body != null) {
            sb3 = sb3 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb3);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log(zq3.q("Content-Type: ", contentType));
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(zq3.q("Content-Length: ", Long.valueOf(body.contentLength())));
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!z || body == null) {
                this.logger.log(zq3.q("--> END ", request.method()));
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (body.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (body.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                ad0 ad0Var = new ad0();
                body.writeTo(ad0Var);
                MediaType contentType2 = body.contentType();
                Charset charset2 = contentType2 == null ? null : contentType2.charset(StandardCharsets.UTF_8);
                if (charset2 == null) {
                    charset2 = StandardCharsets.UTF_8;
                    zq3.g(charset2, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(ad0Var)) {
                    this.logger.log(ad0Var.V0(charset2));
                    this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            zq3.e(body2);
            long contentLength = body2.contentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(proceed.code());
            if (proceed.message().length() == 0) {
                str = "-byte body omitted)";
                sb = "";
                c = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb5 = new StringBuilder();
                str = "-byte body omitted)";
                c = ' ';
                sb5.append(' ');
                sb5.append(message);
                sb = sb5.toString();
            }
            sb4.append(sb);
            sb4.append(c);
            sb4.append(proceed.request().url());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z2 ? "" : ", " + str2 + " body");
            sb4.append(')');
            logger.log(sb4.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z || !HttpHeaders.promisesBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    sd0 source = body2.source();
                    source.request(Long.MAX_VALUE);
                    ad0 g = source.g();
                    if (h.w(EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP, headers2.get("Content-Encoding"), true)) {
                        l = Long.valueOf(g.h1());
                        i63 i63Var = new i63(g.clone());
                        try {
                            g = new ad0();
                            g.I0(i63Var);
                            charset = null;
                            gm0.a(i63Var, null);
                        } finally {
                        }
                    } else {
                        charset = null;
                        l = null;
                    }
                    MediaType contentType3 = body2.contentType();
                    Charset charset3 = contentType3 == null ? charset : contentType3.charset(StandardCharsets.UTF_8);
                    if (charset3 == null) {
                        charset3 = StandardCharsets.UTF_8;
                        zq3.g(charset3, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(g)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + g.h1() + str);
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(g.clone().V0(charset3));
                    }
                    if (l != null) {
                        this.logger.log("<-- END HTTP (" + g.h1() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + g.h1() + "-byte body)");
                    }
                }
            }
            return proceed;
        } catch (Exception e) {
            this.logger.log(zq3.q("<-- HTTP FAILED: ", e));
            throw e;
        }
    }

    public final void level(Level level) {
        zq3.h(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        TreeSet treeSet = new TreeSet(h.y(z38.a));
        i.B(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        zq3.h(level, "level");
        level(level);
        return this;
    }

    public HttpLoggingInterceptor(Logger logger) {
        zq3.h(logger, "logger");
        this.logger = logger;
        this.headersToRedact = b0.e();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
