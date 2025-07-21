package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c95 implements qq3 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c95(Context context) {
        zq3.h(context, "context");
        this.a = context.getSharedPreferences("com.nytimes.internal.EXCLUDE_FROM_BACKUP", 0);
    }

    @Override // defpackage.qq3
    public boolean a() {
        return this.a.getBoolean("BLUETOOTH_AUTOPLAY", false);
    }

    @Override // defpackage.qq3
    public int b() {
        return this.a.getInt("RECENTLY_VIEWED_ITEMS_PER_PAGE", 50);
    }

    @Override // defpackage.qq3
    public boolean c() {
        return this.a.contains("RECENTLY_VIEWED_ITEMS_PER_PAGE");
    }
}
