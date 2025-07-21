package com.nytimes.android.media.audio.views;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.nytimes.android.media.audio.views.AudioLayoutFooter;
import defpackage.cx;
import defpackage.em6;
import defpackage.fg6;
import defpackage.ld1;
import defpackage.uq7;
import defpackage.yh6;
import defpackage.zm8;

/* loaded from: classes4.dex */
public class AudioLayoutFooter extends k {
    Activity activity;
    private AppCompatImageView c;
    private AppCompatImageView d;
    ld1 deepLinkUtils;
    private TextView e;
    uq7 sharingManager;

    public AudioLayoutFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        zm8.a(getContext(), "Save to be implemented when asset is available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(cx cxVar, View view) {
        if (cxVar.b() == null || cxVar.d() == null) {
            return;
        }
        this.sharingManager.l((Activity) getContext(), cxVar.b(), cxVar.d(), null, cxVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(cx cxVar, View view) {
        if (this.deepLinkUtils.e()) {
            this.deepLinkUtils.c(this.activity, cxVar.c());
        } else {
            Toast.makeText(getContext(), em6.no_network_message, 0).show();
        }
    }

    public void g(final cx cxVar) {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: gy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioLayoutFooter.this.h(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: hy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioLayoutFooter.this.i(cxVar, view);
            }
        });
        if (cxVar.c() == null || TextUtils.isEmpty(cxVar.c())) {
            this.e.setOnClickListener(null);
            setVisibility(8);
        } else {
            setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: iy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioLayoutFooter.this.j(cxVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (AppCompatImageView) findViewById(fg6.save_icon);
        this.d = (AppCompatImageView) findViewById(fg6.share_icon);
        this.e = (TextView) findViewById(fg6.subscribe_hint);
    }

    public AudioLayoutFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), yh6.audio_layout_footer_contents, this);
    }
}
