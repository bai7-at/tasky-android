package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {
    public static final Drawable a(Context context, int i) {
        Drawable b = al.b(context, i);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Drawable b(Resources resources, int i, Resources.Theme theme) {
        Drawable e = m07.e(resources, i, theme);
        if (e != null) {
            return e;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Lifecycle c(Context context) {
        Object obj = context;
        while (!(obj instanceof d44)) {
            if (!(obj instanceof ContextWrapper)) {
                return null;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return ((d44) obj).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return mx0.a(context, str) == 0;
    }
}
