package com.google.android.tv.ads;

import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class IconClickFallbackImage implements Parcelable {

    public static abstract class a {
        public abstract IconClickFallbackImage a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(int i);

        public abstract a e(String str);

        public abstract a f(int i);
    }

    public static a a() {
        com.google.android.tv.ads.a aVar = new com.google.android.tv.ads.a();
        aVar.f(0);
        aVar.d(0);
        aVar.b("");
        aVar.c("");
        aVar.e("");
        return aVar;
    }

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract String e();

    public abstract int f();
}
