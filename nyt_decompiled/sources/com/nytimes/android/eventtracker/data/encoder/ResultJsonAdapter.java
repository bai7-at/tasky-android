package com.nytimes.android.eventtracker.data.encoder;

import com.nytimes.android.eventtracker.validator.Validator;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ResultJsonAdapter {
    private final JsonAdapter<Validator.Result> jsonAdapter;
    private final i moshi;

    public ResultJsonAdapter() {
        i d = new i.b().d();
        this.moshi = d;
        this.jsonAdapter = d.c(Validator.Result.class);
    }

    public final Validator.Result a(String str) {
        zq3.h(str, "json");
        return this.jsonAdapter.fromJson(str);
    }
}
