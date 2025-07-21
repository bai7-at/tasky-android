package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.navigation.Navigator;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.zq3;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Navigator.b("activity")
/* loaded from: classes.dex */
public class ActivityNavigator extends Navigator {
    public static final a e = new a(null);
    private final Context c;
    private final Activity d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static class b extends NavDestination {
        private Intent l;
        private String m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Navigator navigator) {
            super(navigator);
            zq3.h(navigator, "activityNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean F() {
            return false;
        }

        public final String H() {
            Intent intent = this.l;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName I() {
            Intent intent = this.l;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String J() {
            return this.m;
        }

        public final Intent K() {
            return this.l;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.l;
                if ((intent != null ? intent.filterEquals(((b) obj).l) : ((b) obj).l == null) && zq3.c(this.m, ((b) obj).m)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.l;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.m;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            ComponentName I = I();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (I != null) {
                sb.append(" class=");
                sb.append(I.getClassName());
            } else {
                String H = H();
                if (H != null) {
                    sb.append(" action=");
                    sb.append(H);
                }
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "sb.toString()");
            return sb2;
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        zq3.h(context, "context");
        this.c = context;
        Iterator it2 = kotlin.sequences.d.f(context, new ss2() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context context2) {
                zq3.h(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public boolean k() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public NavDestination d(b bVar, Bundle bundle, h hVar, Navigator.a aVar) {
        Intent intent;
        int intExtra;
        zq3.h(bVar, "destination");
        if (bVar.K() == null) {
            throw new IllegalStateException(("Destination " + bVar.q() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(bVar.K());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String J = bVar.J();
            if (J != null && J.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(J);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + J);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.d == null) {
            intent2.addFlags(268435456);
        }
        if (hVar != null && hVar.h()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.d;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.q());
        Resources resources = this.c.getResources();
        if (hVar != null) {
            int c = hVar.c();
            int d = hVar.d();
            if ((c <= 0 || !zq3.c(resources.getResourceTypeName(c), "animator")) && (d <= 0 || !zq3.c(resources.getResourceTypeName(d), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c) + " and popExit resource " + resources.getResourceName(d) + " when launching " + bVar);
            }
        }
        this.c.startActivity(intent2);
        if (hVar == null || this.d == null) {
            return null;
        }
        int a2 = hVar.a();
        int b2 = hVar.b();
        if ((a2 <= 0 || !zq3.c(resources.getResourceTypeName(a2), "animator")) && (b2 <= 0 || !zq3.c(resources.getResourceTypeName(b2), "animator"))) {
            if (a2 < 0 && b2 < 0) {
                return null;
            }
            this.d.overridePendingTransition(uo6.d(a2, 0), uo6.d(b2, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a2) + " and exit resource " + resources.getResourceName(b2) + "when launching " + bVar);
        return null;
    }
}
