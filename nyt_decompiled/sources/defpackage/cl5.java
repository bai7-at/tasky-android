package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.nytimes.android.bestsellers.vo.Book;
import com.nytimes.android.bestsellers.vo.BookCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class cl5 extends RecyclerView.d0 {
    private final List B;
    public TextView y;

    cl5(View view) {
        super(view);
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        this.y = (TextView) view.findViewById(hg6.book_other_category);
        arrayList.add(Integer.valueOf(hg6.other_rank_1));
        arrayList.add(Integer.valueOf(hg6.other_rank_2));
        arrayList.add(Integer.valueOf(hg6.other_rank_3));
        arrayList.add(Integer.valueOf(hg6.other_rank_4));
        arrayList.add(Integer.valueOf(hg6.other_rank_5));
    }

    private void W(List list, int i, int i2) {
        RelativeLayout relativeLayout = (RelativeLayout) this.a.findViewById(i);
        TextView textView = (TextView) relativeLayout.findViewById(hg6.other_books_rank);
        TextView textView2 = (TextView) relativeLayout.findViewById(hg6.other_books_title);
        TextView textView3 = (TextView) relativeLayout.findViewById(hg6.other_books_author);
        textView.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i2 + 1)));
        textView2.setText(((Book) list.get(i2)).title());
        textView3.setText(((Book) list.get(i2)).author());
        textView2.setVisibility(0);
        textView3.setVisibility(0);
    }

    public void X(BookCategory bookCategory) {
        this.y.setText(bookCategory.categoryName());
        for (int i = 0; i < this.B.size(); i++) {
            W(bookCategory.books(), ((Integer) this.B.get(i)).intValue(), i);
        }
    }
}
