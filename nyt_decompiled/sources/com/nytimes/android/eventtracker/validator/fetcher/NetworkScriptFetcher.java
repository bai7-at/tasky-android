package com.nytimes.android.eventtracker.validator.fetcher;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.dropbox.android.external.store4.Fetcher;
import com.nytimes.android.eventtracker.data.encoder.ResultJsonAdapter;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher;
import defpackage.x52;
import defpackage.yz6;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class NetworkScriptFetcher implements Fetcher {
    private final String b;
    private final ValidatorApi c;
    private final yz6 d;
    private final JavascriptEngine e;
    private final x52 f;
    private final ResultJsonAdapter g;

    public static final class InvalidEventResultError extends RuntimeException {
        public InvalidEventResultError() {
            super("Invalid Script Result");
        }
    }

    public static final class InvalidJavaScriptError extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidJavaScriptError(Throwable th) {
            super("Invalid Script Fetched", th);
            zq3.h(th, "error");
        }
    }

    public NetworkScriptFetcher(String str, ValidatorApi validatorApi, yz6 yz6Var, JavascriptEngine javascriptEngine, x52 x52Var, ResultJsonAdapter resultJsonAdapter) {
        zq3.h(str, "validationUrl");
        zq3.h(validatorApi, "validatorApi");
        zq3.h(yz6Var, "resourceInflater");
        zq3.h(javascriptEngine, "javascriptEngine");
        zq3.h(x52Var, "eventWrapper");
        zq3.h(resultJsonAdapter, "resultJsonAdapter");
        this.b = str;
        this.c = validatorApi;
        this.d = yz6Var;
        this.e = javascriptEngine;
        this.f = x52Var;
        this.g = resultJsonAdapter;
    }

    @Override // com.dropbox.android.external.store4.Fetcher
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Flow invoke(EventTrackerScriptFetcher.Script script) {
        zq3.h(script, TransferTable.COLUMN_KEY);
        return FlowKt.flow(new NetworkScriptFetcher$invoke$1(this, null));
    }
}
