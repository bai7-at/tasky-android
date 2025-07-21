package io.embrace.android.embracesdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class EmbraceAndroidResourcesService implements AndroidResourcesService {
    private final Context context;

    public EmbraceAndroidResourcesService(Context context) {
        zq3.h(context, "context");
        this.context = context;
    }

    @Override // io.embrace.android.embracesdk.internal.AndroidResourcesService
    @SuppressLint({"DiscouragedApi"})
    public int getIdentifier(String str, String str2, String str3) {
        return this.context.getResources().getIdentifier(str, str2, str3);
    }

    @Override // io.embrace.android.embracesdk.internal.AndroidResourcesService
    public String getString(int i) {
        String string = this.context.getResources().getString(i);
        zq3.g(string, "context.resources.getString(id)");
        return string;
    }
}
