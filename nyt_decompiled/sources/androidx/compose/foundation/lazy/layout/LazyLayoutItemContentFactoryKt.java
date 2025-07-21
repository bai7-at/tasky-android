package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.o04;
import defpackage.u87;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes.dex */
public abstract class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final o04 o04Var, final Object obj, final int i, final Object obj2, Composer composer, final int i2) {
        int i3;
        Composer h = composer.h(1439843069);
        if ((i2 & 14) == 0) {
            i3 = (h.S(o04Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(obj) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.d(i) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.S(obj2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((u87) obj).f(obj2, zr0.b(h, 980966366, true, new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(980966366, i4, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
                    }
                    o04.this.h(i, obj2, composer2, 64);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 568);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    LazyLayoutItemContentFactoryKt.a(o04.this, obj, i, obj2, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }
}
