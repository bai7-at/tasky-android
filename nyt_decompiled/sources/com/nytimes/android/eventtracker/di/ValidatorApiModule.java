package com.nytimes.android.eventtracker.di;

import android.app.Application;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.data.encoder.ResultJsonAdapter;
import com.nytimes.android.eventtracker.di.ValidatorApiModule;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.fetcher.NetworkScriptFetcher;
import com.nytimes.android.eventtracker.validator.fetcher.ValidatorApi;
import defpackage.b04;
import defpackage.m28;
import defpackage.n28;
import defpackage.rp4;
import defpackage.x52;
import defpackage.xe2;
import defpackage.yz6;
import defpackage.ze2;
import defpackage.zq3;
import java.io.File;
import kotlin.time.DurationUnit;
import kotlin.time.c;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* loaded from: classes4.dex */
public final class ValidatorApiModule {
    public static final ValidatorApiModule a = new ValidatorApiModule();

    private ValidatorApiModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call g(b04 b04Var, Request request) {
        zq3.h(b04Var, "$okHttpClient");
        zq3.h(request, "request");
        return ((OkHttpClient) b04Var.get()).newCall(request);
    }

    public final SourceOfTruth b(xe2 xe2Var, File file) {
        zq3.h(xe2Var, "fileSystem");
        zq3.h(file, "storeFileDir");
        return SourceOfTruth.a.a(new ValidatorApiModule$fileSystemSourceOfTruth$1(xe2Var, null), new ValidatorApiModule$fileSystemSourceOfTruth$2(file, null), new ValidatorApiModule$fileSystemSourceOfTruth$3(xe2Var, null), new ValidatorApiModule$fileSystemSourceOfTruth$4(xe2Var, null));
    }

    public final Fetcher c(EventTracker.a aVar, ValidatorApi validatorApi, yz6 yz6Var, JavascriptEngine javascriptEngine, x52 x52Var, ResultJsonAdapter resultJsonAdapter) {
        zq3.h(aVar, "configuration");
        zq3.h(validatorApi, "validatorApi");
        zq3.h(yz6Var, "resourceInflater");
        zq3.h(javascriptEngine, "javascriptEngine");
        zq3.h(x52Var, "eventWrapper");
        zq3.h(resultJsonAdapter, "resultJsonAdapter");
        return new NetworkScriptFetcher(aVar.j(), validatorApi, yz6Var, javascriptEngine, x52Var, resultJsonAdapter);
    }

    public final rp4 d(EventTracker.a aVar) {
        zq3.h(aVar, "configuration");
        return new rp4.b().b(c.t(aVar.m(), DurationUnit.MILLISECONDS)).a();
    }

    public final m28 e(SourceOfTruth sourceOfTruth, Fetcher fetcher, rp4 rp4Var) {
        zq3.h(sourceOfTruth, "sourceOfTruth");
        zq3.h(fetcher, "fetcher");
        zq3.h(rp4Var, "memoryPolicy");
        return n28.a.a(fetcher, sourceOfTruth).a(rp4Var).build();
    }

    public final ValidatorApi f(final b04 b04Var) {
        zq3.h(b04Var, "okHttpClient");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory(new Call.Factory() { // from class: z29
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                Call g;
                g = ValidatorApiModule.g(b04.this, request);
                return g;
            }
        });
        builder.baseUrl("https://storage.googleapis.com");
        builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        builder.addConverterFactory(ScalarsConverterFactory.create());
        builder.validateEagerly(false);
        Object create = builder.build().create(ValidatorApi.class);
        zq3.g(create, "create(...)");
        return (ValidatorApi) create;
    }

    public final xe2 h(File file) {
        zq3.h(file, "storeFileDir");
        return ze2.a.a(file);
    }

    public final File i(Application application) {
        zq3.h(application, "application");
        return new File(application.getCacheDir(), "store_validator_file");
    }
}
