package com.nytimes.android.growthui.regibundle.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.common.components.NYTButtonKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ei0;
import defpackage.ek8;
import defpackage.fb0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class SubscriptionCardKt {
    public static final void a(final a aVar, final String str, final String str2, final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(aVar, "header");
        zq3.h(str, "text");
        zq3.h(str2, "buttonText");
        zq3.h(qs2Var, "onSubscribeButtonClick");
        Composer h = composer.h(-744057112);
        if ((i & 14) == 0) {
            i2 = (h.S(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.S(qs2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i2) == 9362 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-744057112, i2, -1, "com.nytimes.android.growthui.regibundle.components.SubscriptionCard (SubscriptionCard.kt:26)");
            }
            composer2 = h;
            ei0.a(null, null, 0L, 0L, fb0.a(bu1.g(1), c74.a.a(h, 6).k()), bu1.g(10), zr0.b(h, 615925323, true, new gt2() { // from class: com.nytimes.android.growthui.regibundle.components.SubscriptionCardKt$SubscriptionCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    String str3;
                    qs2 qs2Var2;
                    String str4;
                    float f;
                    c74 c74Var;
                    int i4;
                    Modifier.a aVar2;
                    Composer composer4;
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(615925323, i3, -1, "com.nytimes.android.growthui.regibundle.components.SubscriptionCard.<anonymous> (SubscriptionCard.kt:31)");
                    }
                    Modifier.a aVar3 = Modifier.a;
                    c74 c74Var2 = c74.a;
                    float f2 = 20;
                    Modifier j = PaddingKt.j(BackgroundKt.d(aVar3, c74Var2.a(composer3, 6).a(), null, 2, null), bu1.g(16), bu1.g(f2));
                    boolean z2 = z;
                    a aVar4 = aVar;
                    String str5 = str;
                    qs2 qs2Var3 = qs2Var;
                    String str6 = str2;
                    composer3.z(-483455358);
                    rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                    composer3.z(-1323940314);
                    fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                    r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a2 = companion.a();
                    it2 b = LayoutKt.b(j);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a2);
                    } else {
                        composer3.p();
                    }
                    composer3.H();
                    Composer a3 = Updater.a(composer3);
                    Updater.c(a3, a, companion.e());
                    Updater.c(a3, fm1Var, companion.c());
                    Updater.c(a3, layoutDirection, companion.d());
                    Updater.c(a3, r99Var, companion.h());
                    composer3.c();
                    b.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    composer3.z(-1163856341);
                    ap0 ap0Var = ap0.a;
                    composer3.z(107616437);
                    if (!z2 || h.d0(aVar4)) {
                        str3 = str6;
                        qs2Var2 = qs2Var3;
                        str4 = str5;
                        f = f2;
                        c74Var = c74Var2;
                        i4 = 6;
                        aVar2 = aVar3;
                        composer4 = composer3;
                    } else {
                        qs2Var2 = qs2Var3;
                        str4 = str5;
                        f = f2;
                        c74Var = c74Var2;
                        str3 = str6;
                        TextKt.b(aVar4, null, c74Var2.a(composer3, 6).c(), ek8.g(16), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, c74Var2.b(composer3, 6).a(), composer3, 3072, 0, 65522);
                        aVar2 = aVar3;
                        composer4 = composer3;
                        i4 = 6;
                        SpacerKt.a(SizeKt.i(aVar2, bu1.g(f)), composer4, 6);
                    }
                    composer3.R();
                    c74 c74Var3 = c74Var;
                    j h2 = c74Var3.b(composer4, i4).h();
                    TextKt.e(str4, null, c74Var3.a(composer4, i4).b(), ek8.g(24), null, null, null, 0L, null, null, 0L, 0, false, 0, null, h2, composer3, 3072, 0, 32754);
                    SpacerKt.a(SizeKt.i(aVar2, bu1.g(f)), composer3, 6);
                    composer3.z(107638908);
                    final qs2 qs2Var4 = qs2Var2;
                    boolean S = composer3.S(qs2Var4);
                    Object A = composer3.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.android.growthui.regibundle.components.SubscriptionCardKt$SubscriptionCard$1$1$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m571invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m571invoke() {
                                qs2.this.mo865invoke();
                            }
                        };
                        composer3.q(A);
                    }
                    composer3.R();
                    NYTButtonKt.a(null, (qs2) A, str3, true, composer3, 3072, 1);
                    composer3.R();
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 1769472, 15);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.regibundle.components.SubscriptionCardKt$SubscriptionCard$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    SubscriptionCardKt.a(a.this, str, str2, z, qs2Var, composer3, i | 1);
                }
            });
        }
    }
}
