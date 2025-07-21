package com.nytimes.android.dimodules;

import android.app.Application;
import android.os.Looper;
import com.nytimes.android.internal.auth.SamizdatHeader$Builder;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.ds7;
import defpackage.o73;
import defpackage.qs2;
import defpackage.so1;
import defpackage.tb5;
import defpackage.tp0;
import defpackage.zq3;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class OkHttpClientFactory {
    public static final a Companion = new a(null);
    private final ds7 a;
    private final Set b;
    private final Application c;
    private final so1 d;
    private final String e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((tb5) obj).a()), Integer.valueOf(((tb5) obj2).a()));
        }
    }

    public OkHttpClientFactory(ds7 ds7Var, Set set, Application application, so1 so1Var, String str) {
        zq3.h(ds7Var, "signingInterceptor");
        zq3.h(set, "okHttpInterceptorsProvider");
        zq3.h(application, "context");
        zq3.h(so1Var, "deviceConfig");
        this.a = ds7Var;
        this.b = set;
        this.c = application;
        this.d = so1Var;
        this.e = str;
    }

    private final o73 d() {
        return new SamizdatHeader$Builder(null, null, null, null, null, null, null, null, null, null, 1023, null).h(this.d.g()).a(this.d.a()).i(this.d.h()).f(this.d.e()).e(this.d.d()).j(this.d.i()).c(this.d.b()).d(new qs2() { // from class: com.nytimes.android.dimodules.OkHttpClientFactory$createHeaderInterceptor$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String str;
                str = OkHttpClientFactory.this.e;
                return str;
            }
        }).g(new qs2() { // from class: com.nytimes.android.dimodules.OkHttpClientFactory$createHeaderInterceptor$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                Application application;
                application = OkHttpClientFactory.this.c;
                return Integer.valueOf((int) DeviceUtils.H(DeviceUtils.p(application)));
            }
        }).b();
    }

    public final OkHttpClient c() {
        if (zq3.c(Looper.myLooper(), Looper.getMainLooper())) {
            NYTLogger.s(new RuntimeException("OkHttpClient created in the main thread, use a dagger.Lazy to avoid it"));
        }
        File file = new File(this.c.getCacheDir(), "cache_file");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cache(new Cache(file, 20971520L));
        List N0 = kotlin.collections.i.N0(kotlin.collections.i.X0(this.b), new b());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = N0.iterator();
        while (it2.hasNext()) {
            kotlin.collections.i.B(arrayList, ((tb5) it2.next()).b());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            builder.addInterceptor((Interceptor) it3.next());
        }
        builder.addInterceptor(d());
        builder.addInterceptor(this.a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.connectTimeout(1000L, timeUnit);
        builder.readTimeout(10000L, timeUnit);
        return builder.build();
    }
}
