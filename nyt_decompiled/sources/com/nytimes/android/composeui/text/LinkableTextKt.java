package com.nytimes.android.composeui.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.ClickableTextKt;
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
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentMediaFormat;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.fm1;
import defpackage.g54;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.r81;
import defpackage.r99;
import defpackage.rg4;
import defpackage.so0;
import defpackage.ss2;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class LinkableTextKt {
    public static final void a(final String str, final List list, final boolean z, final gt2 gt2Var, Modifier modifier, j jVar, long j, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        Composer composer2;
        j b;
        zq3.h(str, "text");
        zq3.h(gt2Var, "onClick");
        Composer h = composer.h(835843381);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.a : modifier;
        j a = (i2 & 32) != 0 ? j.d.a() : jVar;
        if ((i2 & 64) != 0) {
            j2 = r81.a(h, 0) ? so0.b() : so0.c();
            i3 = i & (-3670017);
        } else {
            j2 = j;
            i3 = i;
        }
        if (b.G()) {
            b.S(835843381, i3, -1, "com.nytimes.android.composeui.text.LinkableText (LinkableText.kt:41)");
        }
        int i4 = i3 & 14;
        final a b2 = b(str, list, j2, h, i4 | 64 | ((i3 >> 12) & 896));
        List list2 = list;
        final String c = (list2 == null || list2.isEmpty()) ? "" : ((g54) i.k0(list)).c();
        if (c(str, list)) {
            h.z(851988491);
            Modifier i5 = PaddingKt.i(ClickableKt.e(modifier2, false, null, null, new qs2() { // from class: com.nytimes.android.composeui.text.LinkableTextKt$LinkableText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m323invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m323invoke() {
                    List<g54> list3;
                    g54 g54Var;
                    String d;
                    if (!z || (list3 = list) == null || (g54Var = (g54) i.m0(list3)) == null || (d = g54Var.d()) == null) {
                        return;
                    }
                    gt2Var.invoke(d, c);
                }
            }, 7, null), bu1.g(4));
            h.z(733328855);
            Alignment.a aVar = Alignment.a;
            rg4 g = BoxKt.g(aVar.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b3 = LayoutKt.b(i5);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ph8 d = ph8.b.d();
            Modifier c2 = boxScopeInstance.c(Modifier.a, aVar.e());
            b = r34.b((r42 & 1) != 0 ? r34.a.i() : j2, (r42 & 2) != 0 ? r34.a.m() : 0L, (r42 & 4) != 0 ? r34.a.p() : null, (r42 & 8) != 0 ? r34.a.n() : null, (r42 & 16) != 0 ? r34.a.o() : null, (r42 & 32) != 0 ? r34.a.k() : null, (r42 & 64) != 0 ? r34.a.l() : null, (r42 & 128) != 0 ? r34.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r34.a.g() : null, (r42 & 512) != 0 ? r34.a.w() : null, (r42 & 1024) != 0 ? r34.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r34.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r34.a.u() : null, (r42 & 8192) != 0 ? r34.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r34.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r34.b.i()) : null, (r42 & 65536) != 0 ? r34.b.e() : 0L, (r42 & 131072) != 0 ? a.b.j() : null);
            composer2 = h;
            TextKt.e(str, c2, 0L, 0L, null, null, null, 0L, d, null, 0L, 0, false, 0, null, b, composer2, i4 | 100663296, 0, 32508);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
        } else {
            composer2 = h;
            composer2.z(852589147);
            composer2.z(-665229120);
            boolean a4 = composer2.a(z) | composer2.S(b2) | composer2.S(gt2Var) | composer2.S(c);
            Object A = composer2.A();
            if (a4 || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.composeui.text.LinkableTextKt$LinkableText$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).intValue());
                        return ww8.a;
                    }

                    public final void invoke(int i6) {
                        a.b bVar;
                        if (!z || (bVar = (a.b) i.m0(b2.h(i6, i6))) == null) {
                            return;
                        }
                        gt2Var.invoke(bVar.e(), c);
                    }
                };
                composer2.q(A);
            }
            composer2.R();
            ClickableTextKt.a(b2, modifier2, a, false, 0, 0, null, (ss2) A, composer2, (i3 >> 9) & ContentMediaFormat.PREVIEW_EPISODE, 120);
            composer2.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final j jVar2 = a;
            final long j3 = j2;
            k.a(new gt2() { // from class: com.nytimes.android.composeui.text.LinkableTextKt$LinkableText$4
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
                    LinkableTextKt.a(str, list, z, gt2Var, modifier3, jVar2, j3, composer3, i | 1, i2);
                }
            });
        }
    }

    private static final a b(String str, List list, long j, Composer composer, int i) {
        composer.z(1650841306);
        if (b.G()) {
            b.S(1650841306, i, -1, "com.nytimes.android.composeui.text.buildStringWithLinks (LinkableText.kt:94)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        c0064a.i(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                g54 g54Var = (g54) it2.next();
                int b0 = h.b0(str, g54Var.b(), 0, false, 6, null);
                int length = g54Var.b().length() + b0;
                c0064a.c(new jy7(j, 0L, (o) null, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, ph8.b.d(), (jo7) null, 12286, (DefaultConstructorMarker) null), b0, length);
                c0064a.a(g54Var.a(), g54Var.d(), b0, length);
            }
        }
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    public static final boolean c(String str, List list) {
        zq3.h(str, "displayText");
        return list != null && list.size() == 1 && zq3.c(((g54) i.k0(list)).b(), str);
    }
}
