package com.nytimes.android.dimodules;

import android.app.Activity;
import android.content.SharedPreferences;
import defpackage.ba2;
import defpackage.g16;
import defpackage.xq5;

/* loaded from: classes4.dex */
public abstract class e implements ba2 {
    public static xq5 a(Activity activity, SharedPreferences sharedPreferences) {
        return (xq5) g16.e(ActivityModule.Companion.e(activity, sharedPreferences));
    }
}
