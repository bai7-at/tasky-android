package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.comments.common.ExtensionsKt;
import com.nytimes.android.databinding.RowRecentlyViewedBinding;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class ct6 extends RecyclerView.d0 {
    private final RowRecentlyViewedBinding B;
    private final ImageView H;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView Q;
    public final TextView S;
    private final hf5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct6(View view, hf5 hf5Var) {
        super(view);
        zq3.h(view, "itemView");
        zq3.h(hf5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.y = hf5Var;
        RowRecentlyViewedBinding bind = RowRecentlyViewedBinding.bind(view);
        zq3.g(bind, "bind(...)");
        this.B = bind;
        ImageView imageView = bind.rowRecentlyViewedPicture;
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        zq3.g(imageView, "apply(...)");
        this.H = imageView;
        TextView textView = bind.rowRecentlyViewedHeadline;
        zq3.g(textView, "rowRecentlyViewedHeadline");
        this.L = textView;
        TextView textView2 = bind.rowRecentlyViewedSummary;
        zq3.g(textView2, "rowRecentlyViewedSummary");
        this.M = textView2;
        TextView textView3 = bind.rowRecentlyViewedKicker;
        zq3.g(textView3, "rowRecentlyViewedKicker");
        this.N = textView3;
        TextView textView4 = bind.rowRecentlyViewedLastAccessed;
        zq3.g(textView4, "rowRecentlyViewedLastAccessed");
        this.Q = textView4;
        TextView textView5 = bind.rowRecentlyViewedCommentCount;
        zq3.g(textView5, "rowRecentlyViewedCommentCount");
        this.S = textView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(ct6 ct6Var, z18 z18Var, View view) {
        zq3.h(ct6Var, "this$0");
        zq3.h(z18Var, "$item");
        ct6Var.y.r0(z18Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ct6 ct6Var, z18 z18Var, View view) {
        zq3.h(ct6Var, "this$0");
        zq3.h(z18Var, "$item");
        ct6Var.y.E0(z18Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(ct6 ct6Var, z18 z18Var, View view) {
        zq3.h(ct6Var, "this$0");
        zq3.h(z18Var, "$item");
        ct6Var.y.D0(z18Var);
    }

    private final void f0(z18 z18Var) {
        if (z18Var.d() <= 0) {
            this.S.setVisibility(8);
            return;
        }
        this.S.setVisibility(0);
        TextView textView = this.S;
        Resources resources = this.a.getContext().getResources();
        zq3.g(resources, "getResources(...)");
        textView.setText(ExtensionsKt.loadCommentsStringFor(resources, z18Var.d()));
    }

    private final void g0(z18 z18Var) {
        if (z18Var.f() == null) {
            this.H.setVisibility(8);
        } else {
            this.H.setVisibility(0);
            og3.c().o(z18Var.f()).f().l(dd6.image_placeholder).j().p(this.H);
        }
    }

    private final void h0(z18 z18Var) {
        String g = z18Var.g();
        if (g == null || h.d0(g)) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setText(z18Var.g());
        View view = this.a;
        zq3.g(view, "itemView");
        this.N.setCompoundDrawablesWithIntrinsicBounds(dx3.a(view, z18Var, false), (Drawable) null, (Drawable) null, (Drawable) null);
        this.N.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.equals(com.nytimes.android.api.cms.AssetConstants.SLIDESHOW_TYPE) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r3.equals(com.nytimes.android.api.cms.AssetConstants.IMAGE_SLIDESHOW_TYPE) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        r1 = defpackage.oe6.ic_media_overlay_slideshow_lg;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i0(defpackage.z18 r3) {
        /*
            r2 = this;
            android.widget.ImageView r0 = r2.H
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 == 0) goto La
            goto L42
        La:
            java.lang.String r3 = r3.c()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795551698: goto L37;
                case -542673043: goto L2b;
                case 112202875: goto L1f;
                case 899908915: goto L16;
                default: goto L15;
            }
        L15:
            goto L42
        L16:
            java.lang.String r0 = "imageslideshow"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto L42
        L1f:
            java.lang.String r0 = "video"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L28
            goto L42
        L28:
            int r1 = defpackage.oe6.ic_media_overlay_video_lg
            goto L42
        L2b:
            java.lang.String r0 = "interactivegraphics"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L42
        L34:
            int r1 = defpackage.ie6.ic_media_overlay_interactive_sm
            goto L42
        L37:
            java.lang.String r0 = "slideshow"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto L42
        L40:
            int r1 = defpackage.oe6.ic_media_overlay_slideshow_lg
        L42:
            com.nytimes.android.databinding.RowRecentlyViewedBinding r2 = r2.B
            android.widget.ImageView r2 = r2.rowRecentlyViewedOverlay
            r2.setImageResource(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct6.i0(z18):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(View view) {
    }

    public final void b0(final z18 z18Var) {
        zq3.h(z18Var, "item");
        this.L.setText(z18Var.m());
        this.M.setText(z18Var.l());
        this.Q.setText(c28.b(z18Var));
        h0(z18Var);
        f0(z18Var);
        g0(z18Var);
        i0(z18Var);
        this.B.rowRecentlyViewedContent.setOnClickListener(new View.OnClickListener() { // from class: zs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ct6.c0(ct6.this, z18Var, view);
            }
        });
        this.B.rowRecentlyViewedShareIcon.setOnClickListener(new View.OnClickListener() { // from class: at6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ct6.d0(ct6.this, z18Var, view);
            }
        });
        this.B.rowRecentlyViewedSaveIcon.setOnClickListener(new View.OnClickListener() { // from class: bt6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ct6.e0(ct6.this, z18Var, view);
            }
        });
        this.B.rowRecentlyViewedSaveIcon.setActivated(this.y.W(z18Var));
        this.B.rowRecentlyViewedSaveIcon.setSelected(this.y.W(z18Var));
    }

    public final void j0() {
        og3.b(this.H);
        this.H.setImageBitmap(null);
        this.B.rowRecentlyViewedContent.setOnClickListener(new View.OnClickListener() { // from class: xs6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ct6.k0(view);
            }
        });
        this.B.rowRecentlyViewedShareIcon.setOnClickListener(new View.OnClickListener() { // from class: ys6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ct6.l0(view);
            }
        });
    }
}
