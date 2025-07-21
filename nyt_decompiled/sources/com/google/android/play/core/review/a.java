package com.google.android.play.core.review;

import android.content.Context;
import defpackage.l17;

/* loaded from: classes3.dex */
public abstract class a {
    public static l17 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new c(new g(context));
    }
}
