package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nytimes.android.logging.NYTLogger;
import defpackage.fg6;
import defpackage.fy;
import defpackage.gy6;
import defpackage.og3;
import defpackage.yh6;

/* loaded from: classes4.dex */
public class AudioInfoView extends LinearLayout {
    ImageView a;
    TextView b;

    class a implements gy6 {
        final /* synthetic */ fy a;

        a(fy fyVar) {
            this.a = fyVar;
        }

        @Override // defpackage.gy6
        public void a(Exception exc) {
            AudioInfoView.this.c();
            AudioInfoView audioInfoView = AudioInfoView.this;
            audioInfoView.b.setText(audioInfoView.e(this.a.b()));
            NYTLogger.h(exc);
        }

        @Override // defpackage.gy6
        public void b() {
            AudioInfoView.this.d();
            AudioInfoView audioInfoView = AudioInfoView.this;
            audioInfoView.b.setText(audioInfoView.e(this.a.b()));
        }
    }

    public AudioInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return str == null ? "" : str;
    }

    public void b(fy fyVar) {
        if (fyVar.a() != null) {
            og3.c().o(fyVar.a()).a(this.a, new a(fyVar));
        } else {
            c();
            this.b.setText(e(fyVar.b()));
        }
    }

    void c() {
        this.a.setVisibility(8);
        setGravity(17);
    }

    void d() {
        this.a.setVisibility(0);
        setGravity(8388627);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        og3.b(this.a);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(fg6.media_icon);
        this.b = (TextView) findViewById(fg6.media_title);
    }

    public AudioInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        View.inflate(getContext(), yh6.audio_info_view_contents, this);
    }
}
