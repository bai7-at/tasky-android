package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import co.datadome.sdk.m;
import defpackage.qn9;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: classes.dex */
public class DataDomeSDK {

    public enum BackBehaviour {
        GO_BACKGROUND,
        BLOCKED,
        GO_BACK
    }

    public static class Builder extends c {
        private static Date A;
        private static Date y;
        private static Date z;
        private VelocityTracker x = null;

        Builder(Application application, String str, String str2) {
            this.f = new WeakReference(application);
            c.t = str;
            this.i = str2;
            H();
            if (application != null) {
                qn9.b.a(application);
            }
        }

        private void H() {
            if (!DataDomeUtils.isValidParameter(c.t).booleanValue()) {
                throw new NullPointerException("[DataDome] Missing DataDome client key.");
            }
            if (DataDomeUtils.isValidParameter(this.i).booleanValue()) {
                return;
            }
            Log.e("DataDome", "Empty application version name.");
        }

        private static void L(Date date) {
            A = date;
        }

        private static void M(Date date) {
            y = date;
        }

        private static void r(Date date) {
            z = date;
        }

        protected Builder K(String str) {
            this.h = str;
            return this;
        }

        public Builder activateDatadomeLogger(Boolean bool) {
            n(bool);
            return this;
        }

        public Map<String, String> addDataDomeHeaders(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            String mergeCookie = DataDomeUtils.mergeCookie(c.DATADOME_COOKIE_PREFIX + getCookie(), map.get(c.HTTP_HEADER_COOKIE));
            if (!mergeCookie.equals(c.DATADOME_COOKIE_PREFIX)) {
                map.put(c.HTTP_HEADER_COOKIE, mergeCookie);
            }
            return map;
        }

        @Deprecated
        public Builder agent(String str) {
            this.userAgent = str;
            return this;
        }

        public Builder backBehaviour(BackBehaviour backBehaviour) {
            this.e = backBehaviour;
            return this;
        }

        @Deprecated
        public Builder bypassAcceptHeader(Boolean bool) {
            this.bypassDataDomeAcceptHeader = bool;
            return this;
        }

        @Deprecated
        public void clearDataDomeCookie() {
            h.d((Context) this.f.get(), c.t).f();
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.w("DataDome", "Please avoid using this method in production. Deleting the DataDome cookie can lead to unwanted response page display!\nCalled from " + stackTraceElement.getFileName() + " by method: " + stackTraceElement.getMethodName() + " at line: " + stackTraceElement.getLineNumber());
        }

        public String getCookie() {
            return g();
        }

        public String getCookieWithAttributes() {
            return x();
        }

        public void handleResponse(Integer num, Map<String, String> map, int i, String str, String str2) {
            o(num, map, i, str, str2);
        }

        public void handleTouchEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked == 0) {
                VelocityTracker velocityTracker = this.x;
                if (velocityTracker == null) {
                    this.x = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.x.addMovement(motionEvent);
                if (z == null || new Date().getTime() - z.getTime() > 100) {
                    logTouchDownEvent(motionEvent.getX(), motionEvent.getY());
                    r(new Date());
                    return;
                }
                return;
            }
            if (actionMasked == 1) {
                if (this.x == null) {
                    this.x = VelocityTracker.obtain();
                }
                if (y == null || new Date().getTime() - y.getTime() > 100) {
                    logTouchUpEvent(motionEvent.getX(), motionEvent.getY());
                    M(new Date());
                    return;
                }
                return;
            }
            if (actionMasked == 2) {
                if (this.x == null) {
                    this.x = VelocityTracker.obtain();
                }
                this.x.addMovement(motionEvent);
                if (A == null || new Date().getTime() - A.getTime() > 100) {
                    this.x.computeCurrentVelocity(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
                    logTouchDownEvent(this.x.getXVelocity(pointerId), this.x.getYVelocity(pointerId));
                    L(new Date());
                    return;
                }
                return;
            }
            if (actionMasked == 3) {
                VelocityTracker velocityTracker2 = this.x;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.x = null;
                return;
            }
            logEvent(a.UNKNOWN_TOUCH_EVENT.a("" + actionMasked));
        }

        public Boolean isBypassingAcceptHeader() {
            return this.bypassDataDomeAcceptHeader;
        }

        public Builder listener(DataDomeSDKListener dataDomeSDKListener) {
            this.j = dataDomeSDKListener;
            return this;
        }

        public void logEvent(int i, String str, String str2) {
            logEvent(new DataDomeEvent(i, str, str2));
        }

        public void logTouchDownEvent(float f, float f2) {
            logEvent(a.TOUCH_DOWN.a(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f), Float.valueOf(f2))));
        }

        public void logTouchMoveEvent(float f, float f2) {
            logEvent(a.TOUCH_MOVE.a(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f), Float.valueOf(f2))));
        }

        public void logTouchUpEvent(float f, float f2) {
            logEvent(a.TOUCH_UP.a(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f), Float.valueOf(f2))));
        }

        public Builder manualListener(DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener) {
            this.k = dataDomeSDKManualIntegrationListener;
            return this;
        }

        public Response process(Response response, Map<String, String> map, String str, Call call) {
            if (DataDomeUtils.isValidParameter(this.h).booleanValue()) {
                return i(response, map, str, call);
            }
            throw new b();
        }

        public void setCookie(String str) {
            p(str);
        }

        public Builder setResponsePageLanguage(String str) {
            this.o = str;
            return this;
        }

        public Boolean verifyResponse(String str, Map<String, String> map, int i) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(c.HTTP_HEADER_SET_COOKIE)) {
                    String value = entry.getValue();
                    if (DataDomeUtils.isValidCookie(value).booleanValue()) {
                        setCookie(value);
                    }
                }
            }
            m(m.a.MANUAL);
            K(str).logEvent(a.RESPONSE_VALIDATION.a("sdk"));
            D();
            return Boolean.valueOf((i == 403 || i == 401) && !DataDomeUtils.isNullOrEmpty(h(map)).booleanValue());
        }

        public void handleResponse(Map<String, String> map, int i, String str, String str2) {
            o(null, map, i, str, str2);
        }

        public void logEvent(a aVar, String str) {
            logEvent(aVar.a(str));
        }
    }

    public enum ResponseType {
        BLOCK,
        HARD_BLOCK,
        DEVICE_CHECK,
        REDIRECT,
        TRAP
    }

    public enum a {
        NULL_CONTEXT("empty applicationRef"),
        RESPONSE_VALIDATION("response validation"),
        CAPTCHA_SUCCESS("captcha success"),
        CAPTCHA_FAILURE("captcha failure"),
        TOUCH_DOWN("touch down"),
        TOUCH_UP("touch up"),
        TOUCH_MOVE("touch move"),
        SWIPE_LEFT("swipe left"),
        SWIPE_RIGHT("swipe right"),
        UNKNOWN_TOUCH_EVENT("Unknown touch event");

        String a;

        a(String str) {
            this.a = str;
        }

        public DataDomeEvent a(String str) {
            return new DataDomeEvent(ordinal(), this.a, str);
        }
    }

    public static Builder with(Application application, String str, String str2) {
        return new Builder(application, str, str2);
    }
}
