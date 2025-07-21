package com.nytimes.android.growthui.common.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.m07;
import defpackage.ma3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class HtmlTextKt {
    public static final void a(final Modifier modifier, final String str, final float f, final int i, Composer composer, final int i2) {
        int i3;
        zq3.h(modifier, "modifier");
        zq3.h(str, "htmlString");
        Composer h = composer.h(205916446);
        if ((i2 & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.b(f) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.d(i) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(205916446, i3, -1, "com.nytimes.android.growthui.common.components.HtmlText (HtmlText.kt:18)");
            }
            h.z(1161348045);
            boolean S = h.S(str) | h.b(f) | h.d(i);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.growthui.common.components.HtmlTextKt$HtmlText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final TextView invoke(Context context) {
                        zq3.h(context, "context");
                        TextView textView = new TextView(context);
                        String str2 = str;
                        float f2 = f;
                        int i4 = i;
                        textView.setText(ma3.a(str2, 63));
                        textView.setLineSpacing(0.0f, 1.5f);
                        textView.setTextSize(f2);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setLinkTextColor(ColorStateList.valueOf(i4));
                        textView.setTypeface(m07.g(context, R.font.font_franklin_medium));
                        textView.setTextColor(ColorStateList.valueOf(i4));
                        return textView;
                    }
                };
                h.q(A);
            }
            ss2 ss2Var = (ss2) A;
            h.R();
            h.z(1161367027);
            boolean S2 = h.S(str);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.growthui.common.components.HtmlTextKt$HtmlText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return ww8.a;
                    }

                    public final void invoke(TextView textView) {
                        zq3.h(textView, "it");
                        textView.setText(ma3.a(str, 63));
                    }
                };
                h.q(A2);
            }
            h.R();
            AndroidView_androidKt.b(ss2Var, modifier, (ss2) A2, h, (i3 << 3) & ContentType.LONG_FORM_ON_DEMAND, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.HtmlTextKt$HtmlText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    HtmlTextKt.a(Modifier.this, str, f, i, composer2, i2 | 1);
                }
            });
        }
    }
}
