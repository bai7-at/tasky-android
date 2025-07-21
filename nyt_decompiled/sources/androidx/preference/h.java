package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.k99;
import defpackage.rf6;

/* loaded from: classes.dex */
public class h extends RecyclerView.d0 {
    private ColorStateList B;
    private final SparseArray H;
    private boolean L;
    private boolean M;
    private final Drawable y;

    h(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.H = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i = rf6.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.y = view.getBackground();
        if (textView != null) {
            this.B = textView.getTextColors();
        }
    }

    public View W(int i) {
        View view = (View) this.H.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            this.H.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean X() {
        return this.L;
    }

    public boolean Y() {
        return this.M;
    }

    void Z() {
        Drawable background = this.a.getBackground();
        Drawable drawable = this.y;
        if (background != drawable) {
            k99.p0(this.a, drawable);
        }
        TextView textView = (TextView) W(R.id.title);
        if (textView == null || this.B == null || textView.getTextColors().equals(this.B)) {
            return;
        }
        textView.setTextColor(this.B);
    }

    public void a0(boolean z) {
        this.L = z;
    }

    public void b0(boolean z) {
        this.M = z;
    }
}
