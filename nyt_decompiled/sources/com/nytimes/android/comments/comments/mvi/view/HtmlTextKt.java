package com.nytimes.android.comments.comments.mvi.view;

import android.content.Context;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import defpackage.cc7;
import defpackage.gd6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.lf6;
import defpackage.m07;
import defpackage.ma3;
import defpackage.mx0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class HtmlTextKt {
    public static final void HtmlText(final String str, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(str, "htmlText");
        Composer h = composer.h(1485139256);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(1485139256, i3, -1, "com.nytimes.android.comments.comments.mvi.view.HtmlText (HtmlText.kt:18)");
            }
            final Spanned a = ma3.a(str, 63);
            zq3.g(a, "fromHtml(...)");
            AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.HtmlTextKt$HtmlText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public final TextView invoke(Context context) {
                    zq3.h(context, "context");
                    TextView textView = new TextView(context);
                    Spanned spanned = a;
                    textView.setContentDescription("Comment Text");
                    textView.setText(spanned);
                    textView.setLineSpacing(0.0f, 1.2f);
                    textView.setTextSize(14.0f);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setLinkTextColor(mx0.c(context, gd6.signal_editorial));
                    textView.setTypeface(m07.g(context, lf6.font_franklin_medium));
                    textView.setTextColor(mx0.c(context, gd6.content_primary));
                    return textView;
                }
            }, modifier, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.HtmlTextKt$HtmlText$2
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
                    zq3.h(textView, "view");
                    textView.setText(a);
                }
            }, h, i3 & ContentType.LONG_FORM_ON_DEMAND, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.HtmlTextKt$HtmlText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    HtmlTextKt.HtmlText(str, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void HtmlTextPreview(Composer composer, final int i) {
        Composer h = composer.h(2100012898);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(2100012898, i, -1, "com.nytimes.android.comments.comments.mvi.view.HtmlTextPreview (HtmlText.kt:45)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$HtmlTextKt.INSTANCE.m270getLambda1$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.HtmlTextKt$HtmlTextPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    HtmlTextKt.HtmlTextPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
