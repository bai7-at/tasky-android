package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.nytimes.android.widget.SectionFrontRecyclerView;

/* loaded from: classes4.dex */
public final class hq2 implements f99 {
    private final FrameLayout a;
    public final ProgressBar b;
    public final SectionFrontRecyclerView c;

    private hq2(FrameLayout frameLayout, ProgressBar progressBar, SectionFrontRecyclerView sectionFrontRecyclerView) {
        this.a = frameLayout;
        this.b = progressBar;
        this.c = sectionFrontRecyclerView;
    }

    public static hq2 a(View view) {
        int i = pg6.progress_indicator;
        ProgressBar progressBar = (ProgressBar) g99.a(view, i);
        if (progressBar != null) {
            i = pg6.sectionFrontRecyclerView;
            SectionFrontRecyclerView sectionFrontRecyclerView = (SectionFrontRecyclerView) g99.a(view, i);
            if (sectionFrontRecyclerView != null) {
                return new hq2((FrameLayout) view, progressBar, sectionFrontRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static hq2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(hi6.fragment_section_front, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.a;
    }
}
