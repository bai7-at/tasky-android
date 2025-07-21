package com.nytimes.android.bestsellers;

import com.nytimes.android.bestsellers.BookCategoryRepository;
import com.nytimes.android.bestsellers.vo.BookCategory;
import defpackage.l28;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class BookCategoryRepository {
    private final l28 a;

    public BookCategoryRepository(l28 l28Var) {
        zq3.h(l28Var, "store");
        this.a = l28Var;
    }

    public static /* synthetic */ Single d(BookCategoryRepository bookCategoryRepository, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bookCategoryRepository.c(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookCategory e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (BookCategory) ss2Var.invoke(obj);
    }

    public final Single b(String str) {
        zq3.h(str, "categoryKey");
        return d(this, str, false, 2, null);
    }

    public final Single c(final String str, boolean z) {
        zq3.h(str, "categoryKey");
        Single fetch = z ? this.a.fetch(ww8.a) : this.a.get(ww8.a);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.bestsellers.BookCategoryRepository$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BookCategory invoke(List list) {
                zq3.h(list, "list");
                String str2 = str;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    BookCategory bookCategory = (BookCategory) it2.next();
                    if (zq3.c(bookCategory.getCategoryKey(), str2)) {
                        return bookCategory;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        Single map = fetch.map(new Function() { // from class: r90
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                BookCategory e;
                e = BookCategoryRepository.e(ss2.this, obj);
                return e;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }
}
