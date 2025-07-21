package com.nytimes.android.abra.allocator;

import android.content.Context;
import com.nytimes.android.abra.R;
import defpackage.yj0;
import defpackage.zj8;
import defpackage.zq3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public final class ResourceProvider {
    private int abraJs;
    private int abraRules;
    private final Context context;

    public ResourceProvider(Context context, int i, int i2) {
        zq3.h(context, "context");
        this.context = context;
        this.abraJs = i;
        this.abraRules = i2;
    }

    public final String getAbraGlobal() {
        InputStream openRawResource = this.context.getResources().openRawResource(R.raw.abra_global);
        zq3.g(openRawResource, "openRawResource(...)");
        return zj8.f(new BufferedReader(new InputStreamReader(openRawResource, yj0.b), 8192));
    }

    public final String getAbraJs() {
        InputStream openRawResource = this.context.getResources().openRawResource(this.abraJs);
        zq3.g(openRawResource, "openRawResource(...)");
        return zj8.f(new BufferedReader(new InputStreamReader(openRawResource, yj0.b), 8192));
    }

    public final String getAbraRules() {
        InputStream openRawResource = this.context.getResources().openRawResource(this.abraRules);
        zq3.g(openRawResource, "openRawResource(...)");
        return zj8.f(new BufferedReader(new InputStreamReader(openRawResource, yj0.b), 8192));
    }
}
