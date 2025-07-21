package defpackage;

import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;
import defpackage.qn4;

/* loaded from: classes.dex */
abstract class rn4 {

    public interface a extends qn4.a {
        void i(Object obj);
    }

    static class b extends qn4.b {
        public b(a aVar) {
            super(aVar);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((a) this.a).i(routeInfo);
        }
    }

    public static final class c {
        public static Display a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                return null;
            }
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }
}
