package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.nytimes.android.bestsellers.vo.Book;
import io.reactivex.subjects.PublishSubject;
import java.util.Locale;

/* loaded from: classes.dex */
public class z70 extends RecyclerView.d0 {
    public TextView B;
    public TextView H;
    public TextView L;
    public ImageView M;
    public CardView N;
    private final PublishSubject Q;
    private final ImageView S;
    private final ImageView X;
    public TextView y;

    public z70(View view, PublishSubject publishSubject) {
        super(view);
        this.Q = publishSubject;
        view.setTag(this);
        this.y = (TextView) view.findViewById(hg6.books_title);
        this.B = (TextView) view.findViewById(hg6.books_author);
        this.N = (CardView) view.findViewById(hg6.card_view);
        this.H = (TextView) view.findViewById(hg6.books_rank);
        this.L = (TextView) view.findViewById(hg6.books_summary);
        this.M = (ImageView) view.findViewById(hg6.books_image);
        this.S = (ImageView) view.findViewById(hg6.new_tag);
        this.X = (ImageView) view.findViewById(hg6.rank_arrow);
    }

    private void X(int i) {
        this.X.setRotation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Book book, View view) {
        this.Q.onNext(book);
    }

    private void a0(int i) {
        Drawable mutate = this.X.getDrawable().mutate();
        this.X.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.X.setImageDrawable(mutate);
    }

    private void b0() {
        this.X.setVisibility(8);
    }

    private void c0() {
        this.X.setVisibility(0);
    }

    private void d0(boolean z, boolean z2) {
        if (z && z2) {
            this.S.setVisibility(0);
        } else {
            this.S.setVisibility(8);
        }
    }

    private void e0(boolean z, boolean z2, int i, int i2) {
        f0(i < i2, i == i2, z, z2);
    }

    private void f0(boolean z, boolean z2, boolean z3, boolean z4) {
        int color;
        int i;
        if (z3 || z4 || z2) {
            b0();
            return;
        }
        if (z4) {
            return;
        }
        c0();
        Resources resources = this.X.getContext().getResources();
        if (z) {
            color = resources.getColor(od6.arrow_green);
            i = 90;
        } else {
            color = resources.getColor(od6.arrow_red);
            i = 270;
        }
        a0(color);
        X(i);
    }

    public void Z(final Book book) {
        this.H.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(book.currentRank())));
        this.y.setText(book.title());
        this.B.setText(book.author());
        String summary = book.summary();
        TextView textView = this.L;
        if (summary == null) {
            summary = "";
        }
        textView.setText(summary);
        if (book.imageURL() == null) {
            og3.c().g(jf6.book_place_holder).p(this.M);
        } else {
            og3.c().o(book.imageURL()).l(jf6.book_place_holder).p(this.M);
        }
        this.y.setTextSize(2, 15.0f);
        int rankLastWeek = book.rankLastWeek();
        int currentRank = book.currentRank();
        boolean z = book.numWeeks() <= 1;
        boolean z2 = book.rankLastWeek() == 0;
        d0(z, z2);
        e0(z, z2, currentRank, rankLastWeek);
        this.y.setVisibility(0);
        this.B.setVisibility(0);
        this.H.setVisibility(0);
        this.L.setVisibility(0);
        this.M.setVisibility(0);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: y70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z70.this.Y(book, view);
            }
        });
    }
}
