package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class ws4 {
    public static final ws4 a = new ws4();

    private ws4() {
    }

    public static final List a(View view) {
        if (c11.d(ws4.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup j = ba9.j(view);
            if (j != null) {
                for (View view2 : ba9.b(j)) {
                    if (view != view2) {
                        arrayList.addAll(a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, ws4.class);
            return null;
        }
    }

    public static final List b(View view) {
        if (c11.d(ws4.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(ba9.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    zq3.g(resourceName, "resourceName");
                    Object[] array = new Regex("/").g(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            c11.b(th, ws4.class);
            return null;
        }
    }

    private final List c(View view) {
        if (c11.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it2 = ba9.b(view).iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(c((View) it2.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if (obj.length() > 0 && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final boolean d(String str, List list) {
        if (c11.d(this)) {
            return false;
        }
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (h.P(str, (String) it2.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final boolean e(List list, List list2) {
        if (c11.d(ws4.class)) {
            return false;
        }
        try {
            zq3.h(list, "indicators");
            zq3.h(list2, "keys");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (a.d((String) it2.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, ws4.class);
            return false;
        }
    }

    public static final boolean f(String str, String str2) {
        if (c11.d(ws4.class)) {
            return false;
        }
        try {
            zq3.h(str, "text");
            zq3.h(str2, "rule");
            return new Regex(str2).d(str);
        } catch (Throwable th) {
            c11.b(th, ws4.class);
            return false;
        }
    }
}
