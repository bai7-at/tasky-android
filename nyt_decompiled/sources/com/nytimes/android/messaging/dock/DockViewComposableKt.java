package com.nytimes.android.messaging.dock;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.messaging.dock.DockViewComposableKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tg6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DockViewComposableKt {
    public static final void DockViewComposable(final int i, Modifier modifier, DockConfig dockConfig, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Composer h = composer.h(464594781);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.S(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= h.S(dockConfig) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i4 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i5 != 0) {
                modifier = Modifier.a;
            }
            if (i6 != 0) {
                dockConfig = null;
            }
            if (i7 != 0) {
                z = false;
            }
            if (b.G()) {
                b.S(464594781, i4, -1, "com.nytimes.android.messaging.dock.DockViewComposable (DockViewComposable.kt:19)");
            }
            Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
            h.z(856885502);
            Object A = h.A();
            Object obj = A;
            if (A == Composer.a.a()) {
                DockView dockView = new DockView(context, null, 0);
                dockView.setId(tg6.dock_container);
                h.q(dockView);
                obj = dockView;
            }
            final DockView dockView2 = (DockView) obj;
            h.R();
            if (z && dockConfig != null) {
                dockView2.showMessage(new qs2() { // from class: com.nytimes.android.messaging.dock.DockViewComposableKt$DockViewComposable$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m597invoke() {
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m597invoke();
                        return ww8.a;
                    }
                }, dockConfig);
                dockView2.setOnClickListener(new View.OnClickListener() { // from class: ft1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DockViewComposableKt.DockViewComposable$lambda$2(DockView.this, view);
                    }
                });
            }
            AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.messaging.dock.DockViewComposableKt$DockViewComposable$3
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public final DockView invoke(Context context2) {
                    zq3.h(context2, "it");
                    return DockView.this;
                }
            }, SizeKt.i(SizeKt.h(modifier, 0.0f, 1, null), bu1.g(dockView2.getVisible() ? 60 : 0)), new ss2() { // from class: com.nytimes.android.messaging.dock.DockViewComposableKt$DockViewComposable$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DockView) obj2);
                    return ww8.a;
                }

                public final void invoke(DockView dockView3) {
                    zq3.h(dockView3, "it");
                    if (i > 0) {
                        dockView2.activate();
                    }
                }
            }, h, 0, 0);
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final DockConfig dockConfig2 = dockConfig;
        final boolean z2 = z;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.dock.DockViewComposableKt$DockViewComposable$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    DockViewComposableKt.DockViewComposable(i, modifier2, dockConfig2, z2, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DockViewComposable$lambda$2(DockView dockView, View view) {
        zq3.h(dockView, "$dockView");
        dockView.onClick();
    }
}
