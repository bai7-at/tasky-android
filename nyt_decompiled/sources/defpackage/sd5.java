package defpackage;

import android.net.Uri;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.Headers;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.a;
import com.google.common.util.concurrent.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class sd5 extends d50 implements com.google.android.exoplayer2.upstream.a {
    private final Call.Factory e;
    private final ra3 f;
    private final String g;
    private final CacheControl h;
    private final ra3 i;
    private i16 j;
    private com.google.android.exoplayer2.upstream.b k;
    private Response l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;

    class a implements Callback {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.a.x(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            this.a.w(response);
        }
    }

    public static final class b implements a.InterfaceC0194a {
        private final ra3 a = new ra3();
        private final Call.Factory b;
        private String c;
        private sq8 d;
        private CacheControl e;
        private i16 f;

        public b(Call.Factory factory) {
            this.b = factory;
        }

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public sd5 a() {
            sd5 sd5Var = new sd5(this.b, this.c, this.e, this.a, this.f, null);
            sq8 sq8Var = this.d;
            if (sq8Var != null) {
                sd5Var.i(sq8Var);
            }
            return sd5Var;
        }

        public b c(sq8 sq8Var) {
            this.d = sq8Var;
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }
    }

    static {
        n72.a("goog.exo.okhttp");
    }

    /* synthetic */ sd5(Call.Factory factory, String str, CacheControl cacheControl, ra3 ra3Var, i16 i16Var, a aVar) {
        this(factory, str, cacheControl, ra3Var, i16Var);
    }

    private void A(long j, com.google.android.exoplayer2.upstream.b bVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        while (j > 0) {
            try {
                int read = ((InputStream) z19.j(this.m)).read(bArr, 0, (int) Math.min(j, ProgressEvent.PART_FAILED_EVENT_CODE));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource$HttpDataSourceException(bVar, 2008, 1);
                }
                j -= read;
                s(read);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(bVar, 2000, 1);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }

    private void w() {
        Response response = this.l;
        if (response != null) {
            ((ResponseBody) ur.e(response.body())).close();
            this.l = null;
        }
        this.m = null;
    }

    private Response x(Call call) {
        c y = c.y();
        call.enqueue(new a(y));
        try {
            return (Response) y.get();
        } catch (InterruptedException unused) {
            call.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    private Request y(com.google.android.exoplayer2.upstream.b bVar) {
        long j = bVar.g;
        long j2 = bVar.h;
        HttpUrl parse = HttpUrl.parse(bVar.a.toString());
        if (parse == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", bVar, ContentMediaFormat.PARTIAL_CONTENT_GENERIC, 1);
        }
        Request.Builder url = new Request.Builder().url(parse);
        CacheControl cacheControl = this.h;
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        HashMap hashMap = new HashMap();
        ra3 ra3Var = this.i;
        if (ra3Var != null) {
            hashMap.putAll(ra3Var.a());
        }
        hashMap.putAll(this.f.a());
        hashMap.putAll(bVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            url.header((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = ib3.a(j, j2);
        if (a2 != null) {
            url.addHeader(Headers.RANGE, a2);
        }
        String str = this.g;
        if (str != null) {
            url.addHeader("User-Agent", str);
        }
        if (!bVar.d(1)) {
            url.addHeader("Accept-Encoding", "identity");
        }
        byte[] bArr = bVar.d;
        RequestBody requestBody = null;
        if (bArr != null) {
            requestBody = RequestBody.create((MediaType) null, bArr);
        } else if (bVar.c == 2) {
            requestBody = RequestBody.create((MediaType) null, z19.f);
        }
        url.method(bVar.b(), requestBody);
        return url.build();
    }

    private int z(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.o;
        if (j != -1) {
            long j2 = j - this.p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) z19.j(this.m)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.p += read;
        s(read);
        return read;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        byte[] bArr;
        this.k = bVar;
        long j = 0;
        this.p = 0L;
        this.o = 0L;
        u(bVar);
        try {
            Response x = x(this.e.newCall(y(bVar)));
            this.l = x;
            ResponseBody responseBody = (ResponseBody) ur.e(x.body());
            this.m = responseBody.byteStream();
            int code = x.code();
            if (!x.isSuccessful()) {
                if (code == 416) {
                    if (bVar.g == ib3.c(x.headers().get(Headers.CONTENT_RANGE))) {
                        this.n = true;
                        v(bVar);
                        long j2 = bVar.h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                try {
                    bArr = z19.a1((InputStream) ur.e(this.m));
                } catch (IOException unused) {
                    bArr = z19.f;
                }
                byte[] bArr2 = bArr;
                Map<String, List<String>> multimap = x.headers().toMultimap();
                w();
                throw new HttpDataSource$InvalidResponseCodeException(code, x.message(), code == 416 ? new DataSourceException(2008) : null, multimap, bVar, bArr2);
            }
            MediaType contentType = responseBody.contentType();
            String mediaType = contentType != null ? contentType.toString() : "";
            i16 i16Var = this.j;
            if (i16Var != null && !i16Var.apply(mediaType)) {
                w();
                throw new HttpDataSource$InvalidContentTypeException(mediaType, bVar);
            }
            if (code == 200) {
                long j3 = bVar.g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            long j4 = bVar.h;
            if (j4 != -1) {
                this.o = j4;
            } else {
                long contentLength = responseBody.contentLength();
                this.o = contentLength != -1 ? contentLength - j : -1L;
            }
            this.n = true;
            v(bVar);
            try {
                A(j, bVar);
                return this.o;
            } catch (HttpDataSource$HttpDataSourceException e) {
                w();
                throw e;
            }
        } catch (IOException e2) {
            throw HttpDataSource$HttpDataSourceException.c(e2, bVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.n) {
            this.n = false;
            t();
            w();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        Response response = this.l;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        Response response = this.l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().toString());
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        try {
            return z(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.c(e, (com.google.android.exoplayer2.upstream.b) z19.j(this.k), 2);
        }
    }

    private sd5(Call.Factory factory, String str, CacheControl cacheControl, ra3 ra3Var, i16 i16Var) {
        super(true);
        this.e = (Call.Factory) ur.e(factory);
        this.g = str;
        this.h = cacheControl;
        this.i = ra3Var;
        this.j = i16Var;
        this.f = new ra3();
    }
}
