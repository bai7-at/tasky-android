package defpackage;

import com.nytimes.android.bestsellers.BestSellersFetcher;
import com.nytimes.android.bestsellers.BookCategoryPersister;
import com.nytimes.android.bestsellers.BookCategoryRepository;
import io.reactivex.Single;
import java.util.List;

/* loaded from: classes.dex */
public final class o70 {
    public static final o70 a = new o70();

    private o70() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single d(BestSellersFetcher bestSellersFetcher, ww8 ww8Var) {
        zq3.h(bestSellersFetcher, "$fetcher");
        zq3.h(ww8Var, "it");
        return bestSellersFetcher.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(List list) {
        zq3.h(list, "it");
        return list;
    }

    public final BookCategoryRepository c(BookCategoryPersister bookCategoryPersister, final BestSellersFetcher bestSellersFetcher) {
        zq3.h(bookCategoryPersister, "persister");
        zq3.h(bestSellersFetcher, "fetcher");
        l28 d = o28.b().a(new wd2() { // from class: m70
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single d2;
                d2 = o70.d(BestSellersFetcher.this, (ww8) obj);
                return d2;
            }
        }).f(bookCategoryPersister).e(new bp5() { // from class: n70
            @Override // defpackage.bp5, io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List e;
                e = o70.e((List) obj);
                return e;
            }
        }).c().d();
        zq3.g(d, "open(...)");
        return new BookCategoryRepository(d);
    }
}
