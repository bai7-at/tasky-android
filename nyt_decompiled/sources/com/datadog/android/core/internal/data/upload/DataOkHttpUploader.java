package com.datadog.android.core.internal.data.upload;

import android.net.TrafficStats;
import com.comscore.streaming.ContentDeliveryMode;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import defpackage.c04;
import defpackage.dy6;
import defpackage.iy6;
import defpackage.jf;
import defpackage.ky6;
import defpackage.na1;
import defpackage.qs2;
import defpackage.ua1;
import defpackage.zq3;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.c;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class DataOkHttpUploader implements na1 {
    public static final a j = new a(null);
    private final ky6 a;
    private final InternalLogger b;
    private final Call.Factory c;
    private final String d;
    private final jf e;
    private volatile int f;
    private volatile UploadStatus g;
    private volatile com.datadog.android.core.internal.persistence.a h;
    private final c04 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DataOkHttpUploader(ky6 ky6Var, InternalLogger internalLogger, Call.Factory factory, String str, jf jfVar) {
        zq3.h(ky6Var, "requestFactory");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(factory, "callFactory");
        zq3.h(str, "sdkVersion");
        zq3.h(jfVar, "androidInfoProvider");
        this.a = ky6Var;
        this.b = internalLogger;
        this.c = factory;
        this.d = str;
        this.e = jfVar;
        this.f = 1;
        this.i = c.a(new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$userAgent$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String l;
                l = DataOkHttpUploader.this.l(System.getProperty("http.agent"));
                DataOkHttpUploader dataOkHttpUploader = DataOkHttpUploader.this;
                if (!h.d0(l)) {
                    return l;
                }
                return "Datadog/" + dataOkHttpUploader.f() + " (Linux; U; Android " + dataOkHttpUploader.e().getOsVersion() + "; " + dataOkHttpUploader.e().b() + " Build/" + dataOkHttpUploader.e().a() + ")";
            }
        });
    }

    private final Request c(dy6 dy6Var) {
        Request.Builder post = new Request.Builder().url(dy6Var.f()).post(RequestBody.Companion.create$default(RequestBody.Companion, dy6Var.a(), dy6Var.b() == null ? null : MediaType.Companion.parse(dy6Var.b()), 0, 0, 6, (Object) null));
        for (Map.Entry entry : dy6Var.d().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            if (zq3.c(lowerCase, "user-agent")) {
                InternalLogger.b.a(this.b, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$buildOkHttpRequest$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Ignoring provided User-Agent header, because it is reserved.";
                    }
                }, null, false, null, 56, null);
            } else {
                post.addHeader(str, str2);
            }
        }
        post.addHeader("User-Agent", g());
        return post.build();
    }

    private final UploadStatus d(dy6 dy6Var) {
        Object obj;
        Iterator it2 = dy6Var.d().entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (h.w((String) ((Map.Entry) obj).getKey(), "DD-API-KEY", true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        String str = entry != null ? (String) entry.getValue() : null;
        if (str != null && (str.length() == 0 || !h(str))) {
            return new UploadStatus.f(0);
        }
        Request c = c(dy6Var);
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        Response execute = this.c.newCall(c).execute();
        execute.close();
        return k(execute.code(), dy6Var);
    }

    private final String g() {
        return (String) this.i.getValue();
    }

    private final boolean h(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!i(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private final boolean i(char c) {
        return c == '\t' || (' ' <= c && c < 127);
    }

    private final iy6 j(com.datadog.android.core.internal.persistence.a aVar) {
        Integer num = null;
        if (aVar == null || this.h == null || !zq3.c(this.h, aVar)) {
            this.f = 1;
        } else {
            this.f++;
            UploadStatus uploadStatus = this.g;
            if (uploadStatus != null) {
                num = Integer.valueOf(uploadStatus.c());
            }
        }
        this.h = aVar;
        return new iy6(this.f, num);
    }

    private final UploadStatus k(final int i, final dy6 dy6Var) {
        if (i == 202) {
            return new UploadStatus.i(i);
        }
        if (i != 403) {
            if (i != 408) {
                if (i != 413) {
                    if (i != 429) {
                        if (i != 500 && i != 507) {
                            if (i != 400) {
                                if (i != 401) {
                                    switch (i) {
                                        case ContentDeliveryMode.ON_DEMAND /* 502 */:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            InternalLogger.b.b(this.b, InternalLogger.Level.WARN, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$responseCodeToUploadStatus$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public final String mo865invoke() {
                                                    return "Unexpected status code " + i + " on upload request: " + dy6Var.c();
                                                }
                                            }, null, false, null, 56, null);
                                            return new UploadStatus.k(i);
                                    }
                                }
                            }
                        }
                        return new UploadStatus.e(i);
                    }
                }
                return new UploadStatus.c(i);
            }
            return new UploadStatus.d(i);
        }
        return new UploadStatus.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l(String str) {
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (i(charAt)) {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
            zq3.g(str2, "toString(...)");
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    @Override // defpackage.na1
    public UploadStatus a(final ua1 ua1Var, List list, byte[] bArr, com.datadog.android.core.internal.persistence.a aVar) {
        UploadStatus jVar;
        UploadStatus uploadStatus;
        zq3.h(ua1Var, "context");
        zq3.h(list, "batch");
        iy6 j2 = j(aVar);
        try {
            dy6 a2 = this.a.a(ua1Var, j2, list, bArr);
            if (a2 == null) {
                return new UploadStatus.h(null);
            }
            try {
                uploadStatus = d(a2);
            } catch (UnknownHostException e) {
                InternalLogger.b.a(this.b, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to find host for site " + ua1.this.i() + "; we will retry later.";
                    }
                }, e, false, null, 48, null);
                uploadStatus = new UploadStatus.b(e);
            } catch (IOException e2) {
                InternalLogger.b.a(this.b, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to execute the request; we will retry later.";
                    }
                }, e2, false, null, 48, null);
                jVar = new UploadStatus.g(e2);
                uploadStatus = jVar;
            } catch (Throwable th) {
                InternalLogger.b.a(this.b, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$3
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to execute the request; we will retry later.";
                    }
                }, th, false, null, 48, null);
                jVar = new UploadStatus.j(th);
                uploadStatus = jVar;
            }
            uploadStatus.f(a2.c(), a2.a().length, this.b, j2.a(), a2.e());
            this.g = uploadStatus;
            return uploadStatus;
        } catch (Exception e3) {
            InternalLogger.b.b(this.b, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$request$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
                }
            }, e3, false, null, 48, null);
            return new UploadStatus.h(e3);
        }
    }

    public final jf e() {
        return this.e;
    }

    public final String f() {
        return this.d;
    }
}
