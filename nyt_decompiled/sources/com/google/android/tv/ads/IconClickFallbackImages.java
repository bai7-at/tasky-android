package com.google.android.tv.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.atv_ads_framework.zzab;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class IconClickFallbackImages implements Parcelable {

    public static abstract class a {
        public abstract IconClickFallbackImages a();
    }

    public static a a(List list) {
        list.getClass();
        b bVar = new b();
        bVar.b(zzab.p(list));
        return bVar;
    }

    public abstract List b();
}
