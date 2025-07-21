package com.nytimes.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nytimes.android.bestsellers.vo.BookCategory;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.aa0;
import defpackage.bl5;
import defpackage.em6;
import defpackage.od6;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class BookRecyclerView extends Hilt_BookRecyclerView {
    aa0 adapter;
    PublishSubject<BookCategory> bookListUpdater;
    private final CompositeDisposable compositeDisposable;
    bl5 otherListsAdapter;
    PublishSubject<List<BookCategory>> otherListsUpdater;
    SnackbarUtil snackbarUtil;

    public BookRecyclerView(Context context) {
        this(context, null);
    }

    private void createBlankAdapters() {
        this.otherListsAdapter = new bl5(new ArrayList());
    }

    private void subscribeToBookList() {
        this.compositeDisposable.add(this.bookListUpdater.subscribe(new Consumer<BookCategory>() { // from class: com.nytimes.android.widget.BookRecyclerView.1
            @Override // io.reactivex.functions.Consumer
            public void accept(BookCategory bookCategory) {
                BookRecyclerView.this.smoothScrollToPosition(0);
                BookRecyclerView bookRecyclerView = BookRecyclerView.this;
                bookRecyclerView.setAdapter(bookRecyclerView.adapter);
                BookRecyclerView.this.adapter.K(bookCategory);
                BookRecyclerView bookRecyclerView2 = BookRecyclerView.this;
                bookRecyclerView2.setBackgroundColor(bookRecyclerView2.getResources().getColor(od6.books_dark_background));
            }
        }, new Consumer<Throwable>() { // from class: com.nytimes.android.widget.BookRecyclerView.2
            @Override // io.reactivex.functions.Consumer
            public void accept(Throwable th) {
                BookRecyclerView.this.showError(th);
            }
        }));
    }

    private void subscribeToOtherLists() {
        this.compositeDisposable.add(this.otherListsUpdater.subscribe(new Consumer<List<BookCategory>>() { // from class: com.nytimes.android.widget.BookRecyclerView.3
            @Override // io.reactivex.functions.Consumer
            public void accept(List<BookCategory> list) {
                BookRecyclerView bookRecyclerView = BookRecyclerView.this;
                bookRecyclerView.setAdapter(bookRecyclerView.otherListsAdapter);
                BookRecyclerView.this.otherListsAdapter.M(list);
                BookRecyclerView bookRecyclerView2 = BookRecyclerView.this;
                bookRecyclerView2.setBackgroundColor(bookRecyclerView2.getResources().getColor(od6.books_dialog_background));
            }
        }, new Consumer<Throwable>() { // from class: com.nytimes.android.widget.BookRecyclerView.4
            @Override // io.reactivex.functions.Consumer
            public void accept(Throwable th) {
                BookRecyclerView.this.showError(th);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.compositeDisposable.clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.F1(true);
        setLayoutManager(linearLayoutManager);
        createBlankAdapters();
        subscribeToBookList();
        subscribeToOtherLists();
    }

    void showError(Throwable th) {
        NYTLogger.h(th);
        this.snackbarUtil.t(em6.no_network_message);
    }

    public BookRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BookRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.compositeDisposable = new CompositeDisposable();
    }
}
