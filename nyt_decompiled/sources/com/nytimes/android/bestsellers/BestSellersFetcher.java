package com.nytimes.android.bestsellers;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.bestsellers.vo.Book;
import com.nytimes.android.bestsellers.vo.BookCategory;
import defpackage.o90;
import defpackage.v90;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.rx2.RxSingleKt;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes.dex */
public final class BestSellersFetcher {
    private final ApolloClient a;
    private final DateTimeFormatter b;

    public BestSellersFetcher(ApolloClient apolloClient) {
        zq3.h(apolloClient, "apolloClient");
        this.a = apolloClient;
        this.b = DateTimeFormatter.ofPattern("uuuu-MM-dd").withZone(ZoneId.of("UTC"));
    }

    private final Book d(o90 o90Var, String str) {
        String n = o90Var.n();
        String b = o90Var.b();
        int k = o90Var.k();
        int o = o90Var.o();
        String e = o90Var.e();
        String i = o90Var.i();
        Integer l = o90Var.l();
        int intValue = l != null ? l.intValue() : 0;
        Object f = o90Var.f();
        if (f == null) {
            f = "";
        }
        String obj = f.toString();
        Object a = o90Var.a();
        if (a == null) {
            a = "";
        }
        String obj2 = a.toString();
        Object c = o90Var.c();
        if (c == null) {
            c = "";
        }
        String obj3 = c.toString();
        Object m = o90Var.m();
        return new Book(n, b, k, o, e, i, intValue, obj, obj2, obj3, (m != null ? m : "").toString(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BookCategory e(v90 v90Var) {
        String e = v90Var.e();
        String format = this.b.format(v90Var.g());
        zq3.g(format, "format(...)");
        String c = v90Var.c();
        String format2 = this.b.format(v90Var.a());
        zq3.g(format2, "format(...)");
        v90.a b = v90Var.b();
        zq3.e(b);
        List a = b.a();
        zq3.e(a);
        List<v90.b> list = a;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (v90.b bVar : list) {
            zq3.e(bVar);
            v90.c a2 = bVar.a();
            zq3.e(a2);
            arrayList.add(d(a2.a(), v90Var.c()));
        }
        return new BookCategory(e, format, c, format2, arrayList);
    }

    public final Single c() {
        return RxSingleKt.rxSingle$default(null, new BestSellersFetcher$fetch$1(this, null), 1, null);
    }
}
