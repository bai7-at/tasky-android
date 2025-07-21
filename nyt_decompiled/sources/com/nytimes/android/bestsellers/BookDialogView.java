package com.nytimes.android.bestsellers;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nytimes.android.analytics.event.values.EnabledOrDisabled;
import com.nytimes.android.bestsellers.vo.Book;
import defpackage.bk6;
import defpackage.gp2;
import defpackage.hg6;
import defpackage.id9;
import defpackage.jf6;
import defpackage.jq;
import defpackage.od6;
import defpackage.og3;
import defpackage.qd6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes.dex */
public class BookDialogView extends com.nytimes.android.bestsellers.c {
    private TextView B;
    private ImageView H;
    private TextView L;
    private ImageView M;
    private ImageView N;
    private View Q;
    protected jq articleEventReporter;
    boolean l;
    TextView m;
    TextView n;
    TextView r;
    TextView s;
    Book t;
    private TextView u;
    private TextView w;
    protected id9 webActivityNavigator;
    private TextView x;
    private TextView y;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            BookDialogView bookDialogView = BookDialogView.this;
            bookDialogView.m.setTextColor(bookDialogView.getResources().getColor(qd6.ds_gray88));
            BookDialogView bookDialogView2 = BookDialogView.this;
            bookDialogView2.p(view, bookDialogView2.t.bookReviewLink());
            BookDialogView bookDialogView3 = BookDialogView.this;
            bookDialogView3.q(bookDialogView3.t.bookReviewLink());
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            BookDialogView bookDialogView = BookDialogView.this;
            bookDialogView.n.setTextColor(bookDialogView.getResources().getColor(qd6.ds_gray88));
            BookDialogView bookDialogView2 = BookDialogView.this;
            bookDialogView2.p(view, bookDialogView2.t.sundayReviewLink());
            BookDialogView bookDialogView3 = BookDialogView.this;
            bookDialogView3.q(bookDialogView3.t.sundayReviewLink());
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            BookDialogView bookDialogView = BookDialogView.this;
            bookDialogView.r.setTextColor(bookDialogView.getResources().getColor(qd6.ds_gray88));
            BookDialogView bookDialogView2 = BookDialogView.this;
            bookDialogView2.p(view, bookDialogView2.t.firstChapterLink());
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            BookDialogView bookDialogView = BookDialogView.this;
            bookDialogView.s.setTextColor(bookDialogView.getResources().getColor(qd6.ds_gray88));
            BookDialogView bookDialogView2 = BookDialogView.this;
            bookDialogView2.p(view, bookDialogView2.t.articleChapterLink());
        }
    }

    public BookDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        Drawable mutate = this.M.getDrawable().mutate();
        Drawable mutate2 = this.N.getDrawable().mutate();
        int color = getContext().getColor(od6.arrow_green);
        if (mutate != null) {
            mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
        this.M.setImageDrawable(mutate);
        int color2 = getContext().getColor(od6.arrow_red);
        if (mutate2 != null) {
            mutate2.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        }
        this.N.setImageDrawable(mutate2);
    }

    private void C() {
        this.M.setVisibility(8);
        this.N.setVisibility(0);
    }

    private void F() {
        String firstChapterLink = this.t.firstChapterLink();
        if (this.r != null) {
            if (firstChapterLink.equals("")) {
                this.r.setVisibility(8);
                return;
            }
            this.l = true;
            this.r.setVisibility(0);
            this.r.setText(getResources().getString(bk6.bookFirstChapter));
        }
    }

    private void N() {
        if (this.l) {
            this.Q.setVisibility(0);
        } else {
            this.Q.setVisibility(8);
        }
        this.l = false;
    }

    private void O() {
        z();
        d0();
        F();
        X();
        N();
    }

    private void R() {
        this.m.setOnClickListener(new a());
        this.n.setOnClickListener(new b());
        this.r.setOnClickListener(new c());
        this.s.setOnClickListener(new d());
    }

    private void U(int i, int i2, int i3) {
        boolean z = i > 1 && i3 != 0;
        boolean z2 = i2 < i3;
        if (!z) {
            s();
            return;
        }
        if (z2) {
            r();
        } else if (i2 > i3) {
            C();
        } else if (i2 == i3) {
            s();
        }
    }

    private void W(int i, int i2) {
        setCurrentRank(i);
        setLastWeekRank(i2);
    }

    private void X() {
        String articleChapterLink = this.t.articleChapterLink();
        if (this.s != null) {
            if (articleChapterLink.equals("")) {
                this.s.setVisibility(8);
                return;
            }
            this.l = true;
            this.s.setVisibility(0);
            this.s.setText(getResources().getString(bk6.bookSelectedChapter));
        }
    }

    private void Z() {
        if (this.t.summary() == null) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
            this.B.setText(this.t.summary());
        }
    }

    private void d0() {
        String sundayReviewLink = this.t.sundayReviewLink();
        if (this.n != null) {
            if (sundayReviewLink.equals("")) {
                this.n.setVisibility(8);
                return;
            }
            this.l = true;
            this.n.setVisibility(0);
            this.n.setText(getResources().getString(bk6.bookSundayReview));
        }
    }

    private void r() {
        this.M.setVisibility(0);
        this.N.setVisibility(8);
    }

    private void s() {
        this.M.setVisibility(8);
        this.N.setVisibility(8);
    }

    private void setCurrentRank(int i) {
        this.x.setText(getResources().getString(bk6.currentRank_des) + " " + i);
    }

    private void setLastWeekRank(int i) {
        String str = getResources().getString(bk6.lastWeekRank_des) + " " + i;
        if (i == 0) {
            this.y.setVisibility(8);
        } else {
            this.y.setText(str);
            this.y.setVisibility(0);
        }
    }

    private void setNumberWeeksOnList(int i) {
        String string = getResources().getString(bk6.newOnList_des);
        String str = getResources().getString(bk6.weeksOnList_des) + " " + Integer.toString(this.t.numWeeks());
        this.L.setVisibility(0);
        if (i <= 1) {
            this.L.setText(string);
        } else {
            this.L.setText(str);
        }
    }

    private void z() {
        String bookReviewLink = this.t.bookReviewLink();
        if (this.m != null) {
            if (bookReviewLink.equals("")) {
                this.m.setVisibility(8);
                return;
            }
            this.l = true;
            this.m.setVisibility(0);
            this.m.setText(getResources().getString(bk6.bookReview));
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.u = (TextView) findViewById(hg6.books_title_expanded);
        this.w = (TextView) findViewById(hg6.books_author_expanded);
        this.x = (TextView) findViewById(hg6.books_rank_expanded);
        this.y = (TextView) findViewById(hg6.rank_last_week_expanded);
        this.B = (TextView) findViewById(hg6.books_summary_expanded);
        this.H = (ImageView) findViewById(hg6.books_image_expanded);
        this.L = (TextView) findViewById(hg6.books_num_of_weeks_expanded);
        this.M = (ImageView) findViewById(hg6.rank_image_expanded);
        this.N = (ImageView) findViewById(hg6.rank_image_down_expanded);
        this.Q = findViewById(hg6.books_space_line);
        this.m = (TextView) findViewById(hg6.books_review_expanded);
        this.n = (TextView) findViewById(hg6.sunday_book_review_expanded);
        this.r = (TextView) findViewById(hg6.first_chapter_expanded);
        this.s = (TextView) findViewById(hg6.selected_chapter_expanded);
    }

    void p(View view, String str) {
        this.webActivityNavigator.c(view.getContext(), str);
    }

    void q(String str) {
        this.articleEventReporter.a("Best Sellers", str, "Books", EnabledOrDisabled.DISABLED);
    }

    public void setData(Book book) {
        this.t = book;
        this.u.setText(gp2.b(book.title()));
        this.w.setText(book.author());
        Z();
        if (book.imageURL() == null) {
            og3.c().g(jf6.book_place_holder).p(this.H);
        } else {
            og3.c().o(book.imageURL()).l(jf6.book_place_holder).p(this.H);
        }
        int numWeeks = book.numWeeks();
        int currentRank = book.currentRank();
        int rankLastWeek = book.rankLastWeek();
        setNumberWeeksOnList(numWeeks);
        W(currentRank, rankLastWeek);
        R();
        A();
        U(numWeeks, currentRank, rankLastWeek);
        O();
    }

    public BookDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
    }
}
