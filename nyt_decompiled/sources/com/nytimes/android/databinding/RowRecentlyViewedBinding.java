package com.nytimes.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eg6;
import defpackage.f99;
import defpackage.g99;
import defpackage.wh6;

/* loaded from: classes4.dex */
public final class RowRecentlyViewedBinding implements f99 {
    public final Barrier contentBarrier;
    private final CardView rootView;
    public final TextView rowRecentlyViewedCommentCount;
    public final ConstraintLayout rowRecentlyViewedContent;
    public final TextView rowRecentlyViewedHeadline;
    public final TextView rowRecentlyViewedKicker;
    public final TextView rowRecentlyViewedLastAccessed;
    public final ImageView rowRecentlyViewedOverlay;
    public final ImageView rowRecentlyViewedPicture;
    public final ImageView rowRecentlyViewedSaveIcon;
    public final ImageView rowRecentlyViewedShareIcon;
    public final TextView rowRecentlyViewedSummary;

    private RowRecentlyViewedBinding(CardView cardView, Barrier barrier, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView5) {
        this.rootView = cardView;
        this.contentBarrier = barrier;
        this.rowRecentlyViewedCommentCount = textView;
        this.rowRecentlyViewedContent = constraintLayout;
        this.rowRecentlyViewedHeadline = textView2;
        this.rowRecentlyViewedKicker = textView3;
        this.rowRecentlyViewedLastAccessed = textView4;
        this.rowRecentlyViewedOverlay = imageView;
        this.rowRecentlyViewedPicture = imageView2;
        this.rowRecentlyViewedSaveIcon = imageView3;
        this.rowRecentlyViewedShareIcon = imageView4;
        this.rowRecentlyViewedSummary = textView5;
    }

    public static RowRecentlyViewedBinding bind(View view) {
        int i = eg6.content_barrier;
        Barrier barrier = (Barrier) g99.a(view, i);
        if (barrier != null) {
            i = eg6.row_recently_viewed_comment_count;
            TextView textView = (TextView) g99.a(view, i);
            if (textView != null) {
                i = eg6.row_recently_viewed_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) g99.a(view, i);
                if (constraintLayout != null) {
                    i = eg6.row_recently_viewed_headline;
                    TextView textView2 = (TextView) g99.a(view, i);
                    if (textView2 != null) {
                        i = eg6.row_recently_viewed_kicker;
                        TextView textView3 = (TextView) g99.a(view, i);
                        if (textView3 != null) {
                            i = eg6.row_recently_viewed_last_accessed;
                            TextView textView4 = (TextView) g99.a(view, i);
                            if (textView4 != null) {
                                i = eg6.row_recently_viewed_overlay;
                                ImageView imageView = (ImageView) g99.a(view, i);
                                if (imageView != null) {
                                    i = eg6.row_recently_viewed_picture;
                                    ImageView imageView2 = (ImageView) g99.a(view, i);
                                    if (imageView2 != null) {
                                        i = eg6.row_recently_viewed_save_icon;
                                        ImageView imageView3 = (ImageView) g99.a(view, i);
                                        if (imageView3 != null) {
                                            i = eg6.row_recently_viewed_share_icon;
                                            ImageView imageView4 = (ImageView) g99.a(view, i);
                                            if (imageView4 != null) {
                                                i = eg6.row_recently_viewed_summary;
                                                TextView textView5 = (TextView) g99.a(view, i);
                                                if (textView5 != null) {
                                                    return new RowRecentlyViewedBinding((CardView) view, barrier, textView, constraintLayout, textView2, textView3, textView4, imageView, imageView2, imageView3, imageView4, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RowRecentlyViewedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowRecentlyViewedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(wh6.row_recently_viewed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.f99
    public CardView getRoot() {
        return this.rootView;
    }
}
