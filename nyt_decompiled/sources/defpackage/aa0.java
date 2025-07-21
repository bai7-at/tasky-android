package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.bestsellers.vo.Book;
import com.nytimes.android.bestsellers.vo.BookCategory;
import io.reactivex.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class aa0 extends RecyclerView.Adapter {
    private List d = Collections.EMPTY_LIST;
    private BookCategory e;
    private final PublishSubject f;

    public aa0(PublishSubject publishSubject) {
        this.f = publishSubject;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 B(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new z70(LayoutInflater.from(viewGroup.getContext()).inflate(zh6.row_books_result, viewGroup, false), this.f);
        }
        if (i == 2) {
            return new la0(LayoutInflater.from(viewGroup.getContext()).inflate(zh6.book_header_view, viewGroup, false));
        }
        return null;
    }

    public void K(BookCategory bookCategory) {
        this.e = bookCategory;
        this.d = bookCategory.books();
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        return i == 0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void z(RecyclerView.d0 d0Var, int i) {
        if (i == 0) {
            ((la0) d0Var).X(this.e);
        } else {
            ((z70) d0Var).Z((Book) this.d.get(i - 1));
        }
    }
}
