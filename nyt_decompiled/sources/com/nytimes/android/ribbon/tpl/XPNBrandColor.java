package com.nytimes.android.ribbon.tpl;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.b22;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.nn0;
import defpackage.wn0;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class XPNBrandColor {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ XPNBrandColor[] $VALUES;
    private final gt2 color;
    public static final XPNBrandColor GAMES = new XPNBrandColor("GAMES", 0, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.1
        public final long b(Composer composer, int i) {
            composer.z(446852890);
            if (b.G()) {
                b.S(446852890, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:8)");
            }
            long d = wn0.d(4294688019L);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return d;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });
    public static final XPNBrandColor AUDIO = new XPNBrandColor("AUDIO", 1, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.2
        public final long b(Composer composer, int i) {
            composer.z(1996773413);
            if (b.G()) {
                b.S(1996773413, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:9)");
            }
            long d = wn0.d(4278811277L);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return d;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });
    public static final XPNBrandColor WIRECUTTER = new XPNBrandColor("WIRECUTTER", 2, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.3
        public final long b(Composer composer, int i) {
            composer.z(-1840261407);
            if (b.G()) {
                b.S(-1840261407, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:10)");
            }
            long d = wn0.d(4281555641L);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return d;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });
    public static final XPNBrandColor COOKING = new XPNBrandColor("COOKING", 3, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.4
        public final long b(Composer composer, int i) {
            composer.z(691359777);
            if (b.G()) {
                b.S(691359777, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:11)");
            }
            long d = wn0.d(4293936432L);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return d;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });
    public static final XPNBrandColor THE_ATHLETIC = new XPNBrandColor("THE_ATHLETIC", 4, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.5
        public final long b(Composer composer, int i) {
            composer.z(-224629225);
            if (b.G()) {
                b.S(-224629225, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:12)");
            }
            long d = wn0.d(4278217507L);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return d;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });
    public static final XPNBrandColor NEWS = new XPNBrandColor("NEWS", 5, new gt2() { // from class: com.nytimes.android.ribbon.tpl.XPNBrandColor.6
        public final long b(Composer composer, int i) {
            composer.z(402183058);
            if (b.G()) {
                b.S(402183058, i, -1, "com.nytimes.android.ribbon.tpl.XPNBrandColor.<anonymous> (XPNBrandColor.kt:13)");
            }
            long k = eb5.Companion.b(composer, 8).k();
            if (b.G()) {
                b.R();
            }
            composer.R();
            return k;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return nn0.j(b((Composer) obj, ((Number) obj2).intValue()));
        }
    });

    private static final /* synthetic */ XPNBrandColor[] $values() {
        return new XPNBrandColor[]{GAMES, AUDIO, WIRECUTTER, COOKING, THE_ATHLETIC, NEWS};
    }

    static {
        XPNBrandColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private XPNBrandColor(String str, int i, gt2 gt2Var) {
        this.color = gt2Var;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static XPNBrandColor valueOf(String str) {
        return (XPNBrandColor) Enum.valueOf(XPNBrandColor.class, str);
    }

    public static XPNBrandColor[] values() {
        return (XPNBrandColor[]) $VALUES.clone();
    }

    public final gt2 getColor() {
        return this.color;
    }
}
