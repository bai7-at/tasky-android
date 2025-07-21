package com.nytimes.android.unfear.reader;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import com.nytimes.android.unfear.reader.composable.ContainerLayoutsKt;
import com.nytimes.android.unfear.reader.composable.DividerLayoutsKt;
import com.nytimes.android.unfear.reader.composable.LockupLayoutsKt;
import com.nytimes.android.unfear.reader.composable.PackageLayoutsKt;
import com.nytimes.android.unfear.reader.composable.SectionLockupLayoutKt;
import com.nytimes.android.unfear.reader.composable.StoryLayoutsKt;
import defpackage.da3;
import defpackage.di7;
import defpackage.ea3;
import defpackage.f38;
import defpackage.fa3;
import defpackage.fg9;
import defpackage.g38;
import defpackage.ga3;
import defpackage.gm2;
import defpackage.h38;
import defpackage.h59;
import defpackage.ha3;
import defpackage.i38;
import defpackage.i59;
import defpackage.il9;
import defpackage.k59;
import defpackage.kt2;
import defpackage.l59;
import defpackage.lh4;
import defpackage.mh7;
import defpackage.uv4;
import defpackage.ww8;
import defpackage.x14;
import defpackage.yh7;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class ComposableSingletons$UnfearInitializerKt {
    public static final ComposableSingletons$UnfearInitializerKt a = new ComposableSingletons$UnfearInitializerKt();
    public static kt2 b = zr0.c(-1114525426, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-1$1
        public final void b(fa3 fa3Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(fa3Var, "level");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(fa3Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1114525426, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-1.<anonymous> (UnfearInitializer.kt:55)");
            }
            DividerLayoutsKt.a(fa3Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | fa3.c | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((fa3) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 c = zr0.c(-1660542966, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-2$1
        public final void b(i59 i59Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(i59Var, "level");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(i59Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1660542966, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-2.<anonymous> (UnfearInitializer.kt:58)");
            }
            DividerLayoutsKt.b(i59Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | i59.a | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 d = zr0.c(-656998519, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-3$1
        public final void b(x14 x14Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(x14Var, "container");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-656998519, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-3.<anonymous> (UnfearInitializer.kt:62)");
            }
            ContainerLayoutsKt.b(x14Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 e = zr0.c(264107770, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-4$1
        public final void b(ga3 ga3Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(ga3Var, "container");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(ga3Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(264107770, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-4.<anonymous> (UnfearInitializer.kt:65)");
            }
            ContainerLayoutsKt.a(ga3Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | ga3.a | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 f = zr0.c(-1823904138, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-5$1
        public final void b(k59 k59Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(k59Var, "container");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(k59Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1823904138, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-5.<anonymous> (UnfearInitializer.kt:68)");
            }
            ContainerLayoutsKt.c(k59Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | k59.d | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((k59) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 g = zr0.c(-1557917421, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-6$1
        public final void b(ha3 ha3Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(ha3Var, "pkg");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(ha3Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1557917421, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-6.<anonymous> (UnfearInitializer.kt:72)");
            }
            PackageLayoutsKt.b(ha3Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | ha3.b | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 h = zr0.c(955213199, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-7$1
        public final void b(l59 l59Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(l59Var, "pkg");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(l59Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(955213199, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-7.<anonymous> (UnfearInitializer.kt:75)");
            }
            PackageLayoutsKt.c(l59Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | l59.d | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((l59) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 i = zr0.c(-697519183, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-8$1
        public final void b(ea3 ea3Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(ea3Var, "pkg");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(ea3Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-697519183, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-8.<anonymous> (UnfearInitializer.kt:78)");
            }
            PackageLayoutsKt.a(ea3Var, modifier, null, composer, ea3.f | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((ea3) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 j = zr0.c(5459336, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-9$1
        public final void b(yh7 yh7Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(yh7Var, "widget");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(yh7Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(5459336, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-9.<anonymous> (UnfearInitializer.kt:82)");
            }
            LockupLayoutsKt.b(yh7Var, modifier, composer, (i3 & ContentType.LONG_FORM_ON_DEMAND) | yh7.e | (i3 & 14), 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((yh7) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 k = zr0.c(565073835, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-10$1
        public final void b(f38 f38Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(f38Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(565073835, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-10.<anonymous> (UnfearInitializer.kt:85)");
            }
            LockupLayoutsKt.c(f38Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 l = zr0.c(1886793750, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-11$1
        public final void b(g38 g38Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(g38Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(1886793750, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-11.<anonymous> (UnfearInitializer.kt:88)");
            }
            LockupLayoutsKt.d(g38Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 m = zr0.c(-708954495, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-12$1
        public final void b(h38 h38Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(h38Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-708954495, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-12.<anonymous> (UnfearInitializer.kt:91)");
            }
            LockupLayoutsKt.e(h38Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 n = zr0.c(-1351111956, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-13$1
        public final void b(i38 i38Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(i38Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-1351111956, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-13.<anonymous> (UnfearInitializer.kt:94)");
            }
            LockupLayoutsKt.f(i38Var, modifier, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 o = zr0.c(1107963416, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-14$1
        public final void b(gm2 gm2Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(gm2Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(gm2Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1107963416, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-14.<anonymous> (UnfearInitializer.kt:97)");
            }
            LockupLayoutsKt.a(gm2Var, modifier, composer, i3 & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 p = zr0.c(-727520843, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-15$1
        public final void b(il9 il9Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(il9Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-727520843, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-15.<anonymous> (UnfearInitializer.kt:100)");
            }
            LockupLayoutsKt.h(il9Var, modifier, null, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 q = zr0.c(-2139631913, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-16$1
        public final void b(fg9 fg9Var, Modifier modifier, Composer composer, int i2) {
            zq3.h(fg9Var, "lockup");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-2139631913, i2, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-16.<anonymous> (UnfearInitializer.kt:103)");
            }
            LockupLayoutsKt.g(fg9Var, modifier, null, composer, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 8, 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            lh4.a(obj);
            b(null, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 r = zr0.c(-1817133580, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-17$1
        public final void b(mh7 mh7Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(mh7Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(mh7Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1817133580, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-17.<anonymous> (UnfearInitializer.kt:106)");
            }
            SectionLockupLayoutKt.b(mh7Var, modifier, null, composer, StyledText.d | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((mh7) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 s = zr0.c(536388119, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-18$1
        public final void b(da3 da3Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(da3Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(da3Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(536388119, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-18.<anonymous> (UnfearInitializer.kt:109)");
            }
            StoryLayoutsKt.a(da3Var, modifier, null, composer, StyledText.d | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((da3) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 t = zr0.c(1366665007, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-19$1
        public final void b(h59 h59Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(h59Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(h59Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1366665007, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-19.<anonymous> (UnfearInitializer.kt:112)");
            }
            StoryLayoutsKt.c(h59Var, modifier, null, composer, StyledText.d | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((h59) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 u = zr0.c(-1335357392, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-20$1
        public final void b(uv4 uv4Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(uv4Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(uv4Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1335357392, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-20.<anonymous> (UnfearInitializer.kt:115)");
            }
            SectionLockupLayoutKt.a(uv4Var, modifier, null, composer, StyledText.d | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((uv4) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });
    public static kt2 v = zr0.c(-1058148352, false, new kt2() { // from class: com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt$lambda-21$1
        public final void b(di7 di7Var, Modifier modifier, Composer composer, int i2) {
            int i3;
            zq3.h(di7Var, "lockup");
            zq3.h(modifier, "modifier");
            if ((i2 & 14) == 0) {
                i3 = (composer.S(di7Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i3 |= composer.S(modifier) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1058148352, i3, -1, "com.nytimes.android.unfear.reader.ComposableSingletons$UnfearInitializerKt.lambda-21.<anonymous> (UnfearInitializer.kt:117)");
            }
            StoryLayoutsKt.b(di7Var, modifier, null, composer, StyledText.d | (i3 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 4);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((di7) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });

    public final kt2 a() {
        return b;
    }

    public final kt2 b() {
        return k;
    }

    public final kt2 c() {
        return l;
    }

    public final kt2 d() {
        return m;
    }

    public final kt2 e() {
        return n;
    }

    public final kt2 f() {
        return o;
    }

    public final kt2 g() {
        return p;
    }

    public final kt2 h() {
        return q;
    }

    public final kt2 i() {
        return r;
    }

    public final kt2 j() {
        return s;
    }

    public final kt2 k() {
        return t;
    }

    public final kt2 l() {
        return c;
    }

    public final kt2 m() {
        return u;
    }

    public final kt2 n() {
        return v;
    }

    public final kt2 o() {
        return d;
    }

    public final kt2 p() {
        return e;
    }

    public final kt2 q() {
        return f;
    }

    public final kt2 r() {
        return g;
    }

    public final kt2 s() {
        return h;
    }

    public final kt2 t() {
        return i;
    }

    public final kt2 u() {
        return j;
    }
}
