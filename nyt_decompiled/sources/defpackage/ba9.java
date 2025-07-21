package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ba9 {
    public static final ba9 a = new ba9();
    private static final String b = ba9.class.getCanonicalName();
    private static WeakReference c = new WeakReference(null);
    private static Method d;

    private ba9() {
    }

    public static final View a(View view) {
        if (c11.d(ba9.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                c11.b(th, ba9.class);
            }
        }
        return null;
    }

    public static final List b(View view) {
        int childCount;
        if (c11.d(ba9.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                    if (i2 >= childCount) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:14:0x0024, B:15:0x0026, B:17:0x002a, B:19:0x0030, B:21:0x0036, B:22:0x0046, B:24:0x004a, B:27:0x0039, B:29:0x003d, B:31:0x004d, B:33:0x0051, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0065, B:46:0x0069), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(android.view.View r5) {
        /*
            java.lang.Class<ba9> r0 = defpackage.ba9.class
            boolean r1 = defpackage.c11.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "view"
            defpackage.zq3.h(r5, r1)     // Catch: java.lang.Throwable -> L44
            boolean r1 = r5 instanceof android.widget.ImageView     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L15
            r1 = 2
            goto L16
        L15:
            r1 = r2
        L16:
            boolean r3 = r5.isClickable()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L1e
            r1 = r1 | 32
        L1e:
            boolean r3 = o(r5)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L26
            r1 = r1 | 512(0x200, float:7.17E-43)
        L26:
            boolean r3 = r5 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L4d
            r3 = r1 | 1025(0x401, float:1.436E-42)
            boolean r4 = r5 instanceof android.widget.Button     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L42
            r3 = r1 | 1029(0x405, float:1.442E-42)
            boolean r4 = r5 instanceof android.widget.Switch     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L39
            r1 = r1 | 9221(0x2405, float:1.2921E-41)
            goto L46
        L39:
            boolean r4 = r5 instanceof android.widget.CheckBox     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L42
            r3 = 33797(0x8405, float:4.736E-41)
            r1 = r1 | r3
            goto L46
        L42:
            r1 = r3
            goto L46
        L44:
            r5 = move-exception
            goto L7f
        L46:
            boolean r5 = r5 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7e
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L7e
        L4d:
            boolean r3 = r5 instanceof android.widget.Spinner     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L7c
            boolean r3 = r5 instanceof android.widget.DatePicker     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L56
            goto L7c
        L56:
            boolean r3 = r5 instanceof android.widget.RatingBar     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L5e
            r5 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r5
            goto L7e
        L5e:
            boolean r3 = r5 instanceof android.widget.RadioGroup     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L65
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L7e
        L65:
            boolean r3 = r5 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L7e
            ba9 r3 = defpackage.ba9.a     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r4 = defpackage.ba9.c     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L44
            boolean r5 = r3.p(r5, r4)     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7e
            r1 = r1 | 64
            goto L7e
        L7c:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L7e:
            return r1
        L7f:
            defpackage.c11.b(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba9.c(android.view.View):int");
    }

    public static final JSONObject d(View view) {
        if (c11.d(ba9.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            if (zq3.c(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List b2 = b(view);
                int size = b2.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        jSONArray.put(d((View) b2.get(i)));
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e) {
                Log.e(b, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (c11.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e) {
                Log.e(b, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final Class f(String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        if (c11.d(ba9.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            zq3.g(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            zq3.g(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        try {
            if (c11.d(ba9.class)) {
                return null;
            }
            try {
                Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                zq3.g(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return null;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                zq3.g(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnTouchListener\")");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                if (obj2 != null) {
                    return (View.OnTouchListener) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
            } catch (ClassNotFoundException e) {
                g29 g29Var = g29.a;
                g29.e0(b, e);
                return null;
            } catch (IllegalAccessException e2) {
                g29 g29Var2 = g29.a;
                g29.e0(b, e2);
                return null;
            } catch (NoSuchFieldException e3) {
                g29 g29Var3 = g29.a;
                g29.e0(b, e3);
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    public static final String i(View view) {
        if (c11.d(ba9.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (c11.d(ba9.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    public static final String k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (c11.d(ba9.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else if (view instanceof DatePicker) {
                int year = ((DatePicker) view).getYear();
                int month = ((DatePicker) view).getMonth();
                int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                z38 z38Var = z38.a;
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                zq3.g(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                zq3.g(currentHour, "view.currentHour");
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                zq3.g(currentMinute, "view.currentMinute");
                int intValue2 = currentMinute.intValue();
                z38 z38Var2 = z38.a;
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                zq3.g(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        View childAt = ((RadioGroup) view).getChildAt(i);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            valueOf = ((RadioButton) childAt).getText();
                            break;
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        if (c11.d(this)) {
            return null;
        }
        try {
            n();
            Method method = d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object invoke = method.invoke(null, fArr, view);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) invoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e) {
                    g29 g29Var = g29.a;
                    g29.e0(b, e);
                } catch (InvocationTargetException e2) {
                    g29 g29Var2 = g29.a;
                    g29.e0(b, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (c11.d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r3[0], r3[1]};
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final void n() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (d != null) {
                return;
            }
            try {
                Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                zq3.g(cls, "forName(CLASS_TOUCHTARGETHELPER)");
                Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                g29 g29Var = g29.a;
                g29.e0(b, e);
            } catch (NoSuchMethodException e2) {
                g29 g29Var2 = g29.a;
                g29.e0(b, e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private static final boolean o(View view) {
        if (c11.d(ba9.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            ba9 ba9Var = a;
            Class f = ba9Var.f("android.support.v4.view.NestedScrollingChild");
            if (f != null && f.isInstance(parent)) {
                return true;
            }
            Class f2 = ba9Var.f("androidx.core.view.NestedScrollingChild");
            if (f2 != null) {
                return f2.isInstance(parent);
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, ba9.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return zq3.c(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (c11.d(ba9.class)) {
            return;
        }
        try {
            zq3.h(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field2 = null;
                        if (field != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field = null;
            }
            if (field != null || field2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            field.setAccessible(true);
            field2.setAccessible(true);
            try {
                field.setAccessible(true);
                obj = field.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                field2.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            c11.b(th, ba9.class);
        }
    }

    public static final void s(View view, JSONObject jSONObject) {
        if (c11.d(ba9.class)) {
            return;
        }
        try {
            zq3.h(view, "view");
            zq3.h(jSONObject, "json");
            try {
                String k = k(view);
                String i = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (yj7.g(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", g29.k(g29.C0(k), ""));
                }
                jSONObject.put("hint", g29.k(g29.C0(i), ""));
                if (tag != null) {
                    jSONObject.put("tag", g29.k(g29.C0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", g29.k(g29.C0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", a.e(view));
            } catch (JSONException e) {
                g29 g29Var = g29.a;
                g29.e0(b, e);
            }
        } catch (Throwable th) {
            c11.b(th, ba9.class);
        }
    }

    public final boolean p(View view, View view2) {
        View l;
        if (c11.d(this)) {
            return false;
        }
        try {
            zq3.h(view, "view");
            String name = view.getClass().getName();
            zq3.g(name, "view.javaClass.name");
            if (!zq3.c(name, "com.facebook.react.views.view.ReactViewGroup") || (l = l(m(view), view2)) == null) {
                return false;
            }
            return l.getId() == view.getId();
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }
}
