package com.nytimes.android.features.home;

import android.content.SharedPreferences;
import defpackage.b05;
import defpackage.ba2;
import defpackage.g16;
import defpackage.j91;

/* loaded from: classes4.dex */
public abstract class b implements ba2 {
    public static j91 a(SharedPreferences sharedPreferences, b05 b05Var) {
        return (j91) g16.e(HomeSingletonComponent.Companion.b(sharedPreferences, b05Var));
    }
}
