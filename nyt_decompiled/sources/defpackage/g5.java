package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.e5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g5 extends e5 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] strArr) {
            zq3.h(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            zq3.g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    @Override // defpackage.e5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        zq3.h(context, "context");
        zq3.h(strArr, "input");
        return a.a(strArr);
    }

    @Override // defpackage.e5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e5.a b(Context context, String[] strArr) {
        zq3.h(context, "context");
        zq3.h(strArr, "input");
        if (strArr.length == 0) {
            return new e5.a(t.i());
        }
        for (String str : strArr) {
            if (mx0.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(strArr.length), 16));
        for (String str2 : strArr) {
            Pair a2 = du8.a(str2, Boolean.TRUE);
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new e5.a(linkedHashMap);
    }

    @Override // defpackage.e5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return t.i();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return t.t(i.h1(d.Y(stringArrayExtra), arrayList));
        }
        return t.i();
    }
}
