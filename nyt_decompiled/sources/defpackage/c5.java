package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* loaded from: classes.dex */
public abstract class c5 {

    private static class a extends c5 {
        private final ActivityOptions a;

        a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        @Override // defpackage.c5
        public Bundle c() {
            return this.a.toBundle();
        }
    }

    static class b {
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    protected c5() {
    }

    public static c5 a(Context context, int i, int i2) {
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static c5 b(Activity activity, View view, String str) {
        return new a(b.a(activity, view, str));
    }

    public abstract Bundle c();
}
