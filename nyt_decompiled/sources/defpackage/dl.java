package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.v;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class dl {
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final int[] c = {R.attr.onClick};
    private static final int[] d = {R.attr.accessibilityHeading};
    private static final int[] e = {R.attr.accessibilityPaneTitle};
    private static final int[] f = {R.attr.screenReaderFocusable};
    private static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    private static final hs7 h = new hs7();
    private final Object[] a = new Object[2];

    private static class a implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            if (this.c == null) {
                a(this.a.getContext());
            }
            try {
                this.c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && k99.L(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        hs7 hs7Var = h;
        Constructor constructor = (Constructor) hs7Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            hs7Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = g;
                if (i >= strArr.length) {
                    return null;
                }
                View s = s(context, str, strArr[i]);
                if (s != null) {
                    return s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fo6.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(fo6.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(fo6.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof vx0) && ((vx0) context).c() == resourceId) ? context : new vx0(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected d c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected f e(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    protected g f(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected n h(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected p j(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected q k(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    protected zk l(Context context, AttributeSet attributeSet) {
        return new zk(context, attributeSet);
    }

    protected bl m(Context context, AttributeSet attributeSet) {
        return new bl(context, attributeSet);
    }

    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected v p(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View l;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = e0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                l = l(context2, attributeSet);
                v(l, str);
                break;
            case "CheckedTextView":
                l = f(context2, attributeSet);
                v(l, str);
                break;
            case "MultiAutoCompleteTextView":
                l = j(context2, attributeSet);
                v(l, str);
                break;
            case "TextView":
                l = o(context2, attributeSet);
                v(l, str);
                break;
            case "ImageButton":
                l = h(context2, attributeSet);
                v(l, str);
                break;
            case "SeekBar":
                l = m(context2, attributeSet);
                v(l, str);
                break;
            case "Spinner":
                l = n(context2, attributeSet);
                v(l, str);
                break;
            case "RadioButton":
                l = k(context2, attributeSet);
                v(l, str);
                break;
            case "ToggleButton":
                l = p(context2, attributeSet);
                v(l, str);
                break;
            case "ImageView":
                l = i(context2, attributeSet);
                v(l, str);
                break;
            case "AutoCompleteTextView":
                l = c(context2, attributeSet);
                v(l, str);
                break;
            case "CheckBox":
                l = e(context2, attributeSet);
                v(l, str);
                break;
            case "EditText":
                l = g(context2, attributeSet);
                v(l, str);
                break;
            case "Button":
                l = d(context2, attributeSet);
                v(l, str);
                break;
            default:
                l = q(context2, str, attributeSet);
                break;
        }
        if (l == null && context != context2) {
            l = t(context2, str, attributeSet);
        }
        if (l != null) {
            b(l, attributeSet);
            a(context2, l, attributeSet);
        }
        return l;
    }
}
