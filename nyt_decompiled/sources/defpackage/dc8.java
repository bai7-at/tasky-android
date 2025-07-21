package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dc8 {
    public static final dc8 a = new dc8();
    private static final List b = i.o(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private dc8() {
    }

    public static final List a(View view) {
        if (c11.d(dc8.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it2 = b.iterator();
            while (it2.hasNext()) {
                if (((Class) it2.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it3 = ba9.b(view).iterator();
            while (it3.hasNext()) {
                arrayList.addAll(a((View) it3.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, dc8.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (c11.d(dc8.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            zq3.h(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ba9.b(view).iterator();
            while (it2.hasNext()) {
                jSONArray.put(b((View) it2.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            c11.b(th, dc8.class);
            return null;
        }
    }

    private final List c(View view) {
        if (c11.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : ba9.b(view)) {
                String k = ba9.k(view2);
                if (k.length() > 0) {
                    arrayList.add(k);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final String d(View view) {
        if (c11.d(dc8.class)) {
            return null;
        }
        try {
            zq3.h(view, "hostView");
            String k = ba9.k(view);
            if (k.length() > 0) {
                return k;
            }
            String join = TextUtils.join(" ", a.c(view));
            zq3.g(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            c11.b(th, dc8.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (c11.d(dc8.class)) {
            return;
        }
        try {
            zq3.h(view, "view");
            zq3.h(jSONObject, "json");
            try {
                String k = ba9.k(view);
                String i = ba9.i(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", ba9.c(view));
                if (k.length() > 0) {
                    jSONObject.put("text", k);
                }
                if (i.length() > 0) {
                    jSONObject.put("hint", i);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            c11.b(th, dc8.class);
        }
    }
}
