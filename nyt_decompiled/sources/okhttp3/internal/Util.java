package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import co.datadome.sdk.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.ad0;
import defpackage.an3;
import defpackage.bk3;
import defpackage.g62;
import defpackage.gm0;
import defpackage.ku8;
import defpackage.no;
import defpackage.px7;
import defpackage.qd0;
import defpackage.qm3;
import defpackage.qs2;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.tk5;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.yt7;
import defpackage.z38;
import defpackage.zq3;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.Regex;
import kotlin.text.h;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final tk5 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        tk5.a aVar = tk5.d;
        ByteString.a aVar2 = ByteString.c;
        UNICODE_BOMS = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        zq3.e(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        zq3.g(name, "OkHttpClient::class.java.name");
        okHttpName = h.w0(h.v0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        zq3.h(list, "<this>");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        zq3.h(eventListener, "<this>");
        return new EventListener.Factory() { // from class: u19
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener asFactory$lambda$8;
                asFactory$lambda$8 = Util.asFactory$lambda$8(EventListener.this, call);
                return asFactory$lambda$8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        zq3.h(eventListener, "$this_asFactory");
        zq3.h(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        zq3.h(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        zq3.h(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        zq3.h(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.d(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        zq3.h(httpUrl, "<this>");
        zq3.h(httpUrl2, "other");
        return zq3.c(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && zq3.c(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (j < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        zq3.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        zq3.h(strArr, "<this>");
        zq3.h(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        zq3.g(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[d.e0(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "delimiters");
        while (i < i2) {
            if (h.O(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(px7 px7Var, int i, TimeUnit timeUnit) {
        zq3.h(px7Var, "<this>");
        zq3.h(timeUnit, "timeUnit");
        try {
            return skipAll(px7Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, ss2 ss2Var) {
        zq3.h(iterable, "<this>");
        zq3.h(ss2Var, "predicate");
        List<T> l = i.l();
        for (T t : iterable) {
            if (((Boolean) ss2Var.invoke(t)).booleanValue()) {
                if (l.isEmpty()) {
                    l = new ArrayList<>();
                }
                zq3.f(l, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                ku8.c(l).add(t);
            }
        }
        return l;
    }

    public static final String format(String str, Object... objArr) {
        zq3.h(str, "format");
        zq3.h(objArr, "args");
        z38 z38Var = z38.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        zq3.g(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        zq3.h(strArr, "<this>");
        zq3.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a = no.a(strArr2);
                while (a.hasNext()) {
                    if (comparator.compare(str, (String) a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        zq3.h(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        try {
            qs2Var.mo865invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        zq3.h(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(i.o(Arrays.copyOf(objArr, objArr.length)));
        zq3.g(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        zq3.h(strArr, "<this>");
        zq3.h(str, "value");
        zq3.h(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        zq3.h(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (zq3.j(charAt, 31) <= 0 || zq3.j(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        zq3.h(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        zq3.h(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        zq3.h(str, "<this>");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        zq3.h(strArr, "<this>");
        zq3.h(strArr2, "other");
        zq3.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        zq3.h(fileSystem, "<this>");
        zq3.h(file, TransferTable.COLUMN_FILE);
        yt7 sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                gm0.a(sink, null);
                return true;
            } catch (IOException unused) {
                ww8 ww8Var = ww8.a;
                gm0.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(Socket socket, sd0 sd0Var) {
        zq3.h(socket, "<this>");
        zq3.h(sd0Var, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !sd0Var.C0();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return h.w(str, "Authorization", true) || h.w(str, c.HTTP_HEADER_COOKIE, true) || h.w(str, "Proxy-Authorization", true) || h.w(str, c.HTTP_HEADER_SET_COOKIE, true);
    }

    public static final void notify(Object obj) {
        zq3.h(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        zq3.h(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final String peerName(Socket socket) {
        zq3.h(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        zq3.g(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(sd0 sd0Var, Charset charset) throws IOException {
        zq3.h(sd0Var, "<this>");
        zq3.h(charset, "default");
        int y0 = sd0Var.y0(UNICODE_BOMS);
        if (y0 == -1) {
            return charset;
        }
        if (y0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            zq3.g(charset2, "UTF_8");
            return charset2;
        }
        if (y0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            zq3.g(charset3, "UTF_16BE");
            return charset3;
        }
        if (y0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            zq3.g(charset4, "UTF_16LE");
            return charset4;
        }
        if (y0 == 3) {
            return yj0.a.a();
        }
        if (y0 == 4) {
            return yj0.a.b();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t;
        Object readFieldOrNull;
        zq3.h(obj, "instance");
        zq3.h(cls, "fieldType");
        zq3.h(str, "fieldName");
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (zq3.c(cls2, Object.class)) {
                if (zq3.c(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                t = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
                zq3.g(cls2, "c.superclass");
            }
        }
        return t;
    }

    public static final int readMedium(sd0 sd0Var) throws IOException {
        zq3.h(sd0Var, "<this>");
        return and(sd0Var.readByte(), 255) | (and(sd0Var.readByte(), 255) << 16) | (and(sd0Var.readByte(), 255) << 8);
    }

    public static final boolean skipAll(px7 px7Var, int i, TimeUnit timeUnit) throws IOException {
        zq3.h(px7Var, "<this>");
        zq3.h(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = px7Var.timeout().hasDeadline() ? px7Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        px7Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            ad0 ad0Var = new ad0();
            while (px7Var.read(ad0Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                ad0Var.a();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                px7Var.timeout().clearDeadline();
            } else {
                px7Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                px7Var.timeout().clearDeadline();
            } else {
                px7Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                px7Var.timeout().clearDeadline();
            } else {
                px7Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return new ThreadFactory() { // from class: w19
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = Util.threadFactory$lambda$1(str, z, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        zq3.h(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            qs2Var.mo865invoke();
        } finally {
            bk3.b(1);
            currentThread.setName(name);
            bk3.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        zq3.h(headers, "<this>");
        an3 u = uo6.u(0, headers.size());
        ArrayList arrayList = new ArrayList(i.w(u, 10));
        Iterator it2 = u.iterator();
        while (it2.hasNext()) {
            int c = ((qm3) it2).c();
            arrayList.add(new Header(headers.name(c), headers.value(c)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        zq3.h(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().K(), header.component2().K());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        zq3.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        zq3.h(httpUrl, "<this>");
        if (h.P(httpUrl.host(), ":", false, 2, null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        zq3.h(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(i.a1(list));
        zq3.g(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        zq3.h(map, "<this>");
        if (map.isEmpty()) {
            return t.i();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        zq3.g(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        zq3.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        zq3.h(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        zq3.h(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        zq3.h(exc, "<this>");
        zq3.h(list, "suppressed");
        Iterator<? extends Exception> it2 = list.iterator();
        while (it2.hasNext()) {
            g62.a(exc, it2.next());
        }
        return exc;
    }

    public static final void writeMedium(qd0 qd0Var, int i) throws IOException {
        zq3.h(qd0Var, "<this>");
        qd0Var.D0((i >>> 16) & 255);
        qd0Var.D0((i >>> 8) & 255);
        qd0Var.D0(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        zq3.h(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        zq3.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final void closeQuietly(Socket socket) {
        zq3.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!zq3.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        zq3.h(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(ad0 ad0Var, byte b) {
        zq3.h(ad0Var, "<this>");
        int i = 0;
        while (!ad0Var.C0() && ad0Var.r(0L) == b) {
            i++;
            ad0Var.readByte();
        }
        return i;
    }
}
