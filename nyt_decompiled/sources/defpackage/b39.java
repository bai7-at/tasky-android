package defpackage;

import com.dropbox.android.external.store4.Fetcher;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.data.encoder.ResultJsonAdapter;
import com.nytimes.android.eventtracker.di.ValidatorApiModule;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.fetcher.ValidatorApi;

/* loaded from: classes4.dex */
public abstract class b39 implements ba2 {
    public static Fetcher a(EventTracker.a aVar, ValidatorApi validatorApi, yz6 yz6Var, JavascriptEngine javascriptEngine, x52 x52Var, ResultJsonAdapter resultJsonAdapter) {
        return (Fetcher) g16.e(ValidatorApiModule.a.c(aVar, validatorApi, yz6Var, javascriptEngine, x52Var, resultJsonAdapter));
    }
}
