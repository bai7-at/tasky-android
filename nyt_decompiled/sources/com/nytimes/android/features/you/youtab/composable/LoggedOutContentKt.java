package com.nytimes.android.features.you.youtab.composable;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.features.you.youtab.YouEventSender;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fb0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.jk;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n37;
import defpackage.n98;
import defpackage.nn0;
import defpackage.oe3;
import defpackage.p8;
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.s5;
import defpackage.v07;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.yk6;
import defpackage.z58;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class LoggedOutContentKt {
    public static final void a(final z58 z58Var, final YouEventSender youEventSender, Modifier modifier, Composer composer, final int i, final int i2) {
        j f;
        j f2;
        zq3.h(z58Var, "subauthClient");
        zq3.h(youEventSender, "eventSender");
        Composer h = composer.h(-1329609996);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1329609996, i, -1, "com.nytimes.android.features.you.youtab.composable.LoggedOutContent (LoggedOutContent.kt:53)");
        }
        final ComponentActivity d = s5.d(h, 0);
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A).a();
        h.R();
        py1.d(ww8.a, new LoggedOutContentKt$LoggedOutContent$1(youEventSender, null), h, 70);
        Modifier f3 = ScrollKt.f(SizeKt.f(modifier2, 0.0f, 1, null), ScrollKt.c(0, h, 0, 1), false, null, false, 14, null);
        h.z(733328855);
        Alignment.a aVar = Alignment.a;
        rg4 g = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(f3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, g, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        Painter d2 = do5.d(re6.you_regiwall_hero, h, 0);
        ContentScale d3 = ContentScale.a.d();
        Modifier.a aVar2 = Modifier.a;
        final Modifier modifier3 = modifier2;
        ImageKt.b(d2, null, boxScopeInstance.c(SizeKt.h(aVar2, 0.0f, 1, null), aVar.m()), null, d3, 0.0f, null, h, 24632, 104);
        Alignment.b g2 = aVar.g();
        Modifier c2 = boxScopeInstance.c(aVar2, aVar.b());
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        rg4 a5 = d.a(arrangement.g(), g2, h, 48);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c3 = LayoutKt.c(c2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a7);
        } else {
            h.p();
        }
        Composer a8 = Updater.a(h);
        Updater.c(a8, a5, companion.e());
        Updater.c(a8, o2, companion.g());
        gt2 b2 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b2);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        Modifier i3 = SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), bu1.g(200));
        yc0.a aVar3 = yc0.b;
        nn0 j = nn0.j(nn0.b.f());
        eb5.a aVar4 = eb5.Companion;
        BoxKt.a(BackgroundKt.b(i3, yc0.a.d(aVar3, i.o(j, nn0.j(aVar4.b(h, 8).a())), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), h, 0);
        Alignment.b g3 = aVar.g();
        Modifier k = PaddingKt.k(BackgroundKt.d(aVar2, aVar4.b(h, 8).a(), null, 2, null), bu1.g(20), 0.0f, 2, null);
        h.z(-483455358);
        rg4 a9 = d.a(arrangement.g(), g3, h, 48);
        h.z(-1323940314);
        int a10 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a11 = companion.a();
        it2 c4 = LayoutKt.c(k);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a11);
        } else {
            h.p();
        }
        Composer a12 = Updater.a(h);
        Updater.c(a12, a9, companion.e());
        Updater.c(a12, o3, companion.g());
        gt2 b3 = companion.b();
        if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
            a12.q(Integer.valueOf(a10));
            a12.v(Integer.valueOf(a10), b3);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(32)), h, 6);
        String b4 = k48.b(yk6.logged_out_prompt, h, 0);
        TPLTypography tPLTypography = TPLTypography.title18;
        j value = tPLTypography.getValue();
        o.a aVar5 = o.b;
        f = value.f((r48 & 1) != 0 ? value.a.i() : 0L, (r48 & 2) != 0 ? value.a.m() : 0L, (r48 & 4) != 0 ? value.a.p() : aVar5.g(), (r48 & 8) != 0 ? value.a.n() : null, (r48 & 16) != 0 ? value.a.o() : null, (r48 & 32) != 0 ? value.a.k() : null, (r48 & 64) != 0 ? value.a.l() : null, (r48 & 128) != 0 ? value.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.a.g() : null, (r48 & 512) != 0 ? value.a.w() : null, (r48 & 1024) != 0 ? value.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? value.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? value.a.u() : null, (r48 & 8192) != 0 ? value.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? value.a.j() : null, (r48 & 32768) != 0 ? value.b.h() : 0, (r48 & 65536) != 0 ? value.b.i() : 0, (r48 & 131072) != 0 ? value.b.e() : 0L, (r48 & 262144) != 0 ? value.b.j() : null, (r48 & 524288) != 0 ? value.c : null, (r48 & Constants.MB) != 0 ? value.b.f() : null, (r48 & 2097152) != 0 ? value.b.d() : 0, (r48 & 4194304) != 0 ? value.b.c() : 0, (r48 & 8388608) != 0 ? value.b.k() : null);
        TextKt.c(b4, null, aVar4.b(h, 8).g(), 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, f, h, 0, 0, 65018);
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(18)), h, 6);
        h.z(-483455358);
        rg4 a13 = d.a(arrangement.g(), aVar.k(), h, 0);
        h.z(-1323940314);
        int a14 = cs0.a(h, 0);
        et0 o4 = h.o();
        qs2 a15 = companion.a();
        it2 c5 = LayoutKt.c(aVar2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a15);
        } else {
            h.p();
        }
        Composer a16 = Updater.a(h);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, o4, companion.g());
        gt2 b5 = companion.b();
        if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
            a16.q(Integer.valueOf(a14));
            a16.v(Integer.valueOf(a14), b5);
        }
        c5.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(693286680);
        rg4 a17 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a18 = cs0.a(h, 0);
        et0 o5 = h.o();
        qs2 a19 = companion.a();
        it2 c6 = LayoutKt.c(aVar2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a19);
        } else {
            h.p();
        }
        Composer a20 = Updater.a(h);
        Updater.c(a20, a17, companion.e());
        Updater.c(a20, o5, companion.g());
        gt2 b6 = companion.b();
        if (a20.f() || !zq3.c(a20.A(), Integer.valueOf(a18))) {
            a20.q(Integer.valueOf(a18));
            a20.v(Integer.valueOf(a18), b6);
        }
        c6.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        oe3 oe3Var = oe3.a;
        IconKt.a(p8.a(oe3Var.a()), null, null, aVar4.b(h, 8).i(), h, 48, 4);
        float f4 = 10;
        SpacerKt.a(SizeKt.s(aVar2, bu1.g(f4)), h, 6);
        TextKt.c(k48.b(yk6.logged_out_interests, h, 0), null, aVar4.b(h, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tPLTypography.getValue(), h, 0, 0, 65530);
        h.R();
        h.t();
        h.R();
        h.R();
        float f5 = 16;
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(f5)), h, 6);
        h.z(693286680);
        rg4 a21 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a22 = cs0.a(h, 0);
        et0 o6 = h.o();
        qs2 a23 = companion.a();
        it2 c7 = LayoutKt.c(aVar2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a23);
        } else {
            h.p();
        }
        Composer a24 = Updater.a(h);
        Updater.c(a24, a21, companion.e());
        Updater.c(a24, o6, companion.g());
        gt2 b7 = companion.b();
        if (a24.f() || !zq3.c(a24.A(), Integer.valueOf(a22))) {
            a24.q(Integer.valueOf(a22));
            a24.v(Integer.valueOf(a22), b7);
        }
        c7.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        IconKt.b(do5.d(re6.ic_save, h, 0), null, null, aVar4.b(h, 8).i(), h, 56, 4);
        SpacerKt.a(SizeKt.s(aVar2, bu1.g(f4)), h, 6);
        TextKt.c(k48.b(yk6.logged_out_saves, h, 0), null, aVar4.b(h, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tPLTypography.getValue(), h, 0, 0, 65530);
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(f5)), h, 6);
        h.z(693286680);
        rg4 a25 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a26 = cs0.a(h, 0);
        et0 o7 = h.o();
        qs2 a27 = companion.a();
        it2 c8 = LayoutKt.c(aVar2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a27);
        } else {
            h.p();
        }
        Composer a28 = Updater.a(h);
        Updater.c(a28, a25, companion.e());
        Updater.c(a28, o7, companion.g());
        gt2 b8 = companion.b();
        if (a28.f() || !zq3.c(a28.A(), Integer.valueOf(a26))) {
            a28.q(Integer.valueOf(a26));
            a28.v(Integer.valueOf(a26), b8);
        }
        c8.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        IconKt.a(v07.a(oe3Var.a()), null, null, aVar4.b(h, 8).i(), h, 48, 4);
        SpacerKt.a(SizeKt.s(aVar2, bu1.g(f4)), h, 6);
        TextKt.c(k48.b(yk6.logged_out_history, h, 0), null, aVar4.b(h, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tPLTypography.getValue(), h, 0, 0, 65530);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        ButtonKt.c(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$2

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$2$1", f = "LoggedOutContent.kt", l = {159}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ComponentActivity $activity;
                final /* synthetic */ z58 $subauthClient;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(z58 z58Var, ComponentActivity componentActivity, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthClient = z58Var;
                    this.$activity = componentActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$subauthClient, this.$activity, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        z58 z58Var = this.$subauthClient;
                        ComponentActivity componentActivity = this.$activity;
                        zq3.f(componentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        this.label = 1;
                        if (n98.a.a(z58Var, (jk) componentActivity, false, null, null, this, 14, null) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m450invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m450invoke() {
                YouEventSender.this.o();
                BuildersKt__Builders_commonKt.launch$default(a, null, null, new AnonymousClass1(z58Var, d, null), 3, null);
            }
        }, PaddingKt.m(SizeKt.h(SizeKt.w(aVar2, null, false, 3, null), 0.0f, 1, null), 0.0f, bu1.g(21), 0.0f, bu1.g(24), 5, null), false, null, null, null, fb0.a(bu1.g(1), aVar4.b(h, 8).k()), null, null, ComposableSingletons$LoggedOutContentKt.a.a(), h, 805306416, 444);
        h.z(-1871812477);
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        h.z(-1871812430);
        int n = c0064a.n(aVar4.c(h, 8).y1().R());
        try {
            c0064a.i(k48.b(yk6.dont_have_an_account, h, 0));
            c0064a.k(n);
            h.R();
            h.z(-1871812214);
            f2 = r38.f((r48 & 1) != 0 ? r38.a.i() : 0L, (r48 & 2) != 0 ? r38.a.m() : 0L, (r48 & 4) != 0 ? r38.a.p() : aVar5.a(), (r48 & 8) != 0 ? r38.a.n() : null, (r48 & 16) != 0 ? r38.a.o() : null, (r48 & 32) != 0 ? r38.a.k() : null, (r48 & 64) != 0 ? r38.a.l() : null, (r48 & 128) != 0 ? r38.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r38.a.g() : null, (r48 & 512) != 0 ? r38.a.w() : null, (r48 & 1024) != 0 ? r38.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r38.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r38.a.u() : null, (r48 & 8192) != 0 ? r38.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r38.a.j() : null, (r48 & 32768) != 0 ? r38.b.h() : 0, (r48 & 65536) != 0 ? r38.b.i() : 0, (r48 & 131072) != 0 ? r38.b.e() : 0L, (r48 & 262144) != 0 ? r38.b.j() : null, (r48 & 524288) != 0 ? r38.c : null, (r48 & Constants.MB) != 0 ? r38.b.f() : null, (r48 & 2097152) != 0 ? r38.b.d() : 0, (r48 & 4194304) != 0 ? r38.b.c() : 0, (r48 & 8388608) != 0 ? aVar4.c(h, 8).y1().b.k() : null);
            n = c0064a.n(f2.R());
            try {
                c0064a.i(k48.b(yk6.create_one, h, 0));
                c0064a.k(n);
                h.R();
                androidx.compose.ui.text.a o8 = c0064a.o();
                h.R();
                TextKt.d(o8, ClickableKt.e(aVar2, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$4

                    @fc1(c = "com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$4$1", f = "LoggedOutContent.kt", l = {190}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$2$1$1$4$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                        final /* synthetic */ ComponentActivity $activity;
                        final /* synthetic */ z58 $subauthClient;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(z58 z58Var, ComponentActivity componentActivity, by0 by0Var) {
                            super(2, by0Var);
                            this.$subauthClient = z58Var;
                            this.$activity = componentActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new AnonymousClass1(this.$subauthClient, this.$activity, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object h = kotlin.coroutines.intrinsics.a.h();
                            int i = this.label;
                            if (i == 0) {
                                f.b(obj);
                                z58 z58Var = this.$subauthClient;
                                ComponentActivity componentActivity = this.$activity;
                                zq3.f(componentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                                this.label = 1;
                                if (n98.a.a(z58Var, (jk) componentActivity, false, null, null, this, 14, null) == h) {
                                    return h;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                            }
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m451invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m451invoke() {
                        YouEventSender.this.h();
                        BuildersKt__Builders_commonKt.launch$default(a, null, null, new AnonymousClass1(z58Var, d, null), 3, null);
                    }
                }, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, h, 0, 0, 262140);
                SpacerKt.a(SizeKt.i(aVar2, bu1.g(40)), h, 6);
                h.R();
                h.t();
                h.R();
                h.R();
                h.R();
                h.t();
                h.R();
                h.R();
                h.R();
                h.t();
                h.R();
                h.R();
                if (b.G()) {
                    b.R();
                }
                cc7 k2 = h.k();
                if (k2 != null) {
                    k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$3
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
                            LoggedOutContentKt.a(z58.this, youEventSender, modifier3, composer2, gt6.a(i | 1), i2);
                        }
                    });
                }
            } finally {
            }
        } finally {
        }
    }
}
