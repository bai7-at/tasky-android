package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.bestsellers.vo.BookCategory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class la0 extends RecyclerView.d0 {
    private final TextView B;
    private final Context H;
    private final SimpleDateFormat L;
    private final SimpleDateFormat M;
    private final TextView y;

    la0(View view) {
        super(view);
        this.y = (TextView) view.findViewById(hg6.books_headline_date);
        this.B = (TextView) view.findViewById(hg6.books_summary_date);
        this.H = view.getContext();
        this.L = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        this.M = new SimpleDateFormat("MMMM d, yyyy", Locale.getDefault());
    }

    private String W(String str) {
        Date date;
        try {
            date = this.L.parse(str);
        } catch (Exception unused) {
            date = new Date();
        }
        return this.M.format(date);
    }

    public void X(BookCategory bookCategory) {
        String W = W(bookCategory.headlineDate());
        String W2 = W(bookCategory.summaryDate());
        this.y.setText(this.H.getString(bk6.bookHeadlineDate, W));
        this.B.setText(this.H.getString(bk6.booksHeadSummaryText, W2));
    }
}
