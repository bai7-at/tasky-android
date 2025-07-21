package defpackage;

import coil.network.CacheResponse;
import coil.util.Time;
import com.amazonaws.services.s3.Headers;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class mg0 {
    public static final a c = new a(null);
    private final Request a;
    private final CacheResponse b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            return h.w("Content-Length", str, true) || h.w("Content-Encoding", str, true) || h.w("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (h.w(Headers.CONNECTION, str, true) || h.w("Keep-Alive", str, true) || h.w("Proxy-Authenticate", str, true) || h.w("Proxy-Authorization", str, true) || h.w("TE", str, true) || h.w("Trailers", str, true) || h.w("Transfer-Encoding", str, true) || h.w("Upgrade", str, true)) ? false : true;
        }

        public final okhttp3.Headers a(okhttp3.Headers headers, okhttp3.Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!h.w("Warning", name, true) || !h.K(value, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, 2, null)) && (d(name) || !e(name) || headers2.get(name) == null)) {
                    builder.add(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!d(name2) && e(name2)) {
                    builder.add(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        public final boolean b(Request request, CacheResponse cacheResponse) {
            return (request.cacheControl().noStore() || cacheResponse.a().noStore() || zq3.c(cacheResponse.d().get("Vary"), "*")) ? false : true;
        }

        public final boolean c(Request request, Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || zq3.c(response.headers().get("Vary"), "*")) ? false : true;
        }

        private a() {
        }
    }

    public static final class b {
        private final Request a;
        private final CacheResponse b;
        private Date c;
        private String d;
        private Date e;
        private String f;
        private Date g;
        private long h;
        private long i;
        private String j;
        private int k;

        public b(Request request, CacheResponse cacheResponse) {
            this.a = request;
            this.b = cacheResponse;
            this.k = -1;
            if (cacheResponse != null) {
                this.h = cacheResponse.e();
                this.i = cacheResponse.c();
                okhttp3.Headers d = cacheResponse.d();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    String name = d.name(i);
                    if (h.w(name, "Date", true)) {
                        this.c = d.getDate("Date");
                        this.d = d.value(i);
                    } else if (h.w(name, com.amazonaws.services.s3.Headers.EXPIRES, true)) {
                        this.g = d.getDate(com.amazonaws.services.s3.Headers.EXPIRES);
                    } else if (h.w(name, com.amazonaws.services.s3.Headers.LAST_MODIFIED, true)) {
                        this.e = d.getDate(com.amazonaws.services.s3.Headers.LAST_MODIFIED);
                        this.f = d.value(i);
                    } else if (h.w(name, com.amazonaws.services.s3.Headers.ETAG, true)) {
                        this.j = d.value(i);
                    } else if (h.w(name, "Age", true)) {
                        this.k = s.y(d.value(i), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.c;
            long max = date != null ? Math.max(0L, this.i - date.getTime()) : 0L;
            int i = this.k;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            return max + (this.i - this.h) + (Time.a.a() - this.i);
        }

        private final long c() {
            CacheResponse cacheResponse = this.b;
            zq3.e(cacheResponse);
            if (cacheResponse.a().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.g;
            if (date != null) {
                Date date2 = this.c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.e == null || this.a.url().query() != null) {
                return 0L;
            }
            Date date3 = this.c;
            long time2 = date3 != null ? date3.getTime() : this.h;
            Date date4 = this.e;
            zq3.e(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean d(Request request) {
            return (request.header(com.amazonaws.services.s3.Headers.GET_OBJECT_IF_MODIFIED_SINCE) == null && request.header(com.amazonaws.services.s3.Headers.GET_OBJECT_IF_NONE_MATCH) == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final mg0 b() {
            String str;
            CacheResponse cacheResponse = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.b == null) {
                return new mg0(this.a, cacheResponse, objArr12 == true ? 1 : 0);
            }
            if (this.a.isHttps() && !this.b.f()) {
                return new mg0(this.a, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            CacheControl a = this.b.a();
            if (!mg0.c.b(this.a, this.b)) {
                return new mg0(this.a, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            CacheControl cacheControl = this.a.cacheControl();
            if (cacheControl.noCache() || d(this.a)) {
                return new mg0(this.a, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long a2 = a();
            long c = c();
            if (cacheControl.maxAgeSeconds() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long j = 0;
            long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!a.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!a.noCache() && a2 + millis < c + j) {
                return new mg0(objArr7 == true ? 1 : 0, this.b, objArr6 == true ? 1 : 0);
            }
            String str2 = this.j;
            if (str2 != null) {
                zq3.e(str2);
                str = com.amazonaws.services.s3.Headers.GET_OBJECT_IF_NONE_MATCH;
            } else {
                Date date = this.e;
                str = com.amazonaws.services.s3.Headers.GET_OBJECT_IF_MODIFIED_SINCE;
                if (date != null) {
                    str2 = this.f;
                    zq3.e(str2);
                } else {
                    if (this.c == null) {
                        return new mg0(this.a, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.d;
                    zq3.e(str2);
                }
            }
            return new mg0(this.a.newBuilder().addHeader(str, str2).build(), this.b, objArr5 == true ? 1 : 0);
        }
    }

    public /* synthetic */ mg0(Request request, CacheResponse cacheResponse, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cacheResponse);
    }

    public final CacheResponse a() {
        return this.b;
    }

    public final Request b() {
        return this.a;
    }

    private mg0(Request request, CacheResponse cacheResponse) {
        this.a = request;
        this.b = cacheResponse;
    }
}
