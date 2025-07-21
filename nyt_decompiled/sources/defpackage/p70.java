package defpackage;

import com.nytimes.android.bestsellers.BestSellersFetcher;
import com.nytimes.android.bestsellers.BookCategoryPersister;
import com.nytimes.android.bestsellers.BookCategoryRepository;

/* loaded from: classes.dex */
public abstract class p70 implements ba2 {
    public static BookCategoryRepository a(BookCategoryPersister bookCategoryPersister, BestSellersFetcher bestSellersFetcher) {
        return (BookCategoryRepository) g16.e(o70.a.c(bookCategoryPersister, bestSellersFetcher));
    }
}
