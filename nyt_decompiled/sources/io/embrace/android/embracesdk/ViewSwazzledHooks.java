package io.embrace.android.embracesdk;

import android.view.View;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import kotlin.Pair;

@InternalApi
/* loaded from: classes5.dex */
public final class ViewSwazzledHooks {
    private static final String UNKNOWN_ELEMENT_NAME = "Unknown element";

    @InternalApi
    public static final class OnClickListener {
        private OnClickListener() {
        }

        public static void _preOnClick(View.OnClickListener onClickListener, View view) {
            ViewSwazzledHooks.logOnClickEvent(view, TapBreadcrumb.TapBreadcrumbType.TAP);
        }
    }

    @InternalApi
    public static final class OnLongClickListener {
        private OnLongClickListener() {
        }

        public static void _preOnLongClick(View.OnLongClickListener onLongClickListener, View view) {
            if (onLongClickListener != null) {
                ViewSwazzledHooks.logOnClickEvent(view, TapBreadcrumb.TapBreadcrumbType.LONG_PRESS);
            }
        }
    }

    private ViewSwazzledHooks() {
    }

    private static void logError(String str, Throwable th) {
        Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
        if (th != null) {
            Embrace.getInstance().getInternalInterface().logInternalError(th);
        }
    }

    static void logOnClickEvent(View view, TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType) {
        String str;
        Pair<Float, Float> pair;
        try {
            try {
                str = view.getResources().getResourceName(view.getId());
            } catch (Exception unused) {
                str = UNKNOWN_ELEMENT_NAME;
            }
            try {
                try {
                    pair = new Pair<>(Float.valueOf(view.getX()), Float.valueOf(view.getY()));
                } catch (Exception e) {
                    logError("Could not log onClickEvent.", e);
                    return;
                }
            } catch (Exception unused2) {
                pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            Embrace.getImpl().logTap(pair, str, tapBreadcrumbType);
        } catch (NoSuchMethodError e2) {
            logError("Could not log onClickEvent. Some methods are missing. ", e2);
        }
    }
}
