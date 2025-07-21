package defpackage;

import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import defpackage.yn1;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public interface vd4 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final wn1 a(rd4 rd4Var) {
            zq3.h(rd4Var, "experiments");
            return new DevSettingGroupExpandable("MainActivity", i.e(rd4Var.i()), null, false, yn1.c.b, null, false, false, 236, null);
        }
    }
}
