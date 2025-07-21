package defpackage;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class ao8 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ao8 a(Context context) {
            zq3.h(context, "context");
            r7 r7Var = r7.a;
            if (r7Var.a() >= 5) {
                return new io8(context);
            }
            if (r7Var.a() == 4) {
                return new do8(context);
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(zy2 zy2Var, by0 by0Var);
}
