package com.nytimes.android.bestsellers;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import com.nytimes.android.bestsellers.BooksBestSellersActivity;
import com.nytimes.android.bestsellers.vo.Book;
import com.nytimes.android.bestsellers.vo.BookCategory;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.bk6;
import defpackage.dc6;
import defpackage.em6;
import defpackage.gg6;
import defpackage.hg6;
import defpackage.jc;
import defpackage.so;
import defpackage.x3;
import defpackage.zh6;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class BooksBestSellersActivity extends d implements AdapterView.OnItemSelectedListener {
    jc analyticsClient;
    PublishSubject<BookCategory> bookListUpdater;
    BookCategoryRepository bookStore;
    PublishSubject<Book> dialogUpdater;
    so e = new so();
    PublishSubject<List<BookCategory>> otherListsUpdater;
    SnackbarUtil snackbarUtil;

    private void Y() {
        Spinner spinner = (Spinner) findViewById(hg6.book_spinner);
        spinner.setAdapter((SpinnerAdapter) ArrayAdapter.createFromResource(this, dc6.bookMenuUserFacing, zh6.spinner_books_dropdown));
        spinner.setOnItemSelectedListener(this);
    }

    private void Z() {
        String[] stringArray = getResources().getStringArray(dc6.bookMenuUserFacing);
        String[] stringArray2 = getResources().getStringArray(dc6.bookMenuURL);
        for (int i = 0; i < stringArray.length; i++) {
            this.e.put(stringArray[i], stringArray2[i]);
        }
    }

    private String a0(String str) {
        return this.e.containsKey(str) ? (String) this.e.get(str) : "";
    }

    private void b0() {
        this.compositeDisposable.add(this.dialogUpdater.subscribe(new Consumer() { // from class: ba0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.d0((Book) obj);
            }
        }, new Consumer() { // from class: ca0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.e0((Throwable) obj);
            }
        }));
    }

    private void c0() {
        setSupportActionBar((Toolbar) findViewById(gg6.toolbar));
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.setDisplayOptions(20);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setCustomView(getLayoutInflater().inflate(zh6.action_bar_books, (ViewGroup) null), new x3.a(-1, -2, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(Book book) {
        View inflate = getLayoutInflater().inflate(zh6.row_books_result_expand, (ViewGroup) null);
        ((BookDialogView) inflate.findViewById(hg6.card_view_expanded)).setData(book);
        Dialog X = X(inflate);
        X.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        X.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(BookCategory bookCategory) {
        this.bookListUpdater.onNext(bookCategory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource h0(String str) {
        return this.bookStore.b(str).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i0(BookCategory bookCategory) {
        return (bookCategory == null || bookCategory.books() == null || bookCategory.books().size() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ArrayList j0(ArrayList arrayList, BookCategory bookCategory) {
        arrayList.add(bookCategory);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(ArrayList arrayList) {
        this.otherListsUpdater.onNext(arrayList);
    }

    private void m0(String str) {
        this.compositeDisposable.add(this.bookStore.b(a0(str)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: da0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.f0((BookCategory) obj);
            }
        }, new Consumer() { // from class: ea0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.g0((Throwable) obj);
            }
        }));
    }

    private void n0() {
        this.compositeDisposable.add(Observable.fromArray(getResources().getStringArray(dc6.otherListsURL)).observeOn(Schedulers.io()).flatMap(new Function() { // from class: fa0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource h0;
                h0 = BooksBestSellersActivity.this.h0((String) obj);
                return h0;
            }
        }).filter(new Predicate() { // from class: ga0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean i0;
                i0 = BooksBestSellersActivity.i0((BookCategory) obj);
                return i0;
            }
        }).reduce(new ArrayList(), new BiFunction() { // from class: ha0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ArrayList j0;
                j0 = BooksBestSellersActivity.j0((ArrayList) obj, (BookCategory) obj2);
                return j0;
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ia0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.k0((ArrayList) obj);
            }
        }, new Consumer() { // from class: ja0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BooksBestSellersActivity.this.l0((Throwable) obj);
            }
        }));
    }

    Dialog X(View view) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void l0(Throwable th) {
        int i = em6.no_network_message;
        NYTLogger.h(th);
        this.snackbarUtil.t(i);
    }

    @Override // com.nytimes.android.bestsellers.d, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zh6.activity_books);
        Z();
        Y();
        c0();
        b0();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String string = getResources().getString(bk6.otherWeeklyLists);
        String obj = adapterView.getItemAtPosition(i).toString();
        if (obj.equals(string)) {
            n0();
        } else {
            m0(obj);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            getOnBackPressedDispatcher().l();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.analyticsClient.B(-1);
    }
}
