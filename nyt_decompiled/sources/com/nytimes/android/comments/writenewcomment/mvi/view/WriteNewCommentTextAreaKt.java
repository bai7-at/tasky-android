package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.c;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.di8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.nn0;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class WriteNewCommentTextAreaKt {
    public static final void WriteNewCommentTextArea(Modifier modifier, final String str, final String str2, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        zq3.h(str, "text");
        zq3.h(str2, "placeholderText");
        zq3.h(ss2Var, "onInputChange");
        Composer h = composer.h(792102042);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.C(ss2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(792102042, i5, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextArea (WriteNewCommentTextArea.kt:28)");
            }
            Modifier h2 = SizeKt.h(modifier4, 0.0f, 1, null);
            j jVar = new j(eb5.Companion.a(h, 8).x(), ek8.g(16), o.b.e(), null, null, gb5.e(), null, ek8.g(0), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777048, null);
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.a;
            nn0.a aVar = nn0.b;
            di8 l = textFieldDefaults.l(0L, 0L, aVar.f(), 0L, 0L, aVar.f(), aVar.f(), aVar.f(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, h, 14352768, 0, 48, 2096923);
            Modifier modifier5 = modifier4;
            composer2 = h;
            TextFieldKt.a(str, ss2Var, h2, false, false, jVar, null, zr0.b(h, -454384939, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextAreaKt$WriteNewCommentTextArea$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-454384939, i6, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextArea.<anonymous> (WriteNewCommentTextArea.kt:33)");
                    }
                    e e = gb5.e();
                    o e2 = o.b.e();
                    TextKt.c(str2, null, eb5.Companion.a(composer3, 8).q(), 0L, null, e2, e, 0L, null, null, ek8.g(21), 0, false, 0, 0, null, null, composer3, 196608, 6, 129946);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, null, false, null, c.e(c.e.a(), androidx.compose.ui.text.input.c.a.c(), false, 0, a.b.e(), null, 22, null), null, false, 0, 0, null, null, l, composer2, ((i5 >> 3) & 14) | 12582912 | ((i5 >> 6) & ContentType.LONG_FORM_ON_DEMAND), 0, 520024);
            if (b.G()) {
                b.R();
            }
            modifier3 = modifier5;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextAreaKt$WriteNewCommentTextArea$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    WriteNewCommentTextAreaKt.WriteNewCommentTextArea(Modifier.this, str, str2, ss2Var, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WriteNewCommentTextAreaPreview(Composer composer, final int i) {
        Composer h = composer.h(-520517742);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-520517742, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextAreaPreview (WriteNewCommentTextArea.kt:64)");
            }
            h.z(-833905701);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = b0.e("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum", null, 2, null);
                h.q(A);
            }
            h.R();
            WriteNewCommentTextArea(null, WriteNewCommentTextAreaPreview$lambda$1((sy4) A), "Share your thoughts", new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextAreaKt$WriteNewCommentTextAreaPreview$1
                public final void invoke(String str) {
                    zq3.h(str, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }
            }, h, 3456, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentTextAreaKt$WriteNewCommentTextAreaPreview$2
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
                    WriteNewCommentTextAreaKt.WriteNewCommentTextAreaPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final String WriteNewCommentTextAreaPreview$lambda$1(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }
}
