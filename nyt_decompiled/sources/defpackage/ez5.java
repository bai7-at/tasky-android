package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.poisonpill.model.Pill;
import com.squareup.moshi.JsonAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ez5 implements dz5 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final JsonAdapter b;
    private final ly5 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ez5(SharedPreferences sharedPreferences, JsonAdapter jsonAdapter, ly5 ly5Var) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(jsonAdapter, "adapter");
        zq3.h(ly5Var, "config");
        this.a = sharedPreferences;
        this.b = jsonAdapter;
        this.c = ly5Var;
        Pill a2 = ly5Var.a();
        if (a2 == null) {
            e();
        } else {
            f(a2);
        }
    }

    private final void e() {
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove("PILL_KEY");
        edit.remove("PILL_DISMISSES_KEY");
        edit.apply();
    }

    private final void f(Pill pill) {
        SharedPreferences.Editor edit = this.a.edit();
        try {
            edit.putString("PILL_KEY", this.b.toJson(pill));
        } catch (Exception e) {
            NYTLogger.i(e, "Exception storing poison pill", new Object[0]);
        }
        edit.apply();
    }

    @Override // defpackage.dz5
    public Pill a() {
        String string = this.a.getString("PILL_KEY", null);
        if (string == null) {
            return null;
        }
        try {
            return (Pill) this.b.fromJson(string);
        } catch (Exception e) {
            NYTLogger.i(e, "Exception getting poison pill", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.dz5
    public int b() {
        return this.a.getInt("PILL_DISMISSES_KEY", 0);
    }

    @Override // defpackage.dz5
    public void c() {
        Pill a2 = a();
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putInt("PILL_DISMISSES_KEY", Math.min(b() + 1, a2.a()));
            edit.apply();
        }
    }

    @Override // defpackage.dz5
    public boolean d() {
        int b = b();
        Pill a2 = a();
        return b < (a2 != null ? a2.a() : 0);
    }
}
