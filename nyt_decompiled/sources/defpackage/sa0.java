package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.bestsellers.BookCategoryRepository;
import com.nytimes.android.bestsellers.BooksBestSellersActivity;
import com.nytimes.android.bestsellers.vo.Book;
import com.nytimes.android.bestsellers.vo.BookCategory;
import com.nytimes.android.sectionfront.adapter.viewholder.a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
public class sa0 extends a {
    final TextView L;
    final TextView M;
    private final BookCategoryRepository N;
    private final String Q;
    private final ImageView S;
    private final RelativeLayout X;
    private final SimpleDateFormat Y;
    private final SimpleDateFormat Z;
    private final CompositeDisposable e0;

    public sa0(View view, BookCategoryRepository bookCategoryRepository) {
        super(view);
        this.e0 = new CompositeDisposable();
        this.S = (ImageView) view.findViewById(pg6.books_sf_image);
        this.L = (TextView) view.findViewById(pg6.books_sf_title);
        this.M = (TextView) view.findViewById(pg6.books_sf_snippet);
        this.X = (RelativeLayout) view.findViewById(pg6.books_sf_layout);
        this.Q = view.getContext().getString(bk6.booksButtonTitle);
        this.N = bookCategoryRepository;
        this.Y = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        this.Z = new SimpleDateFormat("MMMM dd", Locale.getDefault());
        p0();
    }

    private void i0(Book book) {
        (book.imageURL() == null ? og3.c().g(jf6.book_place_holder) : og3.c().o(book.imageURL())).l(jf6.book_place_holder).n(this.a.getContext().getResources().getInteger(nh6.best_sellers_button_book_image_width), this.a.getContext().getResources().getInteger(nh6.best_sellers_button_book_image_height)).p(this.S);
    }

    private String k0(String str) {
        Date date;
        try {
            date = this.Y.parse(str);
        } catch (Exception unused) {
            date = new Date();
        }
        return this.Z.format(date);
    }

    private String l0(BookCategory bookCategory, Book book) {
        return "\"" + gp2.b(book.title()) + "\" is No. " + book.currentRank() + " on the " + bookCategory.categoryName() + " list for " + k0(bookCategory.headlineDate()) + InstructionFileId.DOT;
    }

    private Observable m0() {
        return this.N.c("hardcover-fiction", true).toObservable().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(View view) {
        tr8.a(new Intent(this.a.getContext(), (Class<?>) BooksBestSellersActivity.class), (Activity) dagger.hilt.android.internal.managers.a.d(this.a.getContext()));
    }

    private void p0() {
        this.X.setOnClickListener(new View.OnClickListener() { // from class: qa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sa0.this.n0(view);
            }
        });
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void c0() {
        super.c0();
        this.e0.clear();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.S.setImageDrawable(null);
    }

    public void j0() {
        this.e0.add(m0().subscribe(new Consumer() { // from class: ra0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                sa0.this.o0((BookCategory) obj);
            }
        }, new g05(sa0.class)));
    }

    public void o0(BookCategory bookCategory) {
        Book book = bookCategory.books().get(0);
        this.L.setText(this.Q);
        i0(book);
        this.M.setText(l0(bookCategory, book));
    }
}
