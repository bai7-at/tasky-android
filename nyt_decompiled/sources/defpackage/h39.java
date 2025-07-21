package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.eventtracker.data.encoder.EventJsonAdapter;
import com.nytimes.android.eventtracker.data.encoder.ResultJsonAdapter;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.JavascriptValidator;
import com.nytimes.android.eventtracker.validator.Validator;
import com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher;
import com.nytimes.android.eventtracker.validator.fetcher.a;
import com.nytimes.android.eventtracker.validator.inflater.RawResourceInflater;

/* loaded from: classes4.dex */
public final class h39 {
    public static final h39 a = new h39();

    private h39() {
    }

    public final EventJsonAdapter a() {
        return new EventJsonAdapter();
    }

    public final x52 b(yz6 yz6Var, EventJsonAdapter eventJsonAdapter) {
        zq3.h(yz6Var, "scriptInflater");
        zq3.h(eventJsonAdapter, "adapter");
        return x52.Companion.a(yz6Var, eventJsonAdapter);
    }

    public final yz6 c(Application application) {
        zq3.h(application, "context");
        Resources resources = application.getResources();
        zq3.g(resources, "getResources(...)");
        return new RawResourceInflater(resources);
    }

    public final lc7 d(yz6 yz6Var) {
        zq3.h(yz6Var, "inflater");
        return new i07(yz6Var);
    }

    public final ResultJsonAdapter e() {
        return new ResultJsonAdapter();
    }

    public final lc7 f(lc7 lc7Var, lc7 lc7Var2) {
        zq3.h(lc7Var, "storeFetcher");
        zq3.h(lc7Var2, "resourceFetcher");
        return new EventTrackerScriptFetcher(lc7Var, lc7Var2);
    }

    public final lc7 g(m28 m28Var) {
        zq3.h(m28Var, "store");
        return new a(m28Var);
    }

    public final Validator h(JavascriptEngine javascriptEngine, lc7 lc7Var, x52 x52Var, yz6 yz6Var, n01 n01Var) {
        zq3.h(javascriptEngine, "engine");
        zq3.h(lc7Var, "validationFetcher");
        zq3.h(x52Var, "wrapper");
        zq3.h(yz6Var, "resourceInflater");
        zq3.h(n01Var, "dispatchers");
        return new JavascriptValidator(javascriptEngine, lc7Var, x52Var, yz6Var, n01Var);
    }
}
