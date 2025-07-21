package com.nytimes.android.video.sectionfront.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.nytimes.android.video.sectionfront.ui.VideoEndOverlay;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.c04;
import defpackage.e79;
import defpackage.ho4;
import defpackage.q79;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class VideoEndOverlay extends b {
    private final q79 c;
    private final c04 d;
    public ho4 sharingManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoEndOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(VideoEndOverlay videoEndOverlay, e79 e79Var, View view) {
        zq3.h(videoEndOverlay, "this$0");
        zq3.h(e79Var, "$item");
        videoEndOverlay.getFbShareDialog().g(((ShareLinkContent.a) new ShareLinkContent.a().h(Uri.parse(e79Var.h()))).n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(VideoEndOverlay videoEndOverlay, e79 e79Var, View view) {
        zq3.h(videoEndOverlay, "this$0");
        zq3.h(e79Var, "$item");
        videoEndOverlay.getSharingManager().b(videoEndOverlay.getActivity(), e79Var.g(), e79Var.h(), e79Var.b(), e79Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(VideoEndOverlay videoEndOverlay, e79 e79Var, View view) {
        zq3.h(videoEndOverlay, "this$0");
        zq3.h(e79Var, "$item");
        videoEndOverlay.getSharingManager().a(videoEndOverlay.getActivity(), e79Var.h(), e79Var.g(), e79Var.b(), e79Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(VideoEndOverlay videoEndOverlay, e79 e79Var, View view) {
        zq3.h(videoEndOverlay, "this$0");
        zq3.h(e79Var, "$item");
        videoEndOverlay.getSharingManager().c(videoEndOverlay.getActivity(), e79Var.h(), e79Var.g(), null, e79Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        Context context = getContext();
        zq3.f(context, "null cannot be cast to non-null type dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper");
        Context baseContext = ((ViewComponentManager.FragmentContextWrapper) context).getBaseContext();
        zq3.f(baseContext, "null cannot be cast to non-null type android.app.Activity");
        return (Activity) baseContext;
    }

    private final ShareDialog getFbShareDialog() {
        return (ShareDialog) this.d.getValue();
    }

    public final void U(final e79 e79Var) {
        zq3.h(e79Var, "item");
        this.c.l.s(e79Var);
        this.c.m.setText(e79Var.g());
        this.c.e.setOnClickListener(new View.OnClickListener() { // from class: m79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoEndOverlay.W(VideoEndOverlay.this, e79Var, view);
            }
        });
        this.c.k.setOnClickListener(new View.OnClickListener() { // from class: n79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoEndOverlay.X(VideoEndOverlay.this, e79Var, view);
            }
        });
        this.c.d.setOnClickListener(new View.OnClickListener() { // from class: o79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoEndOverlay.Z(VideoEndOverlay.this, e79Var, view);
            }
        });
        this.c.b.setOnClickListener(new View.OnClickListener() { // from class: p79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoEndOverlay.d0(VideoEndOverlay.this, e79Var, view);
            }
        });
    }

    public final ho4 getSharingManager() {
        ho4 ho4Var = this.sharingManager;
        if (ho4Var != null) {
            return ho4Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    public final void setSharingManager(ho4 ho4Var) {
        zq3.h(ho4Var, "<set-?>");
        this.sharingManager = ho4Var;
    }

    public /* synthetic */ VideoEndOverlay(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEndOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        q79 c = q79.c(LayoutInflater.from(context), this, true);
        zq3.g(c, "inflate(...)");
        this.c = c;
        this.d = c.a(new qs2() { // from class: com.nytimes.android.video.sectionfront.ui.VideoEndOverlay$fbShareDialog$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShareDialog mo865invoke() {
                Activity activity;
                activity = VideoEndOverlay.this.getActivity();
                return new ShareDialog(activity);
            }
        });
    }
}
