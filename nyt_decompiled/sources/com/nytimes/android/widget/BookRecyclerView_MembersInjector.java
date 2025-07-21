package com.nytimes.android.widget;

import com.nytimes.android.bestsellers.vo.BookCategory;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.aa0;
import defpackage.op4;
import defpackage.p76;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

/* loaded from: classes4.dex */
public final class BookRecyclerView_MembersInjector implements op4 {
    private final p76 adapterProvider;
    private final p76 bookListUpdaterProvider;
    private final p76 otherListsUpdaterProvider;
    private final p76 snackbarUtilProvider;

    public BookRecyclerView_MembersInjector(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.bookListUpdaterProvider = p76Var;
        this.otherListsUpdaterProvider = p76Var2;
        this.adapterProvider = p76Var3;
        this.snackbarUtilProvider = p76Var4;
    }

    public static op4 create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new BookRecyclerView_MembersInjector(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static void injectAdapter(BookRecyclerView bookRecyclerView, aa0 aa0Var) {
        bookRecyclerView.adapter = aa0Var;
    }

    public static void injectBookListUpdater(BookRecyclerView bookRecyclerView, PublishSubject<BookCategory> publishSubject) {
        bookRecyclerView.bookListUpdater = publishSubject;
    }

    public static void injectOtherListsUpdater(BookRecyclerView bookRecyclerView, PublishSubject<List<BookCategory>> publishSubject) {
        bookRecyclerView.otherListsUpdater = publishSubject;
    }

    public static void injectSnackbarUtil(BookRecyclerView bookRecyclerView, SnackbarUtil snackbarUtil) {
        bookRecyclerView.snackbarUtil = snackbarUtil;
    }

    public void injectMembers(BookRecyclerView bookRecyclerView) {
        injectBookListUpdater(bookRecyclerView, (PublishSubject) this.bookListUpdaterProvider.get());
        injectOtherListsUpdater(bookRecyclerView, (PublishSubject) this.otherListsUpdaterProvider.get());
        injectAdapter(bookRecyclerView, (aa0) this.adapterProvider.get());
        injectSnackbarUtil(bookRecyclerView, (SnackbarUtil) this.snackbarUtilProvider.get());
    }
}
