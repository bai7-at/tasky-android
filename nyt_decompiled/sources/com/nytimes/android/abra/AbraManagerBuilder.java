package com.nytimes.android.abra;

import android.content.Context;
import com.nytimes.android.abra.AbraManagerBuilder;
import com.nytimes.android.abra.di.AbraModule;
import com.nytimes.android.abra.di.DaggerAbraComponent;
import com.nytimes.android.abra.utilities.AbraClientLogger;
import com.nytimes.android.abra.utilities.AbraLogger;
import com.nytimes.android.abra.utilities.ParamProvider;
import com.nytimes.android.abra.utilities.TestReporter;
import defpackage.b04;
import defpackage.zq3;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class AbraManagerBuilder {
    private final int abraCodeRes;
    private final int abraRulesRes;
    private b04 client;
    private final Context context;
    private AbraClientLogger logClient;
    private final ParamProvider paramProvider;
    private final TestReporter testReporter;

    public AbraManagerBuilder(Context context, ParamProvider paramProvider, TestReporter testReporter, int i, int i2) {
        zq3.h(context, "context");
        zq3.h(paramProvider, "paramProvider");
        zq3.h(testReporter, "testReporter");
        this.context = context;
        this.paramProvider = paramProvider;
        this.testReporter = testReporter;
        this.abraCodeRes = i;
        this.abraRulesRes = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient createAbraModule$lambda$5() {
        return new OkHttpClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient okHttpClient$lambda$2$lambda$1(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "$client");
        return okHttpClient;
    }

    public final AbraManager build() {
        AbraClientLogger abraClientLogger = this.logClient;
        if (abraClientLogger != null) {
            AbraLogger.INSTANCE.attachLogger(abraClientLogger);
        }
        return DaggerAbraComponent.builder().abraModule(createAbraModule$abra_release()).build().abraManager();
    }

    public final AbraModule createAbraModule$abra_release() {
        Context context = this.context;
        ParamProvider paramProvider = this.paramProvider;
        TestReporter testReporter = this.testReporter;
        int i = this.abraCodeRes;
        int i2 = this.abraRulesRes;
        b04 b04Var = this.client;
        if (b04Var == null) {
            b04Var = new b04() { // from class: o0
                @Override // defpackage.b04
                public final Object get() {
                    OkHttpClient createAbraModule$lambda$5;
                    createAbraModule$lambda$5 = AbraManagerBuilder.createAbraModule$lambda$5();
                    return createAbraModule$lambda$5;
                }
            };
        }
        return new AbraModule(context, paramProvider, testReporter, i, i2, b04Var);
    }

    public final AbraManagerBuilder logger(AbraClientLogger abraClientLogger) {
        zq3.h(abraClientLogger, "abraClientLogger");
        this.logClient = abraClientLogger;
        return this;
    }

    public final AbraManagerBuilder okHttpClient(final OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "client");
        this.client = new b04() { // from class: p0
            @Override // defpackage.b04
            public final Object get() {
                OkHttpClient okHttpClient$lambda$2$lambda$1;
                okHttpClient$lambda$2$lambda$1 = AbraManagerBuilder.okHttpClient$lambda$2$lambda$1(OkHttpClient.this);
                return okHttpClient$lambda$2$lambda$1;
            }
        };
        return this;
    }

    public final AbraManagerBuilder okHttpClient(b04 b04Var) {
        zq3.h(b04Var, "client");
        this.client = b04Var;
        return this;
    }
}
