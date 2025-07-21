package com.nytimes.android.internal.pushmessaging.model;

import androidx.work.Data;
import com.nytimes.android.internal.pushmessaging.model.a;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Data a(Subscription subscription, String str) {
        zq3.h(subscription, "<this>");
        Data.a p = new Data.a().p("TOKEN", subscription.h()).q("TAGS", (String[]) subscription.g().toArray(new String[0])).l("REGIID", subscription.f()).p("APPVER", subscription.c()).e("READY", subscription.i()).p("ENV", subscription.d());
        if (str != null) {
            p.p("COOKIE", str);
        }
        return p.a();
    }

    public static final Subscription b(Data data) {
        Set e;
        zq3.h(data, "<this>");
        String f = data.f("TOKEN");
        if (f == null) {
            f = "";
        }
        String str = f;
        String[] g = data.g("TAGS");
        if (g == null || (e = d.F0(g)) == null) {
            e = b0.e();
        }
        Set set = e;
        int d = data.d("REGIID", 0);
        String f2 = data.f("APPVER");
        if (f2 == null) {
            f2 = "0";
        }
        String str2 = f2;
        boolean c = data.c("READY", false);
        String f3 = data.f("ENV");
        if (f3 == null) {
            f3 = a.c.d.c();
        }
        return new Subscription(str, set, d, str2, c, f3, 0, 64, null);
    }
}
