package com.nytimes.android.bestsellers;

import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.jc;
import defpackage.op4;
import io.reactivex.subjects.PublishSubject;

/* loaded from: classes.dex */
public abstract class b implements op4 {
    public static void a(BooksBestSellersActivity booksBestSellersActivity, jc jcVar) {
        booksBestSellersActivity.analyticsClient = jcVar;
    }

    public static void b(BooksBestSellersActivity booksBestSellersActivity, PublishSubject publishSubject) {
        booksBestSellersActivity.bookListUpdater = publishSubject;
    }

    public static void c(BooksBestSellersActivity booksBestSellersActivity, BookCategoryRepository bookCategoryRepository) {
        booksBestSellersActivity.bookStore = bookCategoryRepository;
    }

    public static void d(BooksBestSellersActivity booksBestSellersActivity, PublishSubject publishSubject) {
        booksBestSellersActivity.dialogUpdater = publishSubject;
    }

    public static void e(BooksBestSellersActivity booksBestSellersActivity, PublishSubject publishSubject) {
        booksBestSellersActivity.otherListsUpdater = publishSubject;
    }

    public static void f(BooksBestSellersActivity booksBestSellersActivity, SnackbarUtil snackbarUtil) {
        booksBestSellersActivity.snackbarUtil = snackbarUtil;
    }
}
